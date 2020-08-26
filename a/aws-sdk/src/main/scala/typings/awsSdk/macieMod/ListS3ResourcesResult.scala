package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListS3ResourcesResult extends js.Object {
  /**
    * When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of the associated S3 resources returned by the action.
    */
  var s3Resources: js.UndefOr[S3ResourcesClassification] = js.native
}

object ListS3ResourcesResult {
  @scala.inline
  def apply(): ListS3ResourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListS3ResourcesResult]
  }
  @scala.inline
  implicit class ListS3ResourcesResultOps[Self <: ListS3ResourcesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setS3ResourcesVarargs(value: S3ResourceClassification*): Self = this.set("s3Resources", js.Array(value :_*))
    @scala.inline
    def setS3Resources(value: S3ResourcesClassification): Self = this.set("s3Resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Resources: Self = this.set("s3Resources", js.undefined)
  }
  
}


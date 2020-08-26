package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAttachedIndicesRequest extends js.Object {
  /**
    * The consistency level to use for this operation.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  /**
    * The ARN of the directory.
    */
  var DirectoryArn: Arn = js.native
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * A reference to the object that has indices attached.
    */
  var TargetReference: ObjectReference = js.native
}

object ListAttachedIndicesRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, TargetReference: ObjectReference): ListAttachedIndicesRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], TargetReference = TargetReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttachedIndicesRequest]
  }
  @scala.inline
  implicit class ListAttachedIndicesRequestOps[Self <: ListAttachedIndicesRequest] (val x: Self) extends AnyVal {
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
    def setDirectoryArn(value: Arn): Self = this.set("DirectoryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetReference(value: ObjectReference): Self = this.set("TargetReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsistencyLevel(value: ConsistencyLevel): Self = this.set("ConsistencyLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsistencyLevel: Self = this.set("ConsistencyLevel", js.undefined)
    @scala.inline
    def setMaxResults(value: NumberResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}


package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeModelVersionsResult extends js.Object {
  /**
    * The model version details.
    */
  var modelVersionDetails: js.UndefOr[modelVersionDetailList] = js.native
  /**
    * The next token.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeModelVersionsResult {
  @scala.inline
  def apply(): DescribeModelVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeModelVersionsResult]
  }
  @scala.inline
  implicit class DescribeModelVersionsResultOps[Self <: DescribeModelVersionsResult] (val x: Self) extends AnyVal {
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
    def setModelVersionDetailsVarargs(value: ModelVersionDetail*): Self = this.set("modelVersionDetails", js.Array(value :_*))
    @scala.inline
    def setModelVersionDetails(value: modelVersionDetailList): Self = this.set("modelVersionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelVersionDetails: Self = this.set("modelVersionDetails", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}


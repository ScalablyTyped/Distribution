package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTagValuesOutput extends js.Object {
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.native
  /**
    * A list of all tag values for the specified key in the AWS account.
    */
  var TagValues: js.UndefOr[TagValuesOutputList] = js.native
}

object GetTagValuesOutput {
  @scala.inline
  def apply(): GetTagValuesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTagValuesOutput]
  }
  @scala.inline
  implicit class GetTagValuesOutputOps[Self <: GetTagValuesOutput] (val x: Self) extends AnyVal {
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
    def setPaginationToken(value: PaginationToken): Self = this.set("PaginationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginationToken: Self = this.set("PaginationToken", js.undefined)
    @scala.inline
    def setTagValuesVarargs(value: TagValue*): Self = this.set("TagValues", js.Array(value :_*))
    @scala.inline
    def setTagValues(value: TagValuesOutputList): Self = this.set("TagValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagValues: Self = this.set("TagValues", js.undefined)
  }
  
}


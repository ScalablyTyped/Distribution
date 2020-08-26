package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTagValuesInput extends js.Object {
  /**
    * The key for which you want to list all existing values in the specified Region for the AWS account.
    */
  var Key: TagKey = js.native
  /**
    * A string that indicates that additional data is available. Leave this value empty for your initial request. If the response includes a PaginationToken, use that string for this value to request an additional page of data.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.native
}

object GetTagValuesInput {
  @scala.inline
  def apply(Key: TagKey): GetTagValuesInput = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagValuesInput]
  }
  @scala.inline
  implicit class GetTagValuesInputOps[Self <: GetTagValuesInput] (val x: Self) extends AnyVal {
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
    def setKey(value: TagKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaginationToken(value: PaginationToken): Self = this.set("PaginationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginationToken: Self = this.set("PaginationToken", js.undefined)
  }
  
}


package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRegistriesRequest extends js.Object {
  var Limit: js.UndefOr[integer] = js.native
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * Specifying this limits the results to only those registry names that start with the specified prefix.
    */
  var RegistryNamePrefix: js.UndefOr[string] = js.native
  /**
    * Can be set to Local or AWS to limit responses to your custom registries, or the ones provided by AWS.
    */
  var Scope: js.UndefOr[string] = js.native
}

object ListRegistriesRequest {
  @scala.inline
  def apply(): ListRegistriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegistriesRequest]
  }
  @scala.inline
  implicit class ListRegistriesRequestOps[Self <: ListRegistriesRequest] (val x: Self) extends AnyVal {
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
    def setLimit(value: integer): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRegistryNamePrefix(value: string): Self = this.set("RegistryNamePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryNamePrefix: Self = this.set("RegistryNamePrefix", js.undefined)
    @scala.inline
    def setScope(value: string): Self = this.set("Scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("Scope", js.undefined)
  }
  
}


package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAliasRequest extends js.Object {
  /**
    * The alias to be deleted. The alias name must begin with alias/ followed by the alias name, such as alias/ExampleAlias.
    */
  var AliasName: AliasNameType = js.native
}

object DeleteAliasRequest {
  @scala.inline
  def apply(AliasName: AliasNameType): DeleteAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAliasRequest]
  }
  @scala.inline
  implicit class DeleteAliasRequestOps[Self <: DeleteAliasRequest] (val x: Self) extends AnyVal {
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
    def setAliasName(value: AliasNameType): Self = this.set("AliasName", value.asInstanceOf[js.Any])
  }
  
}


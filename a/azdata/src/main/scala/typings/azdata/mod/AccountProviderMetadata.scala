package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountProviderMetadata extends js.Object {
  /**
    * Any arguments that identify an instantiation of the provider
    */
  var args: js.UndefOr[js.Any] = js.native
  /**
    * Display name of the provider
    */
  var displayName: String = js.native
  /**
    * The identifier of the provider
    */
  var id: String = js.native
  /**
    * Optional settings that identify an instantiation of a provider
    */
  var settings: js.UndefOr[js.Object] = js.native
}

object AccountProviderMetadata {
  @scala.inline
  def apply(displayName: String, id: String): AccountProviderMetadata = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountProviderMetadata]
  }
  @scala.inline
  implicit class AccountProviderMetadataOps[Self <: AccountProviderMetadata] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgs(value: js.Any): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setSettings(value: js.Object): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
  
}


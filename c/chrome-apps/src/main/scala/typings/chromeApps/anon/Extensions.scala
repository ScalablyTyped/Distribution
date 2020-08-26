package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extensions extends js.Object {
  var extensions: js.UndefOr[js.Array[Asterisk | String | Includedirectories]] = js.native
  /** File types to handle */
  var types: js.UndefOr[js.Array[Asterisk | String | Includedirectories]] = js.native
}

object Extensions {
  @scala.inline
  def apply(): Extensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extensions]
  }
  @scala.inline
  implicit class ExtensionsOps[Self <: Extensions] (val x: Self) extends AnyVal {
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
    def setExtensionsVarargs(value: (Asterisk | String | Includedirectories)*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[Asterisk | String | Includedirectories]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setTypesVarargs(value: (Asterisk | String | Includedirectories)*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[Asterisk | String | Includedirectories]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}


package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropIDPlugin extends js.Object {
  
  val CAPICOM_PROPID_ENHKEY_USAGE: `9` = js.native
}
object PropIDPlugin {
  
  @scala.inline
  def apply(CAPICOM_PROPID_ENHKEY_USAGE: `9`): PropIDPlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_PROPID_ENHKEY_USAGE = CAPICOM_PROPID_ENHKEY_USAGE.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropIDPlugin]
  }
  
  @scala.inline
  implicit class PropIDPluginOps[Self <: PropIDPlugin] (val x: Self) extends AnyVal {
    
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
    def setCAPICOM_PROPID_ENHKEY_USAGE(value: `9`): Self = this.set("CAPICOM_PROPID_ENHKEY_USAGE", value.asInstanceOf[js.Any])
  }
}

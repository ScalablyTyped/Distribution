package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`128`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyUsagePlugin extends StObject {
  
  val CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE: `128` = js.native
}
object KeyUsagePlugin {
  
  @scala.inline
  def apply(CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE: `128`): KeyUsagePlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE = CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyUsagePlugin]
  }
  
  @scala.inline
  implicit class KeyUsagePluginMutableBuilder[Self <: KeyUsagePlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_DIGITAL_SIGNATURE_KEY_USAGE(value: `128`): Self = StObject.set(x, "CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE", value.asInstanceOf[js.Any])
  }
}

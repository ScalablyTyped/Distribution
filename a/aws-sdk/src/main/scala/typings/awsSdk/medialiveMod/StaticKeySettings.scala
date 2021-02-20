package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticKeySettings extends StObject {
  
  /**
    * The URL of the license server used for protecting content.
    */
  var KeyProviderServer: js.UndefOr[InputLocation] = js.native
  
  /**
    * Static key value as a 32 character hexadecimal string.
    */
  var StaticKeyValue: stringMin32Max32 = js.native
}
object StaticKeySettings {
  
  @scala.inline
  def apply(StaticKeyValue: stringMin32Max32): StaticKeySettings = {
    val __obj = js.Dynamic.literal(StaticKeyValue = StaticKeyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticKeySettings]
  }
  
  @scala.inline
  implicit class StaticKeySettingsMutableBuilder[Self <: StaticKeySettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyProviderServer(value: InputLocation): Self = StObject.set(x, "KeyProviderServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyProviderServerUndefined: Self = StObject.set(x, "KeyProviderServer", js.undefined)
    
    @scala.inline
    def setStaticKeyValue(value: stringMin32Max32): Self = StObject.set(x, "StaticKeyValue", value.asInstanceOf[js.Any])
  }
}

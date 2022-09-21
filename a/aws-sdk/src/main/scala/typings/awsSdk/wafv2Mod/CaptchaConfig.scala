package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptchaConfig extends StObject {
  
  /**
    * Determines how long a CAPTCHA token remains valid after the client successfully solves a CAPTCHA puzzle. 
    */
  var ImmunityTimeProperty: js.UndefOr[typings.awsSdk.wafv2Mod.ImmunityTimeProperty] = js.undefined
}
object CaptchaConfig {
  
  inline def apply(): CaptchaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptchaConfig]
  }
  
  extension [Self <: CaptchaConfig](x: Self) {
    
    inline def setImmunityTimeProperty(value: ImmunityTimeProperty): Self = StObject.set(x, "ImmunityTimeProperty", value.asInstanceOf[js.Any])
    
    inline def setImmunityTimePropertyUndefined: Self = StObject.set(x, "ImmunityTimeProperty", js.undefined)
  }
}

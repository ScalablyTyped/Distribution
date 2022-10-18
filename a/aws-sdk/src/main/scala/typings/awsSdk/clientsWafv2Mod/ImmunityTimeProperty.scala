package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunityTimeProperty extends StObject {
  
  /**
    * The amount of time, in seconds, that a CAPTCHA token is valid. The default setting is 300.
    */
  var ImmunityTime: TimeWindowSecond
}
object ImmunityTimeProperty {
  
  inline def apply(ImmunityTime: TimeWindowSecond): ImmunityTimeProperty = {
    val __obj = js.Dynamic.literal(ImmunityTime = ImmunityTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunityTimeProperty]
  }
  
  extension [Self <: ImmunityTimeProperty](x: Self) {
    
    inline def setImmunityTime(value: TimeWindowSecond): Self = StObject.set(x, "ImmunityTime", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtaaV10X extends StObject {
  
  /**
    * The AppEUI value.
    */
  var AppEui: js.UndefOr[typings.awsSdk.iotwirelessMod.AppEui] = js.undefined
  
  /**
    * The AppKey value.
    */
  var AppKey: js.UndefOr[typings.awsSdk.iotwirelessMod.AppKey] = js.undefined
  
  /**
    * The GenAppKey value.
    */
  var GenAppKey: js.UndefOr[typings.awsSdk.iotwirelessMod.GenAppKey] = js.undefined
}
object OtaaV10X {
  
  inline def apply(): OtaaV10X = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtaaV10X]
  }
  
  extension [Self <: OtaaV10X](x: Self) {
    
    inline def setAppEui(value: AppEui): Self = StObject.set(x, "AppEui", value.asInstanceOf[js.Any])
    
    inline def setAppEuiUndefined: Self = StObject.set(x, "AppEui", js.undefined)
    
    inline def setAppKey(value: AppKey): Self = StObject.set(x, "AppKey", value.asInstanceOf[js.Any])
    
    inline def setAppKeyUndefined: Self = StObject.set(x, "AppKey", js.undefined)
    
    inline def setGenAppKey(value: GenAppKey): Self = StObject.set(x, "GenAppKey", value.asInstanceOf[js.Any])
    
    inline def setGenAppKeyUndefined: Self = StObject.set(x, "GenAppKey", js.undefined)
  }
}

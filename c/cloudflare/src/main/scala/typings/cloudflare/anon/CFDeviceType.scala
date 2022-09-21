package typings.cloudflare.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CFDeviceType extends StObject {
  
  var `CF-Device-Type`: String
  
  var `CF-IPCountry`: String
  
  var Origin: String
}
object CFDeviceType {
  
  inline def apply(`CF-Device-Type`: String, `CF-IPCountry`: String, Origin: String): CFDeviceType = {
    val __obj = js.Dynamic.literal(Origin = Origin.asInstanceOf[js.Any])
    __obj.updateDynamic("CF-Device-Type")(`CF-Device-Type`.asInstanceOf[js.Any])
    __obj.updateDynamic("CF-IPCountry")(`CF-IPCountry`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CFDeviceType]
  }
  
  extension [Self <: CFDeviceType](x: Self) {
    
    inline def `setCF-Device-Type`(value: String): Self = StObject.set(x, "CF-Device-Type", value.asInstanceOf[js.Any])
    
    inline def `setCF-IPCountry`(value: String): Self = StObject.set(x, "CF-IPCountry", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
  }
}

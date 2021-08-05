package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellularProviderProperties extends StObject {
  
  /** Cellular network ID as a simple concatenation of the network's MCC (Mobile Country Code) and MNC (Mobile Network Code). */
  var Code: String
  
  /** The two-letter country code. */
  var Country: js.UndefOr[String] = js.undefined
  
  /** The operator name. */
  var Name: String
}
object CellularProviderProperties {
  
  inline def apply(Code: String, Name: String): CellularProviderProperties = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellularProviderProperties]
  }
  
  extension [Self <: CellularProviderProperties](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

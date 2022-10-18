package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Region extends StObject {
  
  var country: String
  
  var region: js.UndefOr[String] = js.undefined
}
object Region {
  
  inline def apply(country: String): Region = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  extension [Self <: Region](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}

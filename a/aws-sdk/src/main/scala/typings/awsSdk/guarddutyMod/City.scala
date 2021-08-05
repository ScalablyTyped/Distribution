package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait City extends StObject {
  
  /**
    * The city name of the remote IP address.
    */
  var CityName: js.UndefOr[String] = js.undefined
}
object City {
  
  inline def apply(): City = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[City]
  }
  
  extension [Self <: City](x: Self) {
    
    inline def setCityName(value: String): Self = StObject.set(x, "CityName", value.asInstanceOf[js.Any])
    
    inline def setCityNameUndefined: Self = StObject.set(x, "CityName", js.undefined)
  }
}

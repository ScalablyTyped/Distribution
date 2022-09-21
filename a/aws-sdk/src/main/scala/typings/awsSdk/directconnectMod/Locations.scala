package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locations extends StObject {
  
  /**
    * The locations.
    */
  var locations: js.UndefOr[LocationList] = js.undefined
}
object Locations {
  
  inline def apply(): Locations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locations]
  }
  
  extension [Self <: Locations](x: Self) {
    
    inline def setLocations(value: LocationList): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value*))
  }
}

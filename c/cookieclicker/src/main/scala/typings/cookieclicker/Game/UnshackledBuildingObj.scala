package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnshackledBuildingObj extends StObject {
  
  var building: String
  
  var q: String
}
object UnshackledBuildingObj {
  
  inline def apply(building: String, q: String): UnshackledBuildingObj = {
    val __obj = js.Dynamic.literal(building = building.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnshackledBuildingObj]
  }
  
  extension [Self <: UnshackledBuildingObj](x: Self) {
    
    inline def setBuilding(value: String): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
  }
}

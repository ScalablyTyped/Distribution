package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlacementGroupResult extends StObject {
  
  var PlacementGroup: js.UndefOr[typings.awsSdk.ec2Mod.PlacementGroup] = js.undefined
}
object CreatePlacementGroupResult {
  
  inline def apply(): CreatePlacementGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlacementGroupResult]
  }
  
  extension [Self <: CreatePlacementGroupResult](x: Self) {
    
    inline def setPlacementGroup(value: PlacementGroup): Self = StObject.set(x, "PlacementGroup", value.asInstanceOf[js.Any])
    
    inline def setPlacementGroupUndefined: Self = StObject.set(x, "PlacementGroup", js.undefined)
  }
}

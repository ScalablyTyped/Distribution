package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePlacementGroupsResult extends StObject {
  
  /**
    * Information about the placement groups.
    */
  var PlacementGroups: js.UndefOr[PlacementGroupList] = js.undefined
}
object DescribePlacementGroupsResult {
  
  inline def apply(): DescribePlacementGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlacementGroupsResult]
  }
  
  extension [Self <: DescribePlacementGroupsResult](x: Self) {
    
    inline def setPlacementGroups(value: PlacementGroupList): Self = StObject.set(x, "PlacementGroups", value.asInstanceOf[js.Any])
    
    inline def setPlacementGroupsUndefined: Self = StObject.set(x, "PlacementGroups", js.undefined)
    
    inline def setPlacementGroupsVarargs(value: PlacementGroup*): Self = StObject.set(x, "PlacementGroups", js.Array(value :_*))
  }
}

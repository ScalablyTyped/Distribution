package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePlacementGroupsResult extends StObject {
  
  /**
    * Information about the placement groups.
    */
  var PlacementGroups: js.UndefOr[PlacementGroupList] = js.native
}
object DescribePlacementGroupsResult {
  
  @scala.inline
  def apply(): DescribePlacementGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlacementGroupsResult]
  }
  
  @scala.inline
  implicit class DescribePlacementGroupsResultMutableBuilder[Self <: DescribePlacementGroupsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlacementGroups(value: PlacementGroupList): Self = StObject.set(x, "PlacementGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementGroupsUndefined: Self = StObject.set(x, "PlacementGroups", js.undefined)
    
    @scala.inline
    def setPlacementGroupsVarargs(value: PlacementGroup*): Self = StObject.set(x, "PlacementGroups", js.Array(value :_*))
  }
}

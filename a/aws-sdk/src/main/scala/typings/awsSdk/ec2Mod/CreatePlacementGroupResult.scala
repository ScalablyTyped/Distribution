package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePlacementGroupResult extends StObject {
  
  var PlacementGroup: js.UndefOr[typings.awsSdk.ec2Mod.PlacementGroup] = js.native
}
object CreatePlacementGroupResult {
  
  @scala.inline
  def apply(): CreatePlacementGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlacementGroupResult]
  }
  
  @scala.inline
  implicit class CreatePlacementGroupResultMutableBuilder[Self <: CreatePlacementGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlacementGroup(value: PlacementGroup): Self = StObject.set(x, "PlacementGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementGroupUndefined: Self = StObject.set(x, "PlacementGroup", js.undefined)
  }
}

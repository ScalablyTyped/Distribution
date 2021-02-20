package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePlacementResponse extends StObject {
  
  /**
    * An object describing the placement.
    */
  var placement: PlacementDescription = js.native
}
object DescribePlacementResponse {
  
  @scala.inline
  def apply(placement: PlacementDescription): DescribePlacementResponse = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePlacementResponse]
  }
  
  @scala.inline
  implicit class DescribePlacementResponseMutableBuilder[Self <: DescribePlacementResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlacement(value: PlacementDescription): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
  }
}

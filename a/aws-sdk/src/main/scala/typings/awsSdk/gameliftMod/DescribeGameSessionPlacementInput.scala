package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGameSessionPlacementInput extends StObject {
  
  /**
    * A unique identifier for a game session placement to retrieve.
    */
  var PlacementId: IdStringModel = js.native
}
object DescribeGameSessionPlacementInput {
  
  @scala.inline
  def apply(PlacementId: IdStringModel): DescribeGameSessionPlacementInput = {
    val __obj = js.Dynamic.literal(PlacementId = PlacementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGameSessionPlacementInput]
  }
  
  @scala.inline
  implicit class DescribeGameSessionPlacementInputMutableBuilder[Self <: DescribeGameSessionPlacementInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlacementId(value: IdStringModel): Self = StObject.set(x, "PlacementId", value.asInstanceOf[js.Any])
  }
}

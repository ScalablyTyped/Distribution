package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopGameSessionPlacementInput extends StObject {
  
  /**
    * A unique identifier for a game session placement to cancel.
    */
  var PlacementId: IdStringModel = js.native
}
object StopGameSessionPlacementInput {
  
  @scala.inline
  def apply(PlacementId: IdStringModel): StopGameSessionPlacementInput = {
    val __obj = js.Dynamic.literal(PlacementId = PlacementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopGameSessionPlacementInput]
  }
  
  @scala.inline
  implicit class StopGameSessionPlacementInputMutableBuilder[Self <: StopGameSessionPlacementInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlacementId(value: IdStringModel): Self = StObject.set(x, "PlacementId", value.asInstanceOf[js.Any])
  }
}

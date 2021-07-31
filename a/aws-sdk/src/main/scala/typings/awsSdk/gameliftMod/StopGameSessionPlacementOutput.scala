package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopGameSessionPlacementOutput extends StObject {
  
  /**
    * Object that describes the canceled game session placement, with CANCELLED status and an end time stamp. 
    */
  var GameSessionPlacement: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionPlacement] = js.undefined
}
object StopGameSessionPlacementOutput {
  
  @scala.inline
  def apply(): StopGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopGameSessionPlacementOutput]
  }
  
  @scala.inline
  implicit class StopGameSessionPlacementOutputMutableBuilder[Self <: StopGameSessionPlacementOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameSessionPlacement(value: GameSessionPlacement): Self = StObject.set(x, "GameSessionPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionPlacementUndefined: Self = StObject.set(x, "GameSessionPlacement", js.undefined)
  }
}

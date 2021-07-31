package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameSessionQueueDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to fleet or fleet alias. ARNs, which include a fleet ID or alias ID and a Region name, provide a unique identifier across all Regions. 
    */
  var DestinationArn: js.UndefOr[ArnStringModel] = js.undefined
}
object GameSessionQueueDestination {
  
  @scala.inline
  def apply(): GameSessionQueueDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSessionQueueDestination]
  }
  
  @scala.inline
  implicit class GameSessionQueueDestinationMutableBuilder[Self <: GameSessionQueueDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationArn(value: ArnStringModel): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
  }
}

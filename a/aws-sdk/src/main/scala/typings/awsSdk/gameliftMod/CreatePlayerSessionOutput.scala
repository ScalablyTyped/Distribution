package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlayerSessionOutput extends StObject {
  
  /**
    * Object that describes the newly created player session record.
    */
  var PlayerSession: js.UndefOr[typings.awsSdk.gameliftMod.PlayerSession] = js.undefined
}
object CreatePlayerSessionOutput {
  
  @scala.inline
  def apply(): CreatePlayerSessionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlayerSessionOutput]
  }
  
  @scala.inline
  implicit class CreatePlayerSessionOutputMutableBuilder[Self <: CreatePlayerSessionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlayerSession(value: PlayerSession): Self = StObject.set(x, "PlayerSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerSessionUndefined: Self = StObject.set(x, "PlayerSession", js.undefined)
  }
}

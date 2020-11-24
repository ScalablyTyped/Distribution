package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGameSessionOutput extends js.Object {
  
  /**
    * The updated game session metadata.
    */
  var GameSession: js.UndefOr[typings.awsSdk.gameliftMod.GameSession] = js.native
}
object UpdateGameSessionOutput {
  
  @scala.inline
  def apply(): UpdateGameSessionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGameSessionOutput]
  }
  
  @scala.inline
  implicit class UpdateGameSessionOutputOps[Self <: UpdateGameSessionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGameSession(value: GameSession): Self = this.set("GameSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameSession: Self = this.set("GameSession", js.undefined)
  }
}

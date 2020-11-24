package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopGameSessionPlacementOutput extends js.Object {
  
  /**
    * Object that describes the canceled game session placement, with CANCELLED status and an end time stamp. 
    */
  var GameSessionPlacement: js.UndefOr[typings.awsSdk.gameliftMod.GameSessionPlacement] = js.native
}
object StopGameSessionPlacementOutput {
  
  @scala.inline
  def apply(): StopGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopGameSessionPlacementOutput]
  }
  
  @scala.inline
  implicit class StopGameSessionPlacementOutputOps[Self <: StopGameSessionPlacementOutput] (val x: Self) extends AnyVal {
    
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
    def setGameSessionPlacement(value: GameSessionPlacement): Self = this.set("GameSessionPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameSessionPlacement: Self = this.set("GameSessionPlacement", js.undefined)
  }
}

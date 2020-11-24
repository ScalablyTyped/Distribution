package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameSessionQueueDestination extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to fleet or fleet alias. ARNs, which include a fleet ID or alias ID and a Region name, provide a unique identifier across all Regions. 
    */
  var DestinationArn: js.UndefOr[ArnStringModel] = js.native
}
object GameSessionQueueDestination {
  
  @scala.inline
  def apply(): GameSessionQueueDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSessionQueueDestination]
  }
  
  @scala.inline
  implicit class GameSessionQueueDestinationOps[Self <: GameSessionQueueDestination] (val x: Self) extends AnyVal {
    
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
    def setDestinationArn(value: ArnStringModel): Self = this.set("DestinationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationArn: Self = this.set("DestinationArn", js.undefined)
  }
}

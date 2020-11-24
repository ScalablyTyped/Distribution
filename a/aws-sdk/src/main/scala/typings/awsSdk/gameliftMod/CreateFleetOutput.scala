package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFleetOutput extends js.Object {
  
  /**
    * Properties for the newly created fleet.
    */
  var FleetAttributes: js.UndefOr[typings.awsSdk.gameliftMod.FleetAttributes] = js.native
}
object CreateFleetOutput {
  
  @scala.inline
  def apply(): CreateFleetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetOutput]
  }
  
  @scala.inline
  implicit class CreateFleetOutputOps[Self <: CreateFleetOutput] (val x: Self) extends AnyVal {
    
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
    def setFleetAttributes(value: FleetAttributes): Self = this.set("FleetAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetAttributes: Self = this.set("FleetAttributes", js.undefined)
  }
}

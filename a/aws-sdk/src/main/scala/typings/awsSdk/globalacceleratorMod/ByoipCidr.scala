package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ByoipCidr extends js.Object {
  
  /**
    * The address range, in CIDR notation.
    */
  var Cidr: js.UndefOr[GenericString] = js.native
  
  /**
    * A history of status changes for an IP address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).
    */
  var Events: js.UndefOr[ByoipCidrEvents] = js.native
  
  /**
    * The state of the address pool.
    */
  var State: js.UndefOr[ByoipCidrState] = js.native
}
object ByoipCidr {
  
  @scala.inline
  def apply(): ByoipCidr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByoipCidr]
  }
  
  @scala.inline
  implicit class ByoipCidrOps[Self <: ByoipCidr] (val x: Self) extends AnyVal {
    
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
    def setCidr(value: GenericString): Self = this.set("Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidr: Self = this.set("Cidr", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: ByoipCidrEvent*): Self = this.set("Events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: ByoipCidrEvents): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
    
    @scala.inline
    def setState(value: ByoipCidrState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}

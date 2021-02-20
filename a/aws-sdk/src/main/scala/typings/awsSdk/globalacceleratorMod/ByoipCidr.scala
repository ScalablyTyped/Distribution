package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ByoipCidr extends StObject {
  
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
  implicit class ByoipCidrMutableBuilder[Self <: ByoipCidr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: GenericString): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
    
    @scala.inline
    def setEvents(value: ByoipCidrEvents): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: ByoipCidrEvent*): Self = StObject.set(x, "Events", js.Array(value :_*))
    
    @scala.inline
    def setState(value: ByoipCidrState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}

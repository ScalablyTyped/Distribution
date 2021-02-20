package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPSetUpdate extends StObject {
  
  /**
    * Specifies whether to insert or delete an IP address with UpdateIPSet.
    */
  var Action: ChangeAction = js.native
  
  /**
    * The IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) that web requests originate from.
    */
  var IPSetDescriptor: typings.awsSdk.wafMod.IPSetDescriptor = js.native
}
object IPSetUpdate {
  
  @scala.inline
  def apply(Action: ChangeAction, IPSetDescriptor: IPSetDescriptor): IPSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], IPSetDescriptor = IPSetDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSetUpdate]
  }
  
  @scala.inline
  implicit class IPSetUpdateMutableBuilder[Self <: IPSetUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPSetDescriptor(value: IPSetDescriptor): Self = StObject.set(x, "IPSetDescriptor", value.asInstanceOf[js.Any])
  }
}

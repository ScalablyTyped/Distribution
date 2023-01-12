package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPSetUpdate extends StObject {
  
  /**
    * Specifies whether to insert or delete an IP address with UpdateIPSet.
    */
  var Action: ChangeAction
  
  /**
    * The IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) that web requests originate from.
    */
  var IPSetDescriptor: typings.awsSdk.clientsWafMod.IPSetDescriptor
}
object IPSetUpdate {
  
  inline def apply(Action: ChangeAction, IPSetDescriptor: IPSetDescriptor): IPSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], IPSetDescriptor = IPSetDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSetUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPSetUpdate] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setIPSetDescriptor(value: IPSetDescriptor): Self = StObject.set(x, "IPSetDescriptor", value.asInstanceOf[js.Any])
  }
}

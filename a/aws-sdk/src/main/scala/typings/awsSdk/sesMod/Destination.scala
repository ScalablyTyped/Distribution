package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  /**
    * The recipients to place on the BCC: line of the message.
    */
  var BccAddresses: js.UndefOr[AddressList] = js.undefined
  
  /**
    * The recipients to place on the CC: line of the message.
    */
  var CcAddresses: js.UndefOr[AddressList] = js.undefined
  
  /**
    * The recipients to place on the To: line of the message.
    */
  var ToAddresses: js.UndefOr[AddressList] = js.undefined
}
object Destination {
  
  inline def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  
  extension [Self <: Destination](x: Self) {
    
    inline def setBccAddresses(value: AddressList): Self = StObject.set(x, "BccAddresses", value.asInstanceOf[js.Any])
    
    inline def setBccAddressesUndefined: Self = StObject.set(x, "BccAddresses", js.undefined)
    
    inline def setBccAddressesVarargs(value: Address*): Self = StObject.set(x, "BccAddresses", js.Array(value :_*))
    
    inline def setCcAddresses(value: AddressList): Self = StObject.set(x, "CcAddresses", value.asInstanceOf[js.Any])
    
    inline def setCcAddressesUndefined: Self = StObject.set(x, "CcAddresses", js.undefined)
    
    inline def setCcAddressesVarargs(value: Address*): Self = StObject.set(x, "CcAddresses", js.Array(value :_*))
    
    inline def setToAddresses(value: AddressList): Self = StObject.set(x, "ToAddresses", value.asInstanceOf[js.Any])
    
    inline def setToAddressesUndefined: Self = StObject.set(x, "ToAddresses", js.undefined)
    
    inline def setToAddressesVarargs(value: Address*): Self = StObject.set(x, "ToAddresses", js.Array(value :_*))
  }
}

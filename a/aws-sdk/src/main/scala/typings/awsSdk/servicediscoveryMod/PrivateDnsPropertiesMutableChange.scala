package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateDnsPropertiesMutableChange extends StObject {
  
  /**
    * Updated fields for the Start of Authority (SOA) record for the hosted zone for the private DNS namespace.
    */
  var SOA: SOAChange
}
object PrivateDnsPropertiesMutableChange {
  
  inline def apply(SOA: SOAChange): PrivateDnsPropertiesMutableChange = {
    val __obj = js.Dynamic.literal(SOA = SOA.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateDnsPropertiesMutableChange]
  }
  
  extension [Self <: PrivateDnsPropertiesMutableChange](x: Self) {
    
    inline def setSOA(value: SOAChange): Self = StObject.set(x, "SOA", value.asInstanceOf[js.Any])
  }
}

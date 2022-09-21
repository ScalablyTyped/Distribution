package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateDnsPropertiesMutable extends StObject {
  
  /**
    * Fields for the Start of Authority (SOA) record for the hosted zone for the private DNS namespace.
    */
  var SOA: typings.awsSdk.servicediscoveryMod.SOA
}
object PrivateDnsPropertiesMutable {
  
  inline def apply(SOA: SOA): PrivateDnsPropertiesMutable = {
    val __obj = js.Dynamic.literal(SOA = SOA.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateDnsPropertiesMutable]
  }
  
  extension [Self <: PrivateDnsPropertiesMutable](x: Self) {
    
    inline def setSOA(value: SOA): Self = StObject.set(x, "SOA", value.asInstanceOf[js.Any])
  }
}

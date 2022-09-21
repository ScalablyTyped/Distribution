package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicDnsPropertiesMutable extends StObject {
  
  /**
    * Start of Authority (SOA) record for the hosted zone for the public DNS namespace.
    */
  var SOA: typings.awsSdk.servicediscoveryMod.SOA
}
object PublicDnsPropertiesMutable {
  
  inline def apply(SOA: SOA): PublicDnsPropertiesMutable = {
    val __obj = js.Dynamic.literal(SOA = SOA.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicDnsPropertiesMutable]
  }
  
  extension [Self <: PublicDnsPropertiesMutable](x: Self) {
    
    inline def setSOA(value: SOA): Self = StObject.set(x, "SOA", value.asInstanceOf[js.Any])
  }
}

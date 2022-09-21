package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SOA extends StObject {
  
  /**
    * The time to live (TTL) for purposes of negative caching.
    */
  var TTL: RecordTTL
}
object SOA {
  
  inline def apply(TTL: RecordTTL): SOA = {
    val __obj = js.Dynamic.literal(TTL = TTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[SOA]
  }
  
  extension [Self <: SOA](x: Self) {
    
    inline def setTTL(value: RecordTTL): Self = StObject.set(x, "TTL", value.asInstanceOf[js.Any])
  }
}

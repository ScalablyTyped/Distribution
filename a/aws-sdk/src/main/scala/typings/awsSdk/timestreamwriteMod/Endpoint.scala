package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  /**
    * An endpoint address.
    */
  var Address: String
  
  /**
    * The TTL for the endpoint, in minutes.
    */
  var CachePeriodInMinutes: Long
}
object Endpoint {
  
  inline def apply(Address: String, CachePeriodInMinutes: Long): Endpoint = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], CachePeriodInMinutes = CachePeriodInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  
  extension [Self <: Endpoint](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setCachePeriodInMinutes(value: Long): Self = StObject.set(x, "CachePeriodInMinutes", value.asInstanceOf[js.Any])
  }
}

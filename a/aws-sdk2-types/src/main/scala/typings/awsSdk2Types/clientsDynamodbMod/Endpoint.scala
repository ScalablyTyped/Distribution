package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  /**
    * IP address of the endpoint.
    */
  var Address: String
  
  /**
    * Endpoint cache time to live (TTL) value.
    */
  var CachePeriodInMinutes: Long
}
object Endpoint {
  
  inline def apply(Address: String, CachePeriodInMinutes: Long): Endpoint = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], CachePeriodInMinutes = CachePeriodInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setCachePeriodInMinutes(value: Long): Self = StObject.set(x, "CachePeriodInMinutes", value.asInstanceOf[js.Any])
  }
}

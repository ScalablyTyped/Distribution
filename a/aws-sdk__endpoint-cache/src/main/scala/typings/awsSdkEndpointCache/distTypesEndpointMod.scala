package typings.awsSdkEndpointCache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointMod {
  
  trait Endpoint extends StObject {
    
    /**
      * <p>An endpoint address.</p>
      */
    var Address: String
    
    /**
      * <p>The TTL for the endpoint, in minutes.</p>
      */
    var CachePeriodInMinutes: Double
  }
  object Endpoint {
    
    inline def apply(Address: String, CachePeriodInMinutes: Double): Endpoint = {
      val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], CachePeriodInMinutes = CachePeriodInMinutes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      inline def setCachePeriodInMinutes(value: Double): Self = StObject.set(x, "CachePeriodInMinutes", value.asInstanceOf[js.Any])
    }
  }
}

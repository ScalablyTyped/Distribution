package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEndpointMod {
  
  @js.native
  trait Endpoint extends StObject {
    
    /**
      * _String shape
      */
    var Address: String = js.native
    
    /**
      * _Long shape
      */
    var CachePeriodInMinutes: Double = js.native
  }
  object Endpoint {
    
    @scala.inline
    def apply(Address: String, CachePeriodInMinutes: Double): Endpoint = {
      val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], CachePeriodInMinutes = CachePeriodInMinutes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    @scala.inline
    implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCachePeriodInMinutes(value: Double): Self = StObject.set(x, "CachePeriodInMinutes", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledEndpoint = Endpoint
}

package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointAccessMessage extends StObject {
  
  /**
    * The Redshift-managed VPC endpoint to delete.
    */
  var EndpointName: String
}
object DeleteEndpointAccessMessage {
  
  inline def apply(EndpointName: String): DeleteEndpointAccessMessage = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointAccessMessage]
  }
  
  extension [Self <: DeleteEndpointAccessMessage](x: Self) {
    
    inline def setEndpointName(value: String): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
  }
}

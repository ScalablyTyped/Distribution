package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNamespaceRequest extends StObject {
  
  /**
    * The ID of the namespace that you want to get information about.
    */
  var Id: ResourceId
}
object GetNamespaceRequest {
  
  inline def apply(Id: ResourceId): GetNamespaceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNamespaceRequest]
  }
  
  extension [Self <: GetNamespaceRequest](x: Self) {
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}

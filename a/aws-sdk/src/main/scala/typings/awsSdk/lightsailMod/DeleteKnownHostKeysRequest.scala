package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteKnownHostKeysRequest extends StObject {
  
  /**
    * The name of the instance for which you want to reset the host key or certificate.
    */
  var instanceName: ResourceName
}
object DeleteKnownHostKeysRequest {
  
  inline def apply(instanceName: ResourceName): DeleteKnownHostKeysRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteKnownHostKeysRequest]
  }
  
  extension [Self <: DeleteKnownHostKeysRequest](x: Self) {
    
    inline def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}

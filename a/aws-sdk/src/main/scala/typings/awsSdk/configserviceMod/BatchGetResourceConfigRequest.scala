package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetResourceConfigRequest extends StObject {
  
  /**
    * A list of resource keys to be processed with the current request. Each element in the list consists of the resource type and resource ID.
    */
  var resourceKeys: ResourceKeys
}
object BatchGetResourceConfigRequest {
  
  inline def apply(resourceKeys: ResourceKeys): BatchGetResourceConfigRequest = {
    val __obj = js.Dynamic.literal(resourceKeys = resourceKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetResourceConfigRequest]
  }
  
  extension [Self <: BatchGetResourceConfigRequest](x: Self) {
    
    inline def setResourceKeys(value: ResourceKeys): Self = StObject.set(x, "resourceKeys", value.asInstanceOf[js.Any])
    
    inline def setResourceKeysVarargs(value: ResourceKey*): Self = StObject.set(x, "resourceKeys", js.Array(value*))
  }
}

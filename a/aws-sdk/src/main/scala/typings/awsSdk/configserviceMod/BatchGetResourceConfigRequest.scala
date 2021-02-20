package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetResourceConfigRequest extends StObject {
  
  /**
    * A list of resource keys to be processed with the current request. Each element in the list consists of the resource type and resource ID.
    */
  var resourceKeys: ResourceKeys = js.native
}
object BatchGetResourceConfigRequest {
  
  @scala.inline
  def apply(resourceKeys: ResourceKeys): BatchGetResourceConfigRequest = {
    val __obj = js.Dynamic.literal(resourceKeys = resourceKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetResourceConfigRequest]
  }
  
  @scala.inline
  implicit class BatchGetResourceConfigRequestMutableBuilder[Self <: BatchGetResourceConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceKeys(value: ResourceKeys): Self = StObject.set(x, "resourceKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceKeysVarargs(value: ResourceKey*): Self = StObject.set(x, "resourceKeys", js.Array(value :_*))
  }
}

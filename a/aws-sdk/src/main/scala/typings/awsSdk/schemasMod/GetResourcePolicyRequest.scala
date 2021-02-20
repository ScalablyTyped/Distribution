package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourcePolicyRequest extends StObject {
  
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.native
}
object GetResourcePolicyRequest {
  
  @scala.inline
  def apply(): GetResourcePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePolicyRequest]
  }
  
  @scala.inline
  implicit class GetResourcePolicyRequestMutableBuilder[Self <: GetResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
  }
}

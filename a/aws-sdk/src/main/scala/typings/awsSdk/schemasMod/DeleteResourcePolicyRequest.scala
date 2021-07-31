package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyRequest extends StObject {
  
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.undefined
}
object DeleteResourcePolicyRequest {
  
  @scala.inline
  def apply(): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteResourcePolicyRequestMutableBuilder[Self <: DeleteResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistryName(value: string): Self = StObject.set(x, "RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryNameUndefined: Self = StObject.set(x, "RegistryName", js.undefined)
  }
}

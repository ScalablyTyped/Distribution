package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRepositoryPermissionsPolicyResult extends StObject {
  
  /**
    *  Information about the deleted policy after processing the request. 
    */
  var policy: js.UndefOr[ResourcePolicy] = js.undefined
}
object DeleteRepositoryPermissionsPolicyResult {
  
  @scala.inline
  def apply(): DeleteRepositoryPermissionsPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRepositoryPermissionsPolicyResult]
  }
  
  @scala.inline
  implicit class DeleteRepositoryPermissionsPolicyResultMutableBuilder[Self <: DeleteRepositoryPermissionsPolicyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: ResourcePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}

package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDomainPermissionsPolicyResult extends StObject {
  
  /**
    *  Information about the deleted resource policy after processing the request. 
    */
  var policy: js.UndefOr[ResourcePolicy] = js.native
}
object DeleteDomainPermissionsPolicyResult {
  
  @scala.inline
  def apply(): DeleteDomainPermissionsPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDomainPermissionsPolicyResult]
  }
  
  @scala.inline
  implicit class DeleteDomainPermissionsPolicyResultMutableBuilder[Self <: DeleteDomainPermissionsPolicyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: ResourcePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}

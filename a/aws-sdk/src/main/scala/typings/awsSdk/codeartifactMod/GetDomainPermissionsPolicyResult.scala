package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainPermissionsPolicyResult extends StObject {
  
  /**
    *  The returned resource policy. 
    */
  var policy: js.UndefOr[ResourcePolicy] = js.undefined
}
object GetDomainPermissionsPolicyResult {
  
  @scala.inline
  def apply(): GetDomainPermissionsPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDomainPermissionsPolicyResult]
  }
  
  @scala.inline
  implicit class GetDomainPermissionsPolicyResultMutableBuilder[Self <: GetDomainPermissionsPolicyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: ResourcePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}

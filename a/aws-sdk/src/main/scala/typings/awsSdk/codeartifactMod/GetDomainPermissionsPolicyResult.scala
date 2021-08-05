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
  
  inline def apply(): GetDomainPermissionsPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDomainPermissionsPolicyResult]
  }
  
  extension [Self <: GetDomainPermissionsPolicyResult](x: Self) {
    
    inline def setPolicy(value: ResourcePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}

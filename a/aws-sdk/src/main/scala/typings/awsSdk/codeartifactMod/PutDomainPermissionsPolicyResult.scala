package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutDomainPermissionsPolicyResult extends StObject {
  
  /**
    *  The resource policy that was set after processing the request. 
    */
  var policy: js.UndefOr[ResourcePolicy] = js.undefined
}
object PutDomainPermissionsPolicyResult {
  
  inline def apply(): PutDomainPermissionsPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutDomainPermissionsPolicyResult]
  }
  
  extension [Self <: PutDomainPermissionsPolicyResult](x: Self) {
    
    inline def setPolicy(value: ResourcePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}

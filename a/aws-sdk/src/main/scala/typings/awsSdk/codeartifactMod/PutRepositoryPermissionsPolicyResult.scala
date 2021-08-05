package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRepositoryPermissionsPolicyResult extends StObject {
  
  /**
    *  The resource policy that was set after processing the request. 
    */
  var policy: js.UndefOr[ResourcePolicy] = js.undefined
}
object PutRepositoryPermissionsPolicyResult {
  
  inline def apply(): PutRepositoryPermissionsPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRepositoryPermissionsPolicyResult]
  }
  
  extension [Self <: PutRepositoryPermissionsPolicyResult](x: Self) {
    
    inline def setPolicy(value: ResourcePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}

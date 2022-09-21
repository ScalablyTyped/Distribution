package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeSigningPolicies extends StObject {
  
  /**
    * Code signing configuration policy for deployment validation failure. If you set the policy to Enforce, Lambda blocks the deployment request if signature validation checks fail. If you set the policy to Warn, Lambda allows the deployment and creates a CloudWatch log.  Default value: Warn 
    */
  var UntrustedArtifactOnDeployment: js.UndefOr[CodeSigningPolicy] = js.undefined
}
object CodeSigningPolicies {
  
  inline def apply(): CodeSigningPolicies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeSigningPolicies]
  }
  
  extension [Self <: CodeSigningPolicies](x: Self) {
    
    inline def setUntrustedArtifactOnDeployment(value: CodeSigningPolicy): Self = StObject.set(x, "UntrustedArtifactOnDeployment", value.asInstanceOf[js.Any])
    
    inline def setUntrustedArtifactOnDeploymentUndefined: Self = StObject.set(x, "UntrustedArtifactOnDeployment", js.undefined)
  }
}

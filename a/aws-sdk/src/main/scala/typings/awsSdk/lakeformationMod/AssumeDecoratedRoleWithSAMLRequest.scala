package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssumeDecoratedRoleWithSAMLRequest extends StObject {
  
  /**
    * The time period, between 900 and 43,200 seconds, for the timeout of the temporary credentials.
    */
  var DurationSeconds: js.UndefOr[CredentialTimeoutDurationSecondInteger] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
    */
  var PrincipalArn: IAMSAMLProviderArn
  
  /**
    * The role that represents an IAM principal whose scope down policy allows it to call credential vending APIs such as GetTemporaryTableCredentials. The caller must also have iam:PassRole permission on this role. 
    */
  var RoleArn: IAMRoleArn
  
  /**
    * A SAML assertion consisting of an assertion statement for the user who needs temporary credentials. This must match the SAML assertion that was issued to IAM. This must be Base64 encoded.
    */
  var SAMLAssertion: SAMLAssertionString
}
object AssumeDecoratedRoleWithSAMLRequest {
  
  inline def apply(PrincipalArn: IAMSAMLProviderArn, RoleArn: IAMRoleArn, SAMLAssertion: SAMLAssertionString): AssumeDecoratedRoleWithSAMLRequest = {
    val __obj = js.Dynamic.literal(PrincipalArn = PrincipalArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], SAMLAssertion = SAMLAssertion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssumeDecoratedRoleWithSAMLRequest]
  }
  
  extension [Self <: AssumeDecoratedRoleWithSAMLRequest](x: Self) {
    
    inline def setDurationSeconds(value: CredentialTimeoutDurationSecondInteger): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
    
    inline def setPrincipalArn(value: IAMSAMLProviderArn): Self = StObject.set(x, "PrincipalArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: IAMRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSAMLAssertion(value: SAMLAssertionString): Self = StObject.set(x, "SAMLAssertion", value.asInstanceOf[js.Any])
  }
}

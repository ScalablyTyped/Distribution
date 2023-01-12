package typings.awsSdk

import typings.awsSdk.libCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCredentialsSamlCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/saml_credentials", "SAMLCredentials")
  @js.native
  open class SAMLCredentials protected () extends Credentials {
    /**
    		 * Creates a new credentials object.
    		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
    		 */
    def this(params: SAMLCredentialsParams) = this()
    
    var params: SAMLCredentialsParams = js.native
  }
  
  trait SAMLCredentialsParams extends StObject {
    
    /**
      * The duration, in seconds, of the role session.
      * The minimum duration is 15 minutes.
      * The maximum duration is 12 hours.
      */
    var DurationSeconds: js.UndefOr[Double] = js.undefined
    
    /**
      * An IAM policy in JSON format.
      * The policy plain text must be 2048 bytes or shorter.
      */
    var Policy: js.UndefOr[String] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
      */
    var PrincipalArn: String
    
    /**
      * The Amazon Resource Name (ARN) of the role that the caller is assuming.
      */
    var RoleArn: String
    
    /**
      * The base-64 encoded SAML authentication response provided by the IdP.
      */
    var SAMLAssertion: String
  }
  object SAMLCredentialsParams {
    
    inline def apply(PrincipalArn: String, RoleArn: String, SAMLAssertion: String): SAMLCredentialsParams = {
      val __obj = js.Dynamic.literal(PrincipalArn = PrincipalArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], SAMLAssertion = SAMLAssertion.asInstanceOf[js.Any])
      __obj.asInstanceOf[SAMLCredentialsParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SAMLCredentialsParams] (val x: Self) extends AnyVal {
      
      inline def setDurationSeconds(value: Double): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
      
      inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
      
      inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
      
      inline def setPrincipalArn(value: String): Self = StObject.set(x, "PrincipalArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArn(value: String): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
      
      inline def setSAMLAssertion(value: String): Self = StObject.set(x, "SAMLAssertion", value.asInstanceOf[js.Any])
    }
  }
}

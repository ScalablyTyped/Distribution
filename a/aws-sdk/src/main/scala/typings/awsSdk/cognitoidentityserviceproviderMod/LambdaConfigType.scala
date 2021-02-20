package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaConfigType extends StObject {
  
  /**
    * Creates an authentication challenge.
    */
  var CreateAuthChallenge: js.UndefOr[ArnType] = js.native
  
  /**
    * A custom Message AWS Lambda trigger.
    */
  var CustomMessage: js.UndefOr[ArnType] = js.native
  
  /**
    * Defines the authentication challenge.
    */
  var DefineAuthChallenge: js.UndefOr[ArnType] = js.native
  
  /**
    * A post-authentication AWS Lambda trigger.
    */
  var PostAuthentication: js.UndefOr[ArnType] = js.native
  
  /**
    * A post-confirmation AWS Lambda trigger.
    */
  var PostConfirmation: js.UndefOr[ArnType] = js.native
  
  /**
    * A pre-authentication AWS Lambda trigger.
    */
  var PreAuthentication: js.UndefOr[ArnType] = js.native
  
  /**
    * A pre-registration AWS Lambda trigger.
    */
  var PreSignUp: js.UndefOr[ArnType] = js.native
  
  /**
    * A Lambda trigger that is invoked before token generation.
    */
  var PreTokenGeneration: js.UndefOr[ArnType] = js.native
  
  /**
    * The user migration Lambda config type.
    */
  var UserMigration: js.UndefOr[ArnType] = js.native
  
  /**
    * Verifies the authentication challenge response.
    */
  var VerifyAuthChallengeResponse: js.UndefOr[ArnType] = js.native
}
object LambdaConfigType {
  
  @scala.inline
  def apply(): LambdaConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaConfigType]
  }
  
  @scala.inline
  implicit class LambdaConfigTypeMutableBuilder[Self <: LambdaConfigType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateAuthChallenge(value: ArnType): Self = StObject.set(x, "CreateAuthChallenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateAuthChallengeUndefined: Self = StObject.set(x, "CreateAuthChallenge", js.undefined)
    
    @scala.inline
    def setCustomMessage(value: ArnType): Self = StObject.set(x, "CustomMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMessageUndefined: Self = StObject.set(x, "CustomMessage", js.undefined)
    
    @scala.inline
    def setDefineAuthChallenge(value: ArnType): Self = StObject.set(x, "DefineAuthChallenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefineAuthChallengeUndefined: Self = StObject.set(x, "DefineAuthChallenge", js.undefined)
    
    @scala.inline
    def setPostAuthentication(value: ArnType): Self = StObject.set(x, "PostAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostAuthenticationUndefined: Self = StObject.set(x, "PostAuthentication", js.undefined)
    
    @scala.inline
    def setPostConfirmation(value: ArnType): Self = StObject.set(x, "PostConfirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostConfirmationUndefined: Self = StObject.set(x, "PostConfirmation", js.undefined)
    
    @scala.inline
    def setPreAuthentication(value: ArnType): Self = StObject.set(x, "PreAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreAuthenticationUndefined: Self = StObject.set(x, "PreAuthentication", js.undefined)
    
    @scala.inline
    def setPreSignUp(value: ArnType): Self = StObject.set(x, "PreSignUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreSignUpUndefined: Self = StObject.set(x, "PreSignUp", js.undefined)
    
    @scala.inline
    def setPreTokenGeneration(value: ArnType): Self = StObject.set(x, "PreTokenGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreTokenGenerationUndefined: Self = StObject.set(x, "PreTokenGeneration", js.undefined)
    
    @scala.inline
    def setUserMigration(value: ArnType): Self = StObject.set(x, "UserMigration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMigrationUndefined: Self = StObject.set(x, "UserMigration", js.undefined)
    
    @scala.inline
    def setVerifyAuthChallengeResponse(value: ArnType): Self = StObject.set(x, "VerifyAuthChallengeResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyAuthChallengeResponseUndefined: Self = StObject.set(x, "VerifyAuthChallengeResponse", js.undefined)
  }
}

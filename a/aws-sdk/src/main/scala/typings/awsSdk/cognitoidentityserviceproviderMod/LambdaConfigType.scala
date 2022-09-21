package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaConfigType extends StObject {
  
  /**
    * Creates an authentication challenge.
    */
  var CreateAuthChallenge: js.UndefOr[ArnType] = js.undefined
  
  /**
    * A custom email sender Lambda trigger.
    */
  var CustomEmailSender: js.UndefOr[CustomEmailLambdaVersionConfigType] = js.undefined
  
  /**
    * A custom Message Lambda trigger.
    */
  var CustomMessage: js.UndefOr[ArnType] = js.undefined
  
  /**
    * A custom SMS sender Lambda trigger.
    */
  var CustomSMSSender: js.UndefOr[CustomSMSLambdaVersionConfigType] = js.undefined
  
  /**
    * Defines the authentication challenge.
    */
  var DefineAuthChallenge: js.UndefOr[ArnType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an KMS key. Amazon Cognito uses the key to encrypt codes and temporary passwords sent to CustomEmailSender and CustomSMSSender.
    */
  var KMSKeyID: js.UndefOr[ArnType] = js.undefined
  
  /**
    * A post-authentication Lambda trigger.
    */
  var PostAuthentication: js.UndefOr[ArnType] = js.undefined
  
  /**
    * A post-confirmation Lambda trigger.
    */
  var PostConfirmation: js.UndefOr[ArnType] = js.undefined
  
  /**
    * A pre-authentication Lambda trigger.
    */
  var PreAuthentication: js.UndefOr[ArnType] = js.undefined
  
  /**
    * A pre-registration Lambda trigger.
    */
  var PreSignUp: js.UndefOr[ArnType] = js.undefined
  
  /**
    * A Lambda trigger that is invoked before token generation.
    */
  var PreTokenGeneration: js.UndefOr[ArnType] = js.undefined
  
  /**
    * The user migration Lambda config type.
    */
  var UserMigration: js.UndefOr[ArnType] = js.undefined
  
  /**
    * Verifies the authentication challenge response.
    */
  var VerifyAuthChallengeResponse: js.UndefOr[ArnType] = js.undefined
}
object LambdaConfigType {
  
  inline def apply(): LambdaConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaConfigType]
  }
  
  extension [Self <: LambdaConfigType](x: Self) {
    
    inline def setCreateAuthChallenge(value: ArnType): Self = StObject.set(x, "CreateAuthChallenge", value.asInstanceOf[js.Any])
    
    inline def setCreateAuthChallengeUndefined: Self = StObject.set(x, "CreateAuthChallenge", js.undefined)
    
    inline def setCustomEmailSender(value: CustomEmailLambdaVersionConfigType): Self = StObject.set(x, "CustomEmailSender", value.asInstanceOf[js.Any])
    
    inline def setCustomEmailSenderUndefined: Self = StObject.set(x, "CustomEmailSender", js.undefined)
    
    inline def setCustomMessage(value: ArnType): Self = StObject.set(x, "CustomMessage", value.asInstanceOf[js.Any])
    
    inline def setCustomMessageUndefined: Self = StObject.set(x, "CustomMessage", js.undefined)
    
    inline def setCustomSMSSender(value: CustomSMSLambdaVersionConfigType): Self = StObject.set(x, "CustomSMSSender", value.asInstanceOf[js.Any])
    
    inline def setCustomSMSSenderUndefined: Self = StObject.set(x, "CustomSMSSender", js.undefined)
    
    inline def setDefineAuthChallenge(value: ArnType): Self = StObject.set(x, "DefineAuthChallenge", value.asInstanceOf[js.Any])
    
    inline def setDefineAuthChallengeUndefined: Self = StObject.set(x, "DefineAuthChallenge", js.undefined)
    
    inline def setKMSKeyID(value: ArnType): Self = StObject.set(x, "KMSKeyID", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyIDUndefined: Self = StObject.set(x, "KMSKeyID", js.undefined)
    
    inline def setPostAuthentication(value: ArnType): Self = StObject.set(x, "PostAuthentication", value.asInstanceOf[js.Any])
    
    inline def setPostAuthenticationUndefined: Self = StObject.set(x, "PostAuthentication", js.undefined)
    
    inline def setPostConfirmation(value: ArnType): Self = StObject.set(x, "PostConfirmation", value.asInstanceOf[js.Any])
    
    inline def setPostConfirmationUndefined: Self = StObject.set(x, "PostConfirmation", js.undefined)
    
    inline def setPreAuthentication(value: ArnType): Self = StObject.set(x, "PreAuthentication", value.asInstanceOf[js.Any])
    
    inline def setPreAuthenticationUndefined: Self = StObject.set(x, "PreAuthentication", js.undefined)
    
    inline def setPreSignUp(value: ArnType): Self = StObject.set(x, "PreSignUp", value.asInstanceOf[js.Any])
    
    inline def setPreSignUpUndefined: Self = StObject.set(x, "PreSignUp", js.undefined)
    
    inline def setPreTokenGeneration(value: ArnType): Self = StObject.set(x, "PreTokenGeneration", value.asInstanceOf[js.Any])
    
    inline def setPreTokenGenerationUndefined: Self = StObject.set(x, "PreTokenGeneration", js.undefined)
    
    inline def setUserMigration(value: ArnType): Self = StObject.set(x, "UserMigration", value.asInstanceOf[js.Any])
    
    inline def setUserMigrationUndefined: Self = StObject.set(x, "UserMigration", js.undefined)
    
    inline def setVerifyAuthChallengeResponse(value: ArnType): Self = StObject.set(x, "VerifyAuthChallengeResponse", value.asInstanceOf[js.Any])
    
    inline def setVerifyAuthChallengeResponseUndefined: Self = StObject.set(x, "VerifyAuthChallengeResponse", js.undefined)
  }
}

package typings.azureMsalCommon

import typings.azureMsalCommon.distUtilsMsalTypesMod.StringDict
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestRequestValidatorMod {
  
  @JSImport("@azure/msal-common/dist/request/RequestValidator", "RequestValidator")
  @js.native
  open class RequestValidator () extends StObject
  /* static members */
  object RequestValidator {
    
    @JSImport("@azure/msal-common/dist/request/RequestValidator", "RequestValidator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Removes unnecessary, duplicate, and empty string query parameters from extraQueryParameters
      * @param request
      */
    inline def sanitizeEQParams(eQParams: StringDict, queryParams: Map[String, String]): StringDict = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeEQParams")(eQParams.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any])).asInstanceOf[StringDict]
    
    inline def validateClaims(claims: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateClaims")(claims.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Utility to validate code_challenge_method
      * @param codeChallengeMethod
      */
    inline def validateCodeChallengeMethod(codeChallengeMethod: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCodeChallengeMethod")(codeChallengeMethod.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Utility to validate code_challenge and code_challenge_method
      * @param codeChallenge
      * @param codeChallengeMethod
      */
    inline def validateCodeChallengeParams(codeChallenge: String, codeChallengeMethod: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateCodeChallengeParams")(codeChallenge.asInstanceOf[js.Any], codeChallengeMethod.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Utility to validate prompt sent by the user in the request
      * @param prompt
      */
    inline def validatePrompt(prompt: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePrompt")(prompt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Utility to check if the `redirectUri` in the request is a non-null value
      * @param redirectUri
      */
    inline def validateRedirectUri(redirectUri: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateRedirectUri")(redirectUri.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}

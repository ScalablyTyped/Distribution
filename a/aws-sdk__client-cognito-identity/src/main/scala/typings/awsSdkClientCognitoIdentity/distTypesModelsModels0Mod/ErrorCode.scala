package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.AccessDenied
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InternalServerError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined { readonly ACCESS_DENIED :'AccessDenied',  readonly INTERNAL_SERVER_ERROR :'InternalServerError'}[keyof { readonly ACCESS_DENIED :'AccessDenied',  readonly INTERNAL_SERVER_ERROR :'InternalServerError'}] */
/* Rewritten from type alias, can be one of: 
  - typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.AccessDenied
  - typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InternalServerError
*/
trait ErrorCode extends StObject
object ErrorCode {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models/models_0", "ErrorCode.ACCESS_DENIED")
  @js.native
  val ACCESS_DENIED: AccessDenied = js.native
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/models/models_0", "ErrorCode.INTERNAL_SERVER_ERROR")
  @js.native
  val INTERNAL_SERVER_ERROR: InternalServerError = js.native
}

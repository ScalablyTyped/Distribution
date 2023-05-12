package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsGetCredentialsForIdentityCommandMod.GetCredentialsForIdentityCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "GetCredentialsForIdentityCommand")
@js.native
open class GetCredentialsForIdentityCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.GetCredentialsForIdentityCommand {
  /**
    * @public
    */
  def this(input: GetCredentialsForIdentityCommandInput) = this()
}
/* static members */
object GetCredentialsForIdentityCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "GetCredentialsForIdentityCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

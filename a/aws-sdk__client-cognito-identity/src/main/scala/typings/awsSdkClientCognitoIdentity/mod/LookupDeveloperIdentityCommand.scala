package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsLookupDeveloperIdentityCommandMod.LookupDeveloperIdentityCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "LookupDeveloperIdentityCommand")
@js.native
open class LookupDeveloperIdentityCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.LookupDeveloperIdentityCommand {
  /**
    * @public
    */
  def this(input: LookupDeveloperIdentityCommandInput) = this()
}
/* static members */
object LookupDeveloperIdentityCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "LookupDeveloperIdentityCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

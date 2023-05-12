package typings.awsSdkClientCognitoIdentity.distTypesCommandsMod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsDeleteIdentitiesCommandMod.DeleteIdentitiesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "DeleteIdentitiesCommand")
@js.native
open class DeleteIdentitiesCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsDeleteIdentitiesCommandMod.DeleteIdentitiesCommand {
  /**
    * @public
    */
  def this(input: DeleteIdentitiesCommandInput) = this()
}
/* static members */
object DeleteIdentitiesCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "DeleteIdentitiesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

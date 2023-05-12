package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsDeleteIdentitiesCommandMod.DeleteIdentitiesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "DeleteIdentitiesCommand")
@js.native
open class DeleteIdentitiesCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.DeleteIdentitiesCommand {
  /**
    * @public
    */
  def this(input: DeleteIdentitiesCommandInput) = this()
}
/* static members */
object DeleteIdentitiesCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "DeleteIdentitiesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsListIdentitiesCommandMod.ListIdentitiesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "ListIdentitiesCommand")
@js.native
open class ListIdentitiesCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.ListIdentitiesCommand {
  /**
    * @public
    */
  def this(input: ListIdentitiesCommandInput) = this()
}
/* static members */
object ListIdentitiesCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "ListIdentitiesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

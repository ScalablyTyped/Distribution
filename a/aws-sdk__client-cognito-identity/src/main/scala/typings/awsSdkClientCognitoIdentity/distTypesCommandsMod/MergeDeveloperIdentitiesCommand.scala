package typings.awsSdkClientCognitoIdentity.distTypesCommandsMod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsMergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "MergeDeveloperIdentitiesCommand")
@js.native
open class MergeDeveloperIdentitiesCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommand {
  /**
    * @public
    */
  def this(input: MergeDeveloperIdentitiesCommandInput) = this()
}
/* static members */
object MergeDeveloperIdentitiesCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands", "MergeDeveloperIdentitiesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

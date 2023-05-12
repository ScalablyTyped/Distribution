package typings.awsSdkClientCognitoIdentity.mod

import typings.awsSdkClientCognitoIdentity.distTypesCommandsMergeDeveloperIdentitiesCommandMod.MergeDeveloperIdentitiesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity", "MergeDeveloperIdentitiesCommand")
@js.native
open class MergeDeveloperIdentitiesCommand protected ()
  extends typings.awsSdkClientCognitoIdentity.distTypesCommandsMod.MergeDeveloperIdentitiesCommand {
  /**
    * @public
    */
  def this(input: MergeDeveloperIdentitiesCommandInput) = this()
}
/* static members */
object MergeDeveloperIdentitiesCommand {
  
  @JSImport("@aws-sdk/client-cognito-identity", "MergeDeveloperIdentitiesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

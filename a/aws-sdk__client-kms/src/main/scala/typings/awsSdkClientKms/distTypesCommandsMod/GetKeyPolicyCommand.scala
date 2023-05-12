package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsGetKeyPolicyCommandMod.GetKeyPolicyCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "GetKeyPolicyCommand")
@js.native
open class GetKeyPolicyCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsGetKeyPolicyCommandMod.GetKeyPolicyCommand {
  /**
    * @public
    */
  def this(input: GetKeyPolicyCommandInput) = this()
}
/* static members */
object GetKeyPolicyCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "GetKeyPolicyCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

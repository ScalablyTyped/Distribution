package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsPutKeyPolicyCommandMod.PutKeyPolicyCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "PutKeyPolicyCommand")
@js.native
open class PutKeyPolicyCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsPutKeyPolicyCommandMod.PutKeyPolicyCommand {
  /**
    * @public
    */
  def this(input: PutKeyPolicyCommandInput) = this()
}
/* static members */
object PutKeyPolicyCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "PutKeyPolicyCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

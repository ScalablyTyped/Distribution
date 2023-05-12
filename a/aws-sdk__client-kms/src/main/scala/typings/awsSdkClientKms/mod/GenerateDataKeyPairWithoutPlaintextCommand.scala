package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsGenerateDataKeyPairWithoutPlaintextCommandMod.GenerateDataKeyPairWithoutPlaintextCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "GenerateDataKeyPairWithoutPlaintextCommand")
@js.native
open class GenerateDataKeyPairWithoutPlaintextCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.GenerateDataKeyPairWithoutPlaintextCommand {
  /**
    * @public
    */
  def this(input: GenerateDataKeyPairWithoutPlaintextCommandInput) = this()
}
/* static members */
object GenerateDataKeyPairWithoutPlaintextCommand {
  
  @JSImport("@aws-sdk/client-kms", "GenerateDataKeyPairWithoutPlaintextCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

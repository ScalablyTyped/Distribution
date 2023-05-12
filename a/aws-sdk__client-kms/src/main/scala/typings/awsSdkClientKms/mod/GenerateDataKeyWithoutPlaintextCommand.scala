package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsGenerateDataKeyWithoutPlaintextCommandMod.GenerateDataKeyWithoutPlaintextCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "GenerateDataKeyWithoutPlaintextCommand")
@js.native
open class GenerateDataKeyWithoutPlaintextCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.GenerateDataKeyWithoutPlaintextCommand {
  /**
    * @public
    */
  def this(input: GenerateDataKeyWithoutPlaintextCommandInput) = this()
}
/* static members */
object GenerateDataKeyWithoutPlaintextCommand {
  
  @JSImport("@aws-sdk/client-kms", "GenerateDataKeyWithoutPlaintextCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsGenerateDataKeyPairCommandMod.GenerateDataKeyPairCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "GenerateDataKeyPairCommand")
@js.native
open class GenerateDataKeyPairCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsGenerateDataKeyPairCommandMod.GenerateDataKeyPairCommand {
  /**
    * @public
    */
  def this(input: GenerateDataKeyPairCommandInput) = this()
}
/* static members */
object GenerateDataKeyPairCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "GenerateDataKeyPairCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

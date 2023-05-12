package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsGenerateDataKeyCommandMod.GenerateDataKeyCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "GenerateDataKeyCommand")
@js.native
open class GenerateDataKeyCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsGenerateDataKeyCommandMod.GenerateDataKeyCommand {
  /**
    * @public
    */
  def this(input: GenerateDataKeyCommandInput) = this()
}
/* static members */
object GenerateDataKeyCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "GenerateDataKeyCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

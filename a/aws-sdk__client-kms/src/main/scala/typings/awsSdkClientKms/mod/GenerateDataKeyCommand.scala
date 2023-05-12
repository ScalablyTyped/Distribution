package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsGenerateDataKeyCommandMod.GenerateDataKeyCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "GenerateDataKeyCommand")
@js.native
open class GenerateDataKeyCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.GenerateDataKeyCommand {
  /**
    * @public
    */
  def this(input: GenerateDataKeyCommandInput) = this()
}
/* static members */
object GenerateDataKeyCommand {
  
  @JSImport("@aws-sdk/client-kms", "GenerateDataKeyCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

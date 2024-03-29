package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsGenerateMacCommandMod.GenerateMacCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "GenerateMacCommand")
@js.native
open class GenerateMacCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.GenerateMacCommand {
  /**
    * @public
    */
  def this(input: GenerateMacCommandInput) = this()
}
/* static members */
object GenerateMacCommand {
  
  @JSImport("@aws-sdk/client-kms", "GenerateMacCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

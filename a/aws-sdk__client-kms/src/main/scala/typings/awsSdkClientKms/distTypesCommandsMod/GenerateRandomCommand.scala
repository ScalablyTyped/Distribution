package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsGenerateRandomCommandMod.GenerateRandomCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "GenerateRandomCommand")
@js.native
open class GenerateRandomCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsGenerateRandomCommandMod.GenerateRandomCommand {
  /**
    * @public
    */
  def this(input: GenerateRandomCommandInput) = this()
}
/* static members */
object GenerateRandomCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "GenerateRandomCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

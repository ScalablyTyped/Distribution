package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsGetParametersForImportCommandMod.GetParametersForImportCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "GetParametersForImportCommand")
@js.native
open class GetParametersForImportCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsGetParametersForImportCommandMod.GetParametersForImportCommand {
  /**
    * @public
    */
  def this(input: GetParametersForImportCommandInput) = this()
}
/* static members */
object GetParametersForImportCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "GetParametersForImportCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsGetParametersForImportCommandMod.GetParametersForImportCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "GetParametersForImportCommand")
@js.native
open class GetParametersForImportCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.GetParametersForImportCommand {
  /**
    * @public
    */
  def this(input: GetParametersForImportCommandInput) = this()
}
/* static members */
object GetParametersForImportCommand {
  
  @JSImport("@aws-sdk/client-kms", "GetParametersForImportCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

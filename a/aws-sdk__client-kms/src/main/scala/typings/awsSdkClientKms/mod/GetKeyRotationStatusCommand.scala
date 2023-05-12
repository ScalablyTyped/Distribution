package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsGetKeyRotationStatusCommandMod.GetKeyRotationStatusCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "GetKeyRotationStatusCommand")
@js.native
open class GetKeyRotationStatusCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.GetKeyRotationStatusCommand {
  /**
    * @public
    */
  def this(input: GetKeyRotationStatusCommandInput) = this()
}
/* static members */
object GetKeyRotationStatusCommand {
  
  @JSImport("@aws-sdk/client-kms", "GetKeyRotationStatusCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

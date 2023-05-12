package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsDisableKeyRotationCommandMod.DisableKeyRotationCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "DisableKeyRotationCommand")
@js.native
open class DisableKeyRotationCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.DisableKeyRotationCommand {
  /**
    * @public
    */
  def this(input: DisableKeyRotationCommandInput) = this()
}
/* static members */
object DisableKeyRotationCommand {
  
  @JSImport("@aws-sdk/client-kms", "DisableKeyRotationCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

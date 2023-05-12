package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsEnableKeyRotationCommandMod.EnableKeyRotationCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "EnableKeyRotationCommand")
@js.native
open class EnableKeyRotationCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.EnableKeyRotationCommand {
  /**
    * @public
    */
  def this(input: EnableKeyRotationCommandInput) = this()
}
/* static members */
object EnableKeyRotationCommand {
  
  @JSImport("@aws-sdk/client-kms", "EnableKeyRotationCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

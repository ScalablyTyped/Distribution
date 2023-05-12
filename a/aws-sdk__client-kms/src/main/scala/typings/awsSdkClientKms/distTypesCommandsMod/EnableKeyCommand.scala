package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsEnableKeyCommandMod.EnableKeyCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "EnableKeyCommand")
@js.native
open class EnableKeyCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsEnableKeyCommandMod.EnableKeyCommand {
  /**
    * @public
    */
  def this(input: EnableKeyCommandInput) = this()
}
/* static members */
object EnableKeyCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "EnableKeyCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

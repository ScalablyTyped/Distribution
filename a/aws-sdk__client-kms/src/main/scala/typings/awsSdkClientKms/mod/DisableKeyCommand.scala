package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsDisableKeyCommandMod.DisableKeyCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "DisableKeyCommand")
@js.native
open class DisableKeyCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.DisableKeyCommand {
  /**
    * @public
    */
  def this(input: DisableKeyCommandInput) = this()
}
/* static members */
object DisableKeyCommand {
  
  @JSImport("@aws-sdk/client-kms", "DisableKeyCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

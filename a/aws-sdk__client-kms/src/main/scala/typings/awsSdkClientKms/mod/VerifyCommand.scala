package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsVerifyCommandMod.VerifyCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "VerifyCommand")
@js.native
open class VerifyCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.VerifyCommand {
  /**
    * @public
    */
  def this(input: VerifyCommandInput) = this()
}
/* static members */
object VerifyCommand {
  
  @JSImport("@aws-sdk/client-kms", "VerifyCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsVerifyMacCommandMod.VerifyMacCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "VerifyMacCommand")
@js.native
open class VerifyMacCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.VerifyMacCommand {
  /**
    * @public
    */
  def this(input: VerifyMacCommandInput) = this()
}
/* static members */
object VerifyMacCommand {
  
  @JSImport("@aws-sdk/client-kms", "VerifyMacCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

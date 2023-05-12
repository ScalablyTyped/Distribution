package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsGetPublicKeyCommandMod.GetPublicKeyCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "GetPublicKeyCommand")
@js.native
open class GetPublicKeyCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.GetPublicKeyCommand {
  /**
    * @public
    */
  def this(input: GetPublicKeyCommandInput) = this()
}
/* static members */
object GetPublicKeyCommand {
  
  @JSImport("@aws-sdk/client-kms", "GetPublicKeyCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

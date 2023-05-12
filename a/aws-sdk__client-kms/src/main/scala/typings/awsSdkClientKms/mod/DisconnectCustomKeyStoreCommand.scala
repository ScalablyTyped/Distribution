package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsDisconnectCustomKeyStoreCommandMod.DisconnectCustomKeyStoreCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "DisconnectCustomKeyStoreCommand")
@js.native
open class DisconnectCustomKeyStoreCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.DisconnectCustomKeyStoreCommand {
  /**
    * @public
    */
  def this(input: DisconnectCustomKeyStoreCommandInput) = this()
}
/* static members */
object DisconnectCustomKeyStoreCommand {
  
  @JSImport("@aws-sdk/client-kms", "DisconnectCustomKeyStoreCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

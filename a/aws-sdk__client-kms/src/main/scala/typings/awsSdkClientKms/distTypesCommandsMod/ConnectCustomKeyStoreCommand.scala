package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsConnectCustomKeyStoreCommandMod.ConnectCustomKeyStoreCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "ConnectCustomKeyStoreCommand")
@js.native
open class ConnectCustomKeyStoreCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsConnectCustomKeyStoreCommandMod.ConnectCustomKeyStoreCommand {
  /**
    * @public
    */
  def this(input: ConnectCustomKeyStoreCommandInput) = this()
}
/* static members */
object ConnectCustomKeyStoreCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "ConnectCustomKeyStoreCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

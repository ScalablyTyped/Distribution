package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsDeleteCustomKeyStoreCommandMod.DeleteCustomKeyStoreCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "DeleteCustomKeyStoreCommand")
@js.native
open class DeleteCustomKeyStoreCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.DeleteCustomKeyStoreCommand {
  /**
    * @public
    */
  def this(input: DeleteCustomKeyStoreCommandInput) = this()
}
/* static members */
object DeleteCustomKeyStoreCommand {
  
  @JSImport("@aws-sdk/client-kms", "DeleteCustomKeyStoreCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

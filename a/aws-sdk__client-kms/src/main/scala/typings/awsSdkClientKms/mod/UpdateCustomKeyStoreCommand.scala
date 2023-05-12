package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsUpdateCustomKeyStoreCommandMod.UpdateCustomKeyStoreCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "UpdateCustomKeyStoreCommand")
@js.native
open class UpdateCustomKeyStoreCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.UpdateCustomKeyStoreCommand {
  /**
    * @public
    */
  def this(input: UpdateCustomKeyStoreCommandInput) = this()
}
/* static members */
object UpdateCustomKeyStoreCommand {
  
  @JSImport("@aws-sdk/client-kms", "UpdateCustomKeyStoreCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

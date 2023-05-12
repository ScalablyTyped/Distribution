package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsCreateCustomKeyStoreCommandMod.CreateCustomKeyStoreCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "CreateCustomKeyStoreCommand")
@js.native
open class CreateCustomKeyStoreCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.CreateCustomKeyStoreCommand {
  /**
    * @public
    */
  def this(input: CreateCustomKeyStoreCommandInput) = this()
}
/* static members */
object CreateCustomKeyStoreCommand {
  
  @JSImport("@aws-sdk/client-kms", "CreateCustomKeyStoreCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsDeleteImportedKeyMaterialCommandMod.DeleteImportedKeyMaterialCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "DeleteImportedKeyMaterialCommand")
@js.native
open class DeleteImportedKeyMaterialCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.DeleteImportedKeyMaterialCommand {
  /**
    * @public
    */
  def this(input: DeleteImportedKeyMaterialCommandInput) = this()
}
/* static members */
object DeleteImportedKeyMaterialCommand {
  
  @JSImport("@aws-sdk/client-kms", "DeleteImportedKeyMaterialCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

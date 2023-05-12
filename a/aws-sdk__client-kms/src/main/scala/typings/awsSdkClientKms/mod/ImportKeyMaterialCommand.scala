package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsImportKeyMaterialCommandMod.ImportKeyMaterialCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "ImportKeyMaterialCommand")
@js.native
open class ImportKeyMaterialCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.ImportKeyMaterialCommand {
  /**
    * @public
    */
  def this(input: ImportKeyMaterialCommandInput) = this()
}
/* static members */
object ImportKeyMaterialCommand {
  
  @JSImport("@aws-sdk/client-kms", "ImportKeyMaterialCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsImportTableCommandMod.ImportTableCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "ImportTableCommand")
@js.native
open class ImportTableCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsImportTableCommandMod.ImportTableCommand {
  /**
    * @public
    */
  def this(input: ImportTableCommandInput) = this()
}
/* static members */
object ImportTableCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "ImportTableCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

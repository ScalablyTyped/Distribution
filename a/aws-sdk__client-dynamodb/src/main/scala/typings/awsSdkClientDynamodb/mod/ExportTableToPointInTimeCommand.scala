package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsExportTableToPointInTimeCommandMod.ExportTableToPointInTimeCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "ExportTableToPointInTimeCommand")
@js.native
open class ExportTableToPointInTimeCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.ExportTableToPointInTimeCommand {
  /**
    * @public
    */
  def this(input: ExportTableToPointInTimeCommandInput) = this()
}
/* static members */
object ExportTableToPointInTimeCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "ExportTableToPointInTimeCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

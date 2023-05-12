package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsRestoreTableToPointInTimeCommandMod.RestoreTableToPointInTimeCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "RestoreTableToPointInTimeCommand")
@js.native
open class RestoreTableToPointInTimeCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsRestoreTableToPointInTimeCommandMod.RestoreTableToPointInTimeCommand {
  /**
    * @public
    */
  def this(input: RestoreTableToPointInTimeCommandInput) = this()
}
/* static members */
object RestoreTableToPointInTimeCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "RestoreTableToPointInTimeCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "ExecuteStatementCommand")
@js.native
open class ExecuteStatementCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsExecuteStatementCommandMod.ExecuteStatementCommand {
  /**
    * @public
    */
  def this(input: ExecuteStatementCommandInput) = this()
}
/* static members */
object ExecuteStatementCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "ExecuteStatementCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

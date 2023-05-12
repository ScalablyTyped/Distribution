package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsExecuteTransactionCommandMod.ExecuteTransactionCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "ExecuteTransactionCommand")
@js.native
open class ExecuteTransactionCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.ExecuteTransactionCommand {
  /**
    * @public
    */
  def this(input: ExecuteTransactionCommandInput) = this()
}
/* static members */
object ExecuteTransactionCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "ExecuteTransactionCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsBatchExecuteStatementCommandMod.BatchExecuteStatementCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "BatchExecuteStatementCommand")
@js.native
open class BatchExecuteStatementCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.BatchExecuteStatementCommand {
  /**
    * @public
    */
  def this(input: BatchExecuteStatementCommandInput) = this()
}
/* static members */
object BatchExecuteStatementCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "BatchExecuteStatementCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

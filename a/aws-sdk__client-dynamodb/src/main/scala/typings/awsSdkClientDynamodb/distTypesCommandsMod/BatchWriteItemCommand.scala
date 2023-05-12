package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsBatchWriteItemCommandMod.BatchWriteItemCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "BatchWriteItemCommand")
@js.native
open class BatchWriteItemCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsBatchWriteItemCommandMod.BatchWriteItemCommand {
  /**
    * @public
    */
  def this(input: BatchWriteItemCommandInput) = this()
}
/* static members */
object BatchWriteItemCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "BatchWriteItemCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

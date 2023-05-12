package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsBatchGetItemCommandMod.BatchGetItemCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "BatchGetItemCommand")
@js.native
open class BatchGetItemCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.BatchGetItemCommand {
  /**
    * @public
    */
  def this(input: BatchGetItemCommandInput) = this()
}
/* static members */
object BatchGetItemCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "BatchGetItemCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

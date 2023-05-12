package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsTransactWriteItemsCommandMod.TransactWriteItemsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "TransactWriteItemsCommand")
@js.native
open class TransactWriteItemsCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsTransactWriteItemsCommandMod.TransactWriteItemsCommand {
  /**
    * @public
    */
  def this(input: TransactWriteItemsCommandInput) = this()
}
/* static members */
object TransactWriteItemsCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "TransactWriteItemsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

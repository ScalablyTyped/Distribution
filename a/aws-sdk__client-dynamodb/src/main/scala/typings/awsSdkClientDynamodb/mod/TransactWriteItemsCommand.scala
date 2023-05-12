package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsTransactWriteItemsCommandMod.TransactWriteItemsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "TransactWriteItemsCommand")
@js.native
open class TransactWriteItemsCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.TransactWriteItemsCommand {
  /**
    * @public
    */
  def this(input: TransactWriteItemsCommandInput) = this()
}
/* static members */
object TransactWriteItemsCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "TransactWriteItemsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

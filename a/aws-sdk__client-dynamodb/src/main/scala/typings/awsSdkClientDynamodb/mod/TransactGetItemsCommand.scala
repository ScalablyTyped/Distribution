package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsTransactGetItemsCommandMod.TransactGetItemsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "TransactGetItemsCommand")
@js.native
open class TransactGetItemsCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.TransactGetItemsCommand {
  /**
    * @public
    */
  def this(input: TransactGetItemsCommandInput) = this()
}
/* static members */
object TransactGetItemsCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "TransactGetItemsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

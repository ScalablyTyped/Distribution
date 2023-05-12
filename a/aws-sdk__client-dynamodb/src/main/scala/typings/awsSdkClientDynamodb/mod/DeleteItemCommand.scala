package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsDeleteItemCommandMod.DeleteItemCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "DeleteItemCommand")
@js.native
open class DeleteItemCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.DeleteItemCommand {
  /**
    * @public
    */
  def this(input: DeleteItemCommandInput) = this()
}
/* static members */
object DeleteItemCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "DeleteItemCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

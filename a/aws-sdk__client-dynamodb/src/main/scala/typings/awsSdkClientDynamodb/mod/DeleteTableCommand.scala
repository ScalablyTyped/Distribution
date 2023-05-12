package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsDeleteTableCommandMod.DeleteTableCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "DeleteTableCommand")
@js.native
open class DeleteTableCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.DeleteTableCommand {
  /**
    * @public
    */
  def this(input: DeleteTableCommandInput) = this()
}
/* static members */
object DeleteTableCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "DeleteTableCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

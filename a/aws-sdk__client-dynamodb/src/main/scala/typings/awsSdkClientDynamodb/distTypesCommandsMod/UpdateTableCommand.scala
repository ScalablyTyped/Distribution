package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsUpdateTableCommandMod.UpdateTableCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "UpdateTableCommand")
@js.native
open class UpdateTableCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsUpdateTableCommandMod.UpdateTableCommand {
  /**
    * @public
    */
  def this(input: UpdateTableCommandInput) = this()
}
/* static members */
object UpdateTableCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "UpdateTableCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

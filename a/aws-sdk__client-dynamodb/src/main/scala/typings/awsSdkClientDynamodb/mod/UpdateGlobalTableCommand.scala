package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsUpdateGlobalTableCommandMod.UpdateGlobalTableCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "UpdateGlobalTableCommand")
@js.native
open class UpdateGlobalTableCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.UpdateGlobalTableCommand {
  /**
    * @public
    */
  def this(input: UpdateGlobalTableCommandInput) = this()
}
/* static members */
object UpdateGlobalTableCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "UpdateGlobalTableCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

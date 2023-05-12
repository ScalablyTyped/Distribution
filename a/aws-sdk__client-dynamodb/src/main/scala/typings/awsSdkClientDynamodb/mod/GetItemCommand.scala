package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsGetItemCommandMod.GetItemCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "GetItemCommand")
@js.native
open class GetItemCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.GetItemCommand {
  /**
    * @public
    */
  def this(input: GetItemCommandInput) = this()
}
/* static members */
object GetItemCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "GetItemCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

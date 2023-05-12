package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsListExportsCommandMod.ListExportsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "ListExportsCommand")
@js.native
open class ListExportsCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.ListExportsCommand {
  /**
    * @public
    */
  def this(input: ListExportsCommandInput) = this()
}
/* static members */
object ListExportsCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "ListExportsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

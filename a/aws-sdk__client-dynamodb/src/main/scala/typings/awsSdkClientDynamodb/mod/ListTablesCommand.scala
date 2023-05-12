package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsListTablesCommandMod.ListTablesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "ListTablesCommand")
@js.native
open class ListTablesCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.ListTablesCommand {
  /**
    * @public
    */
  def this(input: ListTablesCommandInput) = this()
}
/* static members */
object ListTablesCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "ListTablesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

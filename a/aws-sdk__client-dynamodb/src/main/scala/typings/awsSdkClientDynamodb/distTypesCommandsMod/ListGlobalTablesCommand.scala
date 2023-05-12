package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsListGlobalTablesCommandMod.ListGlobalTablesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "ListGlobalTablesCommand")
@js.native
open class ListGlobalTablesCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsListGlobalTablesCommandMod.ListGlobalTablesCommand {
  /**
    * @public
    */
  def this(input: ListGlobalTablesCommandInput) = this()
}
/* static members */
object ListGlobalTablesCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "ListGlobalTablesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

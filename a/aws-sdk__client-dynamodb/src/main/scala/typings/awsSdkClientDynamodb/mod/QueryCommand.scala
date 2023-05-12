package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsQueryCommandMod.QueryCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "QueryCommand")
@js.native
open class QueryCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.QueryCommand {
  /**
    * @public
    */
  def this(input: QueryCommandInput) = this()
}
/* static members */
object QueryCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "QueryCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsListImportsCommandMod.ListImportsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "ListImportsCommand")
@js.native
open class ListImportsCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsListImportsCommandMod.ListImportsCommand {
  /**
    * @public
    */
  def this(input: ListImportsCommandInput) = this()
}
/* static members */
object ListImportsCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "ListImportsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

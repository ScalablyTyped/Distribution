package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsListContributorInsightsCommandMod.ListContributorInsightsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "ListContributorInsightsCommand")
@js.native
open class ListContributorInsightsCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsListContributorInsightsCommandMod.ListContributorInsightsCommand {
  /**
    * @public
    */
  def this(input: ListContributorInsightsCommandInput) = this()
}
/* static members */
object ListContributorInsightsCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "ListContributorInsightsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

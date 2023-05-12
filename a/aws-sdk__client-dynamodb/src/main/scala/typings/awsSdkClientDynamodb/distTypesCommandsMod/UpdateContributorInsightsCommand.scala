package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsUpdateContributorInsightsCommandMod.UpdateContributorInsightsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "UpdateContributorInsightsCommand")
@js.native
open class UpdateContributorInsightsCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsUpdateContributorInsightsCommandMod.UpdateContributorInsightsCommand {
  /**
    * @public
    */
  def this(input: UpdateContributorInsightsCommandInput) = this()
}
/* static members */
object UpdateContributorInsightsCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "UpdateContributorInsightsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

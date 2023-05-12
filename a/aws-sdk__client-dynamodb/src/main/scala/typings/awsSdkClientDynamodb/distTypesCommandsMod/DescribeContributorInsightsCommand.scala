package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeContributorInsightsCommandMod.DescribeContributorInsightsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DescribeContributorInsightsCommand")
@js.native
open class DescribeContributorInsightsCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsDescribeContributorInsightsCommandMod.DescribeContributorInsightsCommand {
  /**
    * @public
    */
  def this(input: DescribeContributorInsightsCommandInput) = this()
}
/* static members */
object DescribeContributorInsightsCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DescribeContributorInsightsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

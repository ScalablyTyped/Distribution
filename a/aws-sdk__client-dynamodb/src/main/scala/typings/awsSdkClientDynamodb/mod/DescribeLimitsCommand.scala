package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeLimitsCommandMod.DescribeLimitsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "DescribeLimitsCommand")
@js.native
open class DescribeLimitsCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.DescribeLimitsCommand {
  /**
    * @public
    */
  def this(input: DescribeLimitsCommandInput) = this()
}
/* static members */
object DescribeLimitsCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "DescribeLimitsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

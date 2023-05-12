package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeEndpointsCommandMod.DescribeEndpointsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "DescribeEndpointsCommand")
@js.native
open class DescribeEndpointsCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.DescribeEndpointsCommand {
  /**
    * @public
    */
  def this(input: DescribeEndpointsCommandInput) = this()
}
/* static members */
object DescribeEndpointsCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "DescribeEndpointsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

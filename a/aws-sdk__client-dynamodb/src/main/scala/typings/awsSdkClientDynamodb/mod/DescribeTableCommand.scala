package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeTableCommandMod.DescribeTableCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "DescribeTableCommand")
@js.native
open class DescribeTableCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.DescribeTableCommand {
  /**
    * @public
    */
  def this(input: DescribeTableCommandInput) = this()
}
/* static members */
object DescribeTableCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "DescribeTableCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

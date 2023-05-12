package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeGlobalTableCommandMod.DescribeGlobalTableCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DescribeGlobalTableCommand")
@js.native
open class DescribeGlobalTableCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsDescribeGlobalTableCommandMod.DescribeGlobalTableCommand {
  /**
    * @public
    */
  def this(input: DescribeGlobalTableCommandInput) = this()
}
/* static members */
object DescribeGlobalTableCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DescribeGlobalTableCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

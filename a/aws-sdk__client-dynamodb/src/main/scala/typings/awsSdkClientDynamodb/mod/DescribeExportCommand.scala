package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeExportCommandMod.DescribeExportCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "DescribeExportCommand")
@js.native
open class DescribeExportCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.DescribeExportCommand {
  /**
    * @public
    */
  def this(input: DescribeExportCommandInput) = this()
}
/* static members */
object DescribeExportCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "DescribeExportCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

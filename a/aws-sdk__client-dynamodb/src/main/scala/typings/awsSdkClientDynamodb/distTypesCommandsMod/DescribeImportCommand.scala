package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeImportCommandMod.DescribeImportCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DescribeImportCommand")
@js.native
open class DescribeImportCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsDescribeImportCommandMod.DescribeImportCommand {
  /**
    * @public
    */
  def this(input: DescribeImportCommandInput) = this()
}
/* static members */
object DescribeImportCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DescribeImportCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

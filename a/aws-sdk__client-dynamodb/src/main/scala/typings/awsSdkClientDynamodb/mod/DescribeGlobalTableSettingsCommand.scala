package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeGlobalTableSettingsCommandMod.DescribeGlobalTableSettingsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "DescribeGlobalTableSettingsCommand")
@js.native
open class DescribeGlobalTableSettingsCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.DescribeGlobalTableSettingsCommand {
  /**
    * @public
    */
  def this(input: DescribeGlobalTableSettingsCommandInput) = this()
}
/* static members */
object DescribeGlobalTableSettingsCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "DescribeGlobalTableSettingsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

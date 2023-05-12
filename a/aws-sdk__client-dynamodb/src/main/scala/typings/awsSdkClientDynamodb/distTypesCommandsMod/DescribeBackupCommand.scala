package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsDescribeBackupCommandMod.DescribeBackupCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DescribeBackupCommand")
@js.native
open class DescribeBackupCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsDescribeBackupCommandMod.DescribeBackupCommand {
  /**
    * @public
    */
  def this(input: DescribeBackupCommandInput) = this()
}
/* static members */
object DescribeBackupCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DescribeBackupCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

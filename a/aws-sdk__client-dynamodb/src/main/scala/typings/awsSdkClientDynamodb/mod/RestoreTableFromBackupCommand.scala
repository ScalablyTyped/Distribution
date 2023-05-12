package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsRestoreTableFromBackupCommandMod.RestoreTableFromBackupCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "RestoreTableFromBackupCommand")
@js.native
open class RestoreTableFromBackupCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.RestoreTableFromBackupCommand {
  /**
    * @public
    */
  def this(input: RestoreTableFromBackupCommandInput) = this()
}
/* static members */
object RestoreTableFromBackupCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "RestoreTableFromBackupCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

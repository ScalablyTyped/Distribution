package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsRestoreTableFromBackupCommandMod.RestoreTableFromBackupCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "RestoreTableFromBackupCommand")
@js.native
open class RestoreTableFromBackupCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsRestoreTableFromBackupCommandMod.RestoreTableFromBackupCommand {
  /**
    * @public
    */
  def this(input: RestoreTableFromBackupCommandInput) = this()
}
/* static members */
object RestoreTableFromBackupCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "RestoreTableFromBackupCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

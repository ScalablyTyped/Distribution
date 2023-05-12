package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsDeleteBackupCommandMod.DeleteBackupCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DeleteBackupCommand")
@js.native
open class DeleteBackupCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsDeleteBackupCommandMod.DeleteBackupCommand {
  /**
    * @public
    */
  def this(input: DeleteBackupCommandInput) = this()
}
/* static members */
object DeleteBackupCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "DeleteBackupCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

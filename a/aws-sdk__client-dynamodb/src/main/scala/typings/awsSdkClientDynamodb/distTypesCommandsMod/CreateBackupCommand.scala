package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsCreateBackupCommandMod.CreateBackupCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "CreateBackupCommand")
@js.native
open class CreateBackupCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsCreateBackupCommandMod.CreateBackupCommand {
  /**
    * @public
    */
  def this(input: CreateBackupCommandInput) = this()
}
/* static members */
object CreateBackupCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "CreateBackupCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

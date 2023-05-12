package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsUpdateContinuousBackupsCommandMod.UpdateContinuousBackupsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "UpdateContinuousBackupsCommand")
@js.native
open class UpdateContinuousBackupsCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsUpdateContinuousBackupsCommandMod.UpdateContinuousBackupsCommand {
  /**
    * @public
    */
  def this(input: UpdateContinuousBackupsCommandInput) = this()
}
/* static members */
object UpdateContinuousBackupsCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "UpdateContinuousBackupsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

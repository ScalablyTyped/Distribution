package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsRemovePermissionCommandMod.RemovePermissionCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "RemovePermissionCommand")
@js.native
open class RemovePermissionCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.RemovePermissionCommand {
  /**
    * @public
    */
  def this(input: RemovePermissionCommandInput) = this()
}
/* static members */
object RemovePermissionCommand {
  
  @JSImport("@aws-sdk/client-sqs", "RemovePermissionCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

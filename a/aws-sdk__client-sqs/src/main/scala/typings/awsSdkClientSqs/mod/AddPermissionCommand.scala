package typings.awsSdkClientSqs.mod

import typings.awsSdkClientSqs.distTypesCommandsAddPermissionCommandMod.AddPermissionCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-sqs", "AddPermissionCommand")
@js.native
open class AddPermissionCommand protected ()
  extends typings.awsSdkClientSqs.distTypesCommandsMod.AddPermissionCommand {
  /**
    * @public
    */
  def this(input: AddPermissionCommandInput) = this()
}
/* static members */
object AddPermissionCommand {
  
  @JSImport("@aws-sdk/client-sqs", "AddPermissionCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

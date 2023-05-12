package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsCancelKeyDeletionCommandMod.CancelKeyDeletionCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "CancelKeyDeletionCommand")
@js.native
open class CancelKeyDeletionCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsCancelKeyDeletionCommandMod.CancelKeyDeletionCommand {
  /**
    * @public
    */
  def this(input: CancelKeyDeletionCommandInput) = this()
}
/* static members */
object CancelKeyDeletionCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "CancelKeyDeletionCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

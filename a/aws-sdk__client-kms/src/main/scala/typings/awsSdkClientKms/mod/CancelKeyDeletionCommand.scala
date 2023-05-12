package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsCancelKeyDeletionCommandMod.CancelKeyDeletionCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "CancelKeyDeletionCommand")
@js.native
open class CancelKeyDeletionCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.CancelKeyDeletionCommand {
  /**
    * @public
    */
  def this(input: CancelKeyDeletionCommandInput) = this()
}
/* static members */
object CancelKeyDeletionCommand {
  
  @JSImport("@aws-sdk/client-kms", "CancelKeyDeletionCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

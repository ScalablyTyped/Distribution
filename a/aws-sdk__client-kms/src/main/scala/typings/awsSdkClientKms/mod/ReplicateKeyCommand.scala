package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsReplicateKeyCommandMod.ReplicateKeyCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "ReplicateKeyCommand")
@js.native
open class ReplicateKeyCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.ReplicateKeyCommand {
  /**
    * @public
    */
  def this(input: ReplicateKeyCommandInput) = this()
}
/* static members */
object ReplicateKeyCommand {
  
  @JSImport("@aws-sdk/client-kms", "ReplicateKeyCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsReEncryptCommandMod.ReEncryptCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "ReEncryptCommand")
@js.native
open class ReEncryptCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsReEncryptCommandMod.ReEncryptCommand {
  /**
    * @public
    */
  def this(input: ReEncryptCommandInput) = this()
}
/* static members */
object ReEncryptCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "ReEncryptCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

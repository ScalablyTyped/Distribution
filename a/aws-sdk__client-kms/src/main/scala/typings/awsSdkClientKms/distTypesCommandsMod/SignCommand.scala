package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsSignCommandMod.SignCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "SignCommand")
@js.native
open class SignCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsSignCommandMod.SignCommand {
  /**
    * @public
    */
  def this(input: SignCommandInput) = this()
}
/* static members */
object SignCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "SignCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

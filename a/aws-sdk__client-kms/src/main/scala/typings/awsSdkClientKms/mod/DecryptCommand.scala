package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsDecryptCommandMod.DecryptCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "DecryptCommand")
@js.native
open class DecryptCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.DecryptCommand {
  /**
    * @public
    */
  def this(input: DecryptCommandInput) = this()
}
/* static members */
object DecryptCommand {
  
  @JSImport("@aws-sdk/client-kms", "DecryptCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

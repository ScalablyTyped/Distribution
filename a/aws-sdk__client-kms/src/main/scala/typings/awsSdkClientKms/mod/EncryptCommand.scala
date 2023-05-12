package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsEncryptCommandMod.EncryptCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "EncryptCommand")
@js.native
open class EncryptCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.EncryptCommand {
  /**
    * @public
    */
  def this(input: EncryptCommandInput) = this()
}
/* static members */
object EncryptCommand {
  
  @JSImport("@aws-sdk/client-kms", "EncryptCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

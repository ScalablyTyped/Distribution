package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsRevokeGrantCommandMod.RevokeGrantCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "RevokeGrantCommand")
@js.native
open class RevokeGrantCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.RevokeGrantCommand {
  /**
    * @public
    */
  def this(input: RevokeGrantCommandInput) = this()
}
/* static members */
object RevokeGrantCommand {
  
  @JSImport("@aws-sdk/client-kms", "RevokeGrantCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

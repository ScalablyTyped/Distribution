package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsRetireGrantCommandMod.RetireGrantCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "RetireGrantCommand")
@js.native
open class RetireGrantCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.RetireGrantCommand {
  /**
    * @public
    */
  def this(input: RetireGrantCommandInput) = this()
}
/* static members */
object RetireGrantCommand {
  
  @JSImport("@aws-sdk/client-kms", "RetireGrantCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

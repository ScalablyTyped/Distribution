package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsCreateGrantCommandMod.CreateGrantCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "CreateGrantCommand")
@js.native
open class CreateGrantCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.CreateGrantCommand {
  /**
    * @public
    */
  def this(input: CreateGrantCommandInput) = this()
}
/* static members */
object CreateGrantCommand {
  
  @JSImport("@aws-sdk/client-kms", "CreateGrantCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

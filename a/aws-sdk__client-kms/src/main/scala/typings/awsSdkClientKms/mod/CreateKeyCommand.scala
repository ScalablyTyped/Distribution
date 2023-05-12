package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsCreateKeyCommandMod.CreateKeyCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "CreateKeyCommand")
@js.native
open class CreateKeyCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.CreateKeyCommand {
  /**
    * @public
    */
  def this(input: CreateKeyCommandInput) = this()
}
/* static members */
object CreateKeyCommand {
  
  @JSImport("@aws-sdk/client-kms", "CreateKeyCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

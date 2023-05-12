package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsUpdateKeyDescriptionCommandMod.UpdateKeyDescriptionCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "UpdateKeyDescriptionCommand")
@js.native
open class UpdateKeyDescriptionCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsUpdateKeyDescriptionCommandMod.UpdateKeyDescriptionCommand {
  /**
    * @public
    */
  def this(input: UpdateKeyDescriptionCommandInput) = this()
}
/* static members */
object UpdateKeyDescriptionCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "UpdateKeyDescriptionCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

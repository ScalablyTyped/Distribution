package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsUpdateAliasCommandMod.UpdateAliasCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "UpdateAliasCommand")
@js.native
open class UpdateAliasCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsUpdateAliasCommandMod.UpdateAliasCommand {
  /**
    * @public
    */
  def this(input: UpdateAliasCommandInput) = this()
}
/* static members */
object UpdateAliasCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "UpdateAliasCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

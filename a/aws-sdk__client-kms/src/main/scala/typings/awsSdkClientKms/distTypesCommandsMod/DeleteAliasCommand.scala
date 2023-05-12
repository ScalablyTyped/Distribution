package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsDeleteAliasCommandMod.DeleteAliasCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "DeleteAliasCommand")
@js.native
open class DeleteAliasCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsDeleteAliasCommandMod.DeleteAliasCommand {
  /**
    * @public
    */
  def this(input: DeleteAliasCommandInput) = this()
}
/* static members */
object DeleteAliasCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "DeleteAliasCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

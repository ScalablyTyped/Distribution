package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsListKeyPoliciesCommandMod.ListKeyPoliciesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "ListKeyPoliciesCommand")
@js.native
open class ListKeyPoliciesCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsListKeyPoliciesCommandMod.ListKeyPoliciesCommand {
  /**
    * @public
    */
  def this(input: ListKeyPoliciesCommandInput) = this()
}
/* static members */
object ListKeyPoliciesCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "ListKeyPoliciesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

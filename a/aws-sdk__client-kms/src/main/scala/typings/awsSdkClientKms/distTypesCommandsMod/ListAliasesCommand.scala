package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsListAliasesCommandMod.ListAliasesCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "ListAliasesCommand")
@js.native
open class ListAliasesCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsListAliasesCommandMod.ListAliasesCommand {
  /**
    * @public
    */
  def this(input: ListAliasesCommandInput) = this()
}
/* static members */
object ListAliasesCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "ListAliasesCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

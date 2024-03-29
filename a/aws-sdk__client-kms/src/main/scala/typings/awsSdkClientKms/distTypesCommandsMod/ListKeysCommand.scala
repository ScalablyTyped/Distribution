package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsListKeysCommandMod.ListKeysCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "ListKeysCommand")
@js.native
open class ListKeysCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsListKeysCommandMod.ListKeysCommand {
  /**
    * @public
    */
  def this(input: ListKeysCommandInput) = this()
}
/* static members */
object ListKeysCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "ListKeysCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

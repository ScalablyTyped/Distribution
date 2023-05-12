package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsListGrantsCommandMod.ListGrantsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "ListGrantsCommand")
@js.native
open class ListGrantsCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.ListGrantsCommand {
  /**
    * @public
    */
  def this(input: ListGrantsCommandInput) = this()
}
/* static members */
object ListGrantsCommand {
  
  @JSImport("@aws-sdk/client-kms", "ListGrantsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

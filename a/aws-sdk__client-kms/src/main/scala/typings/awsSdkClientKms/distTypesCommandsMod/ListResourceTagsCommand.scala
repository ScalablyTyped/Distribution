package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsListResourceTagsCommandMod.ListResourceTagsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "ListResourceTagsCommand")
@js.native
open class ListResourceTagsCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsListResourceTagsCommandMod.ListResourceTagsCommand {
  /**
    * @public
    */
  def this(input: ListResourceTagsCommandInput) = this()
}
/* static members */
object ListResourceTagsCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "ListResourceTagsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

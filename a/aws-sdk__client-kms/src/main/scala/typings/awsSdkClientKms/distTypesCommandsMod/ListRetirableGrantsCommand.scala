package typings.awsSdkClientKms.distTypesCommandsMod

import typings.awsSdkClientKms.distTypesCommandsListRetirableGrantsCommandMod.ListRetirableGrantsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms/dist-types/commands", "ListRetirableGrantsCommand")
@js.native
open class ListRetirableGrantsCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsListRetirableGrantsCommandMod.ListRetirableGrantsCommand {
  /**
    * @public
    */
  def this(input: ListRetirableGrantsCommandInput) = this()
}
/* static members */
object ListRetirableGrantsCommand {
  
  @JSImport("@aws-sdk/client-kms/dist-types/commands", "ListRetirableGrantsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

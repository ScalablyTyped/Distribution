package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsListRetirableGrantsCommandMod.ListRetirableGrantsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "ListRetirableGrantsCommand")
@js.native
open class ListRetirableGrantsCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.ListRetirableGrantsCommand {
  /**
    * @public
    */
  def this(input: ListRetirableGrantsCommandInput) = this()
}
/* static members */
object ListRetirableGrantsCommand {
  
  @JSImport("@aws-sdk/client-kms", "ListRetirableGrantsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

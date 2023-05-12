package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsListBackupsCommandMod.ListBackupsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "ListBackupsCommand")
@js.native
open class ListBackupsCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsListBackupsCommandMod.ListBackupsCommand {
  /**
    * @public
    */
  def this(input: ListBackupsCommandInput) = this()
}
/* static members */
object ListBackupsCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "ListBackupsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

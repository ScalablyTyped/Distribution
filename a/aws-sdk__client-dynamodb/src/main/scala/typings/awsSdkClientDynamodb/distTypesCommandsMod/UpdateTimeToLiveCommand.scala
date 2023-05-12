package typings.awsSdkClientDynamodb.distTypesCommandsMod

import typings.awsSdkClientDynamodb.distTypesCommandsUpdateTimeToLiveCommandMod.UpdateTimeToLiveCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "UpdateTimeToLiveCommand")
@js.native
open class UpdateTimeToLiveCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsUpdateTimeToLiveCommandMod.UpdateTimeToLiveCommand {
  /**
    * @public
    */
  def this(input: UpdateTimeToLiveCommandInput) = this()
}
/* static members */
object UpdateTimeToLiveCommand {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/commands", "UpdateTimeToLiveCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

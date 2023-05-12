package typings.awsSdkClientDynamodb.mod

import typings.awsSdkClientDynamodb.distTypesCommandsUpdateGlobalTableSettingsCommandMod.UpdateGlobalTableSettingsCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb", "UpdateGlobalTableSettingsCommand")
@js.native
open class UpdateGlobalTableSettingsCommand protected ()
  extends typings.awsSdkClientDynamodb.distTypesCommandsMod.UpdateGlobalTableSettingsCommand {
  /**
    * @public
    */
  def this(input: UpdateGlobalTableSettingsCommandInput) = this()
}
/* static members */
object UpdateGlobalTableSettingsCommand {
  
  @JSImport("@aws-sdk/client-dynamodb", "UpdateGlobalTableSettingsCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

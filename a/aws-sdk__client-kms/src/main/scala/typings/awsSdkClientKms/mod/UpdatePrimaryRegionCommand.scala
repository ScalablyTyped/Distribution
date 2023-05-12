package typings.awsSdkClientKms.mod

import typings.awsSdkClientKms.distTypesCommandsUpdatePrimaryRegionCommandMod.UpdatePrimaryRegionCommandInput
import typings.awsSdkMiddlewareEndpoint.distTypesTypesMod.EndpointParameterInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms", "UpdatePrimaryRegionCommand")
@js.native
open class UpdatePrimaryRegionCommand protected ()
  extends typings.awsSdkClientKms.distTypesCommandsMod.UpdatePrimaryRegionCommand {
  /**
    * @public
    */
  def this(input: UpdatePrimaryRegionCommandInput) = this()
}
/* static members */
object UpdatePrimaryRegionCommand {
  
  @JSImport("@aws-sdk/client-kms", "UpdatePrimaryRegionCommand")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEndpointParameterInstructions(): EndpointParameterInstructions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEndpointParameterInstructions")().asInstanceOf[EndpointParameterInstructions]
}

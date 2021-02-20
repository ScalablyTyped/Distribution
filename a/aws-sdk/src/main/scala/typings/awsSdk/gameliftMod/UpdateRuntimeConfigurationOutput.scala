package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRuntimeConfigurationOutput extends StObject {
  
  /**
    * The runtime configuration currently in force. If the update was successful, this object matches the one in the request.
    */
  var RuntimeConfiguration: js.UndefOr[typings.awsSdk.gameliftMod.RuntimeConfiguration] = js.native
}
object UpdateRuntimeConfigurationOutput {
  
  @scala.inline
  def apply(): UpdateRuntimeConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRuntimeConfigurationOutput]
  }
  
  @scala.inline
  implicit class UpdateRuntimeConfigurationOutputMutableBuilder[Self <: UpdateRuntimeConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuntimeConfiguration(value: RuntimeConfiguration): Self = StObject.set(x, "RuntimeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeConfigurationUndefined: Self = StObject.set(x, "RuntimeConfiguration", js.undefined)
  }
}

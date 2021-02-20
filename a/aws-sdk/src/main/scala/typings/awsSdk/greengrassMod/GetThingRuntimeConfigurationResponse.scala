package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetThingRuntimeConfigurationResponse extends StObject {
  
  /**
    * Runtime configuration for a thing.
    */
  var RuntimeConfiguration: js.UndefOr[typings.awsSdk.greengrassMod.RuntimeConfiguration] = js.native
}
object GetThingRuntimeConfigurationResponse {
  
  @scala.inline
  def apply(): GetThingRuntimeConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetThingRuntimeConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetThingRuntimeConfigurationResponseMutableBuilder[Self <: GetThingRuntimeConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuntimeConfiguration(value: RuntimeConfiguration): Self = StObject.set(x, "RuntimeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeConfigurationUndefined: Self = StObject.set(x, "RuntimeConfiguration", js.undefined)
  }
}

package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetThingRuntimeConfigurationRequest extends StObject {
  
  /**
    * The thing name.
    */
  var ThingName: string = js.native
}
object GetThingRuntimeConfigurationRequest {
  
  @scala.inline
  def apply(ThingName: string): GetThingRuntimeConfigurationRequest = {
    val __obj = js.Dynamic.literal(ThingName = ThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetThingRuntimeConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetThingRuntimeConfigurationRequestMutableBuilder[Self <: GetThingRuntimeConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThingName(value: string): Self = StObject.set(x, "ThingName", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnclaimDeviceResponse extends StObject {
  
  /**
    * The device's final claim state.
    */
  var State: js.UndefOr[string] = js.native
}
object UnclaimDeviceResponse {
  
  @scala.inline
  def apply(): UnclaimDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnclaimDeviceResponse]
  }
  
  @scala.inline
  implicit class UnclaimDeviceResponseMutableBuilder[Self <: UnclaimDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: string): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}

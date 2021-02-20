package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitiateDeviceClaimResponse extends StObject {
  
  /**
    * The device's final claim state.
    */
  var State: js.UndefOr[string] = js.native
}
object InitiateDeviceClaimResponse {
  
  @scala.inline
  def apply(): InitiateDeviceClaimResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateDeviceClaimResponse]
  }
  
  @scala.inline
  implicit class InitiateDeviceClaimResponseMutableBuilder[Self <: InitiateDeviceClaimResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: string): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}

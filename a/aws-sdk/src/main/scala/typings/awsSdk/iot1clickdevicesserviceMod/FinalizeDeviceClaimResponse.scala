package typings.awsSdk.iot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalizeDeviceClaimResponse extends StObject {
  
  /**
    * The device's final claim state.
    */
  var State: js.UndefOr[string] = js.undefined
}
object FinalizeDeviceClaimResponse {
  
  @scala.inline
  def apply(): FinalizeDeviceClaimResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinalizeDeviceClaimResponse]
  }
  
  @scala.inline
  implicit class FinalizeDeviceClaimResponseMutableBuilder[Self <: FinalizeDeviceClaimResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: string): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}

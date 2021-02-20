package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #region iBeacon
@js.native
trait StartBeaconDiscoveryOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_StartBeaconDiscoveryOptions: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.native
  
  /**
    * iBeacon设备广播的 uuids
    */
  var uuids: String | js.Array[String] = js.native
}
object StartBeaconDiscoveryOptions {
  
  @scala.inline
  def apply(uuids: String | js.Array[String]): StartBeaconDiscoveryOptions = {
    val __obj = js.Dynamic.literal(uuids = uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBeaconDiscoveryOptions]
  }
  
  @scala.inline
  implicit class StartBeaconDiscoveryOptionsMutableBuilder[Self <: StartBeaconDiscoveryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ ErrMsgResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setUuids(value: String | js.Array[String]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidsVarargs(value: String*): Self = StObject.set(x, "uuids", js.Array(value :_*))
  }
}

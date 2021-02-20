package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetWifiListOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 提供预设的 Wi-Fi 信息列表 */
  var wifiList: js.Array[SetWifiList] = js.native
}
object SetWifiListOptions {
  
  @scala.inline
  def apply(wifiList: js.Array[SetWifiList]): SetWifiListOptions = {
    val __obj = js.Dynamic.literal(wifiList = wifiList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetWifiListOptions]
  }
  
  @scala.inline
  implicit class SetWifiListOptionsMutableBuilder[Self <: SetWifiListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWifiList(value: js.Array[SetWifiList]): Self = StObject.set(x, "wifiList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiListVarargs(value: SetWifiList*): Self = StObject.set(x, "wifiList", js.Array(value :_*))
  }
}

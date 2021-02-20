package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNetworkTypeOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 接口调用成功，返回网络类型 networkType */
  @JSName("success")
  def success_MGetNetworkTypeOptions(res: NetworkTypeData): Unit = js.native
}
object GetNetworkTypeOptions {
  
  @scala.inline
  def apply(success: NetworkTypeData => Unit): GetNetworkTypeOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetNetworkTypeOptions]
  }
  
  @scala.inline
  implicit class GetNetworkTypeOptionsMutableBuilder[Self <: GetNetworkTypeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: NetworkTypeData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}

package typings.baiduApp.swan

import typings.baiduApp.anon.CityName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 开放接口-----收货地址
@js.native
trait ChooseAddressOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_ChooseAddressOptions: js.UndefOr[js.Function1[/* res */ CityName, Unit]] = js.native
}
object ChooseAddressOptions {
  
  @scala.inline
  def apply(): ChooseAddressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseAddressOptions]
  }
  
  @scala.inline
  implicit class ChooseAddressOptionsMutableBuilder[Self <: ChooseAddressOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ CityName => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}

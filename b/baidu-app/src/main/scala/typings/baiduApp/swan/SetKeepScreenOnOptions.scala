package typings.baiduApp.swan

import typings.baiduApp.anon.ErrMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetKeepScreenOnOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 是否保持屏幕常亮 */
  var keepScreenOn: Boolean = js.native
  
  @JSName("success")
  var success_SetKeepScreenOnOptions: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.native
}
object SetKeepScreenOnOptions {
  
  @scala.inline
  def apply(keepScreenOn: Boolean): SetKeepScreenOnOptions = {
    val __obj = js.Dynamic.literal(keepScreenOn = keepScreenOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetKeepScreenOnOptions]
  }
  
  @scala.inline
  implicit class SetKeepScreenOnOptionsMutableBuilder[Self <: SetKeepScreenOnOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeepScreenOn(value: Boolean): Self = StObject.set(x, "keepScreenOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ ErrMsg => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}

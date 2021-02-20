package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 识别银行卡并返回卡号、发卡行和卡片类型。
  */
@js.native
trait ocrBankCardOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var image: String = js.native
  
  // 图片资源地址
  @JSName("success")
  var success_ocrBankCardOptions: js.UndefOr[js.Function1[/* res */ ocrBankCardResponse, Unit]] = js.native
}
object ocrBankCardOptions {
  
  @scala.inline
  def apply(image: String): ocrBankCardOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ocrBankCardOptions]
  }
  
  @scala.inline
  implicit class ocrBankCardOptionsMutableBuilder[Self <: ocrBankCardOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ ocrBankCardResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}

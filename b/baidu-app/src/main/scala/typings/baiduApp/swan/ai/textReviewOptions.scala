package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 运用业界领先的深度学习技术，判断一段文本内容是否符合网络发文规范，实现
  * 自动化、智能化的文本审核。
  */
@js.native
trait textReviewOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var content: String = js.native
  
  // 待审核文本，UTF-8，不可为空，不超过20000字节。
  @JSName("success")
  var success_textReviewOptions: js.UndefOr[js.Function1[/* res */ textReviewResponse, Unit]] = js.native
}
object textReviewOptions {
  
  @scala.inline
  def apply(content: String): textReviewOptions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[textReviewOptions]
  }
  
  @scala.inline
  implicit class textReviewOptionsMutableBuilder[Self <: textReviewOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ textReviewResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}

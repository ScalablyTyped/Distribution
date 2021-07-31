package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #region 位置API
trait PageScrollToOptions extends StObject {
  
  /** 滚动动画的时长，默认300ms，单位 ms */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** 滚动到页面的目标位置（单位px */
  var scrollTop: Double
}
object PageScrollToOptions {
  
  @scala.inline
  def apply(scrollTop: Double): PageScrollToOptions = {
    val __obj = js.Dynamic.literal(scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageScrollToOptions]
  }
  
  @scala.inline
  implicit class PageScrollToOptionsMutableBuilder[Self <: PageScrollToOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}

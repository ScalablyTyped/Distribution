package typings.baiduApp.swan

import typings.baiduApp.baiduAppStrings.loading
import typings.baiduApp.baiduAppStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region 界面API列表
trait ToastOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * 提示的延迟时间，单位毫秒，默认：1500
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * 图标，只支持"success"、"loading"
    */
  var icon: js.UndefOr[success | loading] = js.undefined
  
  /**
    * 自定义图标的本地路径，image 的优先级高于 icon
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * 是否显示透明蒙层，防止触摸穿透，默认：false
    */
  var mask: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 提示的内容
    */
  var title: String
}
object ToastOptions {
  
  @scala.inline
  def apply(title: String): ToastOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
  
  @scala.inline
  implicit class ToastOptionsMutableBuilder[Self <: ToastOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setIcon(value: success | loading): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}

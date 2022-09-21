package typings.baiduApp.swan

import typings.baiduApp.anon.Duration
import typings.baiduApp.baiduAppStrings.Numbersign000000
import typings.baiduApp.baiduAppStrings.Numbersignffffff
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetNavigationBarColorOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 动画效果
    */
  var animation: js.UndefOr[Duration] = js.undefined
  
  /**
    * 背景颜色值，有效值为十六进制颜色
    */
  var backgroundColor: String
  
  /**
    * 前景颜色值，包括按钮、标题、状态栏的颜色，仅支持 #ffffff 和 #000000
    */
  var frontColor: Numbersignffffff | Numbersign000000
}
object SetNavigationBarColorOptions {
  
  inline def apply(backgroundColor: String, frontColor: Numbersignffffff | Numbersign000000): SetNavigationBarColorOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], frontColor = frontColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNavigationBarColorOptions]
  }
  
  extension [Self <: SetNavigationBarColorOptions](x: Self) {
    
    inline def setAnimation(value: Duration): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setFrontColor(value: Numbersignffffff | Numbersign000000): Self = StObject.set(x, "frontColor", value.asInstanceOf[js.Any])
  }
}

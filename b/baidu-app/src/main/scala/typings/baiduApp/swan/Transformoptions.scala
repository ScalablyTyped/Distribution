package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transformoptions extends StObject {
  
  var scaleX: Double
  
  // 水平缩放
  var scaleY: Double
  
  // 垂直缩放
  var skewX: Double
  
  // 水平倾斜
  var skewY: Double
  
  // 垂直倾斜
  var translateX: Double
  
  // 水平移动
  var translateY: Double
}
object Transformoptions {
  
  @scala.inline
  def apply(
    scaleX: Double,
    scaleY: Double,
    skewX: Double,
    skewY: Double,
    translateX: Double,
    translateY: Double
  ): Transformoptions = {
    val __obj = js.Dynamic.literal(scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], translateX = translateX.asInstanceOf[js.Any], translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformoptions]
  }
  
  @scala.inline
  implicit class TransformoptionsMutableBuilder[Self <: Transformoptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewX(value: Double): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewY(value: Double): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
  }
}

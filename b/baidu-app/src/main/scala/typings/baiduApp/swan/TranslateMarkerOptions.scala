package typings.baiduApp.swan

import typings.baiduApp.anon.Longitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslateMarkerOptions
  extends BaseOptions[js.Any, js.Any] {
  
  // 动画持续时长，默认值1000ms，平移与旋转分别计算。
  var animationEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  // 指定marker移动到的目标点
  var autoRotate: Boolean = js.native
  
  // 指定 marker
  var destination: Longitude = js.native
  
  // marker 的旋转角度
  var duration: js.UndefOr[Double] = js.native
  
  var markerId: Double = js.native
  
  // 移动过程中是否自动旋转 marker
  var rotate: Double = js.native
}
object TranslateMarkerOptions {
  
  @scala.inline
  def apply(autoRotate: Boolean, destination: Longitude, markerId: Double, rotate: Double): TranslateMarkerOptions = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateMarkerOptions]
  }
  
  @scala.inline
  implicit class TranslateMarkerOptionsMutableBuilder[Self <: TranslateMarkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationEnd(value: () => Unit): Self = StObject.set(x, "animationEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAnimationEndUndefined: Self = StObject.set(x, "animationEnd", js.undefined)
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: Longitude): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setMarkerId(value: Double): Self = StObject.set(x, "markerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
  }
}

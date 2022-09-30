package typings.bizcharts.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  /**
    * 动画执行完时的回调函数
    * @type {function}}
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 动画执行的延迟时间
    * @type {function}}
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * 动画执行时间
    * @type {number}
    */
  var duration: Double
  
  /**
    * 动画缓动效果
    * @type {string}}
    */
  var easing: js.UndefOr[String] = js.undefined
  
  /**
    * 动画暂停时的回调函数
    * @type {function}}
    */
  var pauseCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 是否重复执行动画
    * @type {boolean}}
    */
  var repeat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 动画恢复(重新唤醒)时的回调函数
    * @type {function}}
    */
  var resumeCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 目标样式
    * @type {Record<string, any>}
    */
  var toAttrs: Record[String, Any]
}
object Callback {
  
  inline def apply(duration: Double, toAttrs: Record[String, Any]): Callback = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], toAttrs = toAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  
  extension [Self <: Callback](x: Self) {
    
    inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setPauseCallback(value: () => Unit): Self = StObject.set(x, "pauseCallback", js.Any.fromFunction0(value))
    
    inline def setPauseCallbackUndefined: Self = StObject.set(x, "pauseCallback", js.undefined)
    
    inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setResumeCallback(value: () => Unit): Self = StObject.set(x, "resumeCallback", js.Any.fromFunction0(value))
    
    inline def setResumeCallbackUndefined: Self = StObject.set(x, "resumeCallback", js.undefined)
    
    inline def setToAttrs(value: Record[String, Any]): Self = StObject.set(x, "toAttrs", value.asInstanceOf[js.Any])
  }
}

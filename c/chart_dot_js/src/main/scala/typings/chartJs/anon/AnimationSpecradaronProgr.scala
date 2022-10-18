package typings.chartJs.anon

import typings.chartJs.chartJsStrings.radar
import typings.chartJs.mod.ChartType
import typings.chartJs.mod.EasingFunction
import typings.chartJs.mod.Scriptable
import typings.chartJs.mod.ScriptableContext
import typings.chartJs.typesAnimationMod.AnimationEvent
import typings.chartJs.typesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined chart.js.chart.js.AnimationSpec<'radar'> & {  onProgress :(this : chart.js.chart.js.Chart<chart.js.chart.js.ChartType, chart.js.chart.js.DefaultDataPoint<chart.js.chart.js.ChartType>, unknown>, event : chart.js.chart.js/types/animation.AnimationEvent): void | undefined,   onComplete :(this : chart.js.chart.js.Chart<chart.js.chart.js.ChartType, chart.js.chart.js.DefaultDataPoint<chart.js.chart.js.ChartType>, unknown>, event : chart.js.chart.js/types/animation.AnimationEvent): void | undefined} */
trait AnimationSpecradaronProgr extends StObject {
  
  /**
    * Delay before starting the animations.
    * @default 0
    */
  var delay: js.UndefOr[Scriptable[Double, ScriptableContext[radar]]] = js.undefined
  
  /**
    * The number of milliseconds an animation takes.
    * @default 1000
    */
  var duration: js.UndefOr[Scriptable[Double, ScriptableContext[radar]]] = js.undefined
  
  /**
    * Easing function to use
    * @default 'easeOutQuart'
    */
  var easing: js.UndefOr[Scriptable[EasingFunction, ScriptableContext[radar]]] = js.undefined
  
  /**
    *   If set to true, the animations loop endlessly.
    * @default false
    */
  var loop: js.UndefOr[Scriptable[Boolean, ScriptableContext[radar]]] = js.undefined
  
  /**
    * Callback called when all animations are completed.
    */
  var onComplete: js.UndefOr[
    js.ThisFunction1[
      /* this */ typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any], 
      /* event */ AnimationEvent, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Callback called on each step of an animation.
    */
  var onProgress: js.UndefOr[
    js.ThisFunction1[
      /* this */ typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any], 
      /* event */ AnimationEvent, 
      Unit
    ]
  ] = js.undefined
}
object AnimationSpecradaronProgr {
  
  inline def apply(): AnimationSpecradaronProgr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationSpecradaronProgr]
  }
  
  extension [Self <: AnimationSpecradaronProgr](x: Self) {
    
    inline def setDelay(value: Scriptable[Double, ScriptableContext[radar]]): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "delay", js.Any.fromFunction2(value))
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Scriptable[Double, ScriptableContext[radar]]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "duration", js.Any.fromFunction2(value))
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: Scriptable[EasingFunction, ScriptableContext[radar]]): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[EasingFunction]): Self = StObject.set(x, "easing", js.Any.fromFunction2(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setLoop(value: Scriptable[Boolean, ScriptableContext[radar]]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopFunction2(value: (ScriptableContext[radar], /* options */ AnyObject) => js.UndefOr[Boolean]): Self = StObject.set(x, "loop", js.Any.fromFunction2(value))
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setOnComplete(
      value: js.ThisFunction1[
          /* this */ typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any], 
          /* event */ AnimationEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnProgress(
      value: js.ThisFunction1[
          /* this */ typings.chartJs.mod.Chart[ChartType, typings.chartJs.mod.DefaultDataPoint[ChartType], Any], 
          /* event */ AnimationEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
  }
}

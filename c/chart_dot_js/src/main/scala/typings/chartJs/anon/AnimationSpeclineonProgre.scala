package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.AnimationEvent
import typings.chartJs.distChunksHelpersDotcoreMod.AnyObject
import typings.chartJs.distChunksHelpersDotcoreMod.Chart4
import typings.chartJs.distChunksHelpersDotcoreMod.ChartType
import typings.chartJs.distChunksHelpersDotcoreMod.EasingFunction
import typings.chartJs.distChunksHelpersDotcoreMod.Scriptable
import typings.chartJs.distChunksHelpersDotcoreMod.ScriptableContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined chart.js.chart.js/dist/chunks/helpers.core.AnimationSpec<'line'> & {  onProgress :(this : chart.js.chart.js/dist/chunks/helpers.core.Chart$4<chart.js.chart.js/dist/chunks/helpers.core.ChartType, chart.js.chart.js/dist/chunks/helpers.core.DefaultDataPoint<chart.js.chart.js/dist/chunks/helpers.core.ChartType>, unknown>, event : chart.js.chart.js/dist/chunks/helpers.core.AnimationEvent): void | undefined,   onComplete :(this : chart.js.chart.js/dist/chunks/helpers.core.Chart$4<chart.js.chart.js/dist/chunks/helpers.core.ChartType, chart.js.chart.js/dist/chunks/helpers.core.DefaultDataPoint<chart.js.chart.js/dist/chunks/helpers.core.ChartType>, unknown>, event : chart.js.chart.js/dist/chunks/helpers.core.AnimationEvent): void | undefined} */
trait AnimationSpeclineonProgre extends StObject {
  
  /**
    * Delay before starting the animations.
    * @default 0
    */
  var delay: js.UndefOr[Scriptable[Double, ScriptableContext["line"]]] = js.undefined
  
  /**
    * The number of milliseconds an animation takes.
    * @default 1000
    */
  var duration: js.UndefOr[Scriptable[Double, ScriptableContext["line"]]] = js.undefined
  
  /**
    * Easing function to use
    * @default 'easeOutQuart'
    */
  var easing: js.UndefOr[Scriptable[EasingFunction, ScriptableContext["line"]]] = js.undefined
  
  /**
    *   If set to true, the animations loop endlessly.
    * @default false
    */
  var loop: js.UndefOr[Scriptable[Boolean, ScriptableContext["line"]]] = js.undefined
  
  /**
    * Callback called when all animations are completed.
    */
  var onComplete: js.UndefOr[
    js.ThisFunction1[
      /* this */ Chart4[
        ChartType, 
        typings.chartJs.distChunksHelpersDotcoreMod.DefaultDataPoint[ChartType], 
        Any
      ], 
      /* event */ AnimationEvent, 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Callback called on each step of an animation.
    */
  var onProgress: js.UndefOr[
    js.ThisFunction1[
      /* this */ Chart4[
        ChartType, 
        typings.chartJs.distChunksHelpersDotcoreMod.DefaultDataPoint[ChartType], 
        Any
      ], 
      /* event */ AnimationEvent, 
      Unit
    ]
  ] = js.undefined
}
object AnimationSpeclineonProgre {
  
  inline def apply(): AnimationSpeclineonProgre = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationSpeclineonProgre]
  }
  
  extension [Self <: AnimationSpeclineonProgre](x: Self) {
    
    inline def setDelay(value: Scriptable[Double, ScriptableContext["line"]]): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayFunction2(value: (ScriptableContext["line"], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "delay", js.Any.fromFunction2(value))
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Scriptable[Double, ScriptableContext["line"]]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationFunction2(value: (ScriptableContext["line"], /* options */ AnyObject) => js.UndefOr[Double]): Self = StObject.set(x, "duration", js.Any.fromFunction2(value))
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: Scriptable[EasingFunction, ScriptableContext["line"]]): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingFunction2(value: (ScriptableContext["line"], /* options */ AnyObject) => js.UndefOr[EasingFunction]): Self = StObject.set(x, "easing", js.Any.fromFunction2(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setLoop(value: Scriptable[Boolean, ScriptableContext["line"]]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopFunction2(value: (ScriptableContext["line"], /* options */ AnyObject) => js.UndefOr[Boolean]): Self = StObject.set(x, "loop", js.Any.fromFunction2(value))
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setOnComplete(
      value: js.ThisFunction1[
          /* this */ Chart4[
            ChartType, 
            typings.chartJs.distChunksHelpersDotcoreMod.DefaultDataPoint[ChartType], 
            Any
          ], 
          /* event */ AnimationEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnProgress(
      value: js.ThisFunction1[
          /* this */ Chart4[
            ChartType, 
            typings.chartJs.distChunksHelpersDotcoreMod.DefaultDataPoint[ChartType], 
            Any
          ], 
          /* event */ AnimationEvent, 
          Unit
        ]
    ): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
  }
}

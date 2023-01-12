package typings.chartJs.anon

import typings.chartJs.mod.ChartType
import typings.chartJs.typesAnimationMod.AnimationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnComplete extends StObject {
  
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
object OnComplete {
  
  inline def apply(): OnComplete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnComplete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnComplete] (val x: Self) extends AnyVal {
    
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

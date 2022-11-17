package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.AnimationEvent
import typings.chartJs.distChunksHelpersDotcoreMod.Chart4
import typings.chartJs.distChunksHelpersDotcoreMod.ChartType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnComplete extends StObject {
  
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
object OnComplete {
  
  inline def apply(): OnComplete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnComplete]
  }
  
  extension [Self <: OnComplete](x: Self) {
    
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

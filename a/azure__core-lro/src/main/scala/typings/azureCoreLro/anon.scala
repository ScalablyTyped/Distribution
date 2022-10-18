package typings.azureCoreLro

import typings.azureAbortController.typesSrcAbortSignalMod.AbortSignalLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AbortSignal extends StObject {
    
    var abortSignal: js.UndefOr[AbortSignalLike] = js.undefined
  }
  object AbortSignal {
    
    inline def apply(): AbortSignal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbortSignal]
    }
    
    extension [Self <: AbortSignal](x: Self) {
      
      inline def setAbortSignal(value: AbortSignalLike): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
      
      inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    }
  }
  
  trait FireProgress[TState] extends StObject {
    
    var abortSignal: js.UndefOr[AbortSignalLike] = js.undefined
    
    var fireProgress: js.UndefOr[js.Function1[/* state */ TState, Unit]] = js.undefined
  }
  object FireProgress {
    
    inline def apply[TState](): FireProgress[TState] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FireProgress[TState]]
    }
    
    extension [Self <: FireProgress[?], TState](x: Self & FireProgress[TState]) {
      
      inline def setAbortSignal(value: AbortSignalLike): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
      
      inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
      
      inline def setFireProgress(value: /* state */ TState => Unit): Self = StObject.set(x, "fireProgress", js.Any.fromFunction1(value))
      
      inline def setFireProgressUndefined: Self = StObject.set(x, "fireProgress", js.undefined)
    }
  }
}

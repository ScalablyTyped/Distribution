package typings.canvasSize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined canvas-size.canvas-size.CanvasSizeMaxOptions & {  usePromise :false | undefined} */
  trait CanvasSizeMaxOptionsusePr extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onError: js.UndefOr[
        js.Function3[/* width */ Double, /* height */ Double, /* benchmark */ Double, Any]
      ] = js.undefined
    
    var onSuccess: js.UndefOr[
        js.Function3[/* width */ Double, /* height */ Double, /* benchmark */ Double, Any]
      ] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var usePromise: js.UndefOr[Boolean] = js.undefined
    
    var useWorker: js.UndefOr[Boolean] = js.undefined
  }
  object CanvasSizeMaxOptionsusePr {
    
    inline def apply(): CanvasSizeMaxOptionsusePr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasSizeMaxOptionsusePr]
    }
    
    extension [Self <: CanvasSizeMaxOptionsusePr](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnError(value: (/* width */ Double, /* height */ Double, /* benchmark */ Double) => Any): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnSuccess(value: (/* width */ Double, /* height */ Double, /* benchmark */ Double) => Any): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setUsePromise(value: Boolean): Self = StObject.set(x, "usePromise", value.asInstanceOf[js.Any])
      
      inline def setUsePromiseUndefined: Self = StObject.set(x, "usePromise", js.undefined)
      
      inline def setUseWorker(value: Boolean): Self = StObject.set(x, "useWorker", value.asInstanceOf[js.Any])
      
      inline def setUseWorkerUndefined: Self = StObject.set(x, "useWorker", js.undefined)
    }
  }
  
  /* Inlined canvas-size.canvas-size.CanvasSizeMaxOptions & {  usePromise :true} */
  trait CanvasSizeMaxOptionsusePrMax extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onError: js.UndefOr[
        js.Function3[/* width */ Double, /* height */ Double, /* benchmark */ Double, Any]
      ] = js.undefined
    
    var onSuccess: js.UndefOr[
        js.Function3[/* width */ Double, /* height */ Double, /* benchmark */ Double, Any]
      ] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var usePromise: js.UndefOr[Boolean] = js.undefined
    
    var useWorker: js.UndefOr[Boolean] = js.undefined
  }
  object CanvasSizeMaxOptionsusePrMax {
    
    inline def apply(): CanvasSizeMaxOptionsusePrMax = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasSizeMaxOptionsusePrMax]
    }
    
    extension [Self <: CanvasSizeMaxOptionsusePrMax](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnError(value: (/* width */ Double, /* height */ Double, /* benchmark */ Double) => Any): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnSuccess(value: (/* width */ Double, /* height */ Double, /* benchmark */ Double) => Any): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setUsePromise(value: Boolean): Self = StObject.set(x, "usePromise", value.asInstanceOf[js.Any])
      
      inline def setUsePromiseUndefined: Self = StObject.set(x, "usePromise", js.undefined)
      
      inline def setUseWorker(value: Boolean): Self = StObject.set(x, "useWorker", value.asInstanceOf[js.Any])
      
      inline def setUseWorkerUndefined: Self = StObject.set(x, "useWorker", js.undefined)
    }
  }
}

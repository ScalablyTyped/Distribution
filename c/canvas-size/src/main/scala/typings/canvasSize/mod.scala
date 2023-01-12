package typings.canvasSize

import org.scalablytyped.runtime.Shortcut
import typings.canvasSize.anon.CanvasSizeMaxOptionsusePr
import typings.canvasSize.anon.CanvasSizeMaxOptionsusePrMax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("canvas-size", JSImport.Namespace)
  @js.native
  val ^ : CanvasSize = js.native
  
  @js.native
  trait CanvasSize extends StObject {
    
    def maxArea(options: CanvasSizeMaxOptionsusePr): Unit = js.native
    def maxArea(options: CanvasSizeMaxOptionsusePrMax): js.Promise[CanvasSizeMaxReturn] = js.native
    
    def maxHeight(options: CanvasSizeMaxOptionsusePr): Unit = js.native
    def maxHeight(options: CanvasSizeMaxOptionsusePrMax): js.Promise[CanvasSizeMaxReturn] = js.native
    
    def maxWidth(options: CanvasSizeMaxOptionsusePr): Unit = js.native
    def maxWidth(options: CanvasSizeMaxOptionsusePrMax): js.Promise[CanvasSizeMaxReturn] = js.native
    
    def test(options: CanvasSizeTestOptions): Boolean = js.native
  }
  
  trait CanvasSizeCommonOptions extends StObject {
    
    var onError: js.UndefOr[
        js.Function3[/* width */ Double, /* height */ Double, /* benchmark */ Double, Any]
      ] = js.undefined
    
    var onSuccess: js.UndefOr[
        js.Function3[/* width */ Double, /* height */ Double, /* benchmark */ Double, Any]
      ] = js.undefined
    
    var usePromise: js.UndefOr[Boolean] = js.undefined
    
    var useWorker: js.UndefOr[Boolean] = js.undefined
  }
  object CanvasSizeCommonOptions {
    
    inline def apply(): CanvasSizeCommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasSizeCommonOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CanvasSizeCommonOptions] (val x: Self) extends AnyVal {
      
      inline def setOnError(value: (/* width */ Double, /* height */ Double, /* benchmark */ Double) => Any): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnSuccess(value: (/* width */ Double, /* height */ Double, /* benchmark */ Double) => Any): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setUsePromise(value: Boolean): Self = StObject.set(x, "usePromise", value.asInstanceOf[js.Any])
      
      inline def setUsePromiseUndefined: Self = StObject.set(x, "usePromise", js.undefined)
      
      inline def setUseWorker(value: Boolean): Self = StObject.set(x, "useWorker", value.asInstanceOf[js.Any])
      
      inline def setUseWorkerUndefined: Self = StObject.set(x, "useWorker", js.undefined)
    }
  }
  
  trait CanvasSizeMaxOptions
    extends StObject
       with CanvasSizeCommonOptions {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object CanvasSizeMaxOptions {
    
    inline def apply(): CanvasSizeMaxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasSizeMaxOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CanvasSizeMaxOptions] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  trait CanvasSizeMaxReturn extends StObject {
    
    var benchmark: Double
    
    var height: Double
    
    var width: Double
  }
  object CanvasSizeMaxReturn {
    
    inline def apply(benchmark: Double, height: Double, width: Double): CanvasSizeMaxReturn = {
      val __obj = js.Dynamic.literal(benchmark = benchmark.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasSizeMaxReturn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CanvasSizeMaxReturn] (val x: Self) extends AnyVal {
      
      inline def setBenchmark(value: Double): Self = StObject.set(x, "benchmark", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait CanvasSizeTestOptions
    extends StObject
       with CanvasSizeCommonOptions {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var sizes: js.UndefOr[js.Array[js.Tuple2[Double, Double]]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object CanvasSizeTestOptions {
    
    inline def apply(): CanvasSizeTestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasSizeTestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CanvasSizeTestOptions] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSizes(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSizesVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "sizes", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = CanvasSize
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CanvasSize = ^
}

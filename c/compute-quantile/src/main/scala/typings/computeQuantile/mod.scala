package typings.computeQuantile

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(array: ArrayLike[Double], quantile: Double): Double = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], quantile.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(array: ArrayLike[Double], quantile: Double, options: Options): Double = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], quantile.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("compute-quantile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * If the input `array` is already sorted in `__ascending__` order, you can set the `sorted` option to `true`.
      *
      * @default
      * false
      */
    var sorted: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      inline def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
    }
  }
}

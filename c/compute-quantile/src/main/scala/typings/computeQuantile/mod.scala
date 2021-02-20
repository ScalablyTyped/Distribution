package typings.computeQuantile

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("compute-quantile", JSImport.Namespace)
  @js.native
  def apply(array: ArrayLike[Double], quantile: Double): Double = js.native
  @JSImport("compute-quantile", JSImport.Namespace)
  @js.native
  def apply(array: ArrayLike[Double], quantile: Double, options: Options): Double = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * If the input `array` is already sorted in `__ascending__` order, you can set the `sorted` option to `true`.
      *
      * @default
      * false
      */
    var sorted: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
    }
  }
}

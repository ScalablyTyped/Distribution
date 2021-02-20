package typings.debouncePromise

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("debounce-promise", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T): js.Function1[/* args */ Parameters[T], js.Promise[ReturnType[T]] | ReturnType[T]] = js.native
  @JSImport("debounce-promise", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, wait: js.UndefOr[scala.Nothing], options: DebounceOptions): js.Function1[/* args */ Parameters[T], js.Promise[ReturnType[T]] | ReturnType[T]] = js.native
  @JSImport("debounce-promise", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, wait: Double): js.Function1[/* args */ Parameters[T], js.Promise[ReturnType[T]] | ReturnType[T]] = js.native
  @JSImport("debounce-promise", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, wait: Double, options: DebounceOptions): js.Function1[/* args */ Parameters[T], js.Promise[ReturnType[T]] | ReturnType[T]] = js.native
  
  @js.native
  trait DebounceOptions extends StObject {
    
    var accumulate: js.UndefOr[Boolean] = js.native
    
    var leading: js.UndefOr[Boolean] = js.native
  }
  object DebounceOptions {
    
    @scala.inline
    def apply(): DebounceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DebounceOptions]
    }
    
    @scala.inline
    implicit class DebounceOptionsMutableBuilder[Self <: DebounceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccumulate(value: Boolean): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccumulateUndefined: Self = StObject.set(x, "accumulate", js.undefined)
      
      @scala.inline
      def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
    }
  }
}

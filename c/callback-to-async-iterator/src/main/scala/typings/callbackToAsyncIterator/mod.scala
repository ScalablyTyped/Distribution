package typings.callbackToAsyncIterator

import typings.std.AsyncIterator
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("callback-to-async-iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T, R](listener: js.Function1[/* callback */ js.Function1[/* message */ T, Unit], js.Promise[R]]): AsyncIterator[T, js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(listener.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[T, js.Any, Unit]]
  @scala.inline
  def default[T, R](
    listener: js.Function1[/* callback */ js.Function1[/* message */ T, Unit], js.Promise[R]],
    options: AsyncifyOptions[T, R]
  ): AsyncIterator[T, js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[T, js.Any, Unit]]
  
  trait AsyncifyOptions[T, R] extends StObject {
    
    var buffering: js.UndefOr[Boolean] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* arg */ R, Unit | T]] = js.undefined
    
    var onError: js.UndefOr[js.Function0[Error]] = js.undefined
  }
  object AsyncifyOptions {
    
    @scala.inline
    def apply[T, R](): AsyncifyOptions[T, R] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncifyOptions[T, R]]
    }
    
    @scala.inline
    implicit class AsyncifyOptionsMutableBuilder[Self <: AsyncifyOptions[?, ?], T, R] (val x: Self & (AsyncifyOptions[T, R])) extends AnyVal {
      
      @scala.inline
      def setBuffering(value: Boolean): Self = StObject.set(x, "buffering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferingUndefined: Self = StObject.set(x, "buffering", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* arg */ R => Unit | T): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnError(value: () => Error): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    }
  }
}

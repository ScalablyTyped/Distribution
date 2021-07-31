package typings.bluebirdRetry

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](func: js.Function1[/* param */ T, Unit]): typings.bluebird.mod.^[T] = ^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[T]]
  @scala.inline
  def apply[T](func: js.Function1[/* param */ T, Unit], options: Options): typings.bluebird.mod.^[T] = (^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bluebird.mod.^[T]]
  
  @JSImport("bluebird-retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bluebird-retry", "StopError")
  @js.native
  class StopError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait Options extends StObject {
    
    var args: js.UndefOr[js.Any] = js.undefined
    
    var backoff: js.UndefOr[Double] = js.undefined
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var max_interval: js.UndefOr[Double] = js.undefined
    
    var max_tries: js.UndefOr[Double] = js.undefined
    
    var predicate: js.UndefOr[js.Any] = js.undefined
    
    var throw_original: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
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
      def setArgs(value: js.Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setBackoff(value: Double): Self = StObject.set(x, "backoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoffUndefined: Self = StObject.set(x, "backoff", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setMax_interval(value: Double): Self = StObject.set(x, "max_interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_intervalUndefined: Self = StObject.set(x, "max_interval", js.undefined)
      
      @scala.inline
      def setMax_tries(value: Double): Self = StObject.set(x, "max_tries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_triesUndefined: Self = StObject.set(x, "max_tries", js.undefined)
      
      @scala.inline
      def setPredicate(value: js.Any): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      @scala.inline
      def setThrow_original(value: Boolean): Self = StObject.set(x, "throw_original", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrow_originalUndefined: Self = StObject.set(x, "throw_original", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}

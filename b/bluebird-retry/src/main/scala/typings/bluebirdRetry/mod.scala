package typings.bluebirdRetry

import typings.bluebird.mod.^
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bluebird-retry", JSImport.Namespace)
  @js.native
  def apply[T](func: js.Function1[/* param */ T, Unit]): ^[T] = js.native
  @JSImport("bluebird-retry", JSImport.Namespace)
  @js.native
  def apply[T](func: js.Function1[/* param */ T, Unit], options: Options): ^[T] = js.native
  
  @JSImport("bluebird-retry", "StopError")
  @js.native
  class StopError () extends Error
  
  @js.native
  trait Options extends StObject {
    
    var args: js.UndefOr[js.Any] = js.native
    
    var backoff: js.UndefOr[Double] = js.native
    
    var context: js.UndefOr[js.Any] = js.native
    
    var interval: js.UndefOr[Double] = js.native
    
    var max_interval: js.UndefOr[Double] = js.native
    
    var max_tries: js.UndefOr[Double] = js.native
    
    var predicate: js.UndefOr[js.Any] = js.native
    
    var throw_original: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
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

package typings.consul.mod

import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Watch extends EventEmitter {
  
  var consul: Consul = js.native
  
  /**
    * End watch
    */
  def end(): Unit = js.native
  
  /**
    * Is running
    */
  def isRunning(): Boolean = js.native
  
  /**
    * Update time
    */
  def updateTime(): Double = js.native
}
object Watch {
  
  @js.native
  trait Options extends StObject {
    
    var backoffFactor: js.UndefOr[Double] = js.native
    
    var backoffMax: js.UndefOr[Double] = js.native
    
    var maxAttempts: js.UndefOr[Double] = js.native
    
    var method: js.Function = js.native
    
    var options: js.UndefOr[CommonOptions with WatchOptions] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(method: js.Function): Options = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackoffFactor(value: Double): Self = StObject.set(x, "backoffFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoffFactorUndefined: Self = StObject.set(x, "backoffFactor", js.undefined)
      
      @scala.inline
      def setBackoffMax(value: Double): Self = StObject.set(x, "backoffMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoffMaxUndefined: Self = StObject.set(x, "backoffMax", js.undefined)
      
      @scala.inline
      def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      @scala.inline
      def setMethod(value: js.Function): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: CommonOptions with WatchOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait WatchOptions extends StObject {
    
    var key: js.UndefOr[String] = js.native
  }
  object WatchOptions {
    
    @scala.inline
    def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    @scala.inline
    implicit class WatchOptionsMutableBuilder[Self <: WatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}

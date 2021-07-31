package typings.consul.mod

import typings.node.Buffer
import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lock
  extends StObject
     with EventEmitter {
  
  /**
    * Acquire lock
    */
  def acquire(): Unit = js.native
  
  var consul: Consul = js.native
  
  /**
    * Release lock
    */
  def release(): Unit = js.native
}
object Lock {
  
  trait Options extends StObject {
    
    var key: String
    
    var lockretrytime: js.UndefOr[String] = js.undefined
    
    var lockwaittime: js.UndefOr[String] = js.undefined
    
    var session: js.UndefOr[js.Object | String] = js.undefined
    
    var value: js.UndefOr[String | Buffer] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(key: String): Options = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockretrytime(value: String): Self = StObject.set(x, "lockretrytime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockretrytimeUndefined: Self = StObject.set(x, "lockretrytime", js.undefined)
      
      @scala.inline
      def setLockwaittime(value: String): Self = StObject.set(x, "lockwaittime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockwaittimeUndefined: Self = StObject.set(x, "lockwaittime", js.undefined)
      
      @scala.inline
      def setSession(value: js.Object | String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

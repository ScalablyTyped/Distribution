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
    
    inline def apply(key: String): Options = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLockretrytime(value: String): Self = StObject.set(x, "lockretrytime", value.asInstanceOf[js.Any])
      
      inline def setLockretrytimeUndefined: Self = StObject.set(x, "lockretrytime", js.undefined)
      
      inline def setLockwaittime(value: String): Self = StObject.set(x, "lockwaittime", value.asInstanceOf[js.Any])
      
      inline def setLockwaittimeUndefined: Self = StObject.set(x, "lockwaittime", js.undefined)
      
      inline def setSession(value: js.Object | String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

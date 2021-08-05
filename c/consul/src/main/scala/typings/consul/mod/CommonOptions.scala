package typings.consul.mod

import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonOptions extends StObject {
  
  var consistent: js.UndefOr[Boolean] = js.undefined
  
  var ctx: js.UndefOr[EventEmitter] = js.undefined
  
  var dc: js.UndefOr[String] = js.undefined
  
  var stale: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
  
  @JSName("wait")
  var wait_FCommonOptions: js.UndefOr[String] = js.undefined
  
  var wan: js.UndefOr[Boolean] = js.undefined
}
object CommonOptions {
  
  inline def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  
  extension [Self <: CommonOptions](x: Self) {
    
    inline def setConsistent(value: Boolean): Self = StObject.set(x, "consistent", value.asInstanceOf[js.Any])
    
    inline def setConsistentUndefined: Self = StObject.set(x, "consistent", js.undefined)
    
    inline def setCtx(value: EventEmitter): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
    
    inline def setDc(value: String): Self = StObject.set(x, "dc", value.asInstanceOf[js.Any])
    
    inline def setDcUndefined: Self = StObject.set(x, "dc", js.undefined)
    
    inline def setStale(value: Boolean): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setWait_(value: String): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    
    inline def setWan(value: Boolean): Self = StObject.set(x, "wan", value.asInstanceOf[js.Any])
    
    inline def setWanUndefined: Self = StObject.set(x, "wan", js.undefined)
  }
}

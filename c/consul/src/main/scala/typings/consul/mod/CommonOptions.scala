package typings.consul.mod

import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonOptions extends StObject {
  
  var consistent: js.UndefOr[Boolean] = js.native
  
  var ctx: js.UndefOr[EventEmitter] = js.native
  
  var dc: js.UndefOr[String] = js.native
  
  var stale: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var token: js.UndefOr[String] = js.native
  
  @JSName("wait")
  var wait_FCommonOptions: js.UndefOr[String] = js.native
  
  var wan: js.UndefOr[Boolean] = js.native
}
object CommonOptions {
  
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  
  @scala.inline
  implicit class CommonOptionsMutableBuilder[Self <: CommonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsistent(value: Boolean): Self = StObject.set(x, "consistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsistentUndefined: Self = StObject.set(x, "consistent", js.undefined)
    
    @scala.inline
    def setCtx(value: EventEmitter): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
    
    @scala.inline
    def setDc(value: String): Self = StObject.set(x, "dc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDcUndefined: Self = StObject.set(x, "dc", js.undefined)
    
    @scala.inline
    def setStale(value: Boolean): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setWait_(value: String): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    
    @scala.inline
    def setWan(value: Boolean): Self = StObject.set(x, "wan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWanUndefined: Self = StObject.set(x, "wan", js.undefined)
  }
}

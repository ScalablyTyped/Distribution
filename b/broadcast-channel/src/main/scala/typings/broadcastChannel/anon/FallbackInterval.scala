package typings.broadcastChannel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FallbackInterval extends js.Object {
  
  var fallbackInterval: js.UndefOr[Double] = js.native
  
  var onclose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var ttl: js.UndefOr[Double] = js.native
}
object FallbackInterval {
  
  @scala.inline
  def apply(): FallbackInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FallbackInterval]
  }
  
  @scala.inline
  implicit class FallbackIntervalOps[Self <: FallbackInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFallbackInterval(value: Double): Self = this.set("fallbackInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackInterval: Self = this.set("fallbackInterval", js.undefined)
    
    @scala.inline
    def setOnclose(value: () => Unit): Self = this.set("onclose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnclose: Self = this.set("onclose", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}

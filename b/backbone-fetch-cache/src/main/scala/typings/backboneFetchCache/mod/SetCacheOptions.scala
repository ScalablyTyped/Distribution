package typings.backboneFetchCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetCacheOptions extends GetCacheOptions {
  
  var cache: Boolean = js.native
  
  var expires: Boolean | Double = js.native
  
  var prefill: Boolean = js.native
  
  var prefillExpires: Boolean | Double = js.native
}
object SetCacheOptions {
  
  @scala.inline
  def apply(cache: Boolean, expires: Boolean | Double, prefill: Boolean, prefillExpires: Boolean | Double): SetCacheOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], prefill = prefill.asInstanceOf[js.Any], prefillExpires = prefillExpires.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCacheOptions]
  }
  
  @scala.inline
  implicit class SetCacheOptionsOps[Self <: SetCacheOptions] (val x: Self) extends AnyVal {
    
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires(value: Boolean | Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefill(value: Boolean): Self = this.set("prefill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefillExpires(value: Boolean | Double): Self = this.set("prefillExpires", value.asInstanceOf[js.Any])
  }
}

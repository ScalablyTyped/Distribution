package typings.cacheManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachingConfig extends js.Object {
  
  var ttl: Double | TtlFunction = js.native
}
object CachingConfig {
  
  @scala.inline
  def apply(ttl: Double | TtlFunction): CachingConfig = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachingConfig]
  }
  
  @scala.inline
  implicit class CachingConfigOps[Self <: CachingConfig] (val x: Self) extends AnyVal {
    
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
    def setTtlFunction1(value: /* result */ js.Any => Double): Self = this.set("ttl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTtl(value: Double | TtlFunction): Self = this.set("ttl", value.asInstanceOf[js.Any])
  }
}

package typings.backboneFetchCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache extends js.Object {
  
  var expires: Double = js.native
  
  var lastSync: Double = js.native
  
  var prefillExpires: Double = js.native
  
  var value: js.Any = js.native
}
object Cache {
  
  @scala.inline
  def apply(expires: Double, lastSync: Double, prefillExpires: Double, value: js.Any): Cache = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], lastSync = lastSync.asInstanceOf[js.Any], prefillExpires = prefillExpires.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
  
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
    
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
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSync(value: Double): Self = this.set("lastSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefillExpires(value: Double): Self = this.set("prefillExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}

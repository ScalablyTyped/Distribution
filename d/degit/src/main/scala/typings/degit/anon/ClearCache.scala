package typings.degit.anon

import typings.degit.degitBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearCache extends js.Object {
  
  var clearCache: js.UndefOr[`true`] = js.native
}
object ClearCache {
  
  @scala.inline
  def apply(): ClearCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearCache]
  }
  
  @scala.inline
  implicit class ClearCacheOps[Self <: ClearCache] (val x: Self) extends AnyVal {
    
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
    def setClearCache(value: `true`): Self = this.set("clearCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearCache: Self = this.set("clearCache", js.undefined)
  }
}

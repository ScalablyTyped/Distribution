package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configurable extends js.Object {
  
  var configurable: js.UndefOr[Boolean] = js.native
  
  var multiple_mounts: js.UndefOr[Boolean] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var watchable: js.UndefOr[Boolean] = js.native
}
object Configurable {
  
  @scala.inline
  def apply(): Configurable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configurable]
  }
  
  @scala.inline
  implicit class ConfigurableOps[Self <: Configurable] (val x: Self) extends AnyVal {
    
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
    def setConfigurable(value: Boolean): Self = this.set("configurable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurable: Self = this.set("configurable", js.undefined)
    
    @scala.inline
    def setMultiple_mounts(value: Boolean): Self = this.set("multiple_mounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple_mounts: Self = this.set("multiple_mounts", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setWatchable(value: Boolean): Self = this.set("watchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchable: Self = this.set("watchable", js.undefined)
  }
}

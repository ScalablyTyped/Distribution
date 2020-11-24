package typings.consul.mod.Kv

import typings.consul.mod.CommonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelOptions extends CommonOptions {
  
  var cas: js.UndefOr[String] = js.native
  
  var key: String = js.native
  
  var recurse: js.UndefOr[Boolean] = js.native
}
object DelOptions {
  
  @scala.inline
  def apply(key: String): DelOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelOptions]
  }
  
  @scala.inline
  implicit class DelOptionsOps[Self <: DelOptions] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCas(value: String): Self = this.set("cas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCas: Self = this.set("cas", js.undefined)
    
    @scala.inline
    def setRecurse(value: Boolean): Self = this.set("recurse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurse: Self = this.set("recurse", js.undefined)
  }
}

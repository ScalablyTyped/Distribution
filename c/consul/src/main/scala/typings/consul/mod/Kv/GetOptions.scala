package typings.consul.mod.Kv

import typings.consul.mod.CommonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOptions extends CommonOptions {
  
  var buffer: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[String] = js.native
  
  var key: String = js.native
  
  var raw: js.UndefOr[Boolean] = js.native
  
  var recurse: js.UndefOr[Boolean] = js.native
  
  @JSName("wait")
  var wait_FGetOptions: js.UndefOr[String] = js.native
}
object GetOptions {
  
  @scala.inline
  def apply(key: String): GetOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOptions]
  }
  
  @scala.inline
  implicit class GetOptionsOps[Self <: GetOptions] (val x: Self) extends AnyVal {
    
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
    def setBuffer(value: Boolean): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setRecurse(value: Boolean): Self = this.set("recurse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurse: Self = this.set("recurse", js.undefined)
    
    @scala.inline
    def setWait(value: String): Self = this.set("wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
}

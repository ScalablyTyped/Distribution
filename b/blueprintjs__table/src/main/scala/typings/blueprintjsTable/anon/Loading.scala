package typings.blueprintjsTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loading extends js.Object {
  
  var loading: Boolean = js.native
  
  var renderMode: typings.blueprintjsTable.renderModeMod.RenderMode = js.native
}
object Loading {
  
  @scala.inline
  def apply(loading: Boolean, renderMode: typings.blueprintjsTable.renderModeMod.RenderMode): Loading = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], renderMode = renderMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loading]
  }
  
  @scala.inline
  implicit class LoadingOps[Self <: Loading] (val x: Self) extends AnyVal {
    
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
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderMode(value: typings.blueprintjsTable.renderModeMod.RenderMode): Self = this.set("renderMode", value.asInstanceOf[js.Any])
  }
}

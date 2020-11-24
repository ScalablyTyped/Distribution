package typings.blueprintjsTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderMode extends js.Object {
  
  var renderMode: typings.blueprintjsTable.renderModeMod.RenderMode = js.native
}
object RenderMode {
  
  @scala.inline
  def apply(renderMode: typings.blueprintjsTable.renderModeMod.RenderMode): RenderMode = {
    val __obj = js.Dynamic.literal(renderMode = renderMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderMode]
  }
  
  @scala.inline
  implicit class RenderModeOps[Self <: RenderMode] (val x: Self) extends AnyVal {
    
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
    def setRenderMode(value: typings.blueprintjsTable.renderModeMod.RenderMode): Self = this.set("renderMode", value.asInstanceOf[js.Any])
  }
}

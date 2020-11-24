package typings.blueprintjsCore.resizeObserverTypesMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResizeEntry extends js.Object {
  
  /** Measured dimensions of the target. */
  val contentRect: IDOMRectReadOnly = js.native
  
  /** The resized element. */
  val target: Element = js.native
}
object IResizeEntry {
  
  @scala.inline
  def apply(contentRect: IDOMRectReadOnly, target: Element): IResizeEntry = {
    val __obj = js.Dynamic.literal(contentRect = contentRect.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResizeEntry]
  }
  
  @scala.inline
  implicit class IResizeEntryOps[Self <: IResizeEntry] (val x: Self) extends AnyVal {
    
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
    def setContentRect(value: IDOMRectReadOnly): Self = this.set("contentRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}

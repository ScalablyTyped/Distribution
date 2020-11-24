package typings.chromeApps.chrome.system.display

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Insets extends js.Object {
  
  /** The y-axis distance from the bottom bound. */
  var bottom: integer = js.native
  
  /** The x-axis distance from the left bound. */
  var left: integer = js.native
  
  /** The x-axis distance from the right bound. */
  var right: integer = js.native
  
  /** The y-axis distance from the top bound. */
  var top: integer = js.native
}
object Insets {
  
  @scala.inline
  def apply(bottom: integer, left: integer, right: integer, top: integer): Insets = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insets]
  }
  
  @scala.inline
  implicit class InsetsOps[Self <: Insets] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: integer): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: integer): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: integer): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: integer): Self = this.set("top", value.asInstanceOf[js.Any])
  }
}

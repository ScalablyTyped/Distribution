package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrimitiveOptions extends js.Object {
  
  /** The css cursor to show when the IPrimitive has mouse events on it. Default value is pointer (hand). */
  var cursor: js.UndefOr[String] = js.native
  
  /** Boolean indicating whether the IPrimitive is visible. */
  var visible: js.UndefOr[Boolean] = js.native
}
object IPrimitiveOptions {
  
  @scala.inline
  def apply(): IPrimitiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPrimitiveOptions]
  }
  
  @scala.inline
  implicit class IPrimitiveOptionsOps[Self <: IPrimitiveOptions] (val x: Self) extends AnyVal {
    
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
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}

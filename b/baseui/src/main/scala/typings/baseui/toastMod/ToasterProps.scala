package typings.baseui.toastMod

import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToasterProps extends js.Object {
  
  var autoHideDuration: js.UndefOr[Double] = js.native
  
  var overrides: js.UndefOr[ToasterOverrides] = js.native
  
  var placement: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight | bottom | top] = js.native
  
  var usePortal: js.UndefOr[Boolean] = js.native
}
object ToasterProps {
  
  @scala.inline
  def apply(): ToasterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToasterProps]
  }
  
  @scala.inline
  implicit class ToasterPropsOps[Self <: ToasterProps] (val x: Self) extends AnyVal {
    
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
    def setAutoHideDuration(value: Double): Self = this.set("autoHideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHideDuration: Self = this.set("autoHideDuration", js.undefined)
    
    @scala.inline
    def setOverrides(value: ToasterOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setPlacement(value: topLeft | topRight | bottomLeft | bottomRight | bottom | top): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setUsePortal(value: Boolean): Self = this.set("usePortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePortal: Self = this.set("usePortal", js.undefined)
  }
}

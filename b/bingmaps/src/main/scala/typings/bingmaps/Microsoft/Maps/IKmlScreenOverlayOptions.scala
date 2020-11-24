package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKmlScreenOverlayOptions extends js.Object {
  
  /** A boolean indicating if the screen overlay can be displayed above or beow the navigaiton bar. Default: false */
  var belowNavigationBar: js.UndefOr[Boolean] = js.native
  
  /** The visibility of the screen overlay. Default: true */
  var visible: js.UndefOr[Boolean] = js.native
}
object IKmlScreenOverlayOptions {
  
  @scala.inline
  def apply(): IKmlScreenOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKmlScreenOverlayOptions]
  }
  
  @scala.inline
  implicit class IKmlScreenOverlayOptionsOps[Self <: IKmlScreenOverlayOptions] (val x: Self) extends AnyVal {
    
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
    def setBelowNavigationBar(value: Boolean): Self = this.set("belowNavigationBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBelowNavigationBar: Self = this.set("belowNavigationBar", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}

package typings.blueprintjsCore.overlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOverlayState extends js.Object {
  
  var hasEverOpened: js.UndefOr[Boolean] = js.native
}
object IOverlayState {
  
  @scala.inline
  def apply(): IOverlayState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOverlayState]
  }
  
  @scala.inline
  implicit class IOverlayStateOps[Self <: IOverlayState] (val x: Self) extends AnyVal {
    
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
    def setHasEverOpened(value: Boolean): Self = this.set("hasEverOpened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasEverOpened: Self = this.set("hasEverOpened", js.undefined)
  }
}

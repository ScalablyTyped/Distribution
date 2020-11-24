package typings.cathoQuantum.avatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvatarProps extends js.Object {
  
  var hasNotification: js.UndefOr[Boolean] = js.native
  
  var hasToggle: js.UndefOr[Boolean] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[js.Function0[js.Object]] = js.native
  
  var picture: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object AvatarProps {
  
  @scala.inline
  def apply(): AvatarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvatarProps]
  }
  
  @scala.inline
  implicit class AvatarPropsOps[Self <: AvatarProps] (val x: Self) extends AnyVal {
    
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
    def setHasNotification(value: Boolean): Self = this.set("hasNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasNotification: Self = this.set("hasNotification", js.undefined)
    
    @scala.inline
    def setHasToggle(value: Boolean): Self = this.set("hasToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasToggle: Self = this.set("hasToggle", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setOnClick(value: () => js.Object): Self = this.set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setPicture(value: String): Self = this.set("picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePicture: Self = this.set("picture", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}

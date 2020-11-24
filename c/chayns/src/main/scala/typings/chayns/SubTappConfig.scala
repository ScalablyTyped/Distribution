package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.setSubTapp()
@js.native
trait SubTappConfig extends js.Object {
  
  var boldText: js.UndefOr[Boolean] = js.native
  
  var buttonName: String = js.native
  
  var callbackURL: js.UndefOr[js.Function1[/* result */ js.Any, _]] = js.native
  
  var color: String = js.native
  
  var colorText: js.UndefOr[String] = js.native
  
  var icon: String = js.native
  
  var isExclusiveView: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
  
  var replaceParent: js.UndefOr[Boolean] = js.native
  
  var sortID: Double = js.native
  
  var tappID: Double = js.native
  
  var url: String = js.native
}
object SubTappConfig {
  
  @scala.inline
  def apply(
    buttonName: String,
    color: String,
    icon: String,
    name: String,
    sortID: Double,
    tappID: Double,
    url: String
  ): SubTappConfig = {
    val __obj = js.Dynamic.literal(buttonName = buttonName.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sortID = sortID.asInstanceOf[js.Any], tappID = tappID.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubTappConfig]
  }
  
  @scala.inline
  implicit class SubTappConfigOps[Self <: SubTappConfig] (val x: Self) extends AnyVal {
    
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
    def setButtonName(value: String): Self = this.set("buttonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortID(value: Double): Self = this.set("sortID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTappID(value: Double): Self = this.set("tappID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldText(value: Boolean): Self = this.set("boldText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoldText: Self = this.set("boldText", js.undefined)
    
    @scala.inline
    def setCallbackURL(value: /* result */ js.Any => _): Self = this.set("callbackURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallbackURL: Self = this.set("callbackURL", js.undefined)
    
    @scala.inline
    def setColorText(value: String): Self = this.set("colorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorText: Self = this.set("colorText", js.undefined)
    
    @scala.inline
    def setIsExclusiveView(value: Boolean): Self = this.set("isExclusiveView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExclusiveView: Self = this.set("isExclusiveView", js.undefined)
    
    @scala.inline
    def setReplaceParent(value: Boolean): Self = this.set("replaceParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceParent: Self = this.set("replaceParent", js.undefined)
  }
}

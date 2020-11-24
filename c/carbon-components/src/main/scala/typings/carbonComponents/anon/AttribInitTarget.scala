package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttribInitTarget extends js.Object {
  
  var attribInitTarget: String = js.native
  
  var classBody: String = js.native
  
  var classVisible: String = js.native
  
  var eventAfterHidden: String = js.native
  
  var eventAfterShown: String = js.native
  
  var eventBeforeHidden: String = js.native
  
  var eventBeforeShown: String = js.native
  
  var initEventNames: js.Array[String] = js.native
  
  var selectorInit: String = js.native
  
  var selectorModalClose: String = js.native
  
  var selectorModalContainer: String = js.native
  
  var selectorPrimaryFocus: String = js.native
  
  var selectorsFloatingMenus: js.Array[String] = js.native
}
object AttribInitTarget {
  
  @scala.inline
  def apply(
    attribInitTarget: String,
    classBody: String,
    classVisible: String,
    eventAfterHidden: String,
    eventAfterShown: String,
    eventBeforeHidden: String,
    eventBeforeShown: String,
    initEventNames: js.Array[String],
    selectorInit: String,
    selectorModalClose: String,
    selectorModalContainer: String,
    selectorPrimaryFocus: String,
    selectorsFloatingMenus: js.Array[String]
  ): AttribInitTarget = {
    val __obj = js.Dynamic.literal(attribInitTarget = attribInitTarget.asInstanceOf[js.Any], classBody = classBody.asInstanceOf[js.Any], classVisible = classVisible.asInstanceOf[js.Any], eventAfterHidden = eventAfterHidden.asInstanceOf[js.Any], eventAfterShown = eventAfterShown.asInstanceOf[js.Any], eventBeforeHidden = eventBeforeHidden.asInstanceOf[js.Any], eventBeforeShown = eventBeforeShown.asInstanceOf[js.Any], initEventNames = initEventNames.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorModalClose = selectorModalClose.asInstanceOf[js.Any], selectorModalContainer = selectorModalContainer.asInstanceOf[js.Any], selectorPrimaryFocus = selectorPrimaryFocus.asInstanceOf[js.Any], selectorsFloatingMenus = selectorsFloatingMenus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttribInitTarget]
  }
  
  @scala.inline
  implicit class AttribInitTargetOps[Self <: AttribInitTarget] (val x: Self) extends AnyVal {
    
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
    def setAttribInitTarget(value: String): Self = this.set("attribInitTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassBody(value: String): Self = this.set("classBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassVisible(value: String): Self = this.set("classVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventAfterHidden(value: String): Self = this.set("eventAfterHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventAfterShown(value: String): Self = this.set("eventAfterShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBeforeHidden(value: String): Self = this.set("eventBeforeHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBeforeShown(value: String): Self = this.set("eventBeforeShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitEventNamesVarargs(value: String*): Self = this.set("initEventNames", js.Array(value :_*))
    
    @scala.inline
    def setInitEventNames(value: js.Array[String]): Self = this.set("initEventNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorModalClose(value: String): Self = this.set("selectorModalClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorModalContainer(value: String): Self = this.set("selectorModalContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorPrimaryFocus(value: String): Self = this.set("selectorPrimaryFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsFloatingMenusVarargs(value: String*): Self = this.set("selectorsFloatingMenus", js.Array(value :_*))
    
    @scala.inline
    def setSelectorsFloatingMenus(value: js.Array[String]): Self = this.set("selectorsFloatingMenus", value.asInstanceOf[js.Any])
  }
}

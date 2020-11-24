package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassSearchActive extends js.Object {
  
  var classSearchActive: String = js.native
  
  var classTallRows: String = js.native
  
  var selectorInit: String = js.native
  
  var selectorRowHeight: String = js.native
  
  var selectorSearch: String = js.native
}
object ClassSearchActive {
  
  @scala.inline
  def apply(
    classSearchActive: String,
    classTallRows: String,
    selectorInit: String,
    selectorRowHeight: String,
    selectorSearch: String
  ): ClassSearchActive = {
    val __obj = js.Dynamic.literal(classSearchActive = classSearchActive.asInstanceOf[js.Any], classTallRows = classTallRows.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorRowHeight = selectorRowHeight.asInstanceOf[js.Any], selectorSearch = selectorSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSearchActive]
  }
  
  @scala.inline
  implicit class ClassSearchActiveOps[Self <: ClassSearchActive] (val x: Self) extends AnyVal {
    
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
    def setClassSearchActive(value: String): Self = this.set("classSearchActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassTallRows(value: String): Self = this.set("classTallRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorRowHeight(value: String): Self = this.set("selectorRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorSearch(value: String): Self = this.set("selectorSearch", value.asInstanceOf[js.Any])
  }
}

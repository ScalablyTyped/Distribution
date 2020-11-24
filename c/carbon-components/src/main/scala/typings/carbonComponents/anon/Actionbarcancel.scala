package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actionbarcancel extends js.Object {
  
  var `action-bar-cancel`: String = js.native
  
  var expand: String = js.native
  
  var expandAll: String = js.native
  
  var select: String = js.native
  
  var `select-all`: String = js.native
  
  var sort: String = js.native
}
object Actionbarcancel {
  
  @scala.inline
  def apply(
    `action-bar-cancel`: String,
    expand: String,
    expandAll: String,
    select: String,
    `select-all`: String,
    sort: String
  ): Actionbarcancel = {
    val __obj = js.Dynamic.literal(expand = expand.asInstanceOf[js.Any], expandAll = expandAll.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.updateDynamic("action-bar-cancel")(`action-bar-cancel`.asInstanceOf[js.Any])
    __obj.updateDynamic("select-all")(`select-all`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actionbarcancel]
  }
  
  @scala.inline
  implicit class ActionbarcancelOps[Self <: Actionbarcancel] (val x: Self) extends AnyVal {
    
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
    def `setAction-bar-cancel`(value: String): Self = this.set("action-bar-cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpand(value: String): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandAll(value: String): Self = this.set("expandAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: String): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSelect-all`(value: String): Self = this.set("select-all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
  }
}

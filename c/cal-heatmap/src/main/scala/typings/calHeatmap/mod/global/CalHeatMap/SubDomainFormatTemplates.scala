package typings.calHeatmap.mod.global.CalHeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubDomainFormatTemplates extends js.Object {
  
  /** Format of the title when there is no value associated to the date. Default value: "{date}" */
  var empty: js.UndefOr[String] = js.native
  
  /** Format of the title when it's associated to a value. Default value: "{count} {name} {connector} {date}" */
  var filled: js.UndefOr[String] = js.native
}
object SubDomainFormatTemplates {
  
  @scala.inline
  def apply(): SubDomainFormatTemplates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubDomainFormatTemplates]
  }
  
  @scala.inline
  implicit class SubDomainFormatTemplatesOps[Self <: SubDomainFormatTemplates] (val x: Self) extends AnyVal {
    
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
    def setEmpty(value: String): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setFilled(value: String): Self = this.set("filled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilled: Self = this.set("filled", js.undefined)
  }
}

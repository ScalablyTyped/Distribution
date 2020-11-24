package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBoxProperties extends js.Object {
  
  var selectedRow: js.UndefOr[Double] = js.native
  
  var values: js.UndefOr[js.Array[String]] = js.native
}
object ListBoxProperties {
  
  @scala.inline
  def apply(): ListBoxProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxProperties]
  }
  
  @scala.inline
  implicit class ListBoxPropertiesOps[Self <: ListBoxProperties] (val x: Self) extends AnyVal {
    
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
    def setSelectedRow(value: Double): Self = this.set("selectedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRow: Self = this.set("selectedRow", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}

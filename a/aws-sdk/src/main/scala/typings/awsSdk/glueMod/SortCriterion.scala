package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortCriterion extends js.Object {
  
  /**
    * The name of the field on which to sort.
    */
  var FieldName: js.UndefOr[ValueString] = js.native
  
  /**
    * An ascending or descending sort.
    */
  var Sort: js.UndefOr[typings.awsSdk.glueMod.Sort] = js.native
}
object SortCriterion {
  
  @scala.inline
  def apply(): SortCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortCriterion]
  }
  
  @scala.inline
  implicit class SortCriterionOps[Self <: SortCriterion] (val x: Self) extends AnyVal {
    
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
    def setFieldName(value: ValueString): Self = this.set("FieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldName: Self = this.set("FieldName", js.undefined)
    
    @scala.inline
    def setSort(value: Sort): Self = this.set("Sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("Sort", js.undefined)
  }
}

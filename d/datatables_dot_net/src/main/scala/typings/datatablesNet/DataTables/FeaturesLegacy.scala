package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeaturesLegacy extends js.Object {
  
  var bAutoWidth: Boolean = js.native
  
  var bDeferRender: Boolean = js.native
  
  var bFilter: Boolean = js.native
  
  var bInfo: Boolean = js.native
  
  var bLengthChange: Boolean = js.native
  
  var bPaginate: Boolean = js.native
  
  var bProcessing: Boolean = js.native
  
  var bServerSide: Boolean = js.native
  
  var bSort: Boolean = js.native
  
  var bSortClasses: Boolean = js.native
  
  var bStateSave: Boolean = js.native
}
object FeaturesLegacy {
  
  @scala.inline
  def apply(
    bAutoWidth: Boolean,
    bDeferRender: Boolean,
    bFilter: Boolean,
    bInfo: Boolean,
    bLengthChange: Boolean,
    bPaginate: Boolean,
    bProcessing: Boolean,
    bServerSide: Boolean,
    bSort: Boolean,
    bSortClasses: Boolean,
    bStateSave: Boolean
  ): FeaturesLegacy = {
    val __obj = js.Dynamic.literal(bAutoWidth = bAutoWidth.asInstanceOf[js.Any], bDeferRender = bDeferRender.asInstanceOf[js.Any], bFilter = bFilter.asInstanceOf[js.Any], bInfo = bInfo.asInstanceOf[js.Any], bLengthChange = bLengthChange.asInstanceOf[js.Any], bPaginate = bPaginate.asInstanceOf[js.Any], bProcessing = bProcessing.asInstanceOf[js.Any], bServerSide = bServerSide.asInstanceOf[js.Any], bSort = bSort.asInstanceOf[js.Any], bSortClasses = bSortClasses.asInstanceOf[js.Any], bStateSave = bStateSave.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturesLegacy]
  }
  
  @scala.inline
  implicit class FeaturesLegacyOps[Self <: FeaturesLegacy] (val x: Self) extends AnyVal {
    
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
    def setBAutoWidth(value: Boolean): Self = this.set("bAutoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBDeferRender(value: Boolean): Self = this.set("bDeferRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBFilter(value: Boolean): Self = this.set("bFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBInfo(value: Boolean): Self = this.set("bInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBLengthChange(value: Boolean): Self = this.set("bLengthChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBPaginate(value: Boolean): Self = this.set("bPaginate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBProcessing(value: Boolean): Self = this.set("bProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBServerSide(value: Boolean): Self = this.set("bServerSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBSort(value: Boolean): Self = this.set("bSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBSortClasses(value: Boolean): Self = this.set("bSortClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBStateSave(value: Boolean): Self = this.set("bStateSave", value.asInstanceOf[js.Any])
  }
}

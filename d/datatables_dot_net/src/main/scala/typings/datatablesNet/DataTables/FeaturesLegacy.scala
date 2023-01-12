package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturesLegacy extends StObject {
  
  var bAutoWidth: Boolean
  
  var bDeferRender: Boolean
  
  var bFilter: Boolean
  
  var bInfo: Boolean
  
  var bLengthChange: Boolean
  
  var bPaginate: Boolean
  
  var bProcessing: Boolean
  
  var bServerSide: Boolean
  
  var bSort: Boolean
  
  var bSortClasses: Boolean
  
  var bStateSave: Boolean
}
object FeaturesLegacy {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: FeaturesLegacy] (val x: Self) extends AnyVal {
    
    inline def setBAutoWidth(value: Boolean): Self = StObject.set(x, "bAutoWidth", value.asInstanceOf[js.Any])
    
    inline def setBDeferRender(value: Boolean): Self = StObject.set(x, "bDeferRender", value.asInstanceOf[js.Any])
    
    inline def setBFilter(value: Boolean): Self = StObject.set(x, "bFilter", value.asInstanceOf[js.Any])
    
    inline def setBInfo(value: Boolean): Self = StObject.set(x, "bInfo", value.asInstanceOf[js.Any])
    
    inline def setBLengthChange(value: Boolean): Self = StObject.set(x, "bLengthChange", value.asInstanceOf[js.Any])
    
    inline def setBPaginate(value: Boolean): Self = StObject.set(x, "bPaginate", value.asInstanceOf[js.Any])
    
    inline def setBProcessing(value: Boolean): Self = StObject.set(x, "bProcessing", value.asInstanceOf[js.Any])
    
    inline def setBServerSide(value: Boolean): Self = StObject.set(x, "bServerSide", value.asInstanceOf[js.Any])
    
    inline def setBSort(value: Boolean): Self = StObject.set(x, "bSort", value.asInstanceOf[js.Any])
    
    inline def setBSortClasses(value: Boolean): Self = StObject.set(x, "bSortClasses", value.asInstanceOf[js.Any])
    
    inline def setBStateSave(value: Boolean): Self = StObject.set(x, "bStateSave", value.asInstanceOf[js.Any])
  }
}

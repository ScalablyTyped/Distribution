package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "callback-functions"
//#region "language-settings"
// these are all optional
trait LanguageSettings extends StObject {
  
  var aria: js.UndefOr[LanguageAriaSettings] = js.undefined
  
  var decimal: js.UndefOr[String] = js.undefined
  
  var emptyTable: js.UndefOr[String] = js.undefined
  
  var info: js.UndefOr[String] = js.undefined
  
  var infoEmpty: js.UndefOr[String] = js.undefined
  
  var infoFiltered: js.UndefOr[String] = js.undefined
  
  var infoPostFix: js.UndefOr[String] = js.undefined
  
  var lengthMenu: js.UndefOr[String] = js.undefined
  
  var loadingRecords: js.UndefOr[String] = js.undefined
  
  var paginate: js.UndefOr[LanguagePaginateSettings] = js.undefined
  
  var processing: js.UndefOr[String] = js.undefined
  
  var search: js.UndefOr[String] = js.undefined
  
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  
  var thousands: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var zeroRecords: js.UndefOr[String] = js.undefined
}
object LanguageSettings {
  
  inline def apply(): LanguageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageSettings] (val x: Self) extends AnyVal {
    
    inline def setAria(value: LanguageAriaSettings): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    inline def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
    
    inline def setEmptyTable(value: String): Self = StObject.set(x, "emptyTable", value.asInstanceOf[js.Any])
    
    inline def setEmptyTableUndefined: Self = StObject.set(x, "emptyTable", js.undefined)
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoEmpty(value: String): Self = StObject.set(x, "infoEmpty", value.asInstanceOf[js.Any])
    
    inline def setInfoEmptyUndefined: Self = StObject.set(x, "infoEmpty", js.undefined)
    
    inline def setInfoFiltered(value: String): Self = StObject.set(x, "infoFiltered", value.asInstanceOf[js.Any])
    
    inline def setInfoFilteredUndefined: Self = StObject.set(x, "infoFiltered", js.undefined)
    
    inline def setInfoPostFix(value: String): Self = StObject.set(x, "infoPostFix", value.asInstanceOf[js.Any])
    
    inline def setInfoPostFixUndefined: Self = StObject.set(x, "infoPostFix", js.undefined)
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setLengthMenu(value: String): Self = StObject.set(x, "lengthMenu", value.asInstanceOf[js.Any])
    
    inline def setLengthMenuUndefined: Self = StObject.set(x, "lengthMenu", js.undefined)
    
    inline def setLoadingRecords(value: String): Self = StObject.set(x, "loadingRecords", value.asInstanceOf[js.Any])
    
    inline def setLoadingRecordsUndefined: Self = StObject.set(x, "loadingRecords", js.undefined)
    
    inline def setPaginate(value: LanguagePaginateSettings): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
    
    inline def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
    
    inline def setProcessing(value: String): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
    
    inline def setProcessingUndefined: Self = StObject.set(x, "processing", js.undefined)
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setThousands(value: String): Self = StObject.set(x, "thousands", value.asInstanceOf[js.Any])
    
    inline def setThousandsUndefined: Self = StObject.set(x, "thousands", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setZeroRecords(value: String): Self = StObject.set(x, "zeroRecords", value.asInstanceOf[js.Any])
    
    inline def setZeroRecordsUndefined: Self = StObject.set(x, "zeroRecords", js.undefined)
  }
}

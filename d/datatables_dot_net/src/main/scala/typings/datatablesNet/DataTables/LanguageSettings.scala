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
  
  @scala.inline
  def apply(): LanguageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageSettings]
  }
  
  @scala.inline
  implicit class LanguageSettingsMutableBuilder[Self <: LanguageSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAria(value: LanguageAriaSettings): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    @scala.inline
    def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
    
    @scala.inline
    def setEmptyTable(value: String): Self = StObject.set(x, "emptyTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyTableUndefined: Self = StObject.set(x, "emptyTable", js.undefined)
    
    @scala.inline
    def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoEmpty(value: String): Self = StObject.set(x, "infoEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoEmptyUndefined: Self = StObject.set(x, "infoEmpty", js.undefined)
    
    @scala.inline
    def setInfoFiltered(value: String): Self = StObject.set(x, "infoFiltered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoFilteredUndefined: Self = StObject.set(x, "infoFiltered", js.undefined)
    
    @scala.inline
    def setInfoPostFix(value: String): Self = StObject.set(x, "infoPostFix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPostFixUndefined: Self = StObject.set(x, "infoPostFix", js.undefined)
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setLengthMenu(value: String): Self = StObject.set(x, "lengthMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthMenuUndefined: Self = StObject.set(x, "lengthMenu", js.undefined)
    
    @scala.inline
    def setLoadingRecords(value: String): Self = StObject.set(x, "loadingRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingRecordsUndefined: Self = StObject.set(x, "loadingRecords", js.undefined)
    
    @scala.inline
    def setPaginate(value: LanguagePaginateSettings): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
    
    @scala.inline
    def setProcessing(value: String): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingUndefined: Self = StObject.set(x, "processing", js.undefined)
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setThousands(value: String): Self = StObject.set(x, "thousands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThousandsUndefined: Self = StObject.set(x, "thousands", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setZeroRecords(value: String): Self = StObject.set(x, "zeroRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroRecordsUndefined: Self = StObject.set(x, "zeroRecords", js.undefined)
  }
}

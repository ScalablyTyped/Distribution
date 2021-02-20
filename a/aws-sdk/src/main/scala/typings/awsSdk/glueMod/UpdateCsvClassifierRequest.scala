package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCsvClassifierRequest extends StObject {
  
  /**
    * Enables the processing of files that contain only one column.
    */
  var AllowSingleColumn: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * Indicates whether the CSV file contains a header.
    */
  var ContainsHeader: js.UndefOr[CsvHeaderOption] = js.native
  
  /**
    * A custom symbol to denote what separates each column entry in the row.
    */
  var Delimiter: js.UndefOr[CsvColumnDelimiter] = js.native
  
  /**
    * Specifies not to trim values before identifying the type of column values. The default value is true.
    */
  var DisableValueTrimming: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * A list of strings representing column names.
    */
  var Header: js.UndefOr[CsvHeader] = js.native
  
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
  
  /**
    * A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
    */
  var QuoteSymbol: js.UndefOr[CsvQuoteSymbol] = js.native
}
object UpdateCsvClassifierRequest {
  
  @scala.inline
  def apply(Name: NameString): UpdateCsvClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCsvClassifierRequest]
  }
  
  @scala.inline
  implicit class UpdateCsvClassifierRequestMutableBuilder[Self <: UpdateCsvClassifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSingleColumn(value: NullableBoolean): Self = StObject.set(x, "AllowSingleColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSingleColumnUndefined: Self = StObject.set(x, "AllowSingleColumn", js.undefined)
    
    @scala.inline
    def setContainsHeader(value: CsvHeaderOption): Self = StObject.set(x, "ContainsHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsHeaderUndefined: Self = StObject.set(x, "ContainsHeader", js.undefined)
    
    @scala.inline
    def setDelimiter(value: CsvColumnDelimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    @scala.inline
    def setDisableValueTrimming(value: NullableBoolean): Self = StObject.set(x, "DisableValueTrimming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableValueTrimmingUndefined: Self = StObject.set(x, "DisableValueTrimming", js.undefined)
    
    @scala.inline
    def setHeader(value: CsvHeader): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
    
    @scala.inline
    def setHeaderVarargs(value: NameString*): Self = StObject.set(x, "Header", js.Array(value :_*))
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteSymbol(value: CsvQuoteSymbol): Self = StObject.set(x, "QuoteSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteSymbolUndefined: Self = StObject.set(x, "QuoteSymbol", js.undefined)
  }
}

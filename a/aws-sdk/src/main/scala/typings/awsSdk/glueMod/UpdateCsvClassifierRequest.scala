package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCsvClassifierRequest extends js.Object {
  
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
  implicit class UpdateCsvClassifierRequestOps[Self <: UpdateCsvClassifierRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSingleColumn(value: NullableBoolean): Self = this.set("AllowSingleColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSingleColumn: Self = this.set("AllowSingleColumn", js.undefined)
    
    @scala.inline
    def setContainsHeader(value: CsvHeaderOption): Self = this.set("ContainsHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainsHeader: Self = this.set("ContainsHeader", js.undefined)
    
    @scala.inline
    def setDelimiter(value: CsvColumnDelimiter): Self = this.set("Delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("Delimiter", js.undefined)
    
    @scala.inline
    def setDisableValueTrimming(value: NullableBoolean): Self = this.set("DisableValueTrimming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableValueTrimming: Self = this.set("DisableValueTrimming", js.undefined)
    
    @scala.inline
    def setHeaderVarargs(value: NameString*): Self = this.set("Header", js.Array(value :_*))
    
    @scala.inline
    def setHeader(value: CsvHeader): Self = this.set("Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("Header", js.undefined)
    
    @scala.inline
    def setQuoteSymbol(value: CsvQuoteSymbol): Self = this.set("QuoteSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoteSymbol: Self = this.set("QuoteSymbol", js.undefined)
  }
}

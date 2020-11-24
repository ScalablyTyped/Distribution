package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Occurrences extends js.Object {
  
  /**
    * An array of objects, one for each occurrence of sensitive data in a Microsoft Excel workbook, CSV file, or TSV file. Each object specifies the cell or field that contains the data. This value is null for all other types of files.
    */
  var cells: js.UndefOr[Cells] = js.native
  
  /**
    * An array of objects, one for each occurrence of sensitive data in a Microsoft Word document or non-binary text file, such as an HTML, JSON, TXT, or XML file. Each object specifies the line that contains the data, and the position of the data on that line. This value is often null for file types that are supported by Cell, Page, or Record objects. Exceptions are the locations of: data in unstructured sections of an otherwise structured file, such as a comment in a file; and, data in a malformed file that Amazon Macie analyzes as plain text.
    */
  var lineRanges: js.UndefOr[Ranges] = js.native
  
  /**
    * An array of objects, one for each occurrence of sensitive data in a binary text file. Each object specifies the position of the data relative to the beginning of the file. This value is typically null. For binary text files, Amazon Macie adds location data to a lineRanges.Range or Page object, depending on the file type.
    */
  var offsetRanges: js.UndefOr[Ranges] = js.native
  
  /**
    * An array of objects, one for each occurrence of sensitive data in an Adobe Portable Document Format file. Each object specifies the page that contains the data, and the position of the data on that page. This value is null for all other types of files.
    */
  var pages: js.UndefOr[Pages] = js.native
  
  /**
    * An array of objects, one for each occurrence of sensitive data in an Apache Avro object container or Apache Parquet file. Each object specifies the record index and the path to the field in the record that contains the data. This value is null for all other types of files.
    */
  var records: js.UndefOr[Records] = js.native
}
object Occurrences {
  
  @scala.inline
  def apply(): Occurrences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Occurrences]
  }
  
  @scala.inline
  implicit class OccurrencesOps[Self <: Occurrences] (val x: Self) extends AnyVal {
    
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
    def setCellsVarargs(value: Cell*): Self = this.set("cells", js.Array(value :_*))
    
    @scala.inline
    def setCells(value: Cells): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCells: Self = this.set("cells", js.undefined)
    
    @scala.inline
    def setLineRangesVarargs(value: Range*): Self = this.set("lineRanges", js.Array(value :_*))
    
    @scala.inline
    def setLineRanges(value: Ranges): Self = this.set("lineRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineRanges: Self = this.set("lineRanges", js.undefined)
    
    @scala.inline
    def setOffsetRangesVarargs(value: Range*): Self = this.set("offsetRanges", js.Array(value :_*))
    
    @scala.inline
    def setOffsetRanges(value: Ranges): Self = this.set("offsetRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetRanges: Self = this.set("offsetRanges", js.undefined)
    
    @scala.inline
    def setPagesVarargs(value: Page*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: Pages): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    
    @scala.inline
    def setRecordsVarargs(value: Record*): Self = this.set("records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: Records): Self = this.set("records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecords: Self = this.set("records", js.undefined)
  }
}

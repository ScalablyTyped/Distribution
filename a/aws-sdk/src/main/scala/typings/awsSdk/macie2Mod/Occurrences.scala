package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Occurrences extends StObject {
  
  /**
    * An array of objects, one for each occurrence of sensitive data in a Microsoft Excel workbook, CSV file, or TSV file. This value is null for all other types of files. Each Cell object specifies a cell or field that contains the sensitive data.
    */
  var cells: js.UndefOr[Cells] = js.undefined
  
  /**
    * An array of objects, one for each occurrence of sensitive data in a non-binary text file, such as an HTML, TXT, or XML file. Each Range object specifies a line or inclusive range of lines that contains the sensitive data, and the position of the data on the specified line or lines. This value is often null for file types that are supported by Cell, Page, or Record objects. Exceptions are the location of sensitive data in: unstructured sections of an otherwise structured file, such as a comment in a file; a malformed file that Amazon Macie analyzes as plain text; and, a CSV or TSV file that has any column names that contain sensitive data.
    */
  var lineRanges: js.UndefOr[Ranges] = js.undefined
  
  /**
    *  Reserved for future use.
    */
  var offsetRanges: js.UndefOr[Ranges] = js.undefined
  
  /**
    * An array of objects, one for each occurrence of sensitive data in an Adobe Portable Document Format file. This value is null for all other types of files. Each Page object specifies a page that contains the sensitive data.
    */
  var pages: js.UndefOr[Pages] = js.undefined
  
  /**
    * An array of objects, one for each occurrence of sensitive data in an Apache Avro object container, Apache Parquet file, JSON file, or JSON Lines file. This value is null for all other types of files. For an Avro object container or Parquet file, each Record object specifies a record index and the path to a field in a record that contains the sensitive data. For a JSON or JSON Lines file, each Record object specifies the path to a field or array that contains the sensitive data. For a JSON Lines file, it also specifies the index of the line that contains the data.
    */
  var records: js.UndefOr[Records] = js.undefined
}
object Occurrences {
  
  inline def apply(): Occurrences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Occurrences]
  }
  
  extension [Self <: Occurrences](x: Self) {
    
    inline def setCells(value: Cells): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
    
    inline def setCellsVarargs(value: Cell*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setLineRanges(value: Ranges): Self = StObject.set(x, "lineRanges", value.asInstanceOf[js.Any])
    
    inline def setLineRangesUndefined: Self = StObject.set(x, "lineRanges", js.undefined)
    
    inline def setLineRangesVarargs(value: Range*): Self = StObject.set(x, "lineRanges", js.Array(value*))
    
    inline def setOffsetRanges(value: Ranges): Self = StObject.set(x, "offsetRanges", value.asInstanceOf[js.Any])
    
    inline def setOffsetRangesUndefined: Self = StObject.set(x, "offsetRanges", js.undefined)
    
    inline def setOffsetRangesVarargs(value: Range*): Self = StObject.set(x, "offsetRanges", js.Array(value*))
    
    inline def setPages(value: Pages): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: Page*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def setRecords(value: Records): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    inline def setRecordsVarargs(value: Record*): Self = StObject.set(x, "records", js.Array(value*))
  }
}

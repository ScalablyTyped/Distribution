package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelOptions extends StObject {
  
  /**
    * A variable that specifies whether the first row in the file is parsed as the header. If this value is false, column names are auto-generated.
    */
  var HeaderRow: js.UndefOr[typings.awsSdk.databrewMod.HeaderRow] = js.undefined
  
  /**
    * One or more sheet numbers in the Excel file that will be included in the dataset.
    */
  var SheetIndexes: js.UndefOr[SheetIndexList] = js.undefined
  
  /**
    * One or more named sheets in the Excel file that will be included in the dataset.
    */
  var SheetNames: js.UndefOr[SheetNameList] = js.undefined
}
object ExcelOptions {
  
  inline def apply(): ExcelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelOptions]
  }
  
  extension [Self <: ExcelOptions](x: Self) {
    
    inline def setHeaderRow(value: HeaderRow): Self = StObject.set(x, "HeaderRow", value.asInstanceOf[js.Any])
    
    inline def setHeaderRowUndefined: Self = StObject.set(x, "HeaderRow", js.undefined)
    
    inline def setSheetIndexes(value: SheetIndexList): Self = StObject.set(x, "SheetIndexes", value.asInstanceOf[js.Any])
    
    inline def setSheetIndexesUndefined: Self = StObject.set(x, "SheetIndexes", js.undefined)
    
    inline def setSheetIndexesVarargs(value: SheetIndex*): Self = StObject.set(x, "SheetIndexes", js.Array(value*))
    
    inline def setSheetNames(value: SheetNameList): Self = StObject.set(x, "SheetNames", value.asInstanceOf[js.Any])
    
    inline def setSheetNamesUndefined: Self = StObject.set(x, "SheetNames", js.undefined)
    
    inline def setSheetNamesVarargs(value: SheetName*): Self = StObject.set(x, "SheetNames", js.Array(value*))
  }
}

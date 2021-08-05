package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelOptions extends StObject {
  
  /**
    * Specifies one or more sheet numbers in the Excel file, which will be included in the dataset.
    */
  var SheetIndexes: js.UndefOr[SheetIndexList] = js.undefined
  
  /**
    * Specifies one or more named sheets in the Excel file, which will be included in the dataset.
    */
  var SheetNames: js.UndefOr[SheetNameList] = js.undefined
}
object ExcelOptions {
  
  inline def apply(): ExcelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelOptions]
  }
  
  extension [Self <: ExcelOptions](x: Self) {
    
    inline def setSheetIndexes(value: SheetIndexList): Self = StObject.set(x, "SheetIndexes", value.asInstanceOf[js.Any])
    
    inline def setSheetIndexesUndefined: Self = StObject.set(x, "SheetIndexes", js.undefined)
    
    inline def setSheetIndexesVarargs(value: SheetIndex*): Self = StObject.set(x, "SheetIndexes", js.Array(value :_*))
    
    inline def setSheetNames(value: SheetNameList): Self = StObject.set(x, "SheetNames", value.asInstanceOf[js.Any])
    
    inline def setSheetNamesUndefined: Self = StObject.set(x, "SheetNames", js.undefined)
    
    inline def setSheetNamesVarargs(value: SheetName*): Self = StObject.set(x, "SheetNames", js.Array(value :_*))
  }
}

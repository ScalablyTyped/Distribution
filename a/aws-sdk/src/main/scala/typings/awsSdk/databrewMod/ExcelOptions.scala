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
  
  @scala.inline
  def apply(): ExcelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelOptions]
  }
  
  @scala.inline
  implicit class ExcelOptionsMutableBuilder[Self <: ExcelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSheetIndexes(value: SheetIndexList): Self = StObject.set(x, "SheetIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIndexesUndefined: Self = StObject.set(x, "SheetIndexes", js.undefined)
    
    @scala.inline
    def setSheetIndexesVarargs(value: SheetIndex*): Self = StObject.set(x, "SheetIndexes", js.Array(value :_*))
    
    @scala.inline
    def setSheetNames(value: SheetNameList): Self = StObject.set(x, "SheetNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetNamesUndefined: Self = StObject.set(x, "SheetNames", js.undefined)
    
    @scala.inline
    def setSheetNamesVarargs(value: SheetName*): Self = StObject.set(x, "SheetNames", js.Array(value :_*))
  }
}

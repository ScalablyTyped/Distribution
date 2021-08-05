package typings.convertExcelToJson

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Rows extends StObject {
    
    var rows: Double
  }
  object Rows {
    
    inline def apply(rows: Double): Rows = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rows]
    }
    
    extension [Self <: Rows](x: Self) {
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined convert-excel-to-json.convert-excel-to-json.SheetConfig & {  name :string} */
  trait SheetConfignamestring extends StObject {
    
    var columnToKey: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var header: js.UndefOr[Rows] = js.undefined
    
    var includeEmptyLines: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var range: js.UndefOr[String] = js.undefined
    
    var sheetStubs: js.UndefOr[Boolean] = js.undefined
  }
  object SheetConfignamestring {
    
    inline def apply(name: String): SheetConfignamestring = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SheetConfignamestring]
    }
    
    extension [Self <: SheetConfignamestring](x: Self) {
      
      inline def setColumnToKey(value: StringDictionary[String]): Self = StObject.set(x, "columnToKey", value.asInstanceOf[js.Any])
      
      inline def setColumnToKeyUndefined: Self = StObject.set(x, "columnToKey", js.undefined)
      
      inline def setHeader(value: Rows): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIncludeEmptyLines(value: Boolean): Self = StObject.set(x, "includeEmptyLines", value.asInstanceOf[js.Any])
      
      inline def setIncludeEmptyLinesUndefined: Self = StObject.set(x, "includeEmptyLines", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setSheetStubs(value: Boolean): Self = StObject.set(x, "sheetStubs", value.asInstanceOf[js.Any])
      
      inline def setSheetStubsUndefined: Self = StObject.set(x, "sheetStubs", js.undefined)
    }
  }
  
  trait Sheets extends StObject {
    
    var sheets: js.UndefOr[js.Array[String | SheetConfignamestring]] = js.undefined
  }
  object Sheets {
    
    inline def apply(): Sheets = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sheets]
    }
    
    extension [Self <: Sheets](x: Self) {
      
      inline def setSheets(value: js.Array[String | SheetConfignamestring]): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
      
      inline def setSheetsUndefined: Self = StObject.set(x, "sheets", js.undefined)
      
      inline def setSheetsVarargs(value: (String | SheetConfignamestring)*): Self = StObject.set(x, "sheets", js.Array(value :_*))
    }
  }
  
  trait Source extends StObject {
    
    var source: String | Buffer
  }
  object Source {
    
    inline def apply(source: String | Buffer): Source = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setSource(value: String | Buffer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceFile extends StObject {
    
    var sourceFile: String
  }
  object SourceFile {
    
    inline def apply(sourceFile: String): SourceFile = {
      val __obj = js.Dynamic.literal(sourceFile = sourceFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceFile]
    }
    
    extension [Self <: SourceFile](x: Self) {
      
      inline def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    }
  }
}

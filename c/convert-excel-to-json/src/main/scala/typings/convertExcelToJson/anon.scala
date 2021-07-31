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
    
    @scala.inline
    def apply(rows: Double): Rows = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rows]
    }
    
    @scala.inline
    implicit class RowsMutableBuilder[Self <: Rows] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(name: String): SheetConfignamestring = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SheetConfignamestring]
    }
    
    @scala.inline
    implicit class SheetConfignamestringMutableBuilder[Self <: SheetConfignamestring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnToKey(value: StringDictionary[String]): Self = StObject.set(x, "columnToKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnToKeyUndefined: Self = StObject.set(x, "columnToKey", js.undefined)
      
      @scala.inline
      def setHeader(value: Rows): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setIncludeEmptyLines(value: Boolean): Self = StObject.set(x, "includeEmptyLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeEmptyLinesUndefined: Self = StObject.set(x, "includeEmptyLines", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setSheetStubs(value: Boolean): Self = StObject.set(x, "sheetStubs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetStubsUndefined: Self = StObject.set(x, "sheetStubs", js.undefined)
    }
  }
  
  trait Sheets extends StObject {
    
    var sheets: js.UndefOr[js.Array[String | SheetConfignamestring]] = js.undefined
  }
  object Sheets {
    
    @scala.inline
    def apply(): Sheets = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sheets]
    }
    
    @scala.inline
    implicit class SheetsMutableBuilder[Self <: Sheets] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSheets(value: js.Array[String | SheetConfignamestring]): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetsUndefined: Self = StObject.set(x, "sheets", js.undefined)
      
      @scala.inline
      def setSheetsVarargs(value: (String | SheetConfignamestring)*): Self = StObject.set(x, "sheets", js.Array(value :_*))
    }
  }
  
  trait Source extends StObject {
    
    var source: String | Buffer
  }
  object Source {
    
    @scala.inline
    def apply(source: String | Buffer): Source = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    @scala.inline
    implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: String | Buffer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourceFile extends StObject {
    
    var sourceFile: String
  }
  object SourceFile {
    
    @scala.inline
    def apply(sourceFile: String): SourceFile = {
      val __obj = js.Dynamic.literal(sourceFile = sourceFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceFile]
    }
    
    @scala.inline
    implicit class SourceFileMutableBuilder[Self <: SourceFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    }
  }
}

package typings.convertExcelToJson

import org.scalablytyped.runtime.StringDictionary
import typings.convertExcelToJson.anon.Rows
import typings.convertExcelToJson.anon.Sheets
import typings.convertExcelToJson.anon.Source
import typings.convertExcelToJson.anon.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(config: (SourceFile | Source) & Sheets & SheetConfig): StringDictionary[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Array[js.Any]]]
  @scala.inline
  def apply(
    config: (SourceFile | Source) & Sheets & SheetConfig,
    // Input can also be a json-string (for cli)
  sourceFile: String
  ): StringDictionary[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[js.Any]]]
  @scala.inline
  def apply(config: String): StringDictionary[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Array[js.Any]]]
  @scala.inline
  def apply(config: String, // Input can also be a json-string (for cli)
  sourceFile: String): StringDictionary[js.Array[js.Any]] = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[js.Any]]]
  
  @JSImport("convert-excel-to-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SheetConfig extends StObject {
    
    var columnToKey: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var header: js.UndefOr[Rows] = js.undefined
    
    var includeEmptyLines: js.UndefOr[Boolean] = js.undefined
    
    var range: js.UndefOr[String] = js.undefined
    
    var sheetStubs: js.UndefOr[Boolean] = js.undefined
  }
  object SheetConfig {
    
    @scala.inline
    def apply(): SheetConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SheetConfig]
    }
    
    @scala.inline
    implicit class SheetConfigMutableBuilder[Self <: SheetConfig] (val x: Self) extends AnyVal {
      
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
      def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setSheetStubs(value: Boolean): Self = StObject.set(x, "sheetStubs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetStubsUndefined: Self = StObject.set(x, "sheetStubs", js.undefined)
    }
  }
}

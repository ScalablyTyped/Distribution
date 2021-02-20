package typings.cliTable3

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.cliTable3.anon.Border
import typings.cliTable3.anon.Head
import typings.cliTable3.anon.PartialRecordCharNamestri
import typings.cliTable3.anon.RecordCharNamestring
import typings.std.Array
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cli-table3", JSImport.Namespace)
  @js.native
  val ^ : CliTable3 = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("cli-table3", JSImport.Namespace)
  @js.native
  class Class () extends GenericTable[HorizontalTableRow | VerticalTableRow | CrossTableRow] {
    def this(options: TableConstructorOptions) = this()
  }
  
  type Cell = CellValue | CellOptions
  
  @js.native
  trait CellOptions extends StObject {
    
    var chars: js.UndefOr[PartialRecordCharNamestri] = js.native
    
    var colSpan: js.UndefOr[Double] = js.native
    
    var content: CellValue = js.native
    
    var hAlign: js.UndefOr[HorizontalAlignment] = js.native
    
    var rowSpan: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[Head] = js.native
    
    var truncate: js.UndefOr[String] = js.native
    
    var vAlign: js.UndefOr[VerticalAlignment] = js.native
  }
  object CellOptions {
    
    @scala.inline
    def apply(): CellOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellOptions]
    }
    
    @scala.inline
    implicit class CellOptionsMutableBuilder[Self <: CellOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChars(value: PartialRecordCharNamestri): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setContent(value: CellValue): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNull: Self = StObject.set(x, "content", null)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setHAlign(value: HorizontalAlignment): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setStyle(value: Head): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTruncate(value: String): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      @scala.inline
      def setVAlign(value: VerticalAlignment): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
    }
  }
  
  type CellValue = js.UndefOr[Boolean | Double | String | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typings.cliTable3.cliTable3Strings.top
    - typings.cliTable3.cliTable3Strings.`top-mid`
    - typings.cliTable3.cliTable3Strings.`top-left`
    - typings.cliTable3.cliTable3Strings.`top-right`
    - typings.cliTable3.cliTable3Strings.bottom
    - typings.cliTable3.cliTable3Strings.`bottom-mid`
    - typings.cliTable3.cliTable3Strings.`bottom-left`
    - typings.cliTable3.cliTable3Strings.`bottom-right`
    - typings.cliTable3.cliTable3Strings.left
    - typings.cliTable3.cliTable3Strings.`left-mid`
    - typings.cliTable3.cliTable3Strings.mid
    - typings.cliTable3.cliTable3Strings.`mid-mid`
    - typings.cliTable3.cliTable3Strings.right
    - typings.cliTable3.cliTable3Strings.`right-mid`
    - typings.cliTable3.cliTable3Strings.middle
  */
  trait CharName extends StObject
  object CharName {
    
    @scala.inline
    def bottom: typings.cliTable3.cliTable3Strings.bottom = "bottom".asInstanceOf[typings.cliTable3.cliTable3Strings.bottom]
    
    @scala.inline
    def `bottom-left`: typings.cliTable3.cliTable3Strings.`bottom-left` = "bottom-left".asInstanceOf[typings.cliTable3.cliTable3Strings.`bottom-left`]
    
    @scala.inline
    def `bottom-mid`: typings.cliTable3.cliTable3Strings.`bottom-mid` = "bottom-mid".asInstanceOf[typings.cliTable3.cliTable3Strings.`bottom-mid`]
    
    @scala.inline
    def `bottom-right`: typings.cliTable3.cliTable3Strings.`bottom-right` = "bottom-right".asInstanceOf[typings.cliTable3.cliTable3Strings.`bottom-right`]
    
    @scala.inline
    def left: typings.cliTable3.cliTable3Strings.left = "left".asInstanceOf[typings.cliTable3.cliTable3Strings.left]
    
    @scala.inline
    def `left-mid`: typings.cliTable3.cliTable3Strings.`left-mid` = "left-mid".asInstanceOf[typings.cliTable3.cliTable3Strings.`left-mid`]
    
    @scala.inline
    def mid: typings.cliTable3.cliTable3Strings.mid = "mid".asInstanceOf[typings.cliTable3.cliTable3Strings.mid]
    
    @scala.inline
    def `mid-mid`: typings.cliTable3.cliTable3Strings.`mid-mid` = "mid-mid".asInstanceOf[typings.cliTable3.cliTable3Strings.`mid-mid`]
    
    @scala.inline
    def middle: typings.cliTable3.cliTable3Strings.middle = "middle".asInstanceOf[typings.cliTable3.cliTable3Strings.middle]
    
    @scala.inline
    def right: typings.cliTable3.cliTable3Strings.right = "right".asInstanceOf[typings.cliTable3.cliTable3Strings.right]
    
    @scala.inline
    def `right-mid`: typings.cliTable3.cliTable3Strings.`right-mid` = "right-mid".asInstanceOf[typings.cliTable3.cliTable3Strings.`right-mid`]
    
    @scala.inline
    def top: typings.cliTable3.cliTable3Strings.top = "top".asInstanceOf[typings.cliTable3.cliTable3Strings.top]
    
    @scala.inline
    def `top-left`: typings.cliTable3.cliTable3Strings.`top-left` = "top-left".asInstanceOf[typings.cliTable3.cliTable3Strings.`top-left`]
    
    @scala.inline
    def `top-mid`: typings.cliTable3.cliTable3Strings.`top-mid` = "top-mid".asInstanceOf[typings.cliTable3.cliTable3Strings.`top-mid`]
    
    @scala.inline
    def `top-right`: typings.cliTable3.cliTable3Strings.`top-right` = "top-right".asInstanceOf[typings.cliTable3.cliTable3Strings.`top-right`]
  }
  
  @js.native
  trait CliTable3
    extends Instantiable0[Table]
       with Instantiable1[/* options */ TableConstructorOptions, Table]
  
  type CrossTableRow = StringDictionary[js.Array[Cell]]
  
  @js.native
  trait GenericTable[T] extends Array[T] {
    
    var options: TableInstanceOptions = js.native
    
    val width: Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cliTable3.cliTable3Strings.left
    - typings.cliTable3.cliTable3Strings.center
    - typings.cliTable3.cliTable3Strings.right
  */
  trait HorizontalAlignment extends StObject
  object HorizontalAlignment {
    
    @scala.inline
    def center: typings.cliTable3.cliTable3Strings.center = "center".asInstanceOf[typings.cliTable3.cliTable3Strings.center]
    
    @scala.inline
    def left: typings.cliTable3.cliTable3Strings.left = "left".asInstanceOf[typings.cliTable3.cliTable3Strings.left]
    
    @scala.inline
    def right: typings.cliTable3.cliTable3Strings.right = "right".asInstanceOf[typings.cliTable3.cliTable3Strings.right]
  }
  
  type HorizontalTableRow = js.Array[Cell]
  
  type Table = GenericTable[HorizontalTableRow | VerticalTableRow | CrossTableRow]
  
  /* Inlined parent std.Partial<cli-table3.cli-table3.TableOptions> */
  @js.native
  trait TableConstructorOptions extends StObject {
    
    var chars: js.UndefOr[PartialRecordCharNamestri] = js.native
    
    var colAligns: js.UndefOr[js.Array[HorizontalAlignment]] = js.native
    
    var colWidths: js.UndefOr[js.Array[Double | Null]] = js.native
    
    var head: js.UndefOr[js.Array[String]] = js.native
    
    var rowAligns: js.UndefOr[js.Array[VerticalAlignment]] = js.native
    
    var rowHeights: js.UndefOr[js.Array[Double | Null]] = js.native
    
    var style: js.UndefOr[Partial[Border]] = js.native
    
    var truncate: js.UndefOr[String] = js.native
    
    var wordWrap: js.UndefOr[Boolean] = js.native
  }
  object TableConstructorOptions {
    
    @scala.inline
    def apply(): TableConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableConstructorOptions]
    }
    
    @scala.inline
    implicit class TableConstructorOptionsMutableBuilder[Self <: TableConstructorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChars(value: PartialRecordCharNamestri): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      @scala.inline
      def setColAligns(value: js.Array[HorizontalAlignment]): Self = StObject.set(x, "colAligns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColAlignsUndefined: Self = StObject.set(x, "colAligns", js.undefined)
      
      @scala.inline
      def setColAlignsVarargs(value: HorizontalAlignment*): Self = StObject.set(x, "colAligns", js.Array(value :_*))
      
      @scala.inline
      def setColWidths(value: js.Array[Double | Null]): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColWidthsUndefined: Self = StObject.set(x, "colWidths", js.undefined)
      
      @scala.inline
      def setColWidthsVarargs(value: (Double | Null)*): Self = StObject.set(x, "colWidths", js.Array(value :_*))
      
      @scala.inline
      def setHead(value: js.Array[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      @scala.inline
      def setHeadVarargs(value: String*): Self = StObject.set(x, "head", js.Array(value :_*))
      
      @scala.inline
      def setRowAligns(value: js.Array[VerticalAlignment]): Self = StObject.set(x, "rowAligns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowAlignsUndefined: Self = StObject.set(x, "rowAligns", js.undefined)
      
      @scala.inline
      def setRowAlignsVarargs(value: VerticalAlignment*): Self = StObject.set(x, "rowAligns", js.Array(value :_*))
      
      @scala.inline
      def setRowHeights(value: js.Array[Double | Null]): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightsUndefined: Self = StObject.set(x, "rowHeights", js.undefined)
      
      @scala.inline
      def setRowHeightsVarargs(value: (Double | Null)*): Self = StObject.set(x, "rowHeights", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: Partial[Border]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTruncate(value: String): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      @scala.inline
      def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
    }
  }
  
  @js.native
  trait TableInstanceOptions extends TableOptions {
    
    var chars: RecordCharNamestring = js.native
    
    var style: Border = js.native
  }
  object TableInstanceOptions {
    
    @scala.inline
    def apply(
      chars: RecordCharNamestring,
      colAligns: js.Array[HorizontalAlignment],
      colWidths: js.Array[Double | Null],
      head: js.Array[String],
      rowAligns: js.Array[VerticalAlignment],
      rowHeights: js.Array[Double | Null],
      style: Border,
      truncate: String,
      wordWrap: Boolean
    ): TableInstanceOptions = {
      val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], rowAligns = rowAligns.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableInstanceOptions]
    }
    
    @scala.inline
    implicit class TableInstanceOptionsMutableBuilder[Self <: TableInstanceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChars(value: RecordCharNamestring): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: Border): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TableOptions extends StObject {
    
    var colAligns: js.Array[HorizontalAlignment] = js.native
    
    var colWidths: js.Array[Double | Null] = js.native
    
    var head: js.Array[String] = js.native
    
    var rowAligns: js.Array[VerticalAlignment] = js.native
    
    var rowHeights: js.Array[Double | Null] = js.native
    
    var truncate: String = js.native
    
    var wordWrap: Boolean = js.native
  }
  object TableOptions {
    
    @scala.inline
    def apply(
      colAligns: js.Array[HorizontalAlignment],
      colWidths: js.Array[Double | Null],
      head: js.Array[String],
      rowAligns: js.Array[VerticalAlignment],
      rowHeights: js.Array[Double | Null],
      truncate: String,
      wordWrap: Boolean
    ): TableOptions = {
      val __obj = js.Dynamic.literal(colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], rowAligns = rowAligns.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableOptions]
    }
    
    @scala.inline
    implicit class TableOptionsMutableBuilder[Self <: TableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColAligns(value: js.Array[HorizontalAlignment]): Self = StObject.set(x, "colAligns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColAlignsVarargs(value: HorizontalAlignment*): Self = StObject.set(x, "colAligns", js.Array(value :_*))
      
      @scala.inline
      def setColWidths(value: js.Array[Double | Null]): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColWidthsVarargs(value: (Double | Null)*): Self = StObject.set(x, "colWidths", js.Array(value :_*))
      
      @scala.inline
      def setHead(value: js.Array[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadVarargs(value: String*): Self = StObject.set(x, "head", js.Array(value :_*))
      
      @scala.inline
      def setRowAligns(value: js.Array[VerticalAlignment]): Self = StObject.set(x, "rowAligns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowAlignsVarargs(value: VerticalAlignment*): Self = StObject.set(x, "rowAligns", js.Array(value :_*))
      
      @scala.inline
      def setRowHeights(value: js.Array[Double | Null]): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightsVarargs(value: (Double | Null)*): Self = StObject.set(x, "rowHeights", js.Array(value :_*))
      
      @scala.inline
      def setTruncate(value: String): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cliTable3.cliTable3Strings.top
    - typings.cliTable3.cliTable3Strings.center
    - typings.cliTable3.cliTable3Strings.bottom
  */
  trait VerticalAlignment extends StObject
  object VerticalAlignment {
    
    @scala.inline
    def bottom: typings.cliTable3.cliTable3Strings.bottom = "bottom".asInstanceOf[typings.cliTable3.cliTable3Strings.bottom]
    
    @scala.inline
    def center: typings.cliTable3.cliTable3Strings.center = "center".asInstanceOf[typings.cliTable3.cliTable3Strings.center]
    
    @scala.inline
    def top: typings.cliTable3.cliTable3Strings.top = "top".asInstanceOf[typings.cliTable3.cliTable3Strings.top]
  }
  
  type VerticalTableRow = StringDictionary[Cell]
  
  type _To = CliTable3
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CliTable3 = ^
}

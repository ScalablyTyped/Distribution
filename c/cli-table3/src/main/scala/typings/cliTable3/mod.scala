package typings.cliTable3

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.cliTable3.anon.Border
import typings.cliTable3.anon.Compact
import typings.cliTable3.anon.PartialRecordCharNamestri
import typings.cliTable3.anon.RecordCharNamestring
import typings.std.Array
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cli-table3", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CliTable3 = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("cli-table3", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with GenericTable[HorizontalTableRow | VerticalTableRow | CrossTableRow] {
    def this(options: TableConstructorOptions) = this()
  }
  
  type Cell = CellValue | CellOptions
  
  trait CellOptions extends StObject {
    
    var chars: js.UndefOr[PartialRecordCharNamestri] = js.undefined
    
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var content: CellValue
    
    var hAlign: js.UndefOr[HorizontalAlignment] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[Border] = js.undefined
    
    var truncate: js.UndefOr[String] = js.undefined
    
    var vAlign: js.UndefOr[VerticalAlignment] = js.undefined
  }
  object CellOptions {
    
    inline def apply(): CellOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellOptions]
    }
    
    extension [Self <: CellOptions](x: Self) {
      
      inline def setChars(value: PartialRecordCharNamestri): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setContent(value: CellValue): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setHAlign(value: HorizontalAlignment): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      inline def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setStyle(value: Border): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTruncate(value: String): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      inline def setVAlign(value: VerticalAlignment): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      inline def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
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
    
    inline def bottom: typings.cliTable3.cliTable3Strings.bottom = "bottom".asInstanceOf[typings.cliTable3.cliTable3Strings.bottom]
    
    inline def `bottom-left`: typings.cliTable3.cliTable3Strings.`bottom-left` = "bottom-left".asInstanceOf[typings.cliTable3.cliTable3Strings.`bottom-left`]
    
    inline def `bottom-mid`: typings.cliTable3.cliTable3Strings.`bottom-mid` = "bottom-mid".asInstanceOf[typings.cliTable3.cliTable3Strings.`bottom-mid`]
    
    inline def `bottom-right`: typings.cliTable3.cliTable3Strings.`bottom-right` = "bottom-right".asInstanceOf[typings.cliTable3.cliTable3Strings.`bottom-right`]
    
    inline def left: typings.cliTable3.cliTable3Strings.left = "left".asInstanceOf[typings.cliTable3.cliTable3Strings.left]
    
    inline def `left-mid`: typings.cliTable3.cliTable3Strings.`left-mid` = "left-mid".asInstanceOf[typings.cliTable3.cliTable3Strings.`left-mid`]
    
    inline def mid: typings.cliTable3.cliTable3Strings.mid = "mid".asInstanceOf[typings.cliTable3.cliTable3Strings.mid]
    
    inline def `mid-mid`: typings.cliTable3.cliTable3Strings.`mid-mid` = "mid-mid".asInstanceOf[typings.cliTable3.cliTable3Strings.`mid-mid`]
    
    inline def middle: typings.cliTable3.cliTable3Strings.middle = "middle".asInstanceOf[typings.cliTable3.cliTable3Strings.middle]
    
    inline def right: typings.cliTable3.cliTable3Strings.right = "right".asInstanceOf[typings.cliTable3.cliTable3Strings.right]
    
    inline def `right-mid`: typings.cliTable3.cliTable3Strings.`right-mid` = "right-mid".asInstanceOf[typings.cliTable3.cliTable3Strings.`right-mid`]
    
    inline def top: typings.cliTable3.cliTable3Strings.top = "top".asInstanceOf[typings.cliTable3.cliTable3Strings.top]
    
    inline def `top-left`: typings.cliTable3.cliTable3Strings.`top-left` = "top-left".asInstanceOf[typings.cliTable3.cliTable3Strings.`top-left`]
    
    inline def `top-mid`: typings.cliTable3.cliTable3Strings.`top-mid` = "top-mid".asInstanceOf[typings.cliTable3.cliTable3Strings.`top-mid`]
    
    inline def `top-right`: typings.cliTable3.cliTable3Strings.`top-right` = "top-right".asInstanceOf[typings.cliTable3.cliTable3Strings.`top-right`]
  }
  
  @js.native
  trait CliTable3
    extends StObject
       with Instantiable0[Table]
       with Instantiable1[/* options */ TableConstructorOptions, Table]
  
  type CrossTableRow = StringDictionary[js.Array[Cell]]
  
  @js.native
  trait GenericTable[T]
    extends StObject
       with Array[T] {
    
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
    
    inline def center: typings.cliTable3.cliTable3Strings.center = "center".asInstanceOf[typings.cliTable3.cliTable3Strings.center]
    
    inline def left: typings.cliTable3.cliTable3Strings.left = "left".asInstanceOf[typings.cliTable3.cliTable3Strings.left]
    
    inline def right: typings.cliTable3.cliTable3Strings.right = "right".asInstanceOf[typings.cliTable3.cliTable3Strings.right]
  }
  
  type HorizontalTableRow = js.Array[Cell]
  
  type Table = GenericTable[HorizontalTableRow | VerticalTableRow | CrossTableRow]
  
  /* Inlined parent std.Partial<cli-table3.cli-table3.TableOptions> */
  trait TableConstructorOptions extends StObject {
    
    var chars: js.UndefOr[PartialRecordCharNamestri] = js.undefined
    
    var colAligns: js.UndefOr[js.Array[HorizontalAlignment]] = js.undefined
    
    var colWidths: js.UndefOr[js.Array[Double | Null]] = js.undefined
    
    var head: js.UndefOr[js.Array[String]] = js.undefined
    
    var rowAligns: js.UndefOr[js.Array[VerticalAlignment]] = js.undefined
    
    var rowHeights: js.UndefOr[js.Array[Double | Null]] = js.undefined
    
    var style: js.UndefOr[Partial[Compact]] = js.undefined
    
    var truncate: js.UndefOr[String] = js.undefined
    
    var wordWrap: js.UndefOr[Boolean] = js.undefined
    
    var wrapOnWordBoundary: js.UndefOr[Boolean] = js.undefined
  }
  object TableConstructorOptions {
    
    inline def apply(): TableConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableConstructorOptions]
    }
    
    extension [Self <: TableConstructorOptions](x: Self) {
      
      inline def setChars(value: PartialRecordCharNamestri): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      inline def setColAligns(value: js.Array[HorizontalAlignment]): Self = StObject.set(x, "colAligns", value.asInstanceOf[js.Any])
      
      inline def setColAlignsUndefined: Self = StObject.set(x, "colAligns", js.undefined)
      
      inline def setColAlignsVarargs(value: HorizontalAlignment*): Self = StObject.set(x, "colAligns", js.Array(value*))
      
      inline def setColWidths(value: js.Array[Double | Null]): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      inline def setColWidthsUndefined: Self = StObject.set(x, "colWidths", js.undefined)
      
      inline def setColWidthsVarargs(value: (Double | Null)*): Self = StObject.set(x, "colWidths", js.Array(value*))
      
      inline def setHead(value: js.Array[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setHeadVarargs(value: String*): Self = StObject.set(x, "head", js.Array(value*))
      
      inline def setRowAligns(value: js.Array[VerticalAlignment]): Self = StObject.set(x, "rowAligns", value.asInstanceOf[js.Any])
      
      inline def setRowAlignsUndefined: Self = StObject.set(x, "rowAligns", js.undefined)
      
      inline def setRowAlignsVarargs(value: VerticalAlignment*): Self = StObject.set(x, "rowAligns", js.Array(value*))
      
      inline def setRowHeights(value: js.Array[Double | Null]): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
      
      inline def setRowHeightsUndefined: Self = StObject.set(x, "rowHeights", js.undefined)
      
      inline def setRowHeightsVarargs(value: (Double | Null)*): Self = StObject.set(x, "rowHeights", js.Array(value*))
      
      inline def setStyle(value: Partial[Compact]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTruncate(value: String): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
      
      inline def setWrapOnWordBoundary(value: Boolean): Self = StObject.set(x, "wrapOnWordBoundary", value.asInstanceOf[js.Any])
      
      inline def setWrapOnWordBoundaryUndefined: Self = StObject.set(x, "wrapOnWordBoundary", js.undefined)
    }
  }
  
  trait TableInstanceOptions
    extends StObject
       with TableOptions {
    
    var chars: RecordCharNamestring
    
    var style: Compact
  }
  object TableInstanceOptions {
    
    inline def apply(
      chars: RecordCharNamestring,
      colAligns: js.Array[HorizontalAlignment],
      colWidths: js.Array[Double | Null],
      head: js.Array[String],
      rowAligns: js.Array[VerticalAlignment],
      rowHeights: js.Array[Double | Null],
      style: Compact,
      truncate: String,
      wordWrap: Boolean,
      wrapOnWordBoundary: Boolean
    ): TableInstanceOptions = {
      val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], rowAligns = rowAligns.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any], wrapOnWordBoundary = wrapOnWordBoundary.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableInstanceOptions]
    }
    
    extension [Self <: TableInstanceOptions](x: Self) {
      
      inline def setChars(value: RecordCharNamestring): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Compact): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableOptions extends StObject {
    
    var colAligns: js.Array[HorizontalAlignment]
    
    var colWidths: js.Array[Double | Null]
    
    var head: js.Array[String]
    
    var rowAligns: js.Array[VerticalAlignment]
    
    var rowHeights: js.Array[Double | Null]
    
    var truncate: String
    
    var wordWrap: Boolean
    
    var wrapOnWordBoundary: Boolean
  }
  object TableOptions {
    
    inline def apply(
      colAligns: js.Array[HorizontalAlignment],
      colWidths: js.Array[Double | Null],
      head: js.Array[String],
      rowAligns: js.Array[VerticalAlignment],
      rowHeights: js.Array[Double | Null],
      truncate: String,
      wordWrap: Boolean,
      wrapOnWordBoundary: Boolean
    ): TableOptions = {
      val __obj = js.Dynamic.literal(colAligns = colAligns.asInstanceOf[js.Any], colWidths = colWidths.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], rowAligns = rowAligns.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any], wrapOnWordBoundary = wrapOnWordBoundary.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableOptions]
    }
    
    extension [Self <: TableOptions](x: Self) {
      
      inline def setColAligns(value: js.Array[HorizontalAlignment]): Self = StObject.set(x, "colAligns", value.asInstanceOf[js.Any])
      
      inline def setColAlignsVarargs(value: HorizontalAlignment*): Self = StObject.set(x, "colAligns", js.Array(value*))
      
      inline def setColWidths(value: js.Array[Double | Null]): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      inline def setColWidthsVarargs(value: (Double | Null)*): Self = StObject.set(x, "colWidths", js.Array(value*))
      
      inline def setHead(value: js.Array[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadVarargs(value: String*): Self = StObject.set(x, "head", js.Array(value*))
      
      inline def setRowAligns(value: js.Array[VerticalAlignment]): Self = StObject.set(x, "rowAligns", value.asInstanceOf[js.Any])
      
      inline def setRowAlignsVarargs(value: VerticalAlignment*): Self = StObject.set(x, "rowAligns", js.Array(value*))
      
      inline def setRowHeights(value: js.Array[Double | Null]): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
      
      inline def setRowHeightsVarargs(value: (Double | Null)*): Self = StObject.set(x, "rowHeights", js.Array(value*))
      
      inline def setTruncate(value: String): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWrapOnWordBoundary(value: Boolean): Self = StObject.set(x, "wrapOnWordBoundary", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cliTable3.cliTable3Strings.top
    - typings.cliTable3.cliTable3Strings.center
    - typings.cliTable3.cliTable3Strings.bottom
  */
  trait VerticalAlignment extends StObject
  object VerticalAlignment {
    
    inline def bottom: typings.cliTable3.cliTable3Strings.bottom = "bottom".asInstanceOf[typings.cliTable3.cliTable3Strings.bottom]
    
    inline def center: typings.cliTable3.cliTable3Strings.center = "center".asInstanceOf[typings.cliTable3.cliTable3Strings.center]
    
    inline def top: typings.cliTable3.cliTable3Strings.top = "top".asInstanceOf[typings.cliTable3.cliTable3Strings.top]
  }
  
  type VerticalTableRow = StringDictionary[Cell]
  
  type _To = js.Object & CliTable3
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & CliTable3 = ^
}

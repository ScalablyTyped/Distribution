package typings.cliTable

import typings.cliTable.anon.Border
import typings.cliTable.anon.kintoptopmidtoplefttoprig
import typings.cliTable.cliTableStrings.left
import typings.cliTable.cliTableStrings.middle
import typings.cliTable.cliTableStrings.right
import typings.std.Array
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cli-table", JSImport.Namespace)
  @js.native
  /**
    * Table constructor
    *
    * @param options
    * @api public
    */
  open class ^[T /* <: TableRow */] ()
    extends StObject
       with Table[T] {
    def this(options: /* import warning: importer.ImportType#apply Failed type conversion: T extends cli-table.cli-table.CrossTableRow ? never : cli-table.cli-table.TableOptions<T> */ js.Any) = this()
  }
  
  /* static member */
  @JSImport("cli-table", "version")
  @js.native
  val version: String = js.native
  
  type CrossTableRow = Record[String, js.Array[String]]
  
  type HorizontalTableRow = js.Array[String]
  
  @js.native
  trait Table[T /* <: TableRow */]
    extends StObject
       with Array[T] {
    
    /**
      * Render to a string.
      *
      * @return table representation
      * @api public
      */
    def render(): String = js.native
    
    /**
      * Width getter
      *
      * @return width
      * @api public
      */
    def width: Double = js.native
  }
  
  trait TableOptions[T /* <: TableRow */] extends StObject {
    
    var chars: js.UndefOr[kintoptopmidtoplefttoprig] = js.undefined
    
    var colAligns: js.UndefOr[js.Array[left | middle | right]] = js.undefined
    
    var colWidths: js.UndefOr[js.Array[Double]] = js.undefined
    
    var colors: js.UndefOr[Boolean] = js.undefined
    
    var head: js.UndefOr[js.Array[String]] = js.undefined
    
    var rows: js.UndefOr[js.Array[T]] = js.undefined
    
    var style: js.UndefOr[Border] = js.undefined
    
    var truncate: js.UndefOr[String] = js.undefined
  }
  object TableOptions {
    
    inline def apply[T /* <: TableRow */](): TableOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableOptions[T]]
    }
    
    extension [Self <: TableOptions[?], T /* <: TableRow */](x: Self & TableOptions[T]) {
      
      inline def setChars(value: kintoptopmidtoplefttoprig): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      inline def setColAligns(value: js.Array[left | middle | right]): Self = StObject.set(x, "colAligns", value.asInstanceOf[js.Any])
      
      inline def setColAlignsUndefined: Self = StObject.set(x, "colAligns", js.undefined)
      
      inline def setColAlignsVarargs(value: (left | middle | right)*): Self = StObject.set(x, "colAligns", js.Array(value*))
      
      inline def setColWidths(value: js.Array[Double]): Self = StObject.set(x, "colWidths", value.asInstanceOf[js.Any])
      
      inline def setColWidthsUndefined: Self = StObject.set(x, "colWidths", js.undefined)
      
      inline def setColWidthsVarargs(value: Double*): Self = StObject.set(x, "colWidths", js.Array(value*))
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setHead(value: js.Array[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setHeadVarargs(value: String*): Self = StObject.set(x, "head", js.Array(value*))
      
      inline def setRows(value: js.Array[T]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: T*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setStyle(value: Border): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTruncate(value: String): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    }
  }
  
  type TableRow = HorizontalTableRow | VerticalTableRow | CrossTableRow
  
  type VerticalTableRow = Record[String, String]
}

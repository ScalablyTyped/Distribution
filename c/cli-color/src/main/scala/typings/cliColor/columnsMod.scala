package typings.cliColor

import typings.cliColor.cliColorStrings.left
import typings.cliColor.cliColorStrings.right
import typings.std.ArrayLike
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnsMod {
  
  /**
    * Outputs aligned table of columns.
    */
  inline def apply(data: js.Array[js.Array[js.Any]]): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(data: js.Array[js.Array[js.Any]], options: ColumnsOptions): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(data: Data): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(data: Data, options: ColumnsOptions): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("cli-color/columns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ColumnOptions extends StObject {
    
    /**
      * align: Possible options: `'left'`, `'right'` (defaults to `'left'`)
      */
    var align: js.UndefOr[left | right] = js.undefined
  }
  object ColumnOptions {
    
    inline def apply(): ColumnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnOptions]
    }
    
    extension [Self <: ColumnOptions](x: Self) {
      
      inline def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
  
  trait ColumnsOptions extends StObject {
    
    /**
      * columns: Per column customizations, as e.g. `[{ align: 'right' }, null, { align: 'left' }]`
      */
    var columns: js.UndefOr[js.Array[ColumnOptions | Null]] = js.undefined
    
    /**
      *  Custom colums separator (defaults to `|`)
      */
    var sep: js.UndefOr[String] = js.undefined
  }
  object ColumnsOptions {
    
    inline def apply(): ColumnsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnsOptions]
    }
    
    extension [Self <: ColumnsOptions](x: Self) {
      
      inline def setColumns(value: js.Array[ColumnOptions | Null]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: (ColumnOptions | Null)*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      inline def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
  
  type Data = Iterable[Row] | ArrayLike[Row]
  
  type Row = Iterable[js.Any] | ArrayLike[js.Any]
}

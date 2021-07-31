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
  @scala.inline
  def apply(data: js.Array[js.Array[js.Any]]): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(data: js.Array[js.Array[js.Any]], options: ColumnsOptions): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(data: Data): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(data: Data, options: ColumnsOptions): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
    
    @scala.inline
    def apply(): ColumnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnOptions]
    }
    
    @scala.inline
    implicit class ColumnOptionsMutableBuilder[Self <: ColumnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
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
    
    @scala.inline
    def apply(): ColumnsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnsOptions]
    }
    
    @scala.inline
    implicit class ColumnsOptionsMutableBuilder[Self <: ColumnsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[ColumnOptions | Null]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: (ColumnOptions | Null)*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
    }
  }
  
  type Data = Iterable[Row] | ArrayLike[Row]
  
  type Row = Iterable[js.Any] | ArrayLike[js.Any]
}

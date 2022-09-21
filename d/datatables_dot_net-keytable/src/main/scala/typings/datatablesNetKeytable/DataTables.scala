package typings.datatablesNetKeytable

import typings.datatablesNetKeytable.anon.Disable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTables {
  
  trait Api extends StObject {
    
    var keys: Disable
  }
  object Api {
    
    inline def apply(keys: Disable): Api = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api]
    }
    
    extension [Self <: Api](x: Self) {
      
      inline def setKeys(value: Disable): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    }
  }
  
  trait CellMethods extends StObject {
    
    /*
      * Focus on a cell
      */
    def focus(): Api
  }
  object CellMethods {
    
    inline def apply(focus: () => Api): CellMethods = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[CellMethods]
    }
    
    extension [Self <: CellMethods](x: Self) {
      
      inline def setFocus(value: () => Api): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  trait KeyTableSettings extends StObject {
    
    /*
      * Allow KeyTable's focus to be blurred (removed) from a table
      *
      * When set to true this option allows the table to lose focus (i.e. to be blurred),
      * while false will not allow the table to lose focus.
      */
    var blurable: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Set the class name used for the focused cell
      *
      * The class name to be added and removed from cells as they gain and loose focus.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /*
      * Enable / disable clipboard interaction with KeyTable
      *
      * A boolean flag that can optionally be used to disable KeyTables' clipboard interaction.
      */
    var clipboard: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Set the orthogonal data point for the data to copy to clipboard.
      */
    var clipboardOrthogonal: js.UndefOr[String] = js.undefined
    
    /*
      * Select the columns that can gain focus
      *
      * The columns that can gain focus. This accepts all of the options of column-selector
      * such as class name selector, jQuery pseudo selects and column index selectors.
      */
    var columns: js.UndefOr[Any] = js.undefined
    
    /*
      * Control if editing should be activated immediately upon focus
      *
      * true to enable editing on focus, false to disable.
      */
    var editOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Attach an Editor instance for Excel like editing
      *
      * The Editor instance to use for editing of the table
      */
    var editor: js.UndefOr[Any] = js.undefined
    
    /*
      * Cell to receive initial focus in the table
      *
      * The cell that will receive focus when the table is initialised. This accepts all of
      * the options of cell-selector such as class name selector, jQuery pseudo selects and
      * cell index selectors.
      */
    var focus: js.UndefOr[Any] = js.undefined
    
    /*
      * Limit the keys that KeyTable will listen for and take action on
      *
      * As null KeyTable will listen for all key presses, regardless of what key is pressed.
      * an array you can limit the keys that KeyTable will take action on to just the key
      * codes given in the array.
      */
    var keys: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    /*
      * Set the table's tab index for when it will receive focus
      *
      * The tab index for the table. Like all other tab indexes, this can be -1 to disallow
      * tabbing into the table.
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
  }
  object KeyTableSettings {
    
    inline def apply(): KeyTableSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyTableSettings]
    }
    
    extension [Self <: KeyTableSettings](x: Self) {
      
      inline def setBlurable(value: Boolean): Self = StObject.set(x, "blurable", value.asInstanceOf[js.Any])
      
      inline def setBlurableUndefined: Self = StObject.set(x, "blurable", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClipboard(value: Boolean): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      inline def setClipboardOrthogonal(value: String): Self = StObject.set(x, "clipboardOrthogonal", value.asInstanceOf[js.Any])
      
      inline def setClipboardOrthogonalUndefined: Self = StObject.set(x, "clipboardOrthogonal", js.undefined)
      
      inline def setClipboardUndefined: Self = StObject.set(x, "clipboard", js.undefined)
      
      inline def setColumns(value: Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setEditOnFocus(value: Boolean): Self = StObject.set(x, "editOnFocus", value.asInstanceOf[js.Any])
      
      inline def setEditOnFocusUndefined: Self = StObject.set(x, "editOnFocus", js.undefined)
      
      inline def setEditor(value: Any): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      inline def setFocus(value: Any): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setKeys(value: js.Array[Double]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysNull: Self = StObject.set(x, "keys", null)
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: Double*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
  
  trait Settings extends StObject {
    
    /*
      * KeyTable extension options
      */
    var keys: js.UndefOr[Boolean | KeyTableSettings] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setKeys(value: Boolean | KeyTableSettings): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    }
  }
}

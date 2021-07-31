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
    
    @scala.inline
    def apply(keys: Disable): Api = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api]
    }
    
    @scala.inline
    implicit class ApiMutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeys(value: Disable): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    }
  }
  
  trait CellMethods extends StObject {
    
    /*
      * Focus on a cell
      */
    def focus(): Api
  }
  object CellMethods {
    
    @scala.inline
    def apply(focus: () => Api): CellMethods = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[CellMethods]
    }
    
    @scala.inline
    implicit class CellMethodsMutableBuilder[Self <: CellMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Api): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
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
    var columns: js.UndefOr[js.Any] = js.undefined
    
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
    var editor: js.UndefOr[js.Any] = js.undefined
    
    /*
      * Cell to receive initial focus in the table
      *
      * The cell that will receive focus when the table is initialised. This accepts all of
      * the options of cell-selector such as class name selector, jQuery pseudo selects and
      * cell index selectors.
      */
    var focus: js.UndefOr[js.Any] = js.undefined
    
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
    
    @scala.inline
    def apply(): KeyTableSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyTableSettings]
    }
    
    @scala.inline
    implicit class KeyTableSettingsMutableBuilder[Self <: KeyTableSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlurable(value: Boolean): Self = StObject.set(x, "blurable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurableUndefined: Self = StObject.set(x, "blurable", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClipboard(value: Boolean): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardOrthogonal(value: String): Self = StObject.set(x, "clipboardOrthogonal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardOrthogonalUndefined: Self = StObject.set(x, "clipboardOrthogonal", js.undefined)
      
      @scala.inline
      def setClipboardUndefined: Self = StObject.set(x, "clipboard", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setEditOnFocus(value: Boolean): Self = StObject.set(x, "editOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditOnFocusUndefined: Self = StObject.set(x, "editOnFocus", js.undefined)
      
      @scala.inline
      def setEditor(value: js.Any): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      @scala.inline
      def setFocus(value: js.Any): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setKeys(value: js.Array[Double]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysNull: Self = StObject.set(x, "keys", null)
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setKeysVarargs(value: Double*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
  
  trait Settings extends StObject {
    
    /*
      * KeyTable extension options
      */
    var keys: js.UndefOr[Boolean | KeyTableSettings] = js.undefined
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeys(value: Boolean | KeyTableSettings): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    }
  }
}

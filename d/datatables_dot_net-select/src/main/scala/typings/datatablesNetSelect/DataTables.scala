package typings.datatablesNetSelect

import typings.datatablesNetSelect.anon.Style
import typings.datatablesNetSelect.datatablesNetSelectStrings.api
import typings.datatablesNetSelect.datatablesNetSelectStrings.multi
import typings.datatablesNetSelect.datatablesNetSelectStrings.multiPlussignshift
import typings.datatablesNetSelect.datatablesNetSelectStrings.os
import typings.datatablesNetSelect.datatablesNetSelectStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTables {
  
  trait Api extends StObject {
    
    var select: Style
  }
  object Api {
    
    inline def apply(select: Style): Api = {
      val __obj = js.Dynamic.literal(select = select.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
      
      inline def setSelect(value: Style): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    }
  }
  
  trait CellMethods extends StObject {
    
    /**
      * Deselect a cell
      */
    def deselect(): Api
    
    /**
      * Select cell
      */
    def select(): Api
  }
  object CellMethods {
    
    inline def apply(deselect: () => Api, select: () => Api): CellMethods = {
      val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), select = js.Any.fromFunction0(select))
      __obj.asInstanceOf[CellMethods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellMethods] (val x: Self) extends AnyVal {
      
      inline def setDeselect(value: () => Api): Self = StObject.set(x, "deselect", js.Any.fromFunction0(value))
      
      inline def setSelect(value: () => Api): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
    }
  }
  
  trait CellsMethods extends StObject {
    
    /**
      * Deselect cells
      */
    def deselect(): Api
    
    /**
      * Select multiple cells
      */
    def select(): Api
  }
  object CellsMethods {
    
    inline def apply(deselect: () => Api, select: () => Api): CellsMethods = {
      val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), select = js.Any.fromFunction0(select))
      __obj.asInstanceOf[CellsMethods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellsMethods] (val x: Self) extends AnyVal {
      
      inline def setDeselect(value: () => Api): Self = StObject.set(x, "deselect", js.Any.fromFunction0(value))
      
      inline def setSelect(value: () => Api): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
    }
  }
  
  trait RowMethods extends StObject {
    
    /**
      * Deselect a row
      */
    def deselect(): Api
    
    /**
      * Select a row
      */
    def select(): Api
  }
  object RowMethods {
    
    inline def apply(deselect: () => Api, select: () => Api): RowMethods = {
      val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), select = js.Any.fromFunction0(select))
      __obj.asInstanceOf[RowMethods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowMethods] (val x: Self) extends AnyVal {
      
      inline def setDeselect(value: () => Api): Self = StObject.set(x, "deselect", js.Any.fromFunction0(value))
      
      inline def setSelect(value: () => Api): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
    }
  }
  
  trait RowsMethods extends StObject {
    
    /**
      * Deselect a row
      */
    def deselect(): Api
    
    /**
      * Select multiple rows
      */
    def select(): Api
  }
  object RowsMethods {
    
    inline def apply(deselect: () => Api, select: () => Api): RowsMethods = {
      val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), select = js.Any.fromFunction0(select))
      __obj.asInstanceOf[RowsMethods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowsMethods] (val x: Self) extends AnyVal {
      
      inline def setDeselect(value: () => Api): Self = StObject.set(x, "deselect", js.Any.fromFunction0(value))
      
      inline def setSelect(value: () => Api): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
    }
  }
  
  trait SelectSettings extends StObject {
    
    /*
      * Indicate if the selected items will be removed when clicking outside of the table
      */
    var blurable: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Set the class name that will be applied to selected items
      */
    var className: js.UndefOr[String] = js.undefined
    
    /*
      * Enable / disable the display for item selection information in the table summary
      */
    var info: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Set which table items to select (rows, columns or cells)
      */
    var items: js.UndefOr[String] = js.undefined
    
    /*
      * Set the element selector used for mouse event capture to select items
      */
    var selector: js.UndefOr[String] = js.undefined
    
    /*
      * Set the selection style for end user interaction with the table
      */
    var style: js.UndefOr[api | single | multi | os | multiPlussignshift] = js.undefined
  }
  object SelectSettings {
    
    inline def apply(): SelectSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectSettings] (val x: Self) extends AnyVal {
      
      inline def setBlurable(value: Boolean): Self = StObject.set(x, "blurable", value.asInstanceOf[js.Any])
      
      inline def setBlurableUndefined: Self = StObject.set(x, "blurable", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setItems(value: String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setStyle(value: api | single | multi | os | multiPlussignshift): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait Settings extends StObject {
    
    /*
      * Select extension options
      */
    var select: js.UndefOr[Boolean | String | SelectSettings] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      inline def setSelect(value: Boolean | String | SelectSettings): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    }
  }
}

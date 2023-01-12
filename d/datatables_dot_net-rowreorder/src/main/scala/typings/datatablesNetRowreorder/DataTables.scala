package typings.datatablesNetRowreorder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTables {
  
  trait RowReorderSettings extends StObject {
    
    /**
      * Configure the data point that will be used for the reordering data
      */
    var dataSrc: js.UndefOr[String] = js.undefined
    
    /**
      * Attach an Editor instance for database updating
      */
    var editor: js.UndefOr[Any] = js.undefined
    
    /**
      * Enable / disable RowReorder's user interaction
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the options for the Editor form when submitting data
      */
    var formOptions: js.UndefOr[Any] = js.undefined
    
    /**
      * Define the selector used to pick the elements that will start a drag
      */
    var selector: js.UndefOr[String] = js.undefined
    
    /**
      * Horizontal position control of the row being dragged
      */
    var snapX: js.UndefOr[Double | Boolean] = js.undefined
    
    /**
      * Control automatic of data when a row is dropped
      */
    var update: js.UndefOr[Boolean] = js.undefined
  }
  object RowReorderSettings {
    
    inline def apply(): RowReorderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowReorderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowReorderSettings] (val x: Self) extends AnyVal {
      
      inline def setDataSrc(value: String): Self = StObject.set(x, "dataSrc", value.asInstanceOf[js.Any])
      
      inline def setDataSrcUndefined: Self = StObject.set(x, "dataSrc", js.undefined)
      
      inline def setEditor(value: Any): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setFormOptions(value: Any): Self = StObject.set(x, "formOptions", value.asInstanceOf[js.Any])
      
      inline def setFormOptionsUndefined: Self = StObject.set(x, "formOptions", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSnapX(value: Double | Boolean): Self = StObject.set(x, "snapX", value.asInstanceOf[js.Any])
      
      inline def setSnapXUndefined: Self = StObject.set(x, "snapX", js.undefined)
      
      inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait Settings extends StObject {
    
    /**
      * Enable and configure the RowReorder extension for DataTables
      */
    var rowReorder: js.UndefOr[RowReorderSettings] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      inline def setRowReorder(value: RowReorderSettings): Self = StObject.set(x, "rowReorder", value.asInstanceOf[js.Any])
      
      inline def setRowReorderUndefined: Self = StObject.set(x, "rowReorder", js.undefined)
    }
  }
}

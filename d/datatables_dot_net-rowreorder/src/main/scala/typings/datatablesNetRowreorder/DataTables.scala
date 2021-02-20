package typings.datatablesNetRowreorder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTables {
  
  @js.native
  trait RowReorderSettings extends StObject {
    
    /**
      * Configure the data point that will be used for the reordering data
      */
    var dataSrc: js.UndefOr[String] = js.native
    
    /**
      * Attach an Editor instance for database updating
      */
    var editor: js.UndefOr[js.Any] = js.native
    
    /**
      * Enable / disable RowReorder's user interaction
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /**
      * Set the options for the Editor form when submitting data
      */
    var formOptions: js.UndefOr[js.Any] = js.native
    
    /**
      * Define the selector used to pick the elements that will start a drag
      */
    var selector: js.UndefOr[String] = js.native
    
    /**
      * Horizontal position control of the row being dragged
      */
    var snapX: js.UndefOr[Double | Boolean] = js.native
    
    /**
      * Control automatic of data when a row is dropped
      */
    var update: js.UndefOr[Boolean] = js.native
  }
  object RowReorderSettings {
    
    @scala.inline
    def apply(): RowReorderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowReorderSettings]
    }
    
    @scala.inline
    implicit class RowReorderSettingsMutableBuilder[Self <: RowReorderSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataSrc(value: String): Self = StObject.set(x, "dataSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSrcUndefined: Self = StObject.set(x, "dataSrc", js.undefined)
      
      @scala.inline
      def setEditor(value: js.Any): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setFormOptions(value: js.Any): Self = StObject.set(x, "formOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormOptionsUndefined: Self = StObject.set(x, "formOptions", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setSnapX(value: Double | Boolean): Self = StObject.set(x, "snapX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapXUndefined: Self = StObject.set(x, "snapX", js.undefined)
      
      @scala.inline
      def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait Settings extends StObject {
    
    /**
      * Enable and configure the RowReorder extension for DataTables
      */
    var rowReorder: js.UndefOr[RowReorderSettings] = js.native
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
      def setRowReorder(value: RowReorderSettings): Self = StObject.set(x, "rowReorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowReorderUndefined: Self = StObject.set(x, "rowReorder", js.undefined)
    }
  }
}

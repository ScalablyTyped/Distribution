package typings.datatablesNetAutofill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTables {
  
  @js.native
  trait AutoFillSettings extends StObject {
    
    /*
      * Always ask the end user if an action should be taken or not
      */
    var alwaysAsk: js.UndefOr[Boolean] = js.native
    
    /*
      * Select the columns that can be auto filled
      */
    var columns: String | js.Array[Double] = js.native
    
    /*
      *
      * Initial enablement state of AutoFill
      */
    var enable: js.UndefOr[Boolean] = js.native
  }
  object AutoFillSettings {
    
    @scala.inline
    def apply(columns: String | js.Array[Double]): AutoFillSettings = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoFillSettings]
    }
    
    @scala.inline
    implicit class AutoFillSettingsMutableBuilder[Self <: AutoFillSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysAsk(value: Boolean): Self = StObject.set(x, "alwaysAsk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysAskUndefined: Self = StObject.set(x, "alwaysAsk", js.undefined)
      
      @scala.inline
      def setColumns(value: String | js.Array[Double]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: Double*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    }
  }
  
  @js.native
  trait Settings extends StObject {
    
    /*
      * autoFill extension options
      */
    var autoFill: js.UndefOr[Boolean | AutoFillSettings] = js.native
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
      def setAutoFill(value: Boolean | AutoFillSettings): Self = StObject.set(x, "autoFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFillUndefined: Self = StObject.set(x, "autoFill", js.undefined)
    }
  }
}

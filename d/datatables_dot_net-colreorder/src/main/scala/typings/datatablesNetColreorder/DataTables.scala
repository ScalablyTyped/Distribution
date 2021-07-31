package typings.datatablesNetColreorder

import typings.datatablesNetColreorder.anon.Move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTables {
  
  trait Api extends StObject {
    
    var colReorder: Move
  }
  object Api {
    
    @scala.inline
    def apply(colReorder: Move): Api = {
      val __obj = js.Dynamic.literal(colReorder = colReorder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api]
    }
    
    @scala.inline
    implicit class ApiMutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColReorder(value: Move): Self = StObject.set(x, "colReorder", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColReorderSettings extends StObject {
    
    /*
      * Number of columns (counting from the left) to disallow reordering of, '0' in default
      */
    var fixedColumnsLeft: js.UndefOr[Double] = js.undefined
    
    /*
      * Number of columns (counting from the right) to disallow reordering of, '0' in default
      */
    var fixedColumnsRight: js.UndefOr[Double] = js.undefined
    
    /*
      * Set a default order for the columns in the table
      */
    var order: js.UndefOr[js.Array[Double]] = js.undefined
    
    /*
      * Enable / disable live reordering of columns during a drag, 'true' in default
      */
    var realtime: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Callback after reorder
      */
    def reorderCallback(): Unit
  }
  object ColReorderSettings {
    
    @scala.inline
    def apply(reorderCallback: () => Unit): ColReorderSettings = {
      val __obj = js.Dynamic.literal(reorderCallback = js.Any.fromFunction0(reorderCallback))
      __obj.asInstanceOf[ColReorderSettings]
    }
    
    @scala.inline
    implicit class ColReorderSettingsMutableBuilder[Self <: ColReorderSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixedColumnsLeft(value: Double): Self = StObject.set(x, "fixedColumnsLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedColumnsLeftUndefined: Self = StObject.set(x, "fixedColumnsLeft", js.undefined)
      
      @scala.inline
      def setFixedColumnsRight(value: Double): Self = StObject.set(x, "fixedColumnsRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedColumnsRightUndefined: Self = StObject.set(x, "fixedColumnsRight", js.undefined)
      
      @scala.inline
      def setOrder(value: js.Array[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrderVarargs(value: Double*): Self = StObject.set(x, "order", js.Array(value :_*))
      
      @scala.inline
      def setRealtime(value: Boolean): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealtimeUndefined: Self = StObject.set(x, "realtime", js.undefined)
      
      @scala.inline
      def setReorderCallback(value: () => Unit): Self = StObject.set(x, "reorderCallback", js.Any.fromFunction0(value))
    }
  }
  
  trait Settings extends StObject {
    
    /*
      * colReorder extension options
      */
    var colReorder: js.UndefOr[Boolean | ColReorderSettings] = js.undefined
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
      def setColReorder(value: Boolean | ColReorderSettings): Self = StObject.set(x, "colReorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColReorderUndefined: Self = StObject.set(x, "colReorder", js.undefined)
    }
  }
}

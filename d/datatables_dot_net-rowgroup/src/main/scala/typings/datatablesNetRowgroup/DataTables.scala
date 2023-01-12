package typings.datatablesNetRowgroup

import org.scalablytyped.runtime.Instantiable2
import typings.datatablesNet.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTables {
  
  trait Api extends StObject {
    
    def rowGroup(): RowGroupApi
  }
  object Api {
    
    inline def apply(rowGroup: () => RowGroupApi): Api = {
      val __obj = js.Dynamic.literal(rowGroup = js.Any.fromFunction0(rowGroup))
      __obj.asInstanceOf[Api]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
      
      inline def setRowGroup(value: () => RowGroupApi): Self = StObject.set(x, "rowGroup", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait RowGroupApi extends StObject {
    
    /**
      * Get the data source for the row grouping
      */
    def dataSrc(): Double | String = js.native
    def dataSrc(prop: String): Api = js.native
    /**
      * Set the data source for the row grouping
      */
    def dataSrc(prop: Double): Api = js.native
    
    /**
      * Disable RowGroup's interaction with the table
      */
    def disable(): Api = js.native
    
    /**
      * Enable or disable RowGroup's interaction with the table
      */
    def enable(): Api = js.native
    def enable(enable: Boolean): Api = js.native
  }
  
  /**
    * RowGroup extension options
    */
  trait RowGroupSettings extends StObject {
    
    /**
      * Set the class name to be used for the grouping rows
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Set the data point to use as the grouping data source
      */
    var dataSrc: js.UndefOr[Double | String | js.Array[String]] = js.undefined
    
    /**
      * Text to show for rows which have null, undefined or empty string group data
      */
    var emptyDataGroup: js.UndefOr[String] = js.undefined
    
    /**
      * Provides the ability to disable row grouping at initialisation
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the class name to be used for the grouping end rows
      */
    var endClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Provide a function that can be used to control the data shown in the end grouping row
      */
    var endRender: js.UndefOr[js.Function2[/* rows */ Api, /* group */ String, String | HTMLElement | JQuery]] = js.undefined
    
    /**
      * Set the class name to be used for the grouping start rows
      */
    var startClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Provide a function that can be used to control the data shown in the start grouping row
      */
    var startRender: js.UndefOr[
        js.Function3[/* rows */ Api, /* group */ String, /* level */ Double, String | HTMLElement | JQuery]
      ] = js.undefined
  }
  object RowGroupSettings {
    
    inline def apply(): RowGroupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowGroupSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowGroupSettings] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataSrc(value: Double | String | js.Array[String]): Self = StObject.set(x, "dataSrc", value.asInstanceOf[js.Any])
      
      inline def setDataSrcUndefined: Self = StObject.set(x, "dataSrc", js.undefined)
      
      inline def setDataSrcVarargs(value: String*): Self = StObject.set(x, "dataSrc", js.Array(value*))
      
      inline def setEmptyDataGroup(value: String): Self = StObject.set(x, "emptyDataGroup", value.asInstanceOf[js.Any])
      
      inline def setEmptyDataGroupUndefined: Self = StObject.set(x, "emptyDataGroup", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setEndClassName(value: String): Self = StObject.set(x, "endClassName", value.asInstanceOf[js.Any])
      
      inline def setEndClassNameUndefined: Self = StObject.set(x, "endClassName", js.undefined)
      
      inline def setEndRender(value: (/* rows */ Api, /* group */ String) => String | HTMLElement | JQuery): Self = StObject.set(x, "endRender", js.Any.fromFunction2(value))
      
      inline def setEndRenderUndefined: Self = StObject.set(x, "endRender", js.undefined)
      
      inline def setStartClassName(value: String): Self = StObject.set(x, "startClassName", value.asInstanceOf[js.Any])
      
      inline def setStartClassNameUndefined: Self = StObject.set(x, "startClassName", js.undefined)
      
      inline def setStartRender(value: (/* rows */ Api, /* group */ String, /* level */ Double) => String | HTMLElement | JQuery): Self = StObject.set(x, "startRender", js.Any.fromFunction3(value))
      
      inline def setStartRenderUndefined: Self = StObject.set(x, "startRender", js.undefined)
    }
  }
  
  @js.native
  trait RowGroupStaticFunctions
    extends StObject
       with Instantiable2[/* dt */ Api, (/* settings */ Boolean) | (/* settings */ RowGroupSettings), Unit] {
    
    var defaults: RowGroupSettings = js.native
    
    var version: String = js.native
  }
  
  trait Settings extends StObject {
    
    /**
      * RowGroup extension options
      */
    var rowGroup: js.UndefOr[Boolean | RowGroupSettings] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      inline def setRowGroup(value: Boolean | RowGroupSettings): Self = StObject.set(x, "rowGroup", value.asInstanceOf[js.Any])
      
      inline def setRowGroupUndefined: Self = StObject.set(x, "rowGroup", js.undefined)
    }
  }
  
  trait StaticFunctions extends StObject {
    
    var RowGroup: RowGroupStaticFunctions
  }
  object StaticFunctions {
    
    inline def apply(RowGroup: RowGroupStaticFunctions): StaticFunctions = {
      val __obj = js.Dynamic.literal(RowGroup = RowGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticFunctions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StaticFunctions] (val x: Self) extends AnyVal {
      
      inline def setRowGroup(value: RowGroupStaticFunctions): Self = StObject.set(x, "RowGroup", value.asInstanceOf[js.Any])
    }
  }
}

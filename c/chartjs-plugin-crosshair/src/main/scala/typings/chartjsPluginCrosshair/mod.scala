package typings.chartjsPluginCrosshair

import typings.chartjsPluginCrosshair.chartjsPluginCrosshairStrings.interpolate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait CallbackOptions extends StObject {
    
    var afterZoom: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Unit]] = js.undefined
    
    var beforeZoom: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, Boolean]] = js.undefined
  }
  object CallbackOptions {
    
    inline def apply(): CallbackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbackOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallbackOptions] (val x: Self) extends AnyVal {
      
      inline def setAfterZoom(value: (/* start */ Double, /* end */ Double) => Unit): Self = StObject.set(x, "afterZoom", js.Any.fromFunction2(value))
      
      inline def setAfterZoomUndefined: Self = StObject.set(x, "afterZoom", js.undefined)
      
      inline def setBeforeZoom(value: (/* start */ Double, /* end */ Double) => Boolean): Self = StObject.set(x, "beforeZoom", js.Any.fromFunction2(value))
      
      inline def setBeforeZoomUndefined: Self = StObject.set(x, "beforeZoom", js.undefined)
    }
  }
  
  trait CrosshairOptions extends StObject {
    
    var callbacks: js.UndefOr[CallbackOptions] = js.undefined
    
    var line: js.UndefOr[LineOptions] = js.undefined
    
    var snap: js.UndefOr[SnapOptions] = js.undefined
    
    var sync: js.UndefOr[SyncOptions] = js.undefined
    
    var zoom: js.UndefOr[ZoomOptions] = js.undefined
  }
  object CrosshairOptions {
    
    inline def apply(): CrosshairOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrosshairOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CrosshairOptions] (val x: Self) extends AnyVal {
      
      inline def setCallbacks(value: CallbackOptions): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setLine(value: LineOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setSnap(value: SnapOptions): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      inline def setSync(value: SyncOptions): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      inline def setZoom(value: ZoomOptions): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  trait LineOptions extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var dashPattern: js.UndefOr[js.Array[Double]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object LineOptions {
    
    inline def apply(): LineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashPattern(value: js.Array[Double]): Self = StObject.set(x, "dashPattern", value.asInstanceOf[js.Any])
      
      inline def setDashPatternUndefined: Self = StObject.set(x, "dashPattern", js.undefined)
      
      inline def setDashPatternVarargs(value: Double*): Self = StObject.set(x, "dashPattern", js.Array(value*))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SnapOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
  }
  object SnapOptions {
    
    inline def apply(): SnapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnapOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
  
  trait SyncOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var group: js.UndefOr[Double] = js.undefined
    
    var suppressTooltips: js.UndefOr[Boolean] = js.undefined
  }
  object SyncOptions {
    
    inline def apply(): SyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setGroup(value: Double): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setSuppressTooltips(value: Boolean): Self = StObject.set(x, "suppressTooltips", value.asInstanceOf[js.Any])
      
      inline def setSuppressTooltipsUndefined: Self = StObject.set(x, "suppressTooltips", js.undefined)
    }
  }
  
  trait ZoomOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var zoomButtonClass: js.UndefOr[String] = js.undefined
    
    var zoomButtonText: js.UndefOr[String] = js.undefined
    
    var zoomboxBackgroundColor: js.UndefOr[String] = js.undefined
    
    var zoomboxBorderColor: js.UndefOr[String] = js.undefined
  }
  object ZoomOptions {
    
    inline def apply(): ZoomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setZoomButtonClass(value: String): Self = StObject.set(x, "zoomButtonClass", value.asInstanceOf[js.Any])
      
      inline def setZoomButtonClassUndefined: Self = StObject.set(x, "zoomButtonClass", js.undefined)
      
      inline def setZoomButtonText(value: String): Self = StObject.set(x, "zoomButtonText", value.asInstanceOf[js.Any])
      
      inline def setZoomButtonTextUndefined: Self = StObject.set(x, "zoomButtonText", js.undefined)
      
      inline def setZoomboxBackgroundColor(value: String): Self = StObject.set(x, "zoomboxBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setZoomboxBackgroundColorUndefined: Self = StObject.set(x, "zoomboxBackgroundColor", js.undefined)
      
      inline def setZoomboxBorderColor(value: String): Self = StObject.set(x, "zoomboxBorderColor", value.asInstanceOf[js.Any])
      
      inline def setZoomboxBorderColorUndefined: Self = StObject.set(x, "zoomboxBorderColor", js.undefined)
    }
  }
  
  /* augmented module */
  object chartJsAugmentingMod {
    
    trait ChartDataSets extends StObject {
      
      var interpolate: js.UndefOr[Boolean] = js.undefined
    }
    object ChartDataSets {
      
      inline def apply(): ChartDataSets = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChartDataSets]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ChartDataSets] (val x: Self) extends AnyVal {
        
        inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
        
        inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      }
    }
    
    trait ChartPluginsOptions extends StObject {
      
      var crosshair: js.UndefOr[CrosshairOptions] = js.undefined
    }
    object ChartPluginsOptions {
      
      inline def apply(): ChartPluginsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChartPluginsOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ChartPluginsOptions] (val x: Self) extends AnyVal {
        
        inline def setCrosshair(value: CrosshairOptions): Self = StObject.set(x, "crosshair", value.asInstanceOf[js.Any])
        
        inline def setCrosshairUndefined: Self = StObject.set(x, "crosshair", js.undefined)
      }
    }
    
    trait InteractionModeRegistry extends StObject {
      
      var interpolate: typings.chartjsPluginCrosshair.chartjsPluginCrosshairStrings.interpolate
    }
    object InteractionModeRegistry {
      
      inline def apply(): InteractionModeRegistry = {
        val __obj = js.Dynamic.literal(interpolate = "interpolate")
        __obj.asInstanceOf[InteractionModeRegistry]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: InteractionModeRegistry] (val x: Self) extends AnyVal {
        
        inline def setInterpolate(value: interpolate): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      }
    }
  }
  
  // This is a workaround needed because:
  // classes exported with `export = ` can't be augmented by normal module augmentation (like we use above)
  // see https://github.com/Microsoft/TypeScript/issues/14080
  object global {
    
    trait Chart extends StObject {
      
      def panZoom(increment: Double): Unit
    }
    object Chart {
      
      inline def apply(panZoom: Double => Unit): Chart = {
        val __obj = js.Dynamic.literal(panZoom = js.Any.fromFunction1(panZoom))
        __obj.asInstanceOf[Chart]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Chart] (val x: Self) extends AnyVal {
        
        inline def setPanZoom(value: Double => Unit): Self = StObject.set(x, "panZoom", js.Any.fromFunction1(value))
      }
    }
  }
}

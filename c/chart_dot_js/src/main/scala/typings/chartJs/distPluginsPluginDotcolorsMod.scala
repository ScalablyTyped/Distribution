package typings.chartJs

import typings.chartJs.distTypesIndexMod.ChartType
import typings.chartJs.distTypesIndexMod.DefaultDataPoint
import typings.chartJs.mod.Chart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsPluginDotcolorsMod {
  
  object default {
    
    @JSImport("chart.js/dist/plugins/plugin.colors", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def beforeLayout(
      chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
      _args: Any,
      options: ColorsPluginOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeLayout")(chart.asInstanceOf[js.Any], _args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("chart.js/dist/plugins/plugin.colors", "default.defaults")
    @js.native
    def defaults: ColorsPluginOptions = js.native
    inline def defaults_=(x: ColorsPluginOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist/plugins/plugin.colors", "default.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  trait ColorsPluginOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var forceOverride: js.UndefOr[Boolean] = js.undefined
  }
  object ColorsPluginOptions {
    
    inline def apply(): ColorsPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorsPluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorsPluginOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setForceOverride(value: Boolean): Self = StObject.set(x, "forceOverride", value.asInstanceOf[js.Any])
      
      inline def setForceOverrideUndefined: Self = StObject.set(x, "forceOverride", js.undefined)
    }
  }
}

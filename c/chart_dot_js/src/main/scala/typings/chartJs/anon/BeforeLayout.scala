package typings.chartJs.anon

import typings.chartJs.distPluginsPluginDotcolorsMod.ColorsPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeLayout extends StObject {
  
  def beforeLayout(
    chart: typings.chartJs.mod.Chart[
      typings.chartJs.distTypesIndexMod.ChartType, 
      typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
      Any
    ],
    _args: Any,
    options: ColorsPluginOptions
  ): Unit
  
  var defaults: ColorsPluginOptions
  
  var id: String
}
object BeforeLayout {
  
  inline def apply(
    beforeLayout: (typings.chartJs.mod.Chart[
      typings.chartJs.distTypesIndexMod.ChartType, 
      typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
      Any
    ], Any, ColorsPluginOptions) => Unit,
    defaults: ColorsPluginOptions,
    id: String
  ): BeforeLayout = {
    val __obj = js.Dynamic.literal(beforeLayout = js.Any.fromFunction3(beforeLayout), defaults = defaults.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BeforeLayout] (val x: Self) extends AnyVal {
    
    inline def setBeforeLayout(
      value: (typings.chartJs.mod.Chart[
          typings.chartJs.distTypesIndexMod.ChartType, 
          typings.chartJs.distTypesIndexMod.DefaultDataPoint[typings.chartJs.distTypesIndexMod.ChartType], 
          Any
        ], Any, ColorsPluginOptions) => Unit
    ): Self = StObject.set(x, "beforeLayout", js.Any.fromFunction3(value))
    
    inline def setDefaults(value: ColorsPluginOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}

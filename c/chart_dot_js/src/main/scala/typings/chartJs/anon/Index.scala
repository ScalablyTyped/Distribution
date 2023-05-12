package typings.chartJs.anon

import typings.chartJs.distElementsMod.LineElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var chart: typings.chartJs.distPluginsPluginDotfillerFillerDottargetDotstackMod.Chart
  
  var index: Double
  
  var line: LineElement
  
  var scale: typings.chartJs.distPluginsPluginDotfillerFillerDottargetDotstackMod.Scale
}
object Index {
  
  inline def apply(
    chart: typings.chartJs.distPluginsPluginDotfillerFillerDottargetDotstackMod.Chart,
    index: Double,
    line: LineElement,
    scale: typings.chartJs.distPluginsPluginDotfillerFillerDottargetDotstackMod.Scale
  ): Index = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
    
    inline def setChart(value: typings.chartJs.distPluginsPluginDotfillerFillerDottargetDotstackMod.Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLine(value: LineElement): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setScale(value: typings.chartJs.distPluginsPluginDotfillerFillerDottargetDotstackMod.Scale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}

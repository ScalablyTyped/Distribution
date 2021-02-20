package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BorderWidth = scala.Double | typings.chartJs.anon.keyinPositionTypenumber
  
  /* static member */
  @scala.inline
  def Chart: org.scalablytyped.runtime.Instantiable2[
    /* context */ java.lang.String | typings.std.CanvasRenderingContext2D | typings.std.HTMLCanvasElement | (typings.std.ArrayLike[typings.std.CanvasRenderingContext2D | typings.std.HTMLCanvasElement]), 
    /* options */ typings.chartJs.mod.ChartConfiguration, 
    typings.chartJs.mod.Chart
  ] = typings.chartJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Chart").asInstanceOf[org.scalablytyped.runtime.Instantiable2[
    /* context */ java.lang.String | typings.std.CanvasRenderingContext2D | typings.std.HTMLCanvasElement | (typings.std.ArrayLike[typings.std.CanvasRenderingContext2D | typings.std.HTMLCanvasElement]), 
    /* options */ typings.chartJs.mod.ChartConfiguration, 
    typings.chartJs.mod.Chart
  ]]
  
  type ChartColor = java.lang.String | typings.std.CanvasGradient | typings.std.CanvasPattern | js.Array[java.lang.String]
  
  // NOTE: declare plugin options as interface instead of inline '{ [plugin: string]: any }'
  // to allow module augmentation in case some plugins want to strictly type their options.
  type ChartPluginsOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ChartTooltipPositioner = js.Function2[
    /* elements */ js.Array[js.Any], 
    /* eventPosition */ typings.chartJs.mod.Point, 
    typings.chartJs.mod.Point
  ]
  
  // tslint:disable-next-line no-empty-interface
  type ChartYAxe = typings.chartJs.mod.CommonAxe
  
  // tslint:disable-next-line no-empty-interface
  type LogarithmicTickOptions = typings.chartJs.mod.TickOptions
  
  type Scriptable[T] = js.Function1[/* ctx */ typings.chartJs.anon.Chart, T]
  
  // Tooltip Static Options
  /* static member */
  @scala.inline
  def Tooltip: typings.chartJs.mod.ChartTooltipsStaticConfiguration = typings.chartJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Tooltip").asInstanceOf[typings.chartJs.mod.ChartTooltipsStaticConfiguration]
  @scala.inline
  def Tooltip_=(x: typings.chartJs.mod.ChartTooltipsStaticConfiguration): scala.Unit = typings.chartJs.mod.^.asInstanceOf[js.Dynamic].updateDynamic("Tooltip")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def pluginService: typings.chartJs.mod.PluginServiceStatic = typings.chartJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("pluginService").asInstanceOf[typings.chartJs.mod.PluginServiceStatic]
  @scala.inline
  def pluginService_=(x: typings.chartJs.mod.PluginServiceStatic): scala.Unit = typings.chartJs.mod.^.asInstanceOf[js.Dynamic].updateDynamic("pluginService")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def plugins: typings.chartJs.mod.PluginServiceStatic = typings.chartJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("plugins").asInstanceOf[typings.chartJs.mod.PluginServiceStatic]
  @scala.inline
  def plugins_=(x: typings.chartJs.mod.PluginServiceStatic): scala.Unit = typings.chartJs.mod.^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
}

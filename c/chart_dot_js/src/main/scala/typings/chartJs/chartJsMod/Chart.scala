package typings.chartJs.chartJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.distTypesIndexMod.ChartComponentLike
import typings.chartJs.distTypesIndexMod.ChartConfiguration
import typings.chartJs.distTypesIndexMod.ChartConfigurationCustomTypesPerDataset
import typings.chartJs.distTypesIndexMod.ChartItem
import typings.chartJs.distTypesIndexMod.ChartType
import typings.chartJs.distTypesIndexMod.DefaultDataPoint
import typings.chartJs.distTypesIndexMod.Defaults_
import typings.chartJs.distTypesIndexMod.Overrides
import typings.chartJs.distTypesIndexMod.Registry_
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart/js", "Chart")
@js.native
open class Chart[TType /* <: ChartType */, TData, TLabel] protected ()
  extends typings.chartJs.mod.Chart[TType, TData, TLabel] {
  def this(item: ChartItem, config: ChartConfiguration[TType, TData, TLabel]) = this()
  def this(item: ChartItem, config: ChartConfigurationCustomTypesPerDataset[TType, TData, TLabel]) = this()
}
/* static members */
object Chart {
  
  @JSImport("chart/js", "Chart")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart/js", "Chart.defaults")
  @js.native
  val defaults: Defaults_ = js.native
  
  inline def getChart(key: String): js.UndefOr[
    typings.chartJs.distTypesIndexMod.Chart[ChartType, DefaultDataPoint[ChartType], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChart")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    typings.chartJs.distTypesIndexMod.Chart[ChartType, DefaultDataPoint[ChartType], Any]
  ]]
  inline def getChart(key: CanvasRenderingContext2D): js.UndefOr[
    typings.chartJs.distTypesIndexMod.Chart[ChartType, DefaultDataPoint[ChartType], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChart")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    typings.chartJs.distTypesIndexMod.Chart[ChartType, DefaultDataPoint[ChartType], Any]
  ]]
  inline def getChart(key: HTMLCanvasElement): js.UndefOr[
    typings.chartJs.distTypesIndexMod.Chart[ChartType, DefaultDataPoint[ChartType], Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChart")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    typings.chartJs.distTypesIndexMod.Chart[ChartType, DefaultDataPoint[ChartType], Any]
  ]]
  
  @JSImport("chart/js", "Chart.instances")
  @js.native
  val instances: StringDictionary[
    typings.chartJs.distTypesIndexMod.Chart[ChartType, DefaultDataPoint[ChartType], Any]
  ] = js.native
  
  @JSImport("chart/js", "Chart.overrides")
  @js.native
  val overrides: Overrides = js.native
  
  inline def register(items: ChartComponentLike*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("chart/js", "Chart.registry")
  @js.native
  val registry: Registry_ = js.native
  
  inline def unregister(items: ChartComponentLike*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("chart/js", "Chart.version")
  @js.native
  val version: String = js.native
}

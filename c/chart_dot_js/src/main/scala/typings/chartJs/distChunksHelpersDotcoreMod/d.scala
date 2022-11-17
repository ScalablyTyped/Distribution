package typings.chartJs.distChunksHelpersDotcoreMod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js/dist/chunks/helpers.core", "d")
@js.native
open class d[TType /* <: ChartType */, TData, TLabel] protected ()
  extends StObject
     with Chart4[TType, TData, TLabel] {
  def this(item: ChartItem, config: ChartConfiguration[TType, TData, TLabel]) = this()
  def this(item: ChartItem, config: ChartConfigurationCustomTypesPerDataset[TType, TData, TLabel]) = this()
}
object d {
  
  @JSImport("chart.js/dist/chunks/helpers.core", "d")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("chart.js/dist/chunks/helpers.core", "d.defaults")
  @js.native
  val defaults: Defaults1 = js.native
  
  /* static member */
  inline def getChart(key: String): js.UndefOr[Chart4[ChartType, DefaultDataPoint[ChartType], Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChart")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Chart4[ChartType, DefaultDataPoint[ChartType], Any]]]
  inline def getChart(key: CanvasRenderingContext2D): js.UndefOr[Chart4[ChartType, DefaultDataPoint[ChartType], Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChart")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Chart4[ChartType, DefaultDataPoint[ChartType], Any]]]
  inline def getChart(key: HTMLCanvasElement): js.UndefOr[Chart4[ChartType, DefaultDataPoint[ChartType], Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChart")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Chart4[ChartType, DefaultDataPoint[ChartType], Any]]]
  
  /* static member */
  @JSImport("chart.js/dist/chunks/helpers.core", "d.overrides")
  @js.native
  val overrides: Overrides = js.native
  
  /* static member */
  inline def register(items: ChartComponentLike*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  /* static member */
  @JSImport("chart.js/dist/chunks/helpers.core", "d.registry")
  @js.native
  val registry: Registry1 = js.native
  
  /* static member */
  inline def unregister(items: ChartComponentLike*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  /* static member */
  @JSImport("chart.js/dist/chunks/helpers.core", "d.version")
  @js.native
  val version: String = js.native
}

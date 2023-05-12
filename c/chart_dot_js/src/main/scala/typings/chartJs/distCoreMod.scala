package typings.chartJs

import org.scalablytyped.runtime.Instantiable1
import typings.chartJs.anon.TypeofDateAdapterBase
import typings.chartJs.distCoreCoreDotadaptersMod.DateAdapterBase
import typings.chartJs.distCoreCoreDotanimationMod.default
import typings.chartJs.distCoreCoreDotanimatorMod.Animator
import typings.chartJs.distCoreCoreDotdefaultsMod.Defaults
import typings.chartJs.distCoreCoreDotinteractionMod.InteractionItem
import typings.chartJs.distCoreCoreDotinteractionMod.InteractionOptions
import typings.chartJs.distCoreCoreDotlayoutsMod.LayoutItem
import typings.chartJs.distCoreCoreDotregistryMod.Registry
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreMod {
  
  @JSImport("chart.js/dist/core", "Animation")
  @js.native
  open class Animation protected () extends default {
    def this(cfg: Any, target: Any, prop: Any, to: Any) = this()
  }
  
  @JSImport("chart.js/dist/core", "Animations")
  @js.native
  open class Animations protected ()
    extends typings.chartJs.distCoreCoreDotanimationsMod.default {
    def this(chart: Any, config: Any) = this()
  }
  
  @JSImport("chart.js/dist/core", "Chart")
  @js.native
  open class Chart protected ()
    extends typings.chartJs.distCoreCoreDotcontrollerMod.default {
    def this(item: Any, userConfig: Any) = this()
  }
  object Chart {
    
    @JSImport("chart.js/dist/core", "Chart")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("chart.js/dist/core", "Chart.defaults")
    @js.native
    def defaults: Defaults = js.native
    inline def defaults_=(x: Defaults): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("chart.js/dist/core", "Chart.getChart")
    @js.native
    def getChart: js.Function1[/* key */ Any, Any] = js.native
    inline def getChart_=(x: js.Function1[/* key */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getChart")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("chart.js/dist/core", "Chart.overrides")
    @js.native
    def overrides: Any = js.native
    inline def overrides_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrides")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def register(items: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    @JSImport("chart.js/dist/core", "Chart.registry")
    @js.native
    def registry: Registry = js.native
    inline def registry_=(x: Registry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registry")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def unregister(items: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    /* static member */
    @JSImport("chart.js/dist/core", "Chart.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js/dist/core", "DatasetController")
  @js.native
  open class DatasetController protected ()
    extends typings.chartJs.distCoreCoreDotdatasetControllerMod.default {
    /**
      * @param {Chart} chart
      * @param {number} datasetIndex
      */
    def this(chart: typings.chartJs.distCoreCoreDotdatasetControllerMod.Chart, datasetIndex: Double) = this()
  }
  /* static members */
  object DatasetController {
    
    @JSImport("chart.js/dist/core", "DatasetController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Element type used to generate a meta data (e.g. Chart.element.PointElement).
      */
    @JSImport("chart.js/dist/core", "DatasetController.dataElementType")
    @js.native
    def dataElementType: Any = js.native
    inline def dataElementType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataElementType")(x.asInstanceOf[js.Any])
    
    /**
      * Element type used to generate a meta dataset (e.g. Chart.element.LineElement).
      */
    @JSImport("chart.js/dist/core", "DatasetController.datasetElementType")
    @js.native
    def datasetElementType: Any = js.native
    inline def datasetElementType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("datasetElementType")(x.asInstanceOf[js.Any])
    
    /**
      * @type {any}
      */
    @JSImport("chart.js/dist/core", "DatasetController.defaults")
    @js.native
    def defaults: Any = js.native
    inline def defaults_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js/dist/core", "Element")
  @js.native
  open class Element[T, O] ()
    extends typings.chartJs.distCoreCoreDotelementMod.default[T, O]
  /* static members */
  object Element {
    
    @JSImport("chart.js/dist/core", "Element")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("chart.js/dist/core", "Element.defaultRoutes")
    @js.native
    def defaultRoutes: Any = js.native
    inline def defaultRoutes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
    
    @JSImport("chart.js/dist/core", "Element.defaults")
    @js.native
    def defaults: js.Object = js.native
    inline def defaults_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  }
  
  object Interaction {
    
    object modes {
      
      @JSImport("chart.js/dist/core", "Interaction.modes")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Returns items in the same dataset. If the options.intersect parameter is true, we only return items if we intersect something
        * If the options.intersect is false, we find the nearest item and return the items in that dataset
        * @function Chart.Interaction.modes.dataset
        * @param {Chart} chart - the chart we are returning items from
        * @param {Event} e - the event we are find things at
        * @param {InteractionOptions} options - options to use
        * @param {boolean} [useFinalPosition] - use final element position (animation target)
        * @return {InteractionItem[]} - items that are found
        */
      inline def dataset(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      inline def dataset(
        chart: typings.chartJs.distCoreCoreDotcontrollerMod.default,
        e: Event,
        options: InteractionOptions,
        useFinalPosition: Boolean
      ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("dataset")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      
      /**
        * Returns items at the same index. If the options.intersect parameter is true, we only return items if we intersect something
        * If the options.intersect mode is false, we find the nearest item and return the items at the same index as that item
        * @function Chart.Interaction.modes.index
        * @since v2.4.0
        * @param {Chart} chart - the chart we are returning items from
        * @param {Event} e - the event we are find things at
        * @param {InteractionOptions} options - options to use
        * @param {boolean} [useFinalPosition] - use final element position (animation target)
        * @return {InteractionItem[]} - items that are found
        */
      inline def index(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      inline def index(
        chart: typings.chartJs.distCoreCoreDotcontrollerMod.default,
        e: Event,
        options: InteractionOptions,
        useFinalPosition: Boolean
      ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      
      /**
        * nearest mode returns the element closest to the point
        * @function Chart.Interaction.modes.intersect
        * @param {Chart} chart - the chart we are returning items from
        * @param {Event} e - the event we are find things at
        * @param {InteractionOptions} options - options to use
        * @param {boolean} [useFinalPosition] - use final element position (animation target)
        * @return {InteractionItem[]} - items that are found
        */
      inline def nearest(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      inline def nearest(
        chart: typings.chartJs.distCoreCoreDotcontrollerMod.default,
        e: Event,
        options: InteractionOptions,
        useFinalPosition: Boolean
      ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("nearest")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      
      /**
        * Point mode returns all elements that hit test based on the event position
        * of the event
        * @function Chart.Interaction.modes.intersect
        * @param {Chart} chart - the chart we are returning items from
        * @param {Event} e - the event we are find things at
        * @param {InteractionOptions} options - options to use
        * @param {boolean} [useFinalPosition] - use final element position (animation target)
        * @return {InteractionItem[]} - items that are found
        */
      inline def point(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      inline def point(
        chart: typings.chartJs.distCoreCoreDotcontrollerMod.default,
        e: Event,
        options: InteractionOptions,
        useFinalPosition: Boolean
      ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      
      /**
        * x mode returns the elements that hit-test at the current x coordinate
        * @function Chart.Interaction.modes.x
        * @param {Chart} chart - the chart we are returning items from
        * @param {Event} e - the event we are find things at
        * @param {InteractionOptions} options - options to use
        * @param {boolean} [useFinalPosition] - use final element position (animation target)
        * @return {InteractionItem[]} - items that are found
        */
      inline def x(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      inline def x(
        chart: typings.chartJs.distCoreCoreDotcontrollerMod.default,
        e: Event,
        options: InteractionOptions,
        useFinalPosition: Boolean
      ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      
      /**
        * y mode returns the elements that hit-test at the current y coordinate
        * @function Chart.Interaction.modes.y
        * @param {Chart} chart - the chart we are returning items from
        * @param {Event} e - the event we are find things at
        * @param {InteractionOptions} options - options to use
        * @param {boolean} [useFinalPosition] - use final element position (animation target)
        * @return {InteractionItem[]} - items that are found
        */
      inline def y(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, e: Event, options: InteractionOptions): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("y")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
      inline def y(
        chart: typings.chartJs.distCoreCoreDotcontrollerMod.default,
        e: Event,
        options: InteractionOptions,
        useFinalPosition: Boolean
      ): js.Array[InteractionItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("y")(chart.asInstanceOf[js.Any], e.asInstanceOf[js.Any], options.asInstanceOf[js.Any], useFinalPosition.asInstanceOf[js.Any])).asInstanceOf[js.Array[InteractionItem]]
    }
  }
  
  @JSImport("chart.js/dist/core", "Scale")
  @js.native
  open class Scale protected ()
    extends typings.chartJs.distCoreCoreDotscaleMod.default {
    def this(cfg: Any) = this()
  }
  
  object adapters {
    
    @JSImport("chart.js/dist/core", "_adapters")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("chart.js/dist/core", "_adapters._date")
    @js.native
    open class date protected ()
      extends StObject
         with DateAdapterBase {
      def this(options: AnyObject) = this()
    }
    
    @JSImport("chart.js/dist/core", "_adapters._date")
    @js.native
    def date: TypeofDateAdapterBase & (Instantiable1[/* options */ AnyObject, DateAdapterBase]) = js.native
    
    inline def date_=(x: TypeofDateAdapterBase & (Instantiable1[/* options */ AnyObject, DateAdapterBase])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_date")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("chart.js/dist/core", "animator")
  @js.native
  val animator: Animator = js.native
  
  @JSImport("chart.js/dist/core", "defaults")
  @js.native
  val defaults: Defaults = js.native
  
  object layouts {
    
    @JSImport("chart.js/dist/core", "layouts")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Register a box to a chart.
      * A box is simply a reference to an object that requires layout. eg. Scales, Legend, Title.
      * @param {Chart} chart - the chart to use
      * @param {LayoutItem} item - the item to add to be laid out
      */
    inline def addBox(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, item: LayoutItem): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBox")(chart.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sets (or updates) options on the given `item`.
      * @param {Chart} chart - the chart in which the item lives (or will be added to)
      * @param {LayoutItem} item - the item to configure with the given options
      * @param {object} options - the new item options.
      */
    inline def configure(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, item: LayoutItem, options: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(chart.asInstanceOf[js.Any], item.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Remove a layoutItem from a chart
      * @param {Chart} chart - the chart to remove the box from
      * @param {LayoutItem} layoutItem - the item to remove from the layout
      */
    inline def removeBox(chart: typings.chartJs.distCoreCoreDotcontrollerMod.default, layoutItem: LayoutItem): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBox")(chart.asInstanceOf[js.Any], layoutItem.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Fits boxes of the given chart into the given size by having each box measure itself
      * then running a fitting algorithm
      * @param {Chart} chart - the chart
      * @param {number} width - the width to fit into
      * @param {number} height - the height to fit into
      * @param {number} minPadding - minimum padding required for each side of chart area
      */
    inline def update(
      chart: typings.chartJs.distCoreCoreDotcontrollerMod.default,
      width: Double,
      height: Double,
      minPadding: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(chart.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], minPadding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("chart.js/dist/core", "plugins")
  @js.native
  open class plugins ()
    extends typings.chartJs.distCoreCoreDotpluginsMod.default
  
  @JSImport("chart.js/dist/core", "registry")
  @js.native
  val registry: Registry = js.native
}

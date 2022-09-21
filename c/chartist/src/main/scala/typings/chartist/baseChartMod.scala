package typings.chartist

import typings.chartist.chartistStrings.Asterisk
import typings.chartist.coreTypesMod.AllSeriesTypes
import typings.chartist.coreTypesMod.AxisOptions
import typings.chartist.coreTypesMod.Data
import typings.chartist.coreTypesMod.Options
import typings.chartist.coreTypesMod.ResponsiveOptions
import typings.chartist.eventEmitterMod.AllEventsListener
import typings.chartist.eventEmitterMod.EventListener
import typings.chartist.eventMod.EventEmitter
import typings.chartist.svgMod.Svg
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseChartMod {
  
  @JSImport("chartist/dist/charts/BaseChart", "BaseChart")
  @js.native
  abstract class BaseChart[TEventsTypes] protected () extends StObject {
    def this(
      query: String,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions]
    ) = this()
    def this(
      query: Null,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions]
    ) = this()
    def this(
      query: Element,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions]
    ) = this()
    def this(
      query: String,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[Options[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Null,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[Options[AxisOptions, AxisOptions]]
    ) = this()
    def this(
      query: Element,
      data: Data[AllSeriesTypes],
      defaultOptions: Options[AxisOptions, AxisOptions],
      options: Options[AxisOptions, AxisOptions],
      responsiveOptions: ResponsiveOptions[Options[AxisOptions, AxisOptions]]
    ) = this()
    
    /* protected */ val container: Element = js.native
    
    def createChart(options: Options[AxisOptions, AxisOptions]): Unit = js.native
    
    /* protected */ var data: Data[AllSeriesTypes] = js.native
    
    /* private */ val defaultOptions: Any = js.native
    
    /**
      * This method can be called on the API object of each chart and will un-register all event listeners that were added to other components. This currently includes a window.resize listener as well as media query listeners if any responsive options have been provided. Use this function if you need to destroy and recreate Chartist charts dynamically.
      */
    def detach(): this.type = js.native
    
    /* protected */ val eventEmitter: EventEmitter = js.native
    
    def initialize(): Unit = js.native
    
    /* private */ var initializeTimeoutId: Any = js.native
    
    def off(event: String): this.type = js.native
    def off(event: String, listener: EventListener[Any]): this.type = js.native
    def off(event: Asterisk): this.type = js.native
    def off(event: Asterisk, listener: AllEventsListener[Any]): this.type = js.native
    /**
      * Use this function to un-register event handlers. If the handler function parameter is omitted all handlers for the given event will be un-registered.
      * @param event Name of the event for which a handler should be removed
      * @param listener The handler function that that was previously used to register a new event handler. This handler will be removed from the event handler list. If this parameter is omitted then all event handlers for the given event are removed from the list.
      */
    def off[T /* <: /* keyof TEventsTypes */ String */](event: T): this.type = js.native
    def off[T /* <: /* keyof TEventsTypes */ String */](
      event: T,
      listener: EventListener[
          /* import warning: importer.ImportType#apply Failed type conversion: TEventsTypes[T] */ js.Any
        ]
    ): this.type = js.native
    
    def on(event: String, listener: EventListener[Any]): this.type = js.native
    def on(event: Asterisk, listener: AllEventsListener[Any]): this.type = js.native
    /**
      * Use this function to register event handlers. The handler callbacks are synchronous and will run in the main thread rather than the event loop.
      * @param event Name of the event. Check the examples for supported events.
      * @param listener The handler function that will be called when an event with the given name was emitted. This function will receive a data argument which contains event data. See the example for more details.
      */
    def on[T /* <: /* keyof TEventsTypes */ String */](
      event: T,
      listener: EventListener[
          /* import warning: importer.ImportType#apply Failed type conversion: TEventsTypes[T] */ js.Any
        ]
    ): this.type = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var optionsProvider: Any = js.native
    
    /* private */ val resizeListener: Any = js.native
    
    /* private */ val responsiveOptions: Any = js.native
    
    /* protected */ var svg: js.UndefOr[Svg] = js.native
    
    /**
      * Updates the chart which currently does a full reconstruction of the SVG DOM
      * @param data Optional data you'd like to set for the chart before it will update. If not specified the update method will use the data that is already configured with the chart.
      * @param options Optional options you'd like to add to the previous options for the chart before it will update. If not specified the update method will use the options that have been already configured with the chart.
      * @param override If set to true, the passed options will be used to extend the options that have been configured already. Otherwise the chart default options will be used as the base
      */
    def update(): this.type = js.native
    def update(data: Unit, options: Unit, `override`: Boolean): this.type = js.native
    def update(data: Unit, options: Options[AxisOptions, AxisOptions]): this.type = js.native
    def update(data: Unit, options: Options[AxisOptions, AxisOptions], `override`: Boolean): this.type = js.native
    def update(data: Data[AllSeriesTypes]): this.type = js.native
    def update(data: Data[AllSeriesTypes], options: Unit, `override`: Boolean): this.type = js.native
    def update(data: Data[AllSeriesTypes], options: Options[AxisOptions, AxisOptions]): this.type = js.native
    def update(data: Data[AllSeriesTypes], options: Options[AxisOptions, AxisOptions], `override`: Boolean): this.type = js.native
  }
}

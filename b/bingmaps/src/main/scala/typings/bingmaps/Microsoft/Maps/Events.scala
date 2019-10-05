package typings.bingmaps.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.Directions.DirectionsManager
import typings.bingmaps.Microsoft.Maps.Directions.IDirectionsErrorEventArgs
import typings.bingmaps.Microsoft.Maps.Directions.IDirectionsEventArgs
import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A static class that manages events within the map SDK. */
@JSGlobal("Microsoft.Maps.Events")
@js.native
object Events extends js.Object {
  def addHandler(target: js.Any, eventName: String, handler: js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit]): IHandlerId = js.native
  def addHandler(
    target: DirectionsManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IDirectionsEventArgs | IDirectionsErrorEventArgs], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: DrawingManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | DrawingMode], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: DrawingTools,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | IDrawingModeChangedData], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: EntityCollection,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IEntityCollectionChangedEventArgs], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: GeoXmlLayer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: Infobox,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IInfoboxEventArgs], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: Layer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: Map,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IMapTypeChangeEventArgs], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: Polygon,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: Polyline,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: Pushpin,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): IHandlerId = js.native
  def addOne(target: js.Any, eventName: String, handler: js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def addOne(
    target: DirectionsManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IDirectionsEventArgs | IDirectionsErrorEventArgs], Unit]
  ): Unit = js.native
  def addOne(
    target: DrawingManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | DrawingMode], Unit]
  ): Unit = js.native
  def addOne(
    target: DrawingTools,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | IDrawingModeChangedData], Unit]
  ): Unit = js.native
  def addOne(
    target: EntityCollection,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IEntityCollectionChangedEventArgs], Unit]
  ): Unit = js.native
  def addOne(
    target: GeoXmlLayer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): Unit = js.native
  def addOne(
    target: Infobox,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IInfoboxEventArgs], Unit]
  ): Unit = js.native
  def addOne(
    target: Layer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): Unit = js.native
  def addOne(
    target: Map,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IMapTypeChangeEventArgs], Unit]
  ): Unit = js.native
  def addOne(
    target: Polygon,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): Unit = js.native
  def addOne(
    target: Polyline,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): Unit = js.native
  def addOne(
    target: Pushpin,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): Unit = js.native
  def addThrottledHandler(
    target: js.Any,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[js.Any], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: DirectionsManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IDirectionsEventArgs | IDirectionsErrorEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: DrawingManager,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | DrawingMode], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: DrawingTools,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | IDrawingModeChangedData], Unit]
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: EntityCollection,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IEntityCollectionChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: GeoXmlLayer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: Infobox,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IInfoboxEventArgs], Unit]
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: Layer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: Map,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IMapTypeChangeEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: Polygon,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: Polyline,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: Pushpin,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  def hasHandler(target: js.Any, eventName: String): Boolean = js.native
  def invoke(target: js.Any, evenName: String, args: js.Any): Unit = js.native
  def removeHandler(handlerId: IHandlerId): Unit = js.native
}


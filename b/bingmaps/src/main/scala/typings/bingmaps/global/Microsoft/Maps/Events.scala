package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.Directions.DirectionsManager
import typings.bingmaps.Microsoft.Maps.Directions.IDirectionsErrorEventArgs
import typings.bingmaps.Microsoft.Maps.Directions.IDirectionsEventArgs
import typings.bingmaps.Microsoft.Maps.DrawingManager
import typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode
import typings.bingmaps.Microsoft.Maps.IDrawingModeChangedData
import typings.bingmaps.Microsoft.Maps.IEntityCollectionChangedEventArgs
import typings.bingmaps.Microsoft.Maps.IHandlerId
import typings.bingmaps.Microsoft.Maps.IInfoboxEventArgs
import typings.bingmaps.Microsoft.Maps.IMapTypeChangeEventArgs
import typings.bingmaps.Microsoft.Maps.IMouseEventArgs
import typings.bingmaps.Microsoft.Maps.IPrimitive
import typings.bingmaps.Microsoft.Maps.IPrimitiveChangedEventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    target: typings.bingmaps.Microsoft.Maps.DrawingTools,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | IDrawingModeChangedData], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: typings.bingmaps.Microsoft.Maps.EntityCollection,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IEntityCollectionChangedEventArgs], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: typings.bingmaps.Microsoft.Maps.GeoXmlLayer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: typings.bingmaps.Microsoft.Maps.Infobox,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IInfoboxEventArgs], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: typings.bingmaps.Microsoft.Maps.Layer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: typings.bingmaps.Microsoft.Maps.Map,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IMapTypeChangeEventArgs], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: typings.bingmaps.Microsoft.Maps.Polygon,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: typings.bingmaps.Microsoft.Maps.Polyline,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): IHandlerId = js.native
  def addHandler(
    target: typings.bingmaps.Microsoft.Maps.Pushpin,
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
    target: typings.bingmaps.Microsoft.Maps.DrawingTools,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | IDrawingModeChangedData], Unit]
  ): Unit = js.native
  def addOne(
    target: typings.bingmaps.Microsoft.Maps.EntityCollection,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IEntityCollectionChangedEventArgs], Unit]
  ): Unit = js.native
  def addOne(
    target: typings.bingmaps.Microsoft.Maps.GeoXmlLayer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): Unit = js.native
  def addOne(
    target: typings.bingmaps.Microsoft.Maps.Infobox,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IInfoboxEventArgs], Unit]
  ): Unit = js.native
  def addOne(
    target: typings.bingmaps.Microsoft.Maps.Layer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): Unit = js.native
  def addOne(
    target: typings.bingmaps.Microsoft.Maps.Map,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IMapTypeChangeEventArgs], Unit]
  ): Unit = js.native
  def addOne(
    target: typings.bingmaps.Microsoft.Maps.Polygon,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): Unit = js.native
  def addOne(
    target: typings.bingmaps.Microsoft.Maps.Polyline,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit]
  ): Unit = js.native
  def addOne(
    target: typings.bingmaps.Microsoft.Maps.Pushpin,
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
    target: typings.bingmaps.Microsoft.Maps.DrawingTools,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IPrimitive | IDrawingModeChangedData], Unit]
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: typings.bingmaps.Microsoft.Maps.EntityCollection,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IEntityCollectionChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: typings.bingmaps.Microsoft.Maps.GeoXmlLayer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit]
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: typings.bingmaps.Microsoft.Maps.Infobox,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IInfoboxEventArgs], Unit]
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: typings.bingmaps.Microsoft.Maps.Layer,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: typings.bingmaps.Microsoft.Maps.Map,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IMapTypeChangeEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: typings.bingmaps.Microsoft.Maps.Polygon,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: typings.bingmaps.Microsoft.Maps.Polyline,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  def addThrottledHandler(
    target: typings.bingmaps.Microsoft.Maps.Pushpin,
    eventName: String,
    handler: js.Function1[/* eventArg */ js.UndefOr[IMouseEventArgs | IPrimitiveChangedEventArgs], Unit],
    throttleInterval: Double
  ): IHandlerId = js.native
  
  def hasHandler(target: js.Any, eventName: String): Boolean = js.native
  
  def invoke(target: js.Any, evenName: String, args: js.Any): Unit = js.native
  
  def removeHandler(handlerId: IHandlerId): Unit = js.native
}

package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A static class that manages events within the map SDK. */
@JSGlobal("Microsoft.Maps.Events")
@js.native
object EventsNs extends js.Object {
  def addHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.DirectionsManager,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.IDirectionsEventArgs | bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.IDirectionsErrorEventArgs
      ], 
      scala.Unit
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.DrawingManager,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingMode
      ], 
      scala.Unit
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.DrawingTools,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | bingmapsLib.MicrosoftNs.MapsNs.IDrawingModeChangedData
      ], 
      scala.Unit
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.EntityCollection,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IEntityCollectionChangedEventArgs], 
      scala.Unit
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.GeoXmlLayer,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs], 
      scala.Unit
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.Infobox,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IInfoboxEventArgs], 
      scala.Unit
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.Layer,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs], 
      scala.Unit
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.Map,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs | bingmapsLib.MicrosoftNs.MapsNs.IMapTypeChangeEventArgs
      ], 
      scala.Unit
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.Polygon,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs | bingmapsLib.MicrosoftNs.MapsNs.IPrimitiveChangedEventArgs
      ], 
      scala.Unit
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.Polyline,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs | bingmapsLib.MicrosoftNs.MapsNs.IPrimitiveChangedEventArgs
      ], 
      scala.Unit
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.Pushpin,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs | bingmapsLib.MicrosoftNs.MapsNs.IPrimitiveChangedEventArgs
      ], 
      scala.Unit
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addHandler(
    target: js.Any,
    eventName: java.lang.String,
    handler: js.Function1[/* eventArg */ js.UndefOr[js.Any], scala.Unit]
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addOne(
    target: bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.DirectionsManager,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.IDirectionsEventArgs | bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.IDirectionsErrorEventArgs
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addOne(
    target: bingmapsLib.MicrosoftNs.MapsNs.DrawingManager,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingMode
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addOne(
    target: bingmapsLib.MicrosoftNs.MapsNs.DrawingTools,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | bingmapsLib.MicrosoftNs.MapsNs.IDrawingModeChangedData
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addOne(
    target: bingmapsLib.MicrosoftNs.MapsNs.EntityCollection,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IEntityCollectionChangedEventArgs], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addOne(
    target: bingmapsLib.MicrosoftNs.MapsNs.GeoXmlLayer,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addOne(
    target: bingmapsLib.MicrosoftNs.MapsNs.Infobox,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IInfoboxEventArgs], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addOne(
    target: bingmapsLib.MicrosoftNs.MapsNs.Layer,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addOne(
    target: bingmapsLib.MicrosoftNs.MapsNs.Map,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs | bingmapsLib.MicrosoftNs.MapsNs.IMapTypeChangeEventArgs
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addOne(
    target: bingmapsLib.MicrosoftNs.MapsNs.Polygon,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs | bingmapsLib.MicrosoftNs.MapsNs.IPrimitiveChangedEventArgs
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addOne(
    target: bingmapsLib.MicrosoftNs.MapsNs.Polyline,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs | bingmapsLib.MicrosoftNs.MapsNs.IPrimitiveChangedEventArgs
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addOne(
    target: bingmapsLib.MicrosoftNs.MapsNs.Pushpin,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs | bingmapsLib.MicrosoftNs.MapsNs.IPrimitiveChangedEventArgs
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addOne(
    target: js.Any,
    eventName: java.lang.String,
    handler: js.Function1[/* eventArg */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def addThrottledHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.DirectionsManager,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.IDirectionsEventArgs | bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs.IDirectionsErrorEventArgs
      ], 
      scala.Unit
    ],
    throttleInterval: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addThrottledHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.DrawingManager,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | bingmapsLib.MicrosoftNs.MapsNs.DrawingToolsNs.DrawingMode
      ], 
      scala.Unit
    ],
    throttleInterval: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addThrottledHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.DrawingTools,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IPrimitive | bingmapsLib.MicrosoftNs.MapsNs.IDrawingModeChangedData
      ], 
      scala.Unit
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addThrottledHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.EntityCollection,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IEntityCollectionChangedEventArgs], 
      scala.Unit
    ],
    throttleInterval: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addThrottledHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.GeoXmlLayer,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs], 
      scala.Unit
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addThrottledHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.Infobox,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IInfoboxEventArgs], 
      scala.Unit
    ]
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addThrottledHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.Layer,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs], 
      scala.Unit
    ],
    throttleInterval: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addThrottledHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.Map,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs | bingmapsLib.MicrosoftNs.MapsNs.IMapTypeChangeEventArgs
      ], 
      scala.Unit
    ],
    throttleInterval: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addThrottledHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.Polygon,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs | bingmapsLib.MicrosoftNs.MapsNs.IPrimitiveChangedEventArgs
      ], 
      scala.Unit
    ],
    throttleInterval: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addThrottledHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.Polyline,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs | bingmapsLib.MicrosoftNs.MapsNs.IPrimitiveChangedEventArgs
      ], 
      scala.Unit
    ],
    throttleInterval: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addThrottledHandler(
    target: bingmapsLib.MicrosoftNs.MapsNs.Pushpin,
    eventName: java.lang.String,
    handler: js.Function1[
      /* eventArg */ js.UndefOr[
        bingmapsLib.MicrosoftNs.MapsNs.IMouseEventArgs | bingmapsLib.MicrosoftNs.MapsNs.IPrimitiveChangedEventArgs
      ], 
      scala.Unit
    ],
    throttleInterval: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def addThrottledHandler(
    target: js.Any,
    eventName: java.lang.String,
    handler: js.Function1[/* eventArg */ js.UndefOr[js.Any], scala.Unit],
    throttleInterval: scala.Double
  ): bingmapsLib.MicrosoftNs.MapsNs.IHandlerId = js.native
  def hasHandler(target: js.Any, eventName: java.lang.String): scala.Boolean = js.native
  def invoke(target: js.Any, evenName: java.lang.String, args: js.Any): scala.Unit = js.native
  def removeHandler(handlerId: bingmapsLib.MicrosoftNs.MapsNs.IHandlerId): scala.Unit = js.native
}


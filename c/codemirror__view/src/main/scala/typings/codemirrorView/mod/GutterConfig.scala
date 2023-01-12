package typings.codemirrorView.mod

import typings.codemirrorState.mod.RangeSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GutterConfig extends StObject {
  
  /**
    An extra CSS class to be added to the wrapper (`cm-gutter`)
    element.
    */
  var `class`: js.UndefOr[String] = js.undefined
  
  /**
    Supply event handlers for DOM events on this gutter.
    */
  var domEventHandlers: js.UndefOr[Handlers] = js.undefined
  
  /**
    Add a hidden spacer element that gives the gutter its base
    width.
    */
  var initialSpacer: js.UndefOr[Null | (js.Function1[/* view */ EditorView, GutterMarker])] = js.undefined
  
  /**
    Can be used to optionally add a single marker to every line.
    */
  var lineMarker: js.UndefOr[
    js.Function3[
      /* view */ EditorView, 
      /* line */ BlockInfo, 
      /* otherMarkers */ js.Array[GutterMarker], 
      GutterMarker | Null
    ]
  ] = js.undefined
  
  /**
    If line markers depend on additional state, and should be
    updated when that changes, pass a predicate here that checks
    whether a given view update might change the line markers.
    */
  var lineMarkerChange: js.UndefOr[Null | (js.Function1[/* update */ ViewUpdate, Boolean])] = js.undefined
  
  /**
    Retrieve a set of markers to use in this gutter.
    */
  var markers: js.UndefOr[
    js.Function1[/* view */ EditorView, RangeSet[GutterMarker] | js.Array[RangeSet[GutterMarker]]]
  ] = js.undefined
  
  /**
    Controls whether empty gutter elements should be rendered.
    Defaults to false.
    */
  var renderEmptyElements: js.UndefOr[Boolean] = js.undefined
  
  /**
    Update the spacer element when the view is updated.
    */
  var updateSpacer: js.UndefOr[
    Null | (js.Function2[/* spacer */ GutterMarker, /* update */ ViewUpdate, GutterMarker])
  ] = js.undefined
}
object GutterConfig {
  
  inline def apply(): GutterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GutterConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GutterConfig] (val x: Self) extends AnyVal {
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setDomEventHandlers(value: Handlers): Self = StObject.set(x, "domEventHandlers", value.asInstanceOf[js.Any])
    
    inline def setDomEventHandlersUndefined: Self = StObject.set(x, "domEventHandlers", js.undefined)
    
    inline def setInitialSpacer(value: /* view */ EditorView => GutterMarker): Self = StObject.set(x, "initialSpacer", js.Any.fromFunction1(value))
    
    inline def setInitialSpacerNull: Self = StObject.set(x, "initialSpacer", null)
    
    inline def setInitialSpacerUndefined: Self = StObject.set(x, "initialSpacer", js.undefined)
    
    inline def setLineMarker(
      value: (/* view */ EditorView, /* line */ BlockInfo, /* otherMarkers */ js.Array[GutterMarker]) => GutterMarker | Null
    ): Self = StObject.set(x, "lineMarker", js.Any.fromFunction3(value))
    
    inline def setLineMarkerChange(value: /* update */ ViewUpdate => Boolean): Self = StObject.set(x, "lineMarkerChange", js.Any.fromFunction1(value))
    
    inline def setLineMarkerChangeNull: Self = StObject.set(x, "lineMarkerChange", null)
    
    inline def setLineMarkerChangeUndefined: Self = StObject.set(x, "lineMarkerChange", js.undefined)
    
    inline def setLineMarkerUndefined: Self = StObject.set(x, "lineMarker", js.undefined)
    
    inline def setMarkers(value: /* view */ EditorView => RangeSet[GutterMarker] | js.Array[RangeSet[GutterMarker]]): Self = StObject.set(x, "markers", js.Any.fromFunction1(value))
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setRenderEmptyElements(value: Boolean): Self = StObject.set(x, "renderEmptyElements", value.asInstanceOf[js.Any])
    
    inline def setRenderEmptyElementsUndefined: Self = StObject.set(x, "renderEmptyElements", js.undefined)
    
    inline def setUpdateSpacer(value: (/* spacer */ GutterMarker, /* update */ ViewUpdate) => GutterMarker): Self = StObject.set(x, "updateSpacer", js.Any.fromFunction2(value))
    
    inline def setUpdateSpacerNull: Self = StObject.set(x, "updateSpacer", null)
    
    inline def setUpdateSpacerUndefined: Self = StObject.set(x, "updateSpacer", js.undefined)
  }
}

package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxPromise
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxMap
  extends StObject
     with Widget[dxMapOptions] {
  
  def addMarker(markerOptions: js.Array[Any]): DxPromise[Any] = js.native
  /**
    * Adds a marker to the map.
    */
  def addMarker(markerOptions: Any): DxPromise[Any] = js.native
  
  def addRoute(options: js.Array[Any]): DxPromise[Any] = js.native
  /**
    * Adds a route to the map.
    */
  def addRoute(options: Any): DxPromise[Any] = js.native
  
  def removeMarker(marker: js.Array[Any]): DxPromise[Unit] = js.native
  /**
    * Removes a marker from the map.
    */
  def removeMarker(marker: Any): DxPromise[Unit] = js.native
  def removeMarker(marker: Double): DxPromise[Unit] = js.native
  
  def removeRoute(route: js.Array[Any]): DxPromise[Unit] = js.native
  /**
    * Removes a route from the map.
    */
  def removeRoute(route: Any): DxPromise[Unit] = js.native
  def removeRoute(route: Double): DxPromise[Unit] = js.native
}
object dxMap {
  
  type ClickEvent = NativeEventInfo[dxMap, MouseEvent | PointerEvent]
  
  type DisposingEvent = EventInfo[dxMap]
  
  type InitializedEvent = InitializedEventInfo[dxMap]
  
  trait MarkerAddedEvent
    extends StObject
       with EventInfo[dxMap] {
    
    val options: Any
    
    var originalMarker: Any
  }
  object MarkerAddedEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement], options: Any, originalMarker: Any): MarkerAddedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalMarker = originalMarker.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerAddedEvent]
    }
    
    extension [Self <: MarkerAddedEvent](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOriginalMarker(value: Any): Self = StObject.set(x, "originalMarker", value.asInstanceOf[js.Any])
    }
  }
  
  trait MarkerRemovedEvent
    extends StObject
       with EventInfo[dxMap] {
    
    val options: js.UndefOr[Any] = js.undefined
  }
  object MarkerRemovedEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement]): MarkerRemovedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerRemovedEvent]
    }
    
    extension [Self <: MarkerRemovedEvent](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxMap]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxMapOptions
  
  trait ReadyEvent
    extends StObject
       with EventInfo[dxMap] {
    
    var originalMap: Any
  }
  object ReadyEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement], originalMap: Any): ReadyEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], originalMap = originalMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadyEvent]
    }
    
    extension [Self <: ReadyEvent](x: Self) {
      
      inline def setOriginalMap(value: Any): Self = StObject.set(x, "originalMap", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteAddedEvent
    extends StObject
       with EventInfo[dxMap] {
    
    val options: Any
    
    var originalRoute: Any
  }
  object RouteAddedEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement], options: Any, originalRoute: Any): RouteAddedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalRoute = originalRoute.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteAddedEvent]
    }
    
    extension [Self <: RouteAddedEvent](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOriginalRoute(value: Any): Self = StObject.set(x, "originalRoute", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteRemovedEvent
    extends StObject
       with EventInfo[dxMap] {
    
    val options: js.UndefOr[Any] = js.undefined
  }
  object RouteRemovedEvent {
    
    inline def apply(component: dxMap, element: DxElement_[HTMLElement]): RouteRemovedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteRemovedEvent]
    }
    
    extension [Self <: RouteRemovedEvent](x: Self) {
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}

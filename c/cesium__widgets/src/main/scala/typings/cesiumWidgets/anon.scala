package typings.cesiumWidgets

import typings.cesiumEngine.mod.Cartesian3
import typings.cesiumEngine.mod.GeocoderService
import typings.cesiumEngine.mod.HeadingPitchRange
import typings.cesiumEngine.mod.ImageryProvider
import typings.cesiumEngine.mod.Proxy
import typings.cesiumEngine.mod.Rectangle
import typings.cesiumEngine.mod.TerrainProvider
import typings.cesiumWidgets.mod.Command
import typings.cesiumWidgets.mod.Geocoder.DestinationFoundFunction
import typings.cesiumWidgets.mod.GeocoderViewModel
import typings.cesiumWidgets.mod.ProviderViewModel
import typings.cesiumWidgets.mod.ProviderViewModel.CreationFunction
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var lowFrameRateMessage: js.UndefOr[String] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setLowFrameRateMessage(value: String): Self = StObject.set(x, "lowFrameRateMessage", value.asInstanceOf[js.Any])
      
      inline def setLowFrameRateMessageUndefined: Self = StObject.set(x, "lowFrameRateMessage", js.undefined)
    }
  }
  
  trait AutoComplete extends StObject {
    
    var autoComplete: js.UndefOr[Boolean] = js.undefined
    
    var container: Element | String
    
    var destinationFound: js.UndefOr[DestinationFoundFunction] = js.undefined
    
    var flightDuration: js.UndefOr[Double] = js.undefined
    
    var geocoderServices: js.UndefOr[js.Array[GeocoderService]] = js.undefined
    
    var scene: typings.cesiumEngine.mod.Scene
  }
  object AutoComplete {
    
    inline def apply(container: Element | String, scene: typings.cesiumEngine.mod.Scene): AutoComplete = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoComplete]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoComplete] (val x: Self) extends AnyVal {
      
      inline def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setContainer(value: Element | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setDestinationFound(value: (/* viewModel */ GeocoderViewModel, /* destination */ Cartesian3 | Rectangle) => Unit): Self = StObject.set(x, "destinationFound", js.Any.fromFunction2(value))
      
      inline def setDestinationFoundUndefined: Self = StObject.set(x, "destinationFound", js.undefined)
      
      inline def setFlightDuration(value: Double): Self = StObject.set(x, "flightDuration", value.asInstanceOf[js.Any])
      
      inline def setFlightDurationUndefined: Self = StObject.set(x, "flightDuration", js.undefined)
      
      inline def setGeocoderServices(value: js.Array[GeocoderService]): Self = StObject.set(x, "geocoderServices", value.asInstanceOf[js.Any])
      
      inline def setGeocoderServicesUndefined: Self = StObject.set(x, "geocoderServices", js.undefined)
      
      inline def setGeocoderServicesVarargs(value: GeocoderService*): Self = StObject.set(x, "geocoderServices", js.Array(value*))
      
      inline def setScene(value: typings.cesiumEngine.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    }
  }
  
  trait Category extends StObject {
    
    var category: js.UndefOr[String] = js.undefined
    
    var creationFunction: CreationFunction | Command
    
    var iconUrl: String
    
    var name: String
    
    var tooltip: String
  }
  object Category {
    
    inline def apply(creationFunction: CreationFunction | Command, iconUrl: String, name: String, tooltip: String): Category = {
      val __obj = js.Dynamic.literal(creationFunction = creationFunction.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setCreationFunction(value: CreationFunction | Command): Self = StObject.set(x, "creationFunction", value.asInstanceOf[js.Any])
      
      inline def setCreationFunctionFunction0(
        value: () => ImageryProvider | TerrainProvider | (js.Array[ImageryProvider | TerrainProvider]) | (js.Promise[js.Array[TerrainProvider] | TerrainProvider])
      ): Self = StObject.set(x, "creationFunction", js.Any.fromFunction0(value))
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClampToGround extends StObject {
    
    var clampToGround: js.UndefOr[Boolean] = js.undefined
    
    var clearOnDrop: js.UndefOr[Boolean] = js.undefined
    
    var dropTarget: js.UndefOr[Element | String] = js.undefined
    
    var flyToOnDrop: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[Proxy] = js.undefined
  }
  object ClampToGround {
    
    inline def apply(): ClampToGround = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClampToGround]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClampToGround] (val x: Self) extends AnyVal {
      
      inline def setClampToGround(value: Boolean): Self = StObject.set(x, "clampToGround", value.asInstanceOf[js.Any])
      
      inline def setClampToGroundUndefined: Self = StObject.set(x, "clampToGround", js.undefined)
      
      inline def setClearOnDrop(value: Boolean): Self = StObject.set(x, "clearOnDrop", value.asInstanceOf[js.Any])
      
      inline def setClearOnDropUndefined: Self = StObject.set(x, "clearOnDrop", js.undefined)
      
      inline def setDropTarget(value: Element | String): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
      
      inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
      
      inline def setFlyToOnDrop(value: Boolean): Self = StObject.set(x, "flyToOnDrop", value.asInstanceOf[js.Any])
      
      inline def setFlyToOnDropUndefined: Self = StObject.set(x, "flyToOnDrop", js.undefined)
      
      inline def setProxy(value: Proxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  trait Container extends StObject {
    
    var container: Element | String
    
    var instructionsInitiallyVisible: js.UndefOr[Boolean] = js.undefined
  }
  object Container {
    
    inline def apply(container: Element | String): Container = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[Container]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: Element | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setInstructionsInitiallyVisible(value: Boolean): Self = StObject.set(x, "instructionsInitiallyVisible", value.asInstanceOf[js.Any])
      
      inline def setInstructionsInitiallyVisibleUndefined: Self = StObject.set(x, "instructionsInitiallyVisible", js.undefined)
    }
  }
  
  trait DestinationFound extends StObject {
    
    var destinationFound: js.UndefOr[DestinationFoundFunction] = js.undefined
    
    var flightDuration: js.UndefOr[Double] = js.undefined
    
    var geocoderServices: js.UndefOr[js.Array[GeocoderService]] = js.undefined
    
    var scene: typings.cesiumEngine.mod.Scene
  }
  object DestinationFound {
    
    inline def apply(scene: typings.cesiumEngine.mod.Scene): DestinationFound = {
      val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
      __obj.asInstanceOf[DestinationFound]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestinationFound] (val x: Self) extends AnyVal {
      
      inline def setDestinationFound(value: (/* viewModel */ GeocoderViewModel, /* destination */ Cartesian3 | Rectangle) => Unit): Self = StObject.set(x, "destinationFound", js.Any.fromFunction2(value))
      
      inline def setDestinationFoundUndefined: Self = StObject.set(x, "destinationFound", js.undefined)
      
      inline def setFlightDuration(value: Double): Self = StObject.set(x, "flightDuration", value.asInstanceOf[js.Any])
      
      inline def setFlightDurationUndefined: Self = StObject.set(x, "flightDuration", js.undefined)
      
      inline def setGeocoderServices(value: js.Array[GeocoderService]): Self = StObject.set(x, "geocoderServices", value.asInstanceOf[js.Any])
      
      inline def setGeocoderServicesUndefined: Self = StObject.set(x, "geocoderServices", js.undefined)
      
      inline def setGeocoderServicesVarargs(value: GeocoderService*): Self = StObject.set(x, "geocoderServices", js.Array(value*))
      
      inline def setScene(value: typings.cesiumEngine.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    }
  }
  
  trait Duration extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var maximumHeight: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[HeadingPitchRange] = js.undefined
  }
  object Duration {
    
    inline def apply(): Duration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Duration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setMaximumHeight(value: Double): Self = StObject.set(x, "maximumHeight", value.asInstanceOf[js.Any])
      
      inline def setMaximumHeightUndefined: Self = StObject.set(x, "maximumHeight", js.undefined)
      
      inline def setOffset(value: HeadingPitchRange): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait Globe extends StObject {
    
    var globe: typings.cesiumEngine.mod.Globe
    
    var imageryProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.undefined
    
    var selectedImageryProviderViewModel: js.UndefOr[ProviderViewModel] = js.undefined
    
    var selectedTerrainProviderViewModel: js.UndefOr[ProviderViewModel] = js.undefined
    
    var terrainProviderViewModels: js.UndefOr[js.Array[ProviderViewModel]] = js.undefined
  }
  object Globe {
    
    inline def apply(globe: typings.cesiumEngine.mod.Globe): Globe = {
      val __obj = js.Dynamic.literal(globe = globe.asInstanceOf[js.Any])
      __obj.asInstanceOf[Globe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Globe] (val x: Self) extends AnyVal {
      
      inline def setGlobe(value: typings.cesiumEngine.mod.Globe): Self = StObject.set(x, "globe", value.asInstanceOf[js.Any])
      
      inline def setImageryProviderViewModels(value: js.Array[ProviderViewModel]): Self = StObject.set(x, "imageryProviderViewModels", value.asInstanceOf[js.Any])
      
      inline def setImageryProviderViewModelsUndefined: Self = StObject.set(x, "imageryProviderViewModels", js.undefined)
      
      inline def setImageryProviderViewModelsVarargs(value: ProviderViewModel*): Self = StObject.set(x, "imageryProviderViewModels", js.Array(value*))
      
      inline def setSelectedImageryProviderViewModel(value: ProviderViewModel): Self = StObject.set(x, "selectedImageryProviderViewModel", value.asInstanceOf[js.Any])
      
      inline def setSelectedImageryProviderViewModelUndefined: Self = StObject.set(x, "selectedImageryProviderViewModel", js.undefined)
      
      inline def setSelectedTerrainProviderViewModel(value: ProviderViewModel): Self = StObject.set(x, "selectedTerrainProviderViewModel", value.asInstanceOf[js.Any])
      
      inline def setSelectedTerrainProviderViewModelUndefined: Self = StObject.set(x, "selectedTerrainProviderViewModel", js.undefined)
      
      inline def setTerrainProviderViewModels(value: js.Array[ProviderViewModel]): Self = StObject.set(x, "terrainProviderViewModels", value.asInstanceOf[js.Any])
      
      inline def setTerrainProviderViewModelsUndefined: Self = StObject.set(x, "terrainProviderViewModels", js.undefined)
      
      inline def setTerrainProviderViewModelsVarargs(value: ProviderViewModel*): Self = StObject.set(x, "terrainProviderViewModels", js.Array(value*))
    }
  }
  
  trait LowFrameRateMessage extends StObject {
    
    var container: Element | String
    
    var lowFrameRateMessage: js.UndefOr[String] = js.undefined
    
    var scene: typings.cesiumEngine.mod.Scene
  }
  object LowFrameRateMessage {
    
    inline def apply(container: Element | String, scene: typings.cesiumEngine.mod.Scene): LowFrameRateMessage = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
      __obj.asInstanceOf[LowFrameRateMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LowFrameRateMessage] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: Element | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setLowFrameRateMessage(value: String): Self = StObject.set(x, "lowFrameRateMessage", value.asInstanceOf[js.Any])
      
      inline def setLowFrameRateMessageUndefined: Self = StObject.set(x, "lowFrameRateMessage", js.undefined)
      
      inline def setScene(value: typings.cesiumEngine.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scene extends StObject {
    
    var lowFrameRateMessage: js.UndefOr[String] = js.undefined
    
    var scene: typings.cesiumEngine.mod.Scene
  }
  object Scene {
    
    inline def apply(scene: typings.cesiumEngine.mod.Scene): Scene = {
      val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scene]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scene] (val x: Self) extends AnyVal {
      
      inline def setLowFrameRateMessage(value: String): Self = StObject.set(x, "lowFrameRateMessage", value.asInstanceOf[js.Any])
      
      inline def setLowFrameRateMessageUndefined: Self = StObject.set(x, "lowFrameRateMessage", js.undefined)
      
      inline def setScene(value: typings.cesiumEngine.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    }
  }
  
  trait Toggled extends StObject {
    
    var toggled: js.UndefOr[Boolean] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object Toggled {
    
    inline def apply(): Toggled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Toggled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Toggled] (val x: Self) extends AnyVal {
      
      inline def setToggled(value: Boolean): Self = StObject.set(x, "toggled", value.asInstanceOf[js.Any])
      
      inline def setToggledUndefined: Self = StObject.set(x, "toggled", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}

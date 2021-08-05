package typings.bmapgl

import org.scalablytyped.runtime.StringDictionary
import typings.bmapgl.anon.Coordinates
import typings.bmapgl.bmapglStrings.blank
import typings.bmapgl.bmapglStrings.bmap
import typings.bmapgl.bmapglStrings.cesium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapVGL {
  
  trait Effects extends StObject
  
  trait GeoJSON
    extends StObject
       with /* x */ StringDictionary[js.Any] {
    
    var geometry: Coordinates
    
    var properties: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object GeoJSON {
    
    inline def apply(geometry: Coordinates): GeoJSON = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoJSON]
    }
    
    extension [Self <: GeoJSON](x: Self) {
      
      inline def setGeometry(value: Coordinates): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    }
  }
  
  trait Layer extends StObject {
    
    def destroy(): Unit
    
    def getData(): js.Array[GeoJSON]
    
    def getDefaultOptions(): LayerOptions
    
    def getOptions(): LayerOptions
    
    def setData(x: js.Array[GeoJSON]): Unit
    
    def setOptions(x: LayerOptions): Unit
  }
  object Layer {
    
    inline def apply(
      destroy: () => Unit,
      getData: () => js.Array[GeoJSON],
      getDefaultOptions: () => LayerOptions,
      getOptions: () => LayerOptions,
      setData: js.Array[GeoJSON] => Unit,
      setOptions: LayerOptions => Unit
    ): Layer = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getData = js.Any.fromFunction0(getData), getDefaultOptions = js.Any.fromFunction0(getDefaultOptions), getOptions = js.Any.fromFunction0(getOptions), setData = js.Any.fromFunction1(setData), setOptions = js.Any.fromFunction1(setOptions))
      __obj.asInstanceOf[Layer]
    }
    
    extension [Self <: Layer](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetData(value: () => js.Array[GeoJSON]): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      inline def setGetDefaultOptions(value: () => LayerOptions): Self = StObject.set(x, "getDefaultOptions", js.Any.fromFunction0(value))
      
      inline def setGetOptions(value: () => LayerOptions): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
      
      inline def setSetData(value: js.Array[GeoJSON] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
      
      inline def setSetOptions(value: LayerOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    }
  }
  
  trait LayerOptions
    extends StObject
       with /* x */ StringDictionary[js.Any] {
    
    var data: js.UndefOr[js.Array[GeoJSON]] = js.undefined
    
    var repeat: js.UndefOr[Boolean] = js.undefined
  }
  object LayerOptions {
    
    inline def apply(): LayerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerOptions]
    }
    
    extension [Self <: LayerOptions](x: Self) {
      
      inline def setData(value: js.Array[GeoJSON]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: GeoJSON*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    }
  }
  
  trait View extends StObject {
    
    def addLayer(x: Layer): Unit
    
    def destroy(): Unit
    
    def getAllLayers(x: Layer): js.Array[Layer]
    
    def getAllThreeLayers(x: Layer): js.Array[Layer]
    
    def removeLayer(x: Layer): Unit
  }
  object View {
    
    inline def apply(
      addLayer: Layer => Unit,
      destroy: () => Unit,
      getAllLayers: Layer => js.Array[Layer],
      getAllThreeLayers: Layer => js.Array[Layer],
      removeLayer: Layer => Unit
    ): View = {
      val __obj = js.Dynamic.literal(addLayer = js.Any.fromFunction1(addLayer), destroy = js.Any.fromFunction0(destroy), getAllLayers = js.Any.fromFunction1(getAllLayers), getAllThreeLayers = js.Any.fromFunction1(getAllThreeLayers), removeLayer = js.Any.fromFunction1(removeLayer))
      __obj.asInstanceOf[View]
    }
    
    extension [Self <: View](x: Self) {
      
      inline def setAddLayer(value: Layer => Unit): Self = StObject.set(x, "addLayer", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetAllLayers(value: Layer => js.Array[Layer]): Self = StObject.set(x, "getAllLayers", js.Any.fromFunction1(value))
      
      inline def setGetAllThreeLayers(value: Layer => js.Array[Layer]): Self = StObject.set(x, "getAllThreeLayers", js.Any.fromFunction1(value))
      
      inline def setRemoveLayer(value: Layer => Unit): Self = StObject.set(x, "removeLayer", js.Any.fromFunction1(value))
    }
  }
  
  trait ViewOptions extends StObject {
    
    var effects: js.UndefOr[js.Array[Effects]] = js.undefined
    
    var map: js.UndefOr[js.Object] = js.undefined
    
    var mapType: js.UndefOr[bmap | blank | cesium] = js.undefined
  }
  object ViewOptions {
    
    inline def apply(): ViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewOptions]
    }
    
    extension [Self <: ViewOptions](x: Self) {
      
      inline def setEffects(value: js.Array[Effects]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
      
      inline def setEffectsVarargs(value: Effects*): Self = StObject.set(x, "effects", js.Array(value :_*))
      
      inline def setMap(value: js.Object): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapType(value: bmap | blank | cesium): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
      
      inline def setMapTypeUndefined: Self = StObject.set(x, "mapType", js.undefined)
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
}

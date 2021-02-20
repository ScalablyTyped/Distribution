package typings.bmapgl

import org.scalablytyped.runtime.StringDictionary
import typings.bmapgl.anon.Coordinates
import typings.bmapgl.bmapglStrings.blank
import typings.bmapgl.bmapglStrings.bmap
import typings.bmapgl.bmapglStrings.cesium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapVGL {
  
  @js.native
  trait Effects extends StObject
  
  @js.native
  trait GeoJSON
    extends /* x */ StringDictionary[js.Any] {
    
    var geometry: Coordinates = js.native
    
    var properties: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object GeoJSON {
    
    @scala.inline
    def apply(geometry: Coordinates): GeoJSON = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoJSON]
    }
    
    @scala.inline
    implicit class GeoJSONMutableBuilder[Self <: GeoJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeometry(value: Coordinates): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    }
  }
  
  @js.native
  trait Layer extends StObject {
    
    def destroy(): Unit = js.native
    
    def getData(): js.Array[GeoJSON] = js.native
    
    def getDefaultOptions(): LayerOptions = js.native
    
    def getOptions(): LayerOptions = js.native
    
    def setData(x: js.Array[GeoJSON]): Unit = js.native
    
    def setOptions(x: LayerOptions): Unit = js.native
  }
  object Layer {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class LayerMutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetData(value: () => js.Array[GeoJSON]): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDefaultOptions(value: () => LayerOptions): Self = StObject.set(x, "getDefaultOptions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOptions(value: () => LayerOptions): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetData(value: js.Array[GeoJSON] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetOptions(value: LayerOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait LayerOptions
    extends /* x */ StringDictionary[js.Any] {
    
    var data: js.UndefOr[js.Array[GeoJSON]] = js.native
    
    var repeat: js.UndefOr[Boolean] = js.native
  }
  object LayerOptions {
    
    @scala.inline
    def apply(): LayerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerOptions]
    }
    
    @scala.inline
    implicit class LayerOptionsMutableBuilder[Self <: LayerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[GeoJSON]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: GeoJSON*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    }
  }
  
  @js.native
  trait View extends StObject {
    
    def addLayer(x: Layer): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getAllLayers(x: Layer): js.Array[Layer] = js.native
    
    def getAllThreeLayers(x: Layer): js.Array[Layer] = js.native
    
    def removeLayer(x: Layer): Unit = js.native
  }
  object View {
    
    @scala.inline
    def apply(
      addLayer: Layer => Unit,
      destroy: () => Unit,
      getAllLayers: Layer => js.Array[Layer],
      getAllThreeLayers: Layer => js.Array[Layer],
      removeLayer: Layer => Unit
    ): View = {
      val __obj = js.Dynamic.literal(addLayer = js.Any.fromFunction1(addLayer), destroy = js.Any.fromFunction0(destroy), getAllLayers = js.Any.fromFunction1(getAllLayers), getAllThreeLayers = js.Any.fromFunction1(getAllThreeLayers), removeLayer = js.Any.fromFunction1(removeLayer))
      __obj.asInstanceOf[View]
    }
    
    @scala.inline
    implicit class ViewMutableBuilder[Self <: View] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddLayer(value: Layer => Unit): Self = StObject.set(x, "addLayer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAllLayers(value: Layer => js.Array[Layer]): Self = StObject.set(x, "getAllLayers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAllThreeLayers(value: Layer => js.Array[Layer]): Self = StObject.set(x, "getAllThreeLayers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveLayer(value: Layer => Unit): Self = StObject.set(x, "removeLayer", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ViewOptions extends StObject {
    
    var effects: js.UndefOr[js.Array[Effects]] = js.native
    
    var map: js.UndefOr[js.Object] = js.native
    
    var mapType: js.UndefOr[bmap | blank | cesium] = js.native
  }
  object ViewOptions {
    
    @scala.inline
    def apply(): ViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewOptions]
    }
    
    @scala.inline
    implicit class ViewOptionsMutableBuilder[Self <: ViewOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEffects(value: js.Array[Effects]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
      
      @scala.inline
      def setEffectsVarargs(value: Effects*): Self = StObject.set(x, "effects", js.Array(value :_*))
      
      @scala.inline
      def setMap(value: js.Object): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapType(value: bmap | blank | cesium): Self = StObject.set(x, "mapType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapTypeUndefined: Self = StObject.set(x, "mapType", js.undefined)
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
}

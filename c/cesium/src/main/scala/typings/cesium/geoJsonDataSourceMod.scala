package typings.cesium

import typings.cesium.mod.Color
import typings.cesium.mod.GeoJsonDataSource
import typings.cesium.mod.GeoJsonDataSource.LoadOptions
import typings.cesium.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geoJsonDataSourceMod {
  
  @JSImport("cesium/Source/DataSources/GeoJsonDataSource", JSImport.Default)
  @js.native
  open class default () extends GeoJsonDataSource {
    def this(name: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/DataSources/GeoJsonDataSource", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets or sets default of whether to clamp to the ground.
      */
    @JSImport("cesium/Source/DataSources/GeoJsonDataSource", "default.clampToGround")
    @js.native
    def clampToGround: Boolean = js.native
    inline def clampToGround_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clampToGround")(x.asInstanceOf[js.Any])
    
    /**
      * Gets an object that maps the href property of a crs link to a callback function
      * which takes the crs properties object and returns a Promise that resolves
      * to a function that takes a GeoJSON coordinate and transforms it into a WGS84 Earth-fixed Cartesian.
      * Items in this object take precedence over those defined in <code>crsLinkHrefs</code>, assuming
      * the link has a type specified.
      */
    @JSImport("cesium/Source/DataSources/GeoJsonDataSource", "default.crsLinkHrefs")
    @js.native
    def crsLinkHrefs: Any = js.native
    inline def crsLinkHrefs_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crsLinkHrefs")(x.asInstanceOf[js.Any])
    
    /**
      * Gets an object that maps the type property of a crs link to a callback function
      * which takes the crs properties object and returns a Promise that resolves
      * to a function that takes a GeoJSON coordinate and transforms it into a WGS84 Earth-fixed Cartesian.
      * Items in <code>crsLinkHrefs</code> take precedence over this object.
      */
    @JSImport("cesium/Source/DataSources/GeoJsonDataSource", "default.crsLinkTypes")
    @js.native
    def crsLinkTypes: Any = js.native
    inline def crsLinkTypes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crsLinkTypes")(x.asInstanceOf[js.Any])
    
    /**
      * Gets an object that maps the name of a crs to a callback function which takes a GeoJSON coordinate
      * and transforms it into a WGS84 Earth-fixed Cartesian.  Older versions of GeoJSON which
      * supported the EPSG type can be added to this list as well, by specifying the complete EPSG name,
      * for example 'EPSG:4326'.
      */
    @JSImport("cesium/Source/DataSources/GeoJsonDataSource", "default.crsNames")
    @js.native
    def crsNames: Any = js.native
    inline def crsNames_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crsNames")(x.asInstanceOf[js.Any])
    
    /**
      * Gets or sets default color for polygon interiors.
      */
    @JSImport("cesium/Source/DataSources/GeoJsonDataSource", "default.fill")
    @js.native
    def fill: Color = js.native
    inline def fill_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    
    inline def load(data: String): js.Promise[GeoJsonDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GeoJsonDataSource]]
    inline def load(data: String, options: LoadOptions): js.Promise[GeoJsonDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoJsonDataSource]]
    inline def load(data: Any): js.Promise[GeoJsonDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GeoJsonDataSource]]
    inline def load(data: Any, options: LoadOptions): js.Promise[GeoJsonDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoJsonDataSource]]
    /**
      * Creates a Promise to a new instance loaded with the provided GeoJSON or TopoJSON data.
      * @param data - A url, GeoJSON object, or TopoJSON object to be loaded.
      * @param [options] - An object specifying configuration options
      * @returns A promise that will resolve when the data is loaded.
      */
    inline def load(data: Resource): js.Promise[GeoJsonDataSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GeoJsonDataSource]]
    inline def load(data: Resource, options: LoadOptions): js.Promise[GeoJsonDataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GeoJsonDataSource]]
    
    /**
      * Gets or sets the default color of the map pin created for each point.
      */
    @JSImport("cesium/Source/DataSources/GeoJsonDataSource", "default.markerColor")
    @js.native
    def markerColor: Color = js.native
    inline def markerColor_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(x.asInstanceOf[js.Any])
    
    /**
      * Gets or sets the default size of the map pin created for each point, in pixels.
      */
    @JSImport("cesium/Source/DataSources/GeoJsonDataSource", "default.markerSize")
    @js.native
    def markerSize: Double = js.native
    inline def markerSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerSize")(x.asInstanceOf[js.Any])
    
    /**
      * Gets or sets the default symbol of the map pin created for each point.
      * This can be any valid {@link http://mapbox.com/maki/|Maki} identifier, any single character,
      * or blank if no symbol is to be used.
      */
    @JSImport("cesium/Source/DataSources/GeoJsonDataSource", "default.markerSymbol")
    @js.native
    def markerSymbol: String = js.native
    inline def markerSymbol_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markerSymbol")(x.asInstanceOf[js.Any])
    
    /**
      * Gets or sets the default color of polylines and polygon outlines.
      */
    @JSImport("cesium/Source/DataSources/GeoJsonDataSource", "default.stroke")
    @js.native
    def stroke: Color = js.native
    
    /**
      * Gets or sets the default width of polylines and polygon outlines.
      */
    @JSImport("cesium/Source/DataSources/GeoJsonDataSource", "default.strokeWidth")
    @js.native
    def strokeWidth: Double = js.native
    inline def strokeWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(x.asInstanceOf[js.Any])
    
    inline def stroke_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stroke")(x.asInstanceOf[js.Any])
  }
}

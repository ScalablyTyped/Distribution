package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoJsonObject extends StObject {
  
  /** Geometric coordinates of the object */
  var coordinates: js.UndefOr[js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]] = js.undefined
  
  /** Set of features (only applicable if the type is 'featurecollection') */
  var features: js.UndefOr[js.Array[IGeoJsonObject]] = js.undefined
  
  /** Set of geometries (only applicable if the type is 'geometrycollection') */
  var geometries: js.UndefOr[js.Array[IGeoJsonObject]] = js.undefined
  
  /** Geometry (only applicable if the type is 'feature') */
  var geometry: js.UndefOr[IGeoJsonObject] = js.undefined
  
  /** identifier of a feature (only applicable if the type is 'feature') */
  var id: js.UndefOr[js.Any] = js.undefined
  
  /** Additional properties of the object as a key,value pair */
  var properties: js.UndefOr[js.Any] = js.undefined
  
  /** 
    * Type of the object 
    * could be one of the following: 
    * Point
    * LineString
    * Polygon
    * MultiPoint
    * MultiLineString
    * MultiPolygon
    * GeometryCollection
    * Feature
    * FeatureCollection 
    */
  var `type`: String
}
object IGeoJsonObject {
  
  inline def apply(`type`: String): IGeoJsonObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJsonObject]
  }
  
  extension [Self <: IGeoJsonObject](x: Self) {
    
    inline def setCoordinates(value: js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCoordinatesVarargs(value: ((js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double)*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    inline def setFeatures(value: js.Array[IGeoJsonObject]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: IGeoJsonObject*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    inline def setGeometries(value: js.Array[IGeoJsonObject]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    inline def setGeometriesVarargs(value: IGeoJsonObject*): Self = StObject.set(x, "geometries", js.Array(value :_*))
    
    inline def setGeometry(value: IGeoJsonObject): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoJsonObject extends StObject {
  
  /** Geometric coordinates of the object */
  var coordinates: js.UndefOr[js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]] = js.native
  
  /** Set of features (only applicable if the type is 'featurecollection') */
  var features: js.UndefOr[js.Array[IGeoJsonObject]] = js.native
  
  /** Set of geometries (only applicable if the type is 'geometrycollection') */
  var geometries: js.UndefOr[js.Array[IGeoJsonObject]] = js.native
  
  /** Geometry (only applicable if the type is 'feature') */
  var geometry: js.UndefOr[IGeoJsonObject] = js.native
  
  /** identifier of a feature (only applicable if the type is 'feature') */
  var id: js.UndefOr[js.Any] = js.native
  
  /** Additional properties of the object as a key,value pair */
  var properties: js.UndefOr[js.Any] = js.native
  
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
  var `type`: String = js.native
}
object IGeoJsonObject {
  
  @scala.inline
  def apply(`type`: String): IGeoJsonObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJsonObject]
  }
  
  @scala.inline
  implicit class IGeoJsonObjectMutableBuilder[Self <: IGeoJsonObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    @scala.inline
    def setCoordinatesVarargs(value: ((js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double)*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[IGeoJsonObject]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: IGeoJsonObject*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setGeometries(value: js.Array[IGeoJsonObject]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    @scala.inline
    def setGeometriesVarargs(value: IGeoJsonObject*): Self = StObject.set(x, "geometries", js.Array(value :_*))
    
    @scala.inline
    def setGeometry(value: IGeoJsonObject): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

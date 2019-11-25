package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoJsonObject extends js.Object {
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
  @scala.inline
  def apply(
    `type`: String,
    coordinates: js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double] = null,
    features: js.Array[IGeoJsonObject] = null,
    geometries: js.Array[IGeoJsonObject] = null,
    geometry: IGeoJsonObject = null,
    id: js.Any = null,
    properties: js.Any = null
  ): IGeoJsonObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (geometries != null) __obj.updateDynamic("geometries")(geometries.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoJsonObject]
  }
}


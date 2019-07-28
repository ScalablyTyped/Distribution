package typings.d3DashGeo

import typings.geojson.geojsonMod.GeoJsonProperties
import typings.geojson.geojsonMod.GeometryObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashGeoMod {
  type GeoGeometryObjects = GeometryObject | GeoSphere
  type GeoIdentityTranform = GeoIdentityTransform
  type GeoPermissibleObjects = GeoGeometryObjects | ExtendedGeometryCollection[GeoGeometryObjects] | (ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]) | (ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]])
}

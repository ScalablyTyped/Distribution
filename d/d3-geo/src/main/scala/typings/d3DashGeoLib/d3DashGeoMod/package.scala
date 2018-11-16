package typings
package d3DashGeoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashGeoMod {
  type GeoGeometryObjects = geojsonLib.geojsonMod.GeometryObject | GeoSphere
  type GeoIdentityTranform = GeoIdentityTransform
  type GeoPermissibleObjects = GeoGeometryObjects | ExtendedGeometryCollection[GeoGeometryObjects] | (ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties]) | (ExtendedFeatureCollection[
    ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties]
  ])
}

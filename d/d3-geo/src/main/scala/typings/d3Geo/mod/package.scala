package typings.d3Geo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GeoGeometryObjects = typings.geojson.mod.GeometryObject | typings.d3Geo.mod.GeoSphere
  type GeoIdentityTranform = typings.d3Geo.mod.GeoIdentityTransform
  type GeoPermissibleObjects = typings.d3Geo.mod.GeoGeometryObjects | typings.d3Geo.mod.ExtendedGeometryCollection[typings.d3Geo.mod.GeoGeometryObjects] | (typings.d3Geo.mod.ExtendedFeature[
    typings.d3Geo.mod.GeoGeometryObjects | scala.Null, 
    typings.geojson.mod.GeoJsonProperties
  ]) | (typings.d3Geo.mod.ExtendedFeatureCollection[
    typings.d3Geo.mod.ExtendedFeature[
      typings.d3Geo.mod.GeoGeometryObjects | scala.Null, 
      typings.geojson.mod.GeoJsonProperties
    ]
  ])
}

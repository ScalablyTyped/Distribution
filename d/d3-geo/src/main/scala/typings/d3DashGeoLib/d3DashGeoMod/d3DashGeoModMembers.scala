package typings
package d3DashGeoLib.d3DashGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-geo", JSImport.Namespace)
@js.native
object d3DashGeoModMembers extends js.Object {
  def geoAlbers(): GeoConicProjection = js.native
  def geoAlbersUsa(): GeoProjection = js.native
  def geoArea(
    `object`: ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties]
  ): scala.Double = js.native
  def geoArea(
    `object`: ExtendedFeatureCollection[
      ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties]
    ]
  ): scala.Double = js.native
  def geoArea(`object`: ExtendedGeometryCollection[GeoGeometryObjects]): scala.Double = js.native
  def geoArea(`object`: GeoGeometryObjects): scala.Double = js.native
  def geoAzimuthalEqualArea(): GeoProjection = js.native
  def geoAzimuthalEqualAreaRaw(): GeoRawProjection = js.native
  def geoAzimuthalEquidistant(): GeoProjection = js.native
  def geoAzimuthalEquidistantRaw(): GeoRawProjection = js.native
  def geoBounds(
    `object`: ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties]
  ): js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]] = js.native
  def geoBounds(
    `object`: ExtendedFeatureCollection[
      ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties]
    ]
  ): js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]] = js.native
  def geoBounds(`object`: ExtendedGeometryCollection[GeoGeometryObjects]): js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]] = js.native
  def geoBounds(`object`: GeoGeometryObjects): js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]] = js.native
  def geoCentroid(
    `object`: ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties]
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def geoCentroid(
    `object`: ExtendedFeatureCollection[
      ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties]
    ]
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def geoCentroid(`object`: ExtendedGeometryCollection[GeoGeometryObjects]): js.Tuple2[scala.Double, scala.Double] = js.native
  def geoCentroid(`object`: GeoGeometryObjects): js.Tuple2[scala.Double, scala.Double] = js.native
  def geoCircle(): GeoCircleGenerator[_, _] = js.native
  @JSName("geoCircle")
  def geoCircle_Datum[Datum](): GeoCircleGenerator[_, Datum] = js.native
  @JSName("geoCircle")
  def geoCircle_ThisDatum[This, Datum](): GeoCircleGenerator[This, Datum] = js.native
  def geoClipAntimeridian(stream: GeoStream): GeoStream = js.native
  def geoClipCircle(angle: scala.Double): js.Function1[/* stream */ GeoStream, GeoStream] = js.native
  def geoClipRectangle(x0: scala.Double, y0: scala.Double, x1: scala.Double, y1: scala.Double): js.Function1[/* stream */ GeoStream, GeoStream] = js.native
  def geoConicConformal(): GeoConicProjection = js.native
  def geoConicConformalRaw(phi0: scala.Double, phi1: scala.Double): GeoRawProjection = js.native
  def geoConicEqualArea(): GeoConicProjection = js.native
  def geoConicEqualAreaRaw(phi0: scala.Double, phi1: scala.Double): GeoRawProjection = js.native
  def geoConicEquidistant(): GeoConicProjection = js.native
  def geoConicEquidistantRaw(phi0: scala.Double, phi1: scala.Double): GeoRawProjection = js.native
  def geoContains(
    `object`: ExtendedFeatureCollection[
      ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties]
    ],
    point: js.Tuple2[scala.Double, scala.Double]
  ): scala.Boolean = js.native
  def geoContains(
    `object`: ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties],
    point: js.Tuple2[scala.Double, scala.Double]
  ): scala.Boolean = js.native
  def geoContains(
    `object`: ExtendedGeometryCollection[GeoGeometryObjects],
    point: js.Tuple2[scala.Double, scala.Double]
  ): scala.Boolean = js.native
  def geoContains(`object`: GeoGeometryObjects, point: js.Tuple2[scala.Double, scala.Double]): scala.Boolean = js.native
  def geoDistance(a: js.Tuple2[scala.Double, scala.Double], b: js.Tuple2[scala.Double, scala.Double]): scala.Double = js.native
  def geoEquirectangular(): GeoProjection = js.native
  def geoEquirectangularRaw(): GeoRawProjection = js.native
  def geoGnomonic(): GeoProjection = js.native
  def geoGnomonicRaw(): GeoRawProjection = js.native
  def geoGraticule(): GeoGraticuleGenerator = js.native
  def geoGraticule10(): geojsonLib.geojsonMod.MultiLineString = js.native
  def geoIdentity(): GeoIdentityTransform = js.native
  def geoInterpolate(a: js.Tuple2[scala.Double, scala.Double], b: js.Tuple2[scala.Double, scala.Double]): js.Function1[/* t */ scala.Double, js.Tuple2[scala.Double, scala.Double]] = js.native
  def geoLength(
    `object`: ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties]
  ): scala.Double = js.native
  def geoLength(
    `object`: ExtendedFeatureCollection[
      ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties]
    ]
  ): scala.Double = js.native
  def geoLength(`object`: ExtendedGeometryCollection[GeoGeometryObjects]): scala.Double = js.native
  def geoLength(`object`: GeoGeometryObjects): scala.Double = js.native
  def geoMercator(): GeoProjection = js.native
  def geoMercatorRaw(): GeoRawProjection = js.native
  def geoNaturalEarth1(): GeoProjection = js.native
  def geoNaturalEarth1Raw(): GeoRawProjection = js.native
  def geoOrthographic(): GeoProjection = js.native
  def geoOrthographicRaw(): GeoRawProjection = js.native
  def geoPath(): GeoPath[_, GeoPermissibleObjects] = js.native
  def geoPath(projection: GeoProjection): GeoPath[_, GeoPermissibleObjects] = js.native
  def geoPath(projection: GeoProjection, context: GeoContext): GeoPath[_, GeoPermissibleObjects] = js.native
  def geoPath(projection: GeoStreamWrapper): GeoPath[_, GeoPermissibleObjects] = js.native
  def geoPath(projection: GeoStreamWrapper, context: GeoContext): GeoPath[_, GeoPermissibleObjects] = js.native
  def geoPath(projection: scala.Null, context: GeoContext): GeoPath[_, GeoPermissibleObjects] = js.native
  @JSName("geoPath")
  def geoPath_DatumObjectGeoPermissibleObjects[DatumObject /* <: GeoPermissibleObjects */](): GeoPath[_, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_DatumObjectGeoPermissibleObjects[DatumObject /* <: GeoPermissibleObjects */](projection: GeoProjection): GeoPath[_, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_DatumObjectGeoPermissibleObjects[DatumObject /* <: GeoPermissibleObjects */](projection: GeoProjection, context: GeoContext): GeoPath[_, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_DatumObjectGeoPermissibleObjects[DatumObject /* <: GeoPermissibleObjects */](projection: GeoStreamWrapper): GeoPath[_, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_DatumObjectGeoPermissibleObjects[DatumObject /* <: GeoPermissibleObjects */](projection: GeoStreamWrapper, context: GeoContext): GeoPath[_, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_DatumObjectGeoPermissibleObjects[DatumObject /* <: GeoPermissibleObjects */](projection: scala.Null, context: GeoContext): GeoPath[_, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_ThisDatumObjectGeoPermissibleObjects[This, DatumObject /* <: GeoPermissibleObjects */](): GeoPath[This, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_ThisDatumObjectGeoPermissibleObjects[This, DatumObject /* <: GeoPermissibleObjects */](projection: GeoProjection): GeoPath[This, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_ThisDatumObjectGeoPermissibleObjects[This, DatumObject /* <: GeoPermissibleObjects */](projection: GeoProjection, context: GeoContext): GeoPath[This, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_ThisDatumObjectGeoPermissibleObjects[This, DatumObject /* <: GeoPermissibleObjects */](projection: GeoStreamWrapper): GeoPath[This, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_ThisDatumObjectGeoPermissibleObjects[This, DatumObject /* <: GeoPermissibleObjects */](projection: GeoStreamWrapper, context: GeoContext): GeoPath[This, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_ThisDatumObjectGeoPermissibleObjects[This, DatumObject /* <: GeoPermissibleObjects */](projection: scala.Null, context: GeoContext): GeoPath[This, DatumObject] = js.native
  def geoProjection(project: GeoRawProjection): GeoProjection = js.native
  def geoProjectionMutator(factory: js.Function1[/* repeated */ js.Any, GeoRawProjection]): js.Function0[GeoProjection] = js.native
  def geoRotation(angles: js.Tuple2[scala.Double, scala.Double]): GeoRotation = js.native
  def geoRotation(angles: js.Tuple3[scala.Double, scala.Double, scala.Double]): GeoRotation = js.native
  def geoStereographic(): GeoProjection = js.native
  def geoStereographicRaw(): GeoRawProjection = js.native
  def geoStream(
    `object`: ExtendedFeatureCollection[
      ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties]
    ],
    stream: GeoStream
  ): scala.Unit = js.native
  def geoStream(
    `object`: ExtendedFeature[GeoGeometryObjects | scala.Null, geojsonLib.geojsonMod.GeoJsonProperties],
    stream: GeoStream
  ): scala.Unit = js.native
  def geoStream(`object`: ExtendedGeometryCollection[GeoGeometryObjects], stream: GeoStream): scala.Unit = js.native
  def geoStream(`object`: GeoGeometryObjects, stream: GeoStream): scala.Unit = js.native
  def geoTransform[T /* <: GeoTransformPrototype */](methods: T): d3DashGeoLib.Anon_Stream[T] = js.native
  def geoTransverseMercator(): GeoProjection = js.native
  def geoTransverseMercatorRaw(): GeoRawProjection = js.native
}


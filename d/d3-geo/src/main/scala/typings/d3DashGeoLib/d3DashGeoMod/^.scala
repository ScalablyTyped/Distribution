package typings
package d3DashGeoLib.d3DashGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-geo", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def geoAlbers(): d3DashGeoLib.d3DashGeoMod.GeoConicProjection = js.native
  def geoAlbersUsa(): d3DashGeoLib.d3DashGeoMod.GeoProjection = js.native
  def geoArea(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedFeature[
      d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects | scala.Null, 
      geojsonLib.geojsonMod.GeoJsonProperties
    ]
  ): scala.Double = js.native
  def geoArea(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedFeatureCollection[
      d3DashGeoLib.d3DashGeoMod.ExtendedFeature[
        d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects | scala.Null, 
        geojsonLib.geojsonMod.GeoJsonProperties
      ]
    ]
  ): scala.Double = js.native
  def geoArea(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedGeometryCollection[d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects]
  ): scala.Double = js.native
  def geoArea(`object`: d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects): scala.Double = js.native
  def geoAzimuthalEqualArea(): d3DashGeoLib.d3DashGeoMod.GeoProjection = js.native
  def geoAzimuthalEqualAreaRaw(): d3DashGeoLib.d3DashGeoMod.GeoRawProjection = js.native
  def geoAzimuthalEquidistant(): d3DashGeoLib.d3DashGeoMod.GeoProjection = js.native
  def geoAzimuthalEquidistantRaw(): d3DashGeoLib.d3DashGeoMod.GeoRawProjection = js.native
  def geoBounds(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedFeature[
      d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects | scala.Null, 
      geojsonLib.geojsonMod.GeoJsonProperties
    ]
  ): js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]] = js.native
  def geoBounds(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedFeatureCollection[
      d3DashGeoLib.d3DashGeoMod.ExtendedFeature[
        d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects | scala.Null, 
        geojsonLib.geojsonMod.GeoJsonProperties
      ]
    ]
  ): js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]] = js.native
  def geoBounds(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedGeometryCollection[d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects]
  ): js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]] = js.native
  def geoBounds(`object`: d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects): js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]] = js.native
  def geoCentroid(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedFeature[
      d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects | scala.Null, 
      geojsonLib.geojsonMod.GeoJsonProperties
    ]
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def geoCentroid(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedFeatureCollection[
      d3DashGeoLib.d3DashGeoMod.ExtendedFeature[
        d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects | scala.Null, 
        geojsonLib.geojsonMod.GeoJsonProperties
      ]
    ]
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def geoCentroid(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedGeometryCollection[d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects]
  ): js.Tuple2[scala.Double, scala.Double] = js.native
  def geoCentroid(`object`: d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects): js.Tuple2[scala.Double, scala.Double] = js.native
  def geoCircle(): d3DashGeoLib.d3DashGeoMod.GeoCircleGenerator[_, _] = js.native
  @JSName("geoCircle")
  def geoCircle_Datum[Datum](): d3DashGeoLib.d3DashGeoMod.GeoCircleGenerator[_, Datum] = js.native
  @JSName("geoCircle")
  def geoCircle_ThisDatum[This, Datum](): d3DashGeoLib.d3DashGeoMod.GeoCircleGenerator[This, Datum] = js.native
  def geoClipAntimeridian(stream: d3DashGeoLib.d3DashGeoMod.GeoStream): d3DashGeoLib.d3DashGeoMod.GeoStream = js.native
  def geoClipCircle(angle: scala.Double): js.Function1[
    /* stream */ d3DashGeoLib.d3DashGeoMod.GeoStream, 
    d3DashGeoLib.d3DashGeoMod.GeoStream
  ] = js.native
  def geoClipRectangle(x0: scala.Double, y0: scala.Double, x1: scala.Double, y1: scala.Double): js.Function1[
    /* stream */ d3DashGeoLib.d3DashGeoMod.GeoStream, 
    d3DashGeoLib.d3DashGeoMod.GeoStream
  ] = js.native
  def geoConicConformal(): d3DashGeoLib.d3DashGeoMod.GeoConicProjection = js.native
  def geoConicConformalRaw(phi0: scala.Double, phi1: scala.Double): d3DashGeoLib.d3DashGeoMod.GeoRawProjection = js.native
  def geoConicEqualArea(): d3DashGeoLib.d3DashGeoMod.GeoConicProjection = js.native
  def geoConicEqualAreaRaw(phi0: scala.Double, phi1: scala.Double): d3DashGeoLib.d3DashGeoMod.GeoRawProjection = js.native
  def geoConicEquidistant(): d3DashGeoLib.d3DashGeoMod.GeoConicProjection = js.native
  def geoConicEquidistantRaw(phi0: scala.Double, phi1: scala.Double): d3DashGeoLib.d3DashGeoMod.GeoRawProjection = js.native
  def geoContains(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedFeatureCollection[
      d3DashGeoLib.d3DashGeoMod.ExtendedFeature[
        d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects | scala.Null, 
        geojsonLib.geojsonMod.GeoJsonProperties
      ]
    ],
    point: js.Tuple2[scala.Double, scala.Double]
  ): scala.Boolean = js.native
  def geoContains(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedFeature[
      d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects | scala.Null, 
      geojsonLib.geojsonMod.GeoJsonProperties
    ],
    point: js.Tuple2[scala.Double, scala.Double]
  ): scala.Boolean = js.native
  def geoContains(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedGeometryCollection[d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects],
    point: js.Tuple2[scala.Double, scala.Double]
  ): scala.Boolean = js.native
  def geoContains(
    `object`: d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects,
    point: js.Tuple2[scala.Double, scala.Double]
  ): scala.Boolean = js.native
  def geoDistance(a: js.Tuple2[scala.Double, scala.Double], b: js.Tuple2[scala.Double, scala.Double]): scala.Double = js.native
  def geoEqualEarth(): d3DashGeoLib.d3DashGeoMod.GeoProjection = js.native
  def geoEqualEarthRaw(): d3DashGeoLib.d3DashGeoMod.GeoRawProjection = js.native
  def geoEquirectangular(): d3DashGeoLib.d3DashGeoMod.GeoProjection = js.native
  def geoEquirectangularRaw(): d3DashGeoLib.d3DashGeoMod.GeoRawProjection = js.native
  def geoGnomonic(): d3DashGeoLib.d3DashGeoMod.GeoProjection = js.native
  def geoGnomonicRaw(): d3DashGeoLib.d3DashGeoMod.GeoRawProjection = js.native
  def geoGraticule(): d3DashGeoLib.d3DashGeoMod.GeoGraticuleGenerator = js.native
  def geoGraticule10(): geojsonLib.geojsonMod.MultiLineString = js.native
  def geoIdentity(): d3DashGeoLib.d3DashGeoMod.GeoIdentityTransform = js.native
  def geoInterpolate(a: js.Tuple2[scala.Double, scala.Double], b: js.Tuple2[scala.Double, scala.Double]): js.Function1[/* t */ scala.Double, js.Tuple2[scala.Double, scala.Double]] = js.native
  def geoLength(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedFeature[
      d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects | scala.Null, 
      geojsonLib.geojsonMod.GeoJsonProperties
    ]
  ): scala.Double = js.native
  def geoLength(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedFeatureCollection[
      d3DashGeoLib.d3DashGeoMod.ExtendedFeature[
        d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects | scala.Null, 
        geojsonLib.geojsonMod.GeoJsonProperties
      ]
    ]
  ): scala.Double = js.native
  def geoLength(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedGeometryCollection[d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects]
  ): scala.Double = js.native
  def geoLength(`object`: d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects): scala.Double = js.native
  def geoMercator(): d3DashGeoLib.d3DashGeoMod.GeoProjection = js.native
  def geoMercatorRaw(): d3DashGeoLib.d3DashGeoMod.GeoRawProjection = js.native
  def geoNaturalEarth1(): d3DashGeoLib.d3DashGeoMod.GeoProjection = js.native
  def geoNaturalEarth1Raw(): d3DashGeoLib.d3DashGeoMod.GeoRawProjection = js.native
  def geoOrthographic(): d3DashGeoLib.d3DashGeoMod.GeoProjection = js.native
  def geoOrthographicRaw(): d3DashGeoLib.d3DashGeoMod.GeoRawProjection = js.native
  def geoPath(): d3DashGeoLib.d3DashGeoMod.GeoPath[_, d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects] = js.native
  def geoPath(projection: d3DashGeoLib.d3DashGeoMod.GeoProjection): d3DashGeoLib.d3DashGeoMod.GeoPath[_, d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects] = js.native
  def geoPath(projection: d3DashGeoLib.d3DashGeoMod.GeoProjection, context: d3DashGeoLib.d3DashGeoMod.GeoContext): d3DashGeoLib.d3DashGeoMod.GeoPath[_, d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects] = js.native
  def geoPath(projection: d3DashGeoLib.d3DashGeoMod.GeoStreamWrapper): d3DashGeoLib.d3DashGeoMod.GeoPath[_, d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects] = js.native
  def geoPath(
    projection: d3DashGeoLib.d3DashGeoMod.GeoStreamWrapper,
    context: d3DashGeoLib.d3DashGeoMod.GeoContext
  ): d3DashGeoLib.d3DashGeoMod.GeoPath[_, d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects] = js.native
  def geoPath(projection: scala.Null, context: d3DashGeoLib.d3DashGeoMod.GeoContext): d3DashGeoLib.d3DashGeoMod.GeoPath[_, d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects] = js.native
  @JSName("geoPath")
  def geoPath_DatumObjectGeoPermissibleObjects[DatumObject /* <: d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects */](): d3DashGeoLib.d3DashGeoMod.GeoPath[_, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_DatumObjectGeoPermissibleObjects[DatumObject /* <: d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects */](projection: d3DashGeoLib.d3DashGeoMod.GeoProjection): d3DashGeoLib.d3DashGeoMod.GeoPath[_, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_DatumObjectGeoPermissibleObjects[DatumObject /* <: d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects */](projection: d3DashGeoLib.d3DashGeoMod.GeoProjection, context: d3DashGeoLib.d3DashGeoMod.GeoContext): d3DashGeoLib.d3DashGeoMod.GeoPath[_, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_DatumObjectGeoPermissibleObjects[DatumObject /* <: d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects */](projection: d3DashGeoLib.d3DashGeoMod.GeoStreamWrapper): d3DashGeoLib.d3DashGeoMod.GeoPath[_, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_DatumObjectGeoPermissibleObjects[DatumObject /* <: d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects */](
    projection: d3DashGeoLib.d3DashGeoMod.GeoStreamWrapper,
    context: d3DashGeoLib.d3DashGeoMod.GeoContext
  ): d3DashGeoLib.d3DashGeoMod.GeoPath[_, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_DatumObjectGeoPermissibleObjects[DatumObject /* <: d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects */](projection: scala.Null, context: d3DashGeoLib.d3DashGeoMod.GeoContext): d3DashGeoLib.d3DashGeoMod.GeoPath[_, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_ThisDatumObjectGeoPermissibleObjects[This, DatumObject /* <: d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects */](): d3DashGeoLib.d3DashGeoMod.GeoPath[This, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_ThisDatumObjectGeoPermissibleObjects[This, DatumObject /* <: d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects */](projection: d3DashGeoLib.d3DashGeoMod.GeoProjection): d3DashGeoLib.d3DashGeoMod.GeoPath[This, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_ThisDatumObjectGeoPermissibleObjects[This, DatumObject /* <: d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects */](projection: d3DashGeoLib.d3DashGeoMod.GeoProjection, context: d3DashGeoLib.d3DashGeoMod.GeoContext): d3DashGeoLib.d3DashGeoMod.GeoPath[This, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_ThisDatumObjectGeoPermissibleObjects[This, DatumObject /* <: d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects */](projection: d3DashGeoLib.d3DashGeoMod.GeoStreamWrapper): d3DashGeoLib.d3DashGeoMod.GeoPath[This, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_ThisDatumObjectGeoPermissibleObjects[This, DatumObject /* <: d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects */](
    projection: d3DashGeoLib.d3DashGeoMod.GeoStreamWrapper,
    context: d3DashGeoLib.d3DashGeoMod.GeoContext
  ): d3DashGeoLib.d3DashGeoMod.GeoPath[This, DatumObject] = js.native
  @JSName("geoPath")
  def geoPath_ThisDatumObjectGeoPermissibleObjects[This, DatumObject /* <: d3DashGeoLib.d3DashGeoMod.GeoPermissibleObjects */](projection: scala.Null, context: d3DashGeoLib.d3DashGeoMod.GeoContext): d3DashGeoLib.d3DashGeoMod.GeoPath[This, DatumObject] = js.native
  def geoProjection(project: d3DashGeoLib.d3DashGeoMod.GeoRawProjection): d3DashGeoLib.d3DashGeoMod.GeoProjection = js.native
  def geoProjectionMutator(factory: js.Function1[/* repeated */ js.Any, d3DashGeoLib.d3DashGeoMod.GeoRawProjection]): js.Function0[d3DashGeoLib.d3DashGeoMod.GeoProjection] = js.native
  def geoRotation(angles: js.Tuple2[scala.Double, scala.Double]): d3DashGeoLib.d3DashGeoMod.GeoRotation = js.native
  def geoRotation(angles: js.Tuple3[scala.Double, scala.Double, scala.Double]): d3DashGeoLib.d3DashGeoMod.GeoRotation = js.native
  def geoStereographic(): d3DashGeoLib.d3DashGeoMod.GeoProjection = js.native
  def geoStereographicRaw(): d3DashGeoLib.d3DashGeoMod.GeoRawProjection = js.native
  def geoStream(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedFeatureCollection[
      d3DashGeoLib.d3DashGeoMod.ExtendedFeature[
        d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects | scala.Null, 
        geojsonLib.geojsonMod.GeoJsonProperties
      ]
    ],
    stream: d3DashGeoLib.d3DashGeoMod.GeoStream
  ): scala.Unit = js.native
  def geoStream(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedFeature[
      d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects | scala.Null, 
      geojsonLib.geojsonMod.GeoJsonProperties
    ],
    stream: d3DashGeoLib.d3DashGeoMod.GeoStream
  ): scala.Unit = js.native
  def geoStream(
    `object`: d3DashGeoLib.d3DashGeoMod.ExtendedGeometryCollection[d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects],
    stream: d3DashGeoLib.d3DashGeoMod.GeoStream
  ): scala.Unit = js.native
  def geoStream(
    `object`: d3DashGeoLib.d3DashGeoMod.GeoGeometryObjects,
    stream: d3DashGeoLib.d3DashGeoMod.GeoStream
  ): scala.Unit = js.native
  def geoTransform[T /* <: d3DashGeoLib.d3DashGeoMod.GeoTransformPrototype */](methods: T): d3DashGeoLib.Anon_S[T] = js.native
  def geoTransverseMercator(): d3DashGeoLib.d3DashGeoMod.GeoProjection = js.native
  def geoTransverseMercatorRaw(): d3DashGeoLib.d3DashGeoMod.GeoRawProjection = js.native
}


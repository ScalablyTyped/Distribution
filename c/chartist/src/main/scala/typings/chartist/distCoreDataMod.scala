package typings.chartist

import typings.chartist.anon.FillHoles
import typings.chartist.anon.High
import typings.chartist.chartistBooleans.`false`
import typings.chartist.chartistBooleans.`true`
import typings.chartist.distCoreTypesMod.AxisName
import typings.chartist.distCoreTypesMod.AxisOptions
import typings.chartist.distCoreTypesMod.Bounds
import typings.chartist.distCoreTypesMod.Data
import typings.chartist.distCoreTypesMod.FlatSeries
import typings.chartist.distCoreTypesMod.FlatSeriesPrimitiveValue
import typings.chartist.distCoreTypesMod.FlatSeriesValue
import typings.chartist.distCoreTypesMod.Multi
import typings.chartist.distCoreTypesMod.NormalizedData
import typings.chartist.distCoreTypesMod.NormalizedFlatSeries
import typings.chartist.distCoreTypesMod.NormalizedSeries
import typings.chartist.distCoreTypesMod.Options
import typings.chartist.distCoreTypesMod.Segment
import typings.chartist.distCoreTypesMod.SegmentData
import typings.chartist.distCoreTypesMod.Series
import typings.chartist.distCoreTypesMod.SeriesObject
import typings.chartist.distCoreTypesMod.SeriesPrimitiveValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreDataMod {
  
  @JSImport("chartist/dist/core/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserialize[T /* <: js.Object | Double | String */](): js.UndefOr[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")().asInstanceOf[js.UndefOr[T | Null]]
  inline def deserialize[T /* <: js.Object | Double | String */](data: String): js.UndefOr[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T | Null]]
  
  inline def deserialize_T_T[T /* <: js.Object | Double | String */](data: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getBounds(axisLength: Double, highLow: High, scaleMinSpace: Double): Bounds = (^.asInstanceOf[js.Dynamic].applyDynamic("getBounds")(axisLength.asInstanceOf[js.Any], highLow.asInstanceOf[js.Any], scaleMinSpace.asInstanceOf[js.Any])).asInstanceOf[Bounds]
  inline def getBounds(axisLength: Double, highLow: High, scaleMinSpace: Double, onlyInteger: Boolean): Bounds = (^.asInstanceOf[js.Dynamic].applyDynamic("getBounds")(axisLength.asInstanceOf[js.Any], highLow.asInstanceOf[js.Any], scaleMinSpace.asInstanceOf[js.Any], onlyInteger.asInstanceOf[js.Any])).asInstanceOf[Bounds]
  
  inline def getHighLow(data: js.Array[NormalizedSeries], options: Options[AxisOptions, AxisOptions]): High = (^.asInstanceOf[js.Dynamic].applyDynamic("getHighLow")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[High]
  inline def getHighLow(data: js.Array[NormalizedSeries], options: Options[AxisOptions, AxisOptions], dimension: AxisName): High = (^.asInstanceOf[js.Dynamic].applyDynamic("getHighLow")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[High]
  
  inline def getMetaData(seriesData: FlatSeriesValue[FlatSeriesPrimitiveValue], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetaData")(seriesData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getMetaData(seriesData: SeriesObject[SeriesPrimitiveValue], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetaData")(seriesData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getMetaData(seriesData: Series[SeriesPrimitiveValue], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetaData")(seriesData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getMultiValue(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def getMultiValue(value: Any, dimension: AxisName): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getMultiValue(value: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def getMultiValue(value: Double, dimension: AxisName): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def getMultiValue(value: Multi): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def getMultiValue(value: Multi, dimension: AxisName): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiValue")(value.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def isArrayOfSeries(value: Any): /* is std.Array<chartist.chartist/dist/core/types.Series<chartist.chartist/dist/core/types.SeriesPrimitiveValue> | chartist.chartist/dist/core/types.SeriesObject<chartist.chartist/dist/core/types.SeriesPrimitiveValue>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfSeries")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<chartist.chartist/dist/core/types.Series<chartist.chartist/dist/core/types.SeriesPrimitiveValue> | chartist.chartist/dist/core/types.SeriesObject<chartist.chartist/dist/core/types.SeriesPrimitiveValue>> */ Boolean]
  
  inline def isDataHoleValue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataHoleValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMultiValue(value: Any): /* is chartist.chartist/dist/core/types.Multi */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultiValue")(value.asInstanceOf[js.Any]).asInstanceOf[/* is chartist.chartist/dist/core/types.Multi */ Boolean]
  
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ]
  ): NormalizedData[NormalizedFlatSeries] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any]).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ],
    reverse: Boolean
  ): NormalizedData[NormalizedFlatSeries] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  inline def normalizeData(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Boolean,
    multi: Boolean
  ): NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]]]
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ],
    reverse: Boolean,
    multi: AxisName
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Unit,
    multi: Boolean
  ): NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]]]
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ],
    reverse: Unit,
    multi: AxisName
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  
  inline def normalizeData_false(data: Data[FlatSeries[FlatSeriesPrimitiveValue]], reverse: Boolean, multi: `false`): NormalizedData[NormalizedFlatSeries] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  inline def normalizeData_false(data: Data[FlatSeries[FlatSeriesPrimitiveValue]], reverse: Unit, multi: `false`): NormalizedData[NormalizedFlatSeries] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Boolean,
    multi: Boolean,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]],
    reverse: Boolean,
    multi: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Boolean,
    multi: AxisName,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Unit,
    multi: Boolean,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]],
    reverse: Unit,
    multi: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Unit,
    multi: AxisName,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  
  inline def serialize(): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(data: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(data: Any): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize(data: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def serialize_Union(data: String): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize_Union(data: js.Object): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  inline def serialize_Union(data: Double): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(data.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  
  inline def splitIntoSegments(pathCoordinates: js.Array[Double], valueData: js.Array[SegmentData]): js.Array[Segment] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitIntoSegments")(pathCoordinates.asInstanceOf[js.Any], valueData.asInstanceOf[js.Any])).asInstanceOf[js.Array[Segment]]
  inline def splitIntoSegments(pathCoordinates: js.Array[Double], valueData: js.Array[SegmentData], options: FillHoles): js.Array[Segment] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitIntoSegments")(pathCoordinates.asInstanceOf[js.Any], valueData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Segment]]
}

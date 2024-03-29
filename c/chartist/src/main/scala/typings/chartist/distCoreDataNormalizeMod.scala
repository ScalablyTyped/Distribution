package typings.chartist

import typings.chartist.chartistBooleans.`false`
import typings.chartist.chartistBooleans.`true`
import typings.chartist.distCoreTypesMod.AxisName
import typings.chartist.distCoreTypesMod.Data
import typings.chartist.distCoreTypesMod.FlatSeries
import typings.chartist.distCoreTypesMod.FlatSeriesPrimitiveValue
import typings.chartist.distCoreTypesMod.NormalizedData
import typings.chartist.distCoreTypesMod.NormalizedFlatSeries
import typings.chartist.distCoreTypesMod.NormalizedSeries
import typings.chartist.distCoreTypesMod.Series
import typings.chartist.distCoreTypesMod.SeriesObject
import typings.chartist.distCoreTypesMod.SeriesPrimitiveValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreDataNormalizeMod {
  
  @JSImport("chartist/dist/core/data/normalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}

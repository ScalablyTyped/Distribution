package typings.chartist

import typings.chartist.distCoreTypesMod.AxisName
import typings.chartist.distCoreTypesMod.FlatSeriesPrimitiveValue
import typings.chartist.distCoreTypesMod.FlatSeriesValue
import typings.chartist.distCoreTypesMod.Multi
import typings.chartist.distCoreTypesMod.Series
import typings.chartist.distCoreTypesMod.SeriesObject
import typings.chartist.distCoreTypesMod.SeriesPrimitiveValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreDataDataMod {
  
  @JSImport("chartist/dist/core/data/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}

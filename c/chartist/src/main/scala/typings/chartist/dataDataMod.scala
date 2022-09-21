package typings.chartist

import typings.chartist.coreTypesMod.AxisName
import typings.chartist.coreTypesMod.FlatSeriesPrimitiveValue
import typings.chartist.coreTypesMod.FlatSeriesValue
import typings.chartist.coreTypesMod.Multi
import typings.chartist.coreTypesMod.Series
import typings.chartist.coreTypesMod.SeriesObject
import typings.chartist.coreTypesMod.SeriesPrimitiveValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataDataMod {
  
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

package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_TargetIds extends js.Object {
  /**
           * Get data loaded in the chart.
           * @param targetIds If this argument is given, this API returns the specified target data. If this argument is not given, all of data will be returned.
           */
  def apply(): c3Lib.c3Mod.Data = js.native
  /**
           * Get data loaded in the chart.
           * @param targetIds If this argument is given, this API returns the specified target data. If this argument is not given, all of data will be returned.
           */
  def apply(targetIds: c3Lib.c3Mod.ArrayOrString): c3Lib.c3Mod.Data = js.native
  /**
           * Get and set axes of the data loaded in the chart.
           * @param axes If this argument is given, the axes of data will be updated. If not given, the current axes will be returned. The format of this argument is the same as data.axes.
           */
  def axes(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
           * Get and set axes of the data loaded in the chart.
           * @param axes If this argument is given, the axes of data will be updated. If not given, the current axes will be returned. The format of this argument is the same as data.axes.
           */
  def axes(axes: ScalablyTyped.runtime.StringDictionary[java.lang.String]): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
           * Get and set colors of the data loaded in the chart.
           * @param colors If this argument is given, the colors of data will be updated. If not given, the current colors will be returned. The format of this argument is the same as data.colors.
           */
  def colors(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
           * Get and set colors of the data loaded in the chart.
           * @param colors If this argument is given, the colors of data will be updated. If not given, the current colors will be returned. The format of this argument is the same as data.colors.
           */
  def colors(
    colors: ScalablyTyped.runtime.StringDictionary[java.lang.String | d3DashColorLib.d3DashColorMod.RGBColor]
  ): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
           * Get and set names of the data loaded in the chart.
           * @param names If this argument is given, the names of data will be updated. If not given, the current names will be returned. The format of this argument is the same as data.names.
           */
  def names(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
           * Get and set names of the data loaded in the chart.
           * @param names If this argument is given, the names of data will be updated. If not given, the current names will be returned. The format of this argument is the same as data.names.
           */
  def names(names: ScalablyTyped.runtime.StringDictionary[java.lang.String]): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
           * Get data shown in the chart.
           * @param targetIds If this argument is given, this API filters the data with specified target ids. If this argument is not given, all shown data will be returned.
           */
  def shown(): c3Lib.c3Mod.Data = js.native
  /**
           * Get data shown in the chart.
           * @param targetIds If this argument is given, this API filters the data with specified target ids. If this argument is not given, all shown data will be returned.
           */
  def shown(targetIds: c3Lib.c3Mod.ArrayOrString): c3Lib.c3Mod.Data = js.native
  /**
           * Get values of the data loaded in the chart.
           * @param targetIds This API returns the values of specified target. If this argument is not given, null will be retruned.
           */
  def values(): js.Array[_] = js.native
  /**
           * Get values of the data loaded in the chart.
           * @param targetIds This API returns the values of specified target. If this argument is not given, null will be retruned.
           */
  def values(targetIds: c3Lib.c3Mod.ArrayOrString): js.Array[_] = js.native
}


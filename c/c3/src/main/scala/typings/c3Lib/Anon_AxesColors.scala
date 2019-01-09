package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AxesColors extends js.Object {
  /**
    * Get data loaded in the chart.
    * @param targetIds If this argument is given, this API returns the specified target data. If this argument is not given, all of data will be returned.
    */
  def apply(): c3Lib.c3Mod.Data = js.native
  def apply(targetIds: c3Lib.c3Mod.ArrayOrString): c3Lib.c3Mod.Data = js.native
  /**
    * Get and set axes of the data loaded in the chart.
    * @param axes If this argument is given, the axes of data will be updated. If not given, the current axes will be returned. The format of this argument is the same as data.axes.
    */
  def axes(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def axes(axes: org.scalablytyped.runtime.StringDictionary[java.lang.String]): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
    * Get and set colors of the data loaded in the chart.
    * @param colors If this argument is given, the colors of data will be updated. If not given, the current colors will be returned. The format of this argument is the same as data.colors.
    */
  def colors(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def colors(
    colors: org.scalablytyped.runtime.StringDictionary[java.lang.String | d3DashColorLib.d3DashColorMod.RGBColor]
  ): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
    * Get and set names of the data loaded in the chart.
    * @param names If this argument is given, the names of data will be updated. If not given, the current names will be returned. The format of this argument is the same as data.names.
    */
  def names(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def names(names: org.scalablytyped.runtime.StringDictionary[java.lang.String]): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
    * Get data shown in the chart.
    * @param targetIds If this argument is given, this API filters the data with specified target ids. If this argument is not given, all shown data will be returned.
    */
  def shown(): c3Lib.c3Mod.Data = js.native
  def shown(targetIds: c3Lib.c3Mod.ArrayOrString): c3Lib.c3Mod.Data = js.native
  /**
    * Get values of the data loaded in the chart.
    * @param targetIds This API returns the values of specified target. If this argument is not given, null will be retruned.
    */
  def values(): js.Array[_] = js.native
  def values(targetIds: c3Lib.c3Mod.ArrayOrString): js.Array[_] = js.native
}


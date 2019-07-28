package typings.c3

import org.scalablytyped.runtime.StringDictionary
import typings.c3.c3Mod.ArrayOrString
import typings.c3.c3Mod.Data
import typings.d3DashColor.d3DashColorMod.HSLColor
import typings.d3DashColor.d3DashColorMod.RGBColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AxesColors extends js.Object {
  /**
    * Get data loaded in the chart.
    * @param targetIds If this argument is given, this API returns the specified target data. If this argument is not given, all of data will be returned.
    */
  def apply(): Data = js.native
  def apply(targetIds: ArrayOrString): Data = js.native
  /**
    * Get and set axes of the data loaded in the chart.
    * @param axes If this argument is given, the axes of data will be updated. If not given, the current axes will be returned. The format of this argument is the same as data.axes.
    */
  def axes(): StringDictionary[String] = js.native
  def axes(axes: StringDictionary[String]): StringDictionary[String] = js.native
  /**
    * Get and set colors of the data loaded in the chart.
    * @param colors If this argument is given, the colors of data will be updated. If not given, the current colors will be returned. The format of this argument is the same as data.colors.
    */
  def colors(): StringDictionary[String] = js.native
  def colors(colors: StringDictionary[String | RGBColor | HSLColor]): StringDictionary[String] = js.native
  /**
    * Get and set names of the data loaded in the chart.
    * @param names If this argument is given, the names of data will be updated. If not given, the current names will be returned. The format of this argument is the same as data.names.
    */
  def names(): StringDictionary[String] = js.native
  def names(names: StringDictionary[String]): StringDictionary[String] = js.native
  /**
    * Get data shown in the chart.
    * @param targetIds If this argument is given, this API filters the data with specified target ids. If this argument is not given, all shown data will be returned.
    */
  def shown(): Data = js.native
  def shown(targetIds: ArrayOrString): Data = js.native
  /**
    * Get values of the data loaded in the chart.
    * @param targetIds This API returns the values of specified target. If this argument is not given, null will be retruned.
    */
  def values(): js.Array[_] = js.native
  def values(targetIds: ArrayOrString): js.Array[_] = js.native
}


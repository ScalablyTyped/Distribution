package typings.c3.anon

import org.scalablytyped.runtime.StringDictionary
import typings.c3.mod.ArrayOrString
import typings.c3.mod.AxisName
import typings.c3.mod.DataSeries
import typings.d3Color.mod.HSLColor
import typings.d3Color.mod.RGBColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Names extends StObject {
  
  /**
    * Get data loaded in the chart.
    * @param targetIds If this argument is given, this API returns the specified target data. If this argument is not given, all of data will be returned.
    */
  def apply(): js.Array[DataSeries] = js.native
  def apply(targetIds: ArrayOrString): js.Array[DataSeries] = js.native
  
  /**
    * Get and set axes of the data loaded in the chart.
    * @param axes If this argument is given, the axes of data will be updated. This is a map of data IDs to their new axes' names.
    * @returns Map of the changed data IDs to their new axes' names.
    */
  def axes(): js.Object = js.native
  def axes[T /* <: StringDictionary[AxisName] */](axes: T): T = js.native
  
  /**
    * Get and set colors of the data loaded in the chart.
    * @param colors If this argument is given, the colors of data will be updated. If not given, the current colors will be returned. The format of this argument is the same as data.colors.
    * @returns A map of all data IDs to their current colors.
    */
  def colors(): StringDictionary[String] = js.native
  def colors(colors: StringDictionary[String | RGBColor | HSLColor]): StringDictionary[String] = js.native
  
  /**
    * Set names of the data loaded in the chart.
    * @param names This is a map of current names to new names.
    * @returns Map of the old names to the new names. Only includes the names that were changed.
    */
  def names(): js.Object = js.native
  def names[T /* <: StringDictionary[String] */](names: T): T = js.native
  
  /**
    * Get data shown in the chart.
    * @param targetIds If this argument is given, this API filters the data with specified target ids. If this argument is not given, all shown data will be returned.
    */
  def shown(): js.Array[DataSeries] = js.native
  def shown(targetIds: ArrayOrString): js.Array[DataSeries] = js.native
  
  /**
    * Get values of the data loaded in the chart.
    * @param targetIds This API returns the values of specified target. If this argument is not given, null will be retruned.
    */
  def values(): js.Array[Double] | Null = js.native
  def values(targetIds: ArrayOrString): js.Array[Double] | Null = js.native
}

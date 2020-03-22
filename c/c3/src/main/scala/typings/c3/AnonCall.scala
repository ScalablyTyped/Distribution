package typings.c3

import typings.c3.mod.ArrayOrSingle
import typings.c3.mod.RegionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  /**
    * Either get the regions or override the regions.
    * @param regions Regions will be replaced with this argument.
    * @returns The regions on the plot, after running this function.
    */
  def apply(): js.Array[RegionOptions] = js.native
  def apply[T /* <: js.Array[RegionOptions] */](regions: T): T = js.native
  /**
    * Add new region. This API adds new region instead of replacing.
    * @param grids New region or regions to be added.
    * @returns The regions on the plot, after running this function.
    */
  def add(): js.Array[RegionOptions] = js.native
  def add(regions: ArrayOrSingle[RegionOptions]): js.Array[RegionOptions] = js.native
  /**
    * Remove regions from the chart.
    * @param args Arguments object. If not provided, removes all regions.
    * @returns The regions on the plot, after running this function.
    */
  def remove(): js.Array[RegionOptions] = js.native
  def remove(args: AnonClasses): js.Array[RegionOptions] = js.native
}


package typings.c3.mod

import org.scalablytyped.runtime.StringDictionary
import typings.c3.anon.Axes
import typings.c3.anon.Call
import typings.c3.anon.CallHide
import typings.c3.anon.Columns
import typings.c3.anon.Done
import typings.c3.anon.Enable
import typings.c3.anon.Height
import typings.c3.anon.Hide
import typings.c3.anon.IsShown
import typings.c3.anon.Labels
import typings.c3.anon.Names
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAPI extends js.Object {
  
  def axis(): Unit = js.native
  @JSName("axis")
  var axis_Original: Labels = js.native
  
  /**
    * Get and/or set the categories.
    * @param categories: Value of the categories to update. If provided, will overwrite all categories. If not provided, no change will be made.
    * @returns The list of categories after updating.
    */
  def categories(): js.Array[String] = js.native
  def categories[T /* <: js.Array[String] */](categories: T): T = js.native
  
  /**
    * Get and/or set the value of a category.
    * @param i Index of the category to get or set.
    * @param category: Value to update the category to. If not provided, no change will be made.
    * @returns The value of the category after updating.
    */
  def category(i: Double): String = js.native
  def category[T /* <: String */](i: Double, category: T): T = js.native
  
  /**
    * Get the color for the specified id.
    * @returns The color that the data series with the specified id has on the chart.
    */
  def color(id: String): String = js.native
  
  /**
    * Get data loaded in the chart.
    * @param targetIds If this argument is given, this API returns the specified target data. If this argument is not given, all of data will be returned.
    */
  def data(): js.Array[DataSeries] = js.native
  def data(targetIds: ArrayOrString): js.Array[DataSeries] = js.native
  @JSName("data")
  var data_Original: Names = js.native
  
  /**
    * This API fades out specified targets and reverts the others.
    * You can specify multiple targets by giving an array that includes id as String. If no argument is given, all of targets will be faded out.
    */
  def defocus(): Unit = js.native
  def defocus(targetIds: ArrayOrString): Unit = js.native
  
  /**
    * Reset the chart object and remove element and events completely.
    */
  // Not a typo - returns `null` not `void`
  def destroy(): Null = js.native
  
  /**
    * Flow data to the chart. By this API, you can append new data points to the chart.
    * If data that has the same target id is given, the chart will be appended. Otherwise, new target will be added.
    * @param args The arguments object for this method.
    */
  def flow(args: Columns): Unit = js.native
  
  /**
    * Force to redraw.
    */
  def flush(): Unit = js.native
  
  /**
    * This API highlights specified targets and fade out the others.
    * You can specify multiple targets by giving an array that includes id as String. If no argument is given, all of targets will be highlighted.
    */
  def focus(): Unit = js.native
  def focus(targetIds: ArrayOrString): Unit = js.native
  
  /**
    * Update groups for the targets.
    * @param groups An array of groups, each with an array of data IDs defining members of the groups.
    */
  def groups(): js.Array[js.Array[String]] = js.native
  def groups[T /* <: js.Array[js.Array[String]] */](groups: T): T = js.native
  @JSName("groups")
  def groups_T_ArrayArrayString_T[T /* <: js.Array[js.Array[String]] */](): T = js.native
  
  /**
    * This API hides specified targets.
    * @param targetIds You can specify multiple data sets by giving an array of ID strings. If no argument is given, all of data will be hidden.
    * @param options Options object.
    */
  def hide(): Unit = js.native
  def hide(targetIds: js.UndefOr[ArrayOrString], options: ShowHideOptions): Unit = js.native
  def hide(targetIds: ArrayOrString): Unit = js.native
  
  var internal: ChartInternal = js.native
  
  def legend(): Unit = js.native
  @JSName("legend")
  var legend_Original: Hide = js.native
  
  /**
    * Load data to the chart.
    * NOTE: unload should be used if some data needs to be unloaded simultaneously. If you call unload API soon after/before load instead of unload param, chart will not be rendered properly
    * because of cancel of animation.
    * NOTE: done will be called after data loaded, but it's not after rendering. It's because rendering will finish after some transition and there is some time lag between loading and rendering.
    */
  def load(args: Axes): Unit = js.native
  
  /**
    * Either get the regions or override the regions.
    * @param regions Regions will be replaced with this argument.
    * @returns The regions on the plot, after running this function.
    */
  def regions(): js.Array[RegionOptions] = js.native
  def regions[T /* <: js.Array[RegionOptions] */](regions: T): T = js.native
  @JSName("regions")
  var regions_Original: Call = js.native
  
  /**
    * Resize the chart. If no size is specified it will resize to fit.
    * @param size This argument should include width and height in pixels.
    */
  def resize(): Unit = js.native
  def resize(size: Height): Unit = js.native
  
  /**
    * This API reverts specified targets.
    * You can specify multiple targets by giving an array that includes id as String. If no argument is given, all of targets will be reverted.
    */
  def revert(): Unit = js.native
  def revert(targetIds: ArrayOrString): Unit = js.native
  
  /**
    * Change data point state to selected. By this API, you can select data points. To use this API, `data.selection.enabled` needs to be `true`.
    * @param ids Specify target ids to be selected. If this argument is not given, all targets will be the candidate.
    * @param indices Specify indices to be selected. If this argument is not given, all data points will be the candidate.
    * @param resetOther If this argument is set true, the data points that are not specified by ids, indices will be unselected.
    */
  def select(): Unit = js.native
  def select(ids: js.UndefOr[scala.Nothing], indices: js.UndefOr[scala.Nothing], resetOther: Boolean): Unit = js.native
  def select(ids: js.UndefOr[scala.Nothing], indices: js.Array[Double]): Unit = js.native
  def select(ids: js.UndefOr[scala.Nothing], indices: js.Array[Double], resetOther: Boolean): Unit = js.native
  def select(ids: js.Array[String]): Unit = js.native
  def select(ids: js.Array[String], indices: js.UndefOr[scala.Nothing], resetOther: Boolean): Unit = js.native
  def select(ids: js.Array[String], indices: js.Array[Double]): Unit = js.native
  def select(ids: js.Array[String], indices: js.Array[Double], resetOther: Boolean): Unit = js.native
  
  /**
    * Get selected data points. By this API, you can get selected data points information. To use this API, `data.selection.enabled` needs to be `true`.
    * @param targetId You can filter the result by giving target id that you want to get. If not given, all of data points will be returned.
    */
  def selected(): Data = js.native
  def selected(targetId: String): Data = js.native
  
  /**
    * This API shows specified targets.
    * @param targetIds You can specify multiple data sets by giving an array of ID strings. If no argument is given, all of data will be shown.
    * @param options Options object.
    */
  def show(): Unit = js.native
  def show(targetIds: js.UndefOr[ArrayOrString], options: ShowHideOptions): Unit = js.native
  def show(targetIds: ArrayOrString): Unit = js.native
  
  var subchart: IsShown = js.native
  
  /**
    * This API toggles (shows or hides) specified targets.
    * @param targetIds You can specify multiple data sets by giving an array of ID strings. If no argument is given, all of data will be toggled.
    * @param options Options object.
    */
  def toggle(): Unit = js.native
  def toggle(targetIds: js.UndefOr[ArrayOrString], options: ShowHideOptions): Unit = js.native
  def toggle(targetIds: ArrayOrString): Unit = js.native
  
  def tooltip(): Unit = js.native
  @JSName("tooltip")
  var tooltip_Original: CallHide = js.native
  
  /**
    * Change the type of the chart.
    * @param type Specify the type to be transformed. The types listed in data.type can be used.
    * @param targetIds Specify target data IDs to be transformed. If not given, all targets will be the candidate.
    */
  def transform(`type`: ChartType): Unit = js.native
  def transform(`type`: ChartType, targetIds: ArrayOrString): Unit = js.native
  
  /**
    * Unload data from the chart.
    * @param args If given, will unload the data with the ids that match the string, the array of strings, or the `ids` argument of the object. If not given, will unload all data.
    * NOTE: If you call load API soon after/before unload, unload param of load should be used. Otherwise chart will not be rendered properly because of cancel of animation.
    */
  def unload(): Unit = js.native
  def unload(args: Done): Unit = js.native
  def unload(args: ArrayOrString): Unit = js.native
  
  /**
    * Change data point state to unselected. By this API, you can unselect data points. To use this API, `data.selection.enabled` needs to be `true`.
    * @param ids Specify target ids to be unselected. If this argument is not given, all targets will be the candidate.
    * @param indices Specify indices to be unselected. If this argument is not given, all data points will be the candidate.
    */
  def unselect(): Unit = js.native
  def unselect(ids: js.UndefOr[scala.Nothing], indices: js.Array[Double]): Unit = js.native
  def unselect(ids: js.Array[String]): Unit = js.native
  def unselect(ids: js.Array[String], indices: js.Array[Double]): Unit = js.native
  
  /**
    * Unzoom to the original domain.
    */
  def unzoom(): Unit = js.native
  
  /**
    * Get and set x values for the chart. Same as `xs` method.
    * @param x If given, x values of every target will be updated.
    * @returns A map of data IDs to their x IDs after running this function.
    */
  def x(): StringDictionary[PrimitiveArray] = js.native
  def x(x: StringDictionary[PrimitiveArray]): StringDictionary[PrimitiveArray] = js.native
  def x(x: PrimitiveArray): StringDictionary[PrimitiveArray] = js.native
  
  /**
    * Update the grid lines.
    * @param grids Grid lines will be replaced with this argument.
    */
  def xgrids(): js.Array[GridLineOptionsWithAxis] = js.native
  def xgrids[T /* <: js.Array[GridLineOptionsWithAxis] */](grids: T): T = js.native
  @JSName("xgrids")
  var xgrids_Original: GridOperations = js.native
  
  /**
    * Get and set x values for the chart. Same as `x` method.
    * @param x If given, x values of every target will be updated.
    * @returns A map of data IDs to their x IDs after running this function.
    */
  def xs(): StringDictionary[PrimitiveArray] = js.native
  def xs(xs: StringDictionary[PrimitiveArray]): StringDictionary[PrimitiveArray] = js.native
  
  /**
    * Update the grid lines.
    * @param grids Grid lines will be replaced with this argument.
    */
  def ygrids(): js.Array[GridLineOptionsWithAxis] = js.native
  def ygrids[T /* <: js.Array[GridLineOptionsWithAxis] */](grids: T): T = js.native
  @JSName("ygrids")
  var ygrids_Original: GridOperations = js.native
  
  /**
    * Zoom by giving x domain.
    * @param domain If given, the chart will be zoomed to the given domain.
    * @returns `domain`, if given; otherwise the current zoom range of the chart.
    */
  def zoom(): js.Array[Double] = js.native
  def zoom(domain: js.Array[Double]): js.Array[Double] = js.native
  @JSName("zoom")
  var zoom_Original: Enable = js.native
}

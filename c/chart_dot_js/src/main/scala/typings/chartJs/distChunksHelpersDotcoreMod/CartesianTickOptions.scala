package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CartesianTickOptions
  extends StObject
     with TickOptions {
  
  /**
    * The label alignment
    * @default 'center'
    */
  var align: Align | "inner" = js.native
  
  /**
    *   If true, automatically calculates how many labels can be shown and hides labels accordingly. Labels will be rotated up to maxRotation before skipping any. Turn autoSkip off to show all labels no matter what.
    * @default true
    */
  var autoSkip: Boolean = js.native
  
  /**
    * Padding between the ticks on the horizontal axis when autoSkip is enabled.
    * @default 0
    */
  var autoSkipPadding: Double = js.native
  
  /**
    * How is the label positioned perpendicular to the axis direction.
    * This only applies when the rotation is 0 and the axis position is one of "top", "left", "right", or "bottom"
    * @default 'near'
    */
  var crossAlign: "near" | "center" | "far" = js.native
  
  /**
    * Should the defined `min` and `max` values be presented as ticks even if they are not "nice".
    * @default: true
    */
  var includeBounds: Boolean = js.native
  
  /**
    * Distance in pixels to offset the label from the centre point of the tick (in the x direction for the x axis, and the y direction for the y axis). Note: this can cause labels at the edges to be cropped by the edge of the canvas
    * @default 0
    */
  var labelOffset: Double = js.native
  
  /**
    * Maximum rotation for tick labels when rotating to condense labels. Note: Rotation doesn't occur until necessary. Note: Only applicable to horizontal scales.
    * @default 50
    */
  var maxRotation: Double = js.native
  
  /**
    * Maximum number of ticks and gridlines to show.
    * @default 11
    */
  var maxTicksLimit: Double = js.native
  
  /**
    * Minimum rotation for tick labels. Note: Only applicable to horizontal scales.
    * @default 0
    */
  var minRotation: Double = js.native
  
  /**
    * Flips tick labels around axis, displaying the labels inside the chart instead of outside. Note: Only applicable to vertical scales.
    * @default false
    */
  var mirror: Boolean = js.native
  
  /**
    * The number of ticks to examine when deciding how many labels will fit. Setting a smaller value will be faster, but may be less accurate when there is large variability in label length.
    * @default ticks.length
    */
  var sampleSize: Double = js.native
}

package typings
package d3DashShapeLib.d3DashShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CurveGenerator extends CurveGeneratorLineOnly {
  /**
       * Indicates the end of the current area segment.
       */
  def areaEnd(): scala.Unit
  /**
       * Indicates the start of a new area segment.
       * Each area segment consists of exactly two line segments: the topline, followed by the baseline, with the baseline points in reverse order.
       */
  def areaStart(): scala.Unit
}


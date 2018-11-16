package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to represent a viewport on screen
     */
@JSGlobal("BABYLON.Viewport")
@js.native
class Viewport protected () extends js.Object {
  /**
           * Creates a Viewport object located at (x, y) and sized (width, height)
           * @param x defines viewport left coordinate
           * @param y defines viewport top coordinate
           * @param width defines the viewport width
           * @param height defines the viewport height
           */
  def this(/** viewport left coordinate */
  x: scala.Double, /** viewport top coordinate */
  y: scala.Double, /**viewport width */
  width: scala.Double, /** viewport height */
  height: scala.Double) = this()
  /** viewport height */
  var height: scala.Double = js.native
  /**viewport width */
  var width: scala.Double = js.native
  /** viewport left coordinate */
  var x: scala.Double = js.native
  /** viewport top coordinate */
  var y: scala.Double = js.native
  /**
           * Creates a new viewport using absolute sizing (from 0-> width, 0-> height instead of 0->1)
           * @param renderWidthOrEngine defines either an engine or the rendering width
           * @param renderHeight defines the rendering height
           * @returns a new Viewport
           */
  def toGlobal(renderWidthOrEngine: Engine, renderHeight: scala.Double): Viewport = js.native
  /**
           * Creates a new viewport using absolute sizing (from 0-> width, 0-> height instead of 0->1)
           * @param renderWidthOrEngine defines either an engine or the rendering width
           * @param renderHeight defines the rendering height
           * @returns a new Viewport
           */
  def toGlobal(renderWidthOrEngine: scala.Double, renderHeight: scala.Double): Viewport = js.native
}


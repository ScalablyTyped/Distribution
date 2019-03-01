package typings
package chromaDashJsLib.chromaDashJsMod.chromaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cubehelix extends js.Object {
  /**
    * gamma factor can be used to emphasise low or high intensity values, default=1
    */
  def gamma(g: scala.Double): Cubehelix
  /**
    * lightness range: default: [0,1] (black -> white)
    */
  def lightness(l: js.Array[scala.Double]): Cubehelix
  /**
    * number (and direction) of hue rotations (e.g. 1=360°, 1.5=`540°``), default=-1.5
    */
  def rotations(r: scala.Double): Cubehelix
  /**
    * You can call cubehelix.scale() to use the cube-helix through the chroma.scale interface.
    */
  def scale(): Scale[Color]
  /**
    * Set start color for hue rotation, default=300
    */
  def start(s: scala.Double): Cubehelix
}

object Cubehelix {
  @scala.inline
  def apply(
    gamma: js.Function1[scala.Double, Cubehelix],
    lightness: js.Function1[js.Array[scala.Double], Cubehelix],
    rotations: js.Function1[scala.Double, Cubehelix],
    scale: js.Function0[Scale[Color]],
    start: js.Function1[scala.Double, Cubehelix]
  ): Cubehelix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gamma")(gamma)
    __obj.updateDynamic("lightness")(lightness)
    __obj.updateDynamic("rotations")(rotations)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Cubehelix]
  }
}


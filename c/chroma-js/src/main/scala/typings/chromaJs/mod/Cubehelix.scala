package typings.chromaJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cubehelix extends js.Object {
  /**
    * gamma factor can be used to emphasise low or high intensity values, default=1
    */
  def gamma(g: Double): Cubehelix
  /**
    * lightness range: default: [0,1] (black -> white)
    */
  def lightness(l: js.Array[Double]): Cubehelix
  /**
    * number (and direction) of hue rotations (e.g. 1=360°, 1.5=`540°``), default=-1.5
    */
  def rotations(r: Double): Cubehelix
  /**
    * You can call cubehelix.scale() to use the cube-helix through the chroma.scale interface.
    */
  def scale(): Scale[Color]
  /**
    * Set start color for hue rotation, default=300
    */
  def start(s: Double): Cubehelix
}

object Cubehelix {
  @scala.inline
  def apply(
    gamma: Double => Cubehelix,
    lightness: js.Array[Double] => Cubehelix,
    rotations: Double => Cubehelix,
    scale: () => Scale[Color],
    start: Double => Cubehelix
  ): Cubehelix = {
    val __obj = js.Dynamic.literal(gamma = js.Any.fromFunction1(gamma), lightness = js.Any.fromFunction1(lightness), rotations = js.Any.fromFunction1(rotations), scale = js.Any.fromFunction0(scale), start = js.Any.fromFunction1(start))
    __obj.asInstanceOf[Cubehelix]
  }
}


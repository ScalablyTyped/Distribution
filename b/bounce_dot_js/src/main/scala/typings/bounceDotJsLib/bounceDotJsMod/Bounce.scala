package typings
package bounceDotJsLib.bounceDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounce extends js.Object {
  def applyTo(elements: jqueryLib.JQuery[stdLib.HTMLElement]): jqueryLib.JQueryPromise[scala.Unit] = js.native
  def applyTo(elements: jqueryLib.JQuery[stdLib.HTMLElement], options: AnimationOptions): jqueryLib.JQueryPromise[scala.Unit] = js.native
  def applyTo(elements: js.Array[stdLib.Element]): scala.Unit = js.native
  def applyTo(elements: js.Array[stdLib.Element], options: AnimationOptions): scala.Unit = js.native
  def applyTo(element: stdLib.Element): scala.Unit = js.native
  def applyTo(element: stdLib.Element, options: AnimationOptions): scala.Unit = js.native
  def define(name: java.lang.String): Bounce = js.native
  def deserialize(serailized: js.Array[SerailizedComponent[scala.Double | Point2D]]): Bounce = js.native
  def remove(): scala.Unit = js.native
  def rotate(options: BounceOptions[scala.Double]): Bounce = js.native
  def scale(options: BounceOptions[Point2D]): Bounce = js.native
  def serialize(): js.Array[SerailizedComponent[scala.Double | Point2D]] = js.native
  def skew(options: BounceOptions[Point2D]): Bounce = js.native
  def translate(options: BounceOptions[Point2D]): Bounce = js.native
}


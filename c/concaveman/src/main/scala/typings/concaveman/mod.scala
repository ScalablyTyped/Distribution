package typings.concaveman

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A very fast 2D concave hull algorithm in JavaScript (generates a general outline of a point set).
    *
    * @name concaveman
    * @param {Array<Array<number>>} points is an array of [x, y] points.
    * @param {number} [concavity=2] is a relative measure of concavity. 1 results in a relatively detailed shape, Infinity results in a convex hull. You can use values lower than 1, but they can produce pretty crazy shapes.
    * @param {number} [lengthThreshold=0] when a segment length is under this threshold, it stops being considered for further detalization. Higher values result in simpler shapes.
    * @return {Array<Array<number>>}
    * @example
    * var points = [[10, 20], [30, 12.5], ...];
    * var polygon = concaveman(points);
    *
    * //=hull
    */
  @scala.inline
  def apply(points: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].apply(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
  @scala.inline
  def apply(points: js.Array[js.Array[Double]], concavity: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].apply(points.asInstanceOf[js.Any], concavity.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  @scala.inline
  def apply(points: js.Array[js.Array[Double]], concavity: Double, lengthThreshold: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].apply(points.asInstanceOf[js.Any], concavity.asInstanceOf[js.Any], lengthThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  @scala.inline
  def apply(points: js.Array[js.Array[Double]], concavity: Unit, lengthThreshold: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].apply(points.asInstanceOf[js.Any], concavity.asInstanceOf[js.Any], lengthThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  
  @JSImport("concaveman", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}

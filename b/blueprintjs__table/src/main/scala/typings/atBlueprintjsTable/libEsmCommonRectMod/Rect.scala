package typings.atBlueprintjsTable.libEsmCommonRectMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common/rect", "Rect")
@js.native
class Rect protected () extends js.Object {
  def this(left: Double, top: Double, width: Double, height: Double) = this()
  var height: Double = js.native
  var left: Double = js.native
  var top: Double = js.native
  var width: Double = js.native
  def containsX(clientX: Double): Boolean = js.native
  def containsY(clientY: Double): Boolean = js.native
  def equals(rect: Rect): Boolean = js.native
  def sizeStyle(): CSSProperties = js.native
  def style(): CSSProperties = js.native
  def subtractOrigin(anyRect: AnyRect): Rect = js.native
  def union(anyRect: AnyRect): Rect = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/common/rect", "Rect")
@js.native
object Rect extends js.Object {
  var ORIGIN: Rect = js.native
  /**
    * Returns the CSS properties representing the absolute positioning of
    * this Rect.
    */
  def style(rect: AnyRect): CSSProperties = js.native
  /**
    * Returns a new Rect that subtracts the origin of the second argument
    * from the first.
    */
  def subtractOrigin(anyRect0: AnyRect, anyRect1: AnyRect): Rect = js.native
  /**
    * Returns the smallest Rect that entirely contains the supplied rects
    */
  def union(anyRect0: AnyRect, anyRect1: AnyRect): Rect = js.native
  /**
    * Given a ClientRect or Rect object, returns a Rect object.
    */
  def wrap(rect: AnyRect): Rect = js.native
}


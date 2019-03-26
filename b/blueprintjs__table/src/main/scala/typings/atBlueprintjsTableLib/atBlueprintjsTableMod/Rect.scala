package typings
package atBlueprintjsTableLib.atBlueprintjsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table", "Rect")
@js.native
class Rect protected ()
  extends atBlueprintjsTableLib.libEsmCommonMod.Rect {
  def this(left: scala.Double, top: scala.Double, width: scala.Double, height: scala.Double) = this()
}

/* static members */
@JSImport("@blueprintjs/table", "Rect")
@js.native
object Rect extends js.Object {
  var ORIGIN: atBlueprintjsTableLib.libEsmCommonRectMod.Rect = js.native
  /**
    * Returns the CSS properties representing the absolute positioning of
    * this Rect.
    */
  def style(rect: atBlueprintjsTableLib.libEsmCommonRectMod.AnyRect): reactLib.reactMod.ReactNs.CSSProperties = js.native
  /**
    * Returns a new Rect that subtracts the origin of the second argument
    * from the first.
    */
  def subtractOrigin(
    anyRect0: atBlueprintjsTableLib.libEsmCommonRectMod.AnyRect,
    anyRect1: atBlueprintjsTableLib.libEsmCommonRectMod.AnyRect
  ): atBlueprintjsTableLib.libEsmCommonRectMod.Rect = js.native
  /**
    * Returns the smallest Rect that entirely contains the supplied rects
    */
  def union(
    anyRect0: atBlueprintjsTableLib.libEsmCommonRectMod.AnyRect,
    anyRect1: atBlueprintjsTableLib.libEsmCommonRectMod.AnyRect
  ): atBlueprintjsTableLib.libEsmCommonRectMod.Rect = js.native
  /**
    * Given a ClientRect or Rect object, returns a Rect object.
    */
  def wrap(rect: atBlueprintjsTableLib.libEsmCommonRectMod.AnyRect): atBlueprintjsTableLib.libEsmCommonRectMod.Rect = js.native
}


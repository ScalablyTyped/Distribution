package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridOperations extends js.Object {
  /**
    * Update the x/y grid lines.
    * @param grids X/Y grid lines will be replaced with this argument. The format of this argument is the same as grid.x.lines or grid.y.lines.
    */
  def apply(grids: js.Array[_]): scala.Unit = js.native
  /**
    * Add x/y grid lines. This API adds new x/y grid lines instead of replacing like xgrids.
    * @param grids New x/y grid lines will be added. The format of this argument is the same as grid.x.lines or grid.y.lines and it's possible to give an Object if only one line will be added.
    */
  def add(grids: js.Array[_]): scala.Unit = js.native
  def add(grids: js.Object): scala.Unit = js.native
  /**
    * Remove x/y grid lines. This API removes x/y grid lines.
    * @param args This argument should include value or class. If value is given, the x/y grid lines that have specified x/y value will be removed. If class is given, the x/y grid lines that
    * have specified class will be removed. If args is not given, all of x/y grid lines will be removed.
    */
  def remove(): scala.Unit = js.native
  def remove(args: c3Lib.Anon_ClassValue): scala.Unit = js.native
}


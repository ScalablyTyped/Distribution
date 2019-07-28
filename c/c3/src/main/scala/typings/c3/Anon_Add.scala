package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Add extends js.Object {
  /**
    * Update regions.
    * @param regions Regions will be replaced with this argument. The format of this argument is the same as regions.
    */
  def apply(regions: js.Array[_]): Unit = js.native
  /**
    * Add new region. This API adds new region instead of replacing like regions.
    * @param grids New region will be added. The format of this argument is the same as regions and it's possible to give an Object if only one region will be added.
    */
  def add(regions: js.Array[_]): Unit = js.native
  def add(regions: js.Object): Unit = js.native
  /**
    * Remove regions. This API removes regions.
    * @param args This argument should include classes. If classes is given, the regions that have one of the specified classes will be removed. If args is not given, all of regions will be
    * removed.
    */
  def remove(): Unit = js.native
  def remove(args: Anon_Class): Unit = js.native
}


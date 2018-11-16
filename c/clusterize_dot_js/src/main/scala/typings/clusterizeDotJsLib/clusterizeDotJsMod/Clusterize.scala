package typings
package clusterizeDotJsLib.clusterizeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clusterize extends js.Object {
  def append(rows: js.Array[java.lang.String]): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroy(clean: scala.Boolean): scala.Unit = js.native
  def getRowsAmount(): scala.Double = js.native
  def getScrollProgress(): scala.Double = js.native
  def prepend(rows: js.Array[java.lang.String]): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def refresh(force: scala.Boolean): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def update(data: js.Array[java.lang.String]): scala.Unit = js.native
}


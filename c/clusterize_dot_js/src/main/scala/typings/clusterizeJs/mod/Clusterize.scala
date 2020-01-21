package typings.clusterizeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clusterize extends js.Object {
  def append(rows: js.Array[String]): Unit = js.native
  def clear(): Unit = js.native
  def destroy(): Unit = js.native
  def destroy(clean: Boolean): Unit = js.native
  def getRowsAmount(): Double = js.native
  def getScrollProgress(): Double = js.native
  def prepend(rows: js.Array[String]): Unit = js.native
  def refresh(): Unit = js.native
  def refresh(force: Boolean): Unit = js.native
  def update(): Unit = js.native
  def update(data: js.Array[String]): Unit = js.native
}


package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceCollection extends js.Object {
  var dataSourceAdded: Event = js.native
  var dataSourceRemoved: Event = js.native
  var length: scala.Double = js.native
  def add(dataSource: DataSource): stdLib.Promise[DataSource] = js.native
  def add(dataSource: stdLib.Promise[DataSource]): stdLib.Promise[DataSource] = js.native
  def contains(dataSource: DataSource): scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def get(index: scala.Double): DataSource = js.native
  def indexOf(dataSource: DataSource): scala.Double = js.native
  def isDestroyed(): scala.Boolean = js.native
  def remove(dataSource: DataSource): scala.Boolean = js.native
  def remove(dataSource: DataSource, destroy: scala.Boolean): scala.Boolean = js.native
  def removeAll(): scala.Unit = js.native
  def removeAll(destroy: scala.Boolean): scala.Unit = js.native
}


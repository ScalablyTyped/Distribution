package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "DataSourceCollection")
@js.native
class DataSourceCollection () extends js.Object {
  
  def add(dataSource: js.Promise[DataSource]): js.Promise[DataSource] = js.native
  def add(dataSource: DataSource): js.Promise[DataSource] = js.native
  
  def contains(dataSource: DataSource): Boolean = js.native
  
  var dataSourceAdded: Event[js.Array[_]] = js.native
  
  var dataSourceRemoved: Event[js.Array[_]] = js.native
  
  def destroy(): Unit = js.native
  
  def get(index: Double): DataSource = js.native
  
  def getByName(name: String): js.Array[DataSource] = js.native
  
  def indexOf(dataSource: DataSource): Double = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var length: Double = js.native
  
  def lowerToBottom(dataSource: DataSource): Unit = js.native
  
  def remove(dataSource: DataSource): Boolean = js.native
  def remove(dataSource: DataSource, destroy: Boolean): Boolean = js.native
  
  def removeAll(): Unit = js.native
  def removeAll(destroy: Boolean): Unit = js.native
}

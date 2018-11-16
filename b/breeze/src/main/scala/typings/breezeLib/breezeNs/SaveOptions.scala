package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.SaveOptions")
@js.native
class SaveOptions () extends js.Object {
  def this(config: breezeLib.Anon_ResourceNameDataService) = this()
  var allowConcurrentSaves: scala.Boolean = js.native
  var dataService: DataService = js.native
  var resourceName: java.lang.String = js.native
  var tag: js.Object = js.native
  def setAsDefault(): SaveOptions = js.native
  def using(config: SaveOptionsConfiguration): SaveOptions = js.native
}

@JSGlobal("breeze.SaveOptions")
@js.native
object SaveOptions extends js.Object {
  var defaultInstance: breezeLib.breezeNs.SaveOptions = js.native
}


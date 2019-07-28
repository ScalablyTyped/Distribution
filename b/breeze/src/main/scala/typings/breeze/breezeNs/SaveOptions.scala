package typings.breeze.breezeNs

import typings.breeze.Anon_AllowConcurrentSaves
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.SaveOptions")
@js.native
class SaveOptions () extends js.Object {
  def this(config: Anon_AllowConcurrentSaves) = this()
  var allowConcurrentSaves: Boolean = js.native
  var dataService: DataService = js.native
  var resourceName: String = js.native
  var tag: js.Object = js.native
  def setAsDefault(): SaveOptions = js.native
  def using(config: SaveOptionsConfiguration): SaveOptions = js.native
}

/* static members */
@JSGlobal("breeze.SaveOptions")
@js.native
object SaveOptions extends js.Object {
  var defaultInstance: SaveOptions = js.native
}


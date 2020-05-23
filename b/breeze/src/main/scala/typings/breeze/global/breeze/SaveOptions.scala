package typings.breeze.global.breeze

import typings.breeze.anon.AllowConcurrentSaves
import typings.breeze.breeze.SaveOptionsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.SaveOptions")
@js.native
class SaveOptions ()
  extends typings.breeze.breeze.SaveOptions {
  def this(config: AllowConcurrentSaves) = this()
  /* CompleteClass */
  override var allowConcurrentSaves: Boolean = js.native
  /* CompleteClass */
  override var dataService: typings.breeze.breeze.DataService = js.native
  /* CompleteClass */
  override var resourceName: String = js.native
  /* CompleteClass */
  override var tag: js.Object = js.native
  /* CompleteClass */
  override def setAsDefault(): typings.breeze.breeze.SaveOptions = js.native
  /* CompleteClass */
  override def using(config: SaveOptionsConfiguration): typings.breeze.breeze.SaveOptions = js.native
}

/* static members */
@JSGlobal("breeze.SaveOptions")
@js.native
object SaveOptions extends js.Object {
  var defaultInstance: typings.breeze.breeze.SaveOptions = js.native
}


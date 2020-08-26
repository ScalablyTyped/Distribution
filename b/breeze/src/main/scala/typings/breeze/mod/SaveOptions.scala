package typings.breeze.mod

import typings.breeze.anon.AllowConcurrentSaves
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "SaveOptions")
@js.native
class SaveOptions ()
  extends typings.breeze.breeze.SaveOptions {
  def this(config: AllowConcurrentSaves) = this()
}

/* static members */
@JSImport("breeze", "SaveOptions")
@js.native
object SaveOptions extends js.Object {
  var defaultInstance: typings.breeze.breeze.SaveOptions = js.native
}


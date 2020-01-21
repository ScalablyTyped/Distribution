package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "DAVCollection")
@js.native
class DAVCollection[T] protected () extends js.Object {
  def this(options: DAVCollectionOptions[T]) = this()
  var account: Account = js.native
  var ctag: String = js.native
  var data: String = js.native
  var description: String = js.native
  var displayName: String = js.native
  var objects: js.Array[T] = js.native
  var reports: js.Array[String] = js.native
  var resourcetype: String = js.native
  var syncToken: String = js.native
  var url: String = js.native
}


package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "DAVCollection")
@js.native
class DAVCollection[T] protected () extends js.Object {
  def this(options: DAVCollectionOptions[T]) = this()
  var account: Account = js.native
  var ctag: java.lang.String = js.native
  var data: java.lang.String = js.native
  var description: java.lang.String = js.native
  var displayName: java.lang.String = js.native
  var objects: js.Array[T] = js.native
  var reports: js.Array[java.lang.String] = js.native
  var resourcetype: java.lang.String = js.native
  var syncToken: java.lang.String = js.native
  var url: java.lang.String = js.native
}


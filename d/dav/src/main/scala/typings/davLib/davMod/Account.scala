package typings
package davLib.davMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "Account")
@js.native
class Account () extends js.Object {
  def this(options: AccountOptions) = this()
  var addressBooks: js.Array[AddressBook] = js.native
  var calendars: js.Array[Calendar] = js.native
  var credentials: Credentials = js.native
  var homeUrl: java.lang.String = js.native
  var principalUrl: java.lang.String = js.native
  var rootUrl: java.lang.String = js.native
  var server: java.lang.String = js.native
}


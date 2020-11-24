package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dav", "Account")
@js.native
class Account () extends js.Object {
  def this(options: AccountOptions) = this()
  
  var addressBooks: js.Array[AddressBook] = js.native
  
  var calendars: js.Array[Calendar] = js.native
  
  var credentials: Credentials = js.native
  
  var homeUrl: String = js.native
  
  var principalUrl: String = js.native
  
  var rootUrl: String = js.native
  
  var server: String = js.native
}

package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dav", "VCard")
@js.native
class VCard () extends DAVObject {
  def this(options: VCardOptions) = this()
  
  var addressBook: AddressBook = js.native
  
  var addressData: String = js.native
}

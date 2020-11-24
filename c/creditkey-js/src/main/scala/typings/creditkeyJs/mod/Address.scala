package typings.creditkeyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("creditkey-js", "Address")
@js.native
class Address protected () extends js.Object {
  def this(
    first_name: String,
    last_name: String,
    company_name: String,
    email: String,
    address1: String,
    address2: String,
    city: String,
    state: String,
    zip: String,
    phone_number: String
  ) = this()
  def this(
    first_name: String,
    last_name: String,
    company_name: String,
    email: String,
    address1: String,
    address2: Null,
    city: String,
    state: String,
    zip: String,
    phone_number: String
  ) = this()
  
  def is_valid_address(): Boolean = js.native
}

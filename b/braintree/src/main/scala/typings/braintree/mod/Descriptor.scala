package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descriptor extends js.Object {
  var name: String
  var phone: String
  var url: String
}

object Descriptor {
  @scala.inline
  def apply(name: String, phone: String, url: String): Descriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Descriptor]
  }
}


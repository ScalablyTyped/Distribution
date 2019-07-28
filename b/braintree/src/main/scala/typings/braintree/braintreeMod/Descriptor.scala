package typings.braintree.braintreeMod

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
    val __obj = js.Dynamic.literal(name = name, phone = phone, url = url)
  
    __obj.asInstanceOf[Descriptor]
  }
}


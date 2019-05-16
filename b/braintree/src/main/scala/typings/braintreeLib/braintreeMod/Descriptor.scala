package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descriptor extends js.Object {
  var name: java.lang.String
  var phone: java.lang.String
  var url: java.lang.String
}

object Descriptor {
  @scala.inline
  def apply(name: java.lang.String, phone: java.lang.String, url: java.lang.String): Descriptor = {
    val __obj = js.Dynamic.literal(name = name, phone = phone, url = url)
  
    __obj.asInstanceOf[Descriptor]
  }
}


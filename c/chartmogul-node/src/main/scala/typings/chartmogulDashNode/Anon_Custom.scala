package typings.chartmogulDashNode

import typings.chartmogulDashNode.chartmogulDashNodeMod.Customer.NewCustomAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Custom extends js.Object {
  var custom: js.Array[NewCustomAttributes]
  var email: String
}

object Anon_Custom {
  @scala.inline
  def apply(custom: js.Array[NewCustomAttributes], email: String): Anon_Custom = {
    val __obj = js.Dynamic.literal(custom = custom, email = email)
  
    __obj.asInstanceOf[Anon_Custom]
  }
}


package typings.cqrsDashDomain.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var id: String
}

object Command {
  @scala.inline
  def apply(id: String): Command = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[Command]
  }
}


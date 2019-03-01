package typings
package cqrsDashDomainLib.cqrsDashDomainMod.DomainNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var id: java.lang.String
}

object Command {
  @scala.inline
  def apply(id: java.lang.String): Command = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Command]
  }
}


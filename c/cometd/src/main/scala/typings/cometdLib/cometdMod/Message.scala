package typings
package cometdLib.cometdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var data: js.Any
  var successful: scala.Boolean
}

object Message {
  @scala.inline
  def apply(data: js.Any, successful: scala.Boolean): Message = {
    val __obj = js.Dynamic.literal(data = data, successful = successful)
  
    __obj.asInstanceOf[Message]
  }
}


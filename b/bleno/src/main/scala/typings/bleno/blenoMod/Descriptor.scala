package typings.bleno.blenoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descriptor extends js.Object {
  var uuid: String
  var value: Buffer
}

object Descriptor {
  @scala.inline
  def apply(toString: () => String, uuid: String, value: Buffer): Descriptor = {
    val __obj = js.Dynamic.literal(toString = js.Any.fromFunction0(toString), uuid = uuid, value = value)
  
    __obj.asInstanceOf[Descriptor]
  }
}


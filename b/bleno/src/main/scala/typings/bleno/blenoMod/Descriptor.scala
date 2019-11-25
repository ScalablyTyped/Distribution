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
  def apply(uuid: String, value: Buffer): Descriptor = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Descriptor]
  }
}


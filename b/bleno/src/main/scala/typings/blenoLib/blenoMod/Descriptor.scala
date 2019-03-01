package typings
package blenoLib.blenoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descriptor extends js.Object {
  var uuid: java.lang.String
  var value: nodeLib.Buffer
}

object Descriptor {
  @scala.inline
  def apply(toString: js.Function0[java.lang.String], uuid: java.lang.String, value: nodeLib.Buffer): Descriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("uuid")(uuid)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Descriptor]
  }
}


package typings
package commanderLib.commanderMod.localNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var bool: scala.Boolean
  var description: java.lang.String
  var flags: java.lang.String
  var long: java.lang.String
  var optional: scala.Boolean
  var required: scala.Boolean
  var short: js.UndefOr[java.lang.String] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    bool: scala.Boolean,
    description: java.lang.String,
    flags: java.lang.String,
    long: java.lang.String,
    optional: scala.Boolean,
    required: scala.Boolean,
    short: java.lang.String = null
  ): Option = {
    val __obj = js.Dynamic.literal(bool = bool, description = description, flags = flags, long = long, optional = optional, required = required)
    if (short != null) __obj.updateDynamic("short")(short)
    __obj.asInstanceOf[Option]
  }
}


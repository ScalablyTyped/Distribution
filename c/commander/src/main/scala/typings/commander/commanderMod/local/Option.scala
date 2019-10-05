package typings.commander.commanderMod.local

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var bool: Boolean
  var description: String
  var flags: String
  var long: String
  var optional: Boolean
  var required: Boolean
  var short: js.UndefOr[String] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    bool: Boolean,
    description: String,
    flags: String,
    long: String,
    optional: Boolean,
    required: Boolean,
    short: String = null
  ): Option = {
    val __obj = js.Dynamic.literal(bool = bool, description = description, flags = flags, long = long, optional = optional, required = required)
    if (short != null) __obj.updateDynamic("short")(short)
    __obj.asInstanceOf[Option]
  }
}


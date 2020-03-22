package typings.commander.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
   // The option must have a value after parsing, which usually means it must be specified on command line.
  var bool: Boolean
  var description: String
  var flags: String
  var long: String
   // A value is optional when the option is specified.
  var mandatory: Boolean
   // A value must be supplied when the option is specified.
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
    mandatory: Boolean,
    optional: Boolean,
    required: Boolean,
    short: String = null
  ): Option = {
    val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], mandatory = mandatory.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}


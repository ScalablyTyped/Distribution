package typings.commander.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
   // The option must have a value after parsing, which usually means it must be specified on command line.
  var bool: Boolean = js.native
  var description: String = js.native
  var flags: String = js.native
  var long: String = js.native
   // A value is optional when the option is specified.
  var mandatory: Boolean = js.native
   // A value must be supplied when the option is specified.
  var optional: Boolean = js.native
  var required: Boolean = js.native
  var short: js.UndefOr[String] = js.native
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
    required: Boolean
  ): Option = {
    val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], mandatory = mandatory.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBool(value: Boolean): Self = this.set("bool", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setLong(value: String): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def setMandatory(value: Boolean): Self = this.set("mandatory", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort(value: String): Self = this.set("short", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShort: Self = this.set("short", js.undefined)
  }
  
}


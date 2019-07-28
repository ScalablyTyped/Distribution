package typings.convict.convictMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaObj[T] extends js.Object {
  var arg: js.UndefOr[String] = js.undefined
  var default: T
  var doc: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[String] = js.undefined
  /**
    * From the implementation:
    *
    *  format can be a:
    *   - predefined type, as seen below
    *   - an array of enumerated values, e.g. ["production", "development", "testing"]
    *   - built-in JavaScript type, i.e. Object, Array, String, Number, Boolean
    *   - function that performs validation and throws an Error on failure
    *
    * If omitted, format will be set to the value of Object.prototype.toString.call
    * for the default value
    */
  var format: js.UndefOr[PredefinedFormat | js.Array[_] | (js.Function1[/* val */ js.Any, Unit])] = js.undefined
  var sensitive: js.UndefOr[Boolean] = js.undefined
}

object SchemaObj {
  @scala.inline
  def apply[T](
    default: T,
    arg: String = null,
    doc: String = null,
    env: String = null,
    format: PredefinedFormat | js.Array[_] | (js.Function1[/* val */ js.Any, Unit]) = null,
    sensitive: js.UndefOr[Boolean] = js.undefined
  ): SchemaObj[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    if (arg != null) __obj.updateDynamic("arg")(arg)
    if (doc != null) __obj.updateDynamic("doc")(doc)
    if (env != null) __obj.updateDynamic("env")(env)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive)
    __obj.asInstanceOf[SchemaObj[T]]
  }
}


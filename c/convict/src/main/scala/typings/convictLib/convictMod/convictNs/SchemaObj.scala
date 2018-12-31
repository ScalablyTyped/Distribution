package typings
package convictLib.convictMod.convictNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaObj[T] extends js.Object {
  var arg: js.UndefOr[java.lang.String] = js.undefined
  var default: T
  var doc: js.UndefOr[java.lang.String] = js.undefined
  var env: js.UndefOr[java.lang.String] = js.undefined
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
  var format: js.UndefOr[PredefinedFormat | js.Array[_] | (js.Function1[/* val */ js.Any, scala.Unit])] = js.undefined
  var sensitive: js.UndefOr[scala.Boolean] = js.undefined
}


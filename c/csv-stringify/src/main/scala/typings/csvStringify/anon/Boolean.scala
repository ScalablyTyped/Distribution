package typings.csvStringify.anon

import typings.csvStringify.es5Mod.Cast
import typings.csvStringify.es5Mod.CastingContext
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boolean extends js.Object {
  var boolean: js.UndefOr[Cast[scala.Boolean]] = js.undefined
  var date: js.UndefOr[Cast[typings.std.Date]] = js.undefined
  var number: js.UndefOr[Cast[Double]] = js.undefined
  /**
    * Custom formatter for generic object values
    */
  var `object`: js.UndefOr[Cast[Record[String, _]]] = js.undefined
  var string: js.UndefOr[Cast[String]] = js.undefined
}

object Boolean {
  @scala.inline
  def apply(
    boolean: (scala.Boolean, /* context */ CastingContext) => String = null,
    date: (typings.std.Date, /* context */ CastingContext) => String = null,
    number: (Double, /* context */ CastingContext) => String = null,
    `object`: (Record[String, _], /* context */ CastingContext) => String = null,
    string: (String, /* context */ CastingContext) => String = null
  ): Boolean = {
    val __obj = js.Dynamic.literal()
    if (boolean != null) __obj.updateDynamic("boolean")(js.Any.fromFunction2(boolean))
    if (date != null) __obj.updateDynamic("date")(js.Any.fromFunction2(date))
    if (number != null) __obj.updateDynamic("number")(js.Any.fromFunction2(number))
    if (`object` != null) __obj.updateDynamic("object")(js.Any.fromFunction2(`object`))
    if (string != null) __obj.updateDynamic("string")(js.Any.fromFunction2(string))
    __obj.asInstanceOf[Boolean]
  }
}


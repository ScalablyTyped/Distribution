package typings
package babyparseLib.BabyParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @interface ParseResult
  *
  * data: is an array of rows. If header is false, rows are arrays; otherwise they are objects of data keyed by the field name.
  * errors: is an array of errors
  * meta: contains extra information about the parse, such as delimiter used, the newline sequence, whether the process was aborted, etc. Properties in this object are not guaranteed to exist in all situations
  */
trait ParseResult extends js.Object {
  var data: js.Array[_]
  var errors: js.Array[ParseError]
  var meta: ParseMeta
}

object ParseResult {
  @scala.inline
  def apply(data: js.Array[_], errors: js.Array[ParseError], meta: ParseMeta): ParseResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[ParseResult]
  }
}


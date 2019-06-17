package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationLocale extends js.Object {
  var next: java.lang.String
  var preposition: java.lang.String
  var prev: java.lang.String
}

object PaginationLocale {
  @scala.inline
  def apply(next: java.lang.String, preposition: java.lang.String, prev: java.lang.String): PaginationLocale = {
    val __obj = js.Dynamic.literal(next = next, preposition = preposition, prev = prev)
  
    __obj.asInstanceOf[PaginationLocale]
  }
}


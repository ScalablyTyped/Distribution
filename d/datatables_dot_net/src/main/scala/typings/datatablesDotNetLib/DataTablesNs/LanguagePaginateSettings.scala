package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguagePaginateSettings extends js.Object {
  var first: java.lang.String
  var last: java.lang.String
  var next: java.lang.String
  var previous: java.lang.String
}

object LanguagePaginateSettings {
  @scala.inline
  def apply(
    first: java.lang.String,
    last: java.lang.String,
    next: java.lang.String,
    previous: java.lang.String
  ): LanguagePaginateSettings = {
    val __obj = js.Dynamic.literal(first = first, last = last, next = next, previous = previous)
  
    __obj.asInstanceOf[LanguagePaginateSettings]
  }
}


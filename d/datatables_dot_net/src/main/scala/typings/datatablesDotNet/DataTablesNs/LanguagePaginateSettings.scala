package typings.datatablesDotNet.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguagePaginateSettings extends js.Object {
  var first: String
  var last: String
  var next: String
  var previous: String
}

object LanguagePaginateSettings {
  @scala.inline
  def apply(first: String, last: String, next: String, previous: String): LanguagePaginateSettings = {
    val __obj = js.Dynamic.literal(first = first, last = last, next = next, previous = previous)
  
    __obj.asInstanceOf[LanguagePaginateSettings]
  }
}


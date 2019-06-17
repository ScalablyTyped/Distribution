package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectLocale extends js.Object {
  var create: java.lang.String
  // Remove noResultsMsg prop in the next major version
  var noResultsMsg: java.lang.String
  var placeholder: java.lang.String
}

object SelectLocale {
  @scala.inline
  def apply(create: java.lang.String, noResultsMsg: java.lang.String, placeholder: java.lang.String): SelectLocale = {
    val __obj = js.Dynamic.literal(create = create, noResultsMsg = noResultsMsg, placeholder = placeholder)
  
    __obj.asInstanceOf[SelectLocale]
  }
}


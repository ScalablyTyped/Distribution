package typings.bootstrap3Typeahead.Bootstrap3Typeahead

import typings.bootstrap3Typeahead.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeahead extends js.Object {
  @JSName("$element")
  var $element: JQuery
  var options: Options
}

object Typeahead {
  @scala.inline
  def apply($element: JQuery, options: Options): Typeahead = {
    val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeahead]
  }
}


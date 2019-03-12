package typings
package bootpagLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  /**
    * jQuery Bootpag plugin main method
    */
  def bootpag(options: bootpagLib.JqueryBootpagNs.Options): JQuery
  /**
    * jQuery Bootpag "page" event occurring on page click.
    * @param eventName : always "page"
    * @param handler : A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_page(eventName: bootpagLib.bootpagLibStrings.page, handler: bootpagLib.JqueryBootpagNs.PageEventHandler): JQuery
}

object JQuery {
  @scala.inline
  def apply(
    bootpag: bootpagLib.JqueryBootpagNs.Options => JQuery,
    on_page: (bootpagLib.bootpagLibStrings.page, bootpagLib.JqueryBootpagNs.PageEventHandler) => JQuery
  ): JQuery = {
    val __obj = js.Dynamic.literal(bootpag = js.Any.fromFunction1(bootpag))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_page))
    __obj.asInstanceOf[JQuery]
  }
}


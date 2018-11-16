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


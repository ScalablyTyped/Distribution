package typings.bootpag

import typings.bootpag.JqueryBootpag.Options
import typings.bootpag.JqueryBootpag.PageEventHandler
import typings.bootpag.bootpagStrings.page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * jQuery Bootpag plugin main method
    */
  def bootpag(options: Options): JQuery = js.native
  /**
    * jQuery Bootpag "page" event occurring on page click.
    * @param eventName : always "page"
    * @param handler : A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_page(eventName: page, handler: PageEventHandler): JQuery = js.native
}

object JQuery {
  @scala.inline
  def apply(bootpag: Options => JQuery, on: (page, PageEventHandler) => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(bootpag = js.Any.fromFunction1(bootpag), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[JQuery]
  }
  @scala.inline
  implicit class JQueryOps[Self <: JQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBootpag(value: Options => JQuery): Self = this.set("bootpag", js.Any.fromFunction1(value))
    @scala.inline
    def setOn(value: (page, PageEventHandler) => JQuery): Self = this.set("on", js.Any.fromFunction2(value))
  }
  
}


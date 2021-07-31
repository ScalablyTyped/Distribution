package typings.bootpag

import typings.bootpag.JqueryBootpag.Options
import typings.bootpag.JqueryBootpag.PageEventHandler
import typings.bootpag.bootpagStrings.page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * jQuery Bootpag plugin main method
    */
  def bootpag(options: Options): JQuery
  
  /**
    * jQuery Bootpag "page" event occurring on page click.
    * @param eventName : always "page"
    * @param handler : A function to execute when the event is triggered. The value false is also allowed as a shorthand for a function that simply does return false.
    */
  @JSName("on")
  def on_page(eventName: page, handler: PageEventHandler): JQuery
}
object JQuery {
  
  @scala.inline
  def apply(bootpag: Options => JQuery, on: (page, PageEventHandler) => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(bootpag = js.Any.fromFunction1(bootpag), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBootpag(value: Options => JQuery): Self = StObject.set(x, "bootpag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOn(value: (page, PageEventHandler) => JQuery): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}

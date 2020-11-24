package typings.bootstrap3Typeahead.Bootstrap3Typeahead

import typings.bootstrap3Typeahead.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeahead extends js.Object {
  
  @JSName("$element")
  var $element: JQuery = js.native
  
  var options: Options = js.native
}
object Typeahead {
  
  @scala.inline
  def apply($element: JQuery, options: Options): Typeahead = {
    val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeahead]
  }
  
  @scala.inline
  implicit class TypeaheadOps[Self <: Typeahead] (val x: Self) extends AnyVal {
    
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
    def set$element(value: JQuery): Self = this.set("$element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}

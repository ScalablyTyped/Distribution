package typings.countdown.countdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format extends js.Object {
  
  var delim: js.UndefOr[String] = js.native
  
  var empty: js.UndefOr[String] = js.native
  
  var formatNumber: js.UndefOr[js.Function1[/* value */ Double, String]] = js.native
  
  var formatter: js.UndefOr[js.Function2[/* value */ Double, /* unit */ Double, String]] = js.native
  
  var last: js.UndefOr[String] = js.native
  
  var plural: js.UndefOr[String | js.Array[String]] = js.native
  
  var singular: js.UndefOr[String | js.Array[String]] = js.native
}
object Format {
  
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    
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
    def setDelim(value: String): Self = this.set("delim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelim: Self = this.set("delim", js.undefined)
    
    @scala.inline
    def setEmpty(value: String): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    
    @scala.inline
    def setFormatNumber(value: /* value */ Double => String): Self = this.set("formatNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatNumber: Self = this.set("formatNumber", js.undefined)
    
    @scala.inline
    def setFormatter(value: (/* value */ Double, /* unit */ Double) => String): Self = this.set("formatter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setLast(value: String): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    
    @scala.inline
    def setPluralVarargs(value: String*): Self = this.set("plural", js.Array(value :_*))
    
    @scala.inline
    def setPlural(value: String | js.Array[String]): Self = this.set("plural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlural: Self = this.set("plural", js.undefined)
    
    @scala.inline
    def setSingularVarargs(value: String*): Self = this.set("singular", js.Array(value :_*))
    
    @scala.inline
    def setSingular(value: String | js.Array[String]): Self = this.set("singular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingular: Self = this.set("singular", js.undefined)
  }
}

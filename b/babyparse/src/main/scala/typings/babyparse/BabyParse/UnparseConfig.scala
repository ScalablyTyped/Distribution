package typings.babyparse.BabyParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnparseConfig extends js.Object {
  
      // default: false
  var delimiter: js.UndefOr[String] = js.native
  
    // default: ","
  var newline: js.UndefOr[String] = js.native
  
  var quotes: js.UndefOr[Boolean | js.Array[Boolean]] = js.native
}
object UnparseConfig {
  
  @scala.inline
  def apply(): UnparseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnparseConfig]
  }
  
  @scala.inline
  implicit class UnparseConfigOps[Self <: UnparseConfig] (val x: Self) extends AnyVal {
    
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setNewline(value: String): Self = this.set("newline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewline: Self = this.set("newline", js.undefined)
    
    @scala.inline
    def setQuotesVarargs(value: Boolean*): Self = this.set("quotes", js.Array(value :_*))
    
    @scala.inline
    def setQuotes(value: Boolean | js.Array[Boolean]): Self = this.set("quotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotes: Self = this.set("quotes", js.undefined)
  }
}

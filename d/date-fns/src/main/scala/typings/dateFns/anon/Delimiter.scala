package typings.dateFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delimiter extends js.Object {
  
  var delimiter: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[js.Array[String]] = js.native
  
  var locale: js.UndefOr[typings.dateFns.mod.Locale] = js.native
  
  var zero: js.UndefOr[Boolean] = js.native
}
object Delimiter {
  
  @scala.inline
  def apply(): Delimiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delimiter]
  }
  
  @scala.inline
  implicit class DelimiterOps[Self <: Delimiter] (val x: Self) extends AnyVal {
    
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
    def setFormatVarargs(value: String*): Self = this.set("format", js.Array(value :_*))
    
    @scala.inline
    def setFormat(value: js.Array[String]): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLocale(value: typings.dateFns.mod.Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setZero(value: Boolean): Self = this.set("zero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZero: Self = this.set("zero", js.undefined)
  }
}

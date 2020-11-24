package typings.cssesc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Partial<cssesc.cssesc.Options>> */
@js.native
trait ReadonlyPartialOptions extends js.Object {
  
  val escapeEverything: js.UndefOr[Boolean] = js.native
  
  val isIdentifier: js.UndefOr[Boolean] = js.native
  
  val quotes: js.UndefOr[String] = js.native
  
  val wrap: js.UndefOr[Boolean] = js.native
}
object ReadonlyPartialOptions {
  
  @scala.inline
  def apply(): ReadonlyPartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyPartialOptions]
  }
  
  @scala.inline
  implicit class ReadonlyPartialOptionsOps[Self <: ReadonlyPartialOptions] (val x: Self) extends AnyVal {
    
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
    def setEscapeEverything(value: Boolean): Self = this.set("escapeEverything", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeEverything: Self = this.set("escapeEverything", js.undefined)
    
    @scala.inline
    def setIsIdentifier(value: Boolean): Self = this.set("isIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIdentifier: Self = this.set("isIdentifier", js.undefined)
    
    @scala.inline
    def setQuotes(value: String): Self = this.set("quotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotes: Self = this.set("quotes", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}

package typings.bodyParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsText extends Options {
  
  /**
    * Specify the default character set for the text content if the charset
    * is not specified in the Content-Type header of the request.
    * Defaults to `utf-8`.
    */
  var defaultCharset: js.UndefOr[String] = js.native
}
object OptionsText {
  
  @scala.inline
  def apply(): OptionsText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsText]
  }
  
  @scala.inline
  implicit class OptionsTextOps[Self <: OptionsText] (val x: Self) extends AnyVal {
    
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
    def setDefaultCharset(value: String): Self = this.set("defaultCharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCharset: Self = this.set("defaultCharset", js.undefined)
  }
}

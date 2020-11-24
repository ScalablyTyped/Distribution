package typings.clownface.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutOptions extends js.Object {
  
  var language: js.UndefOr[String | js.Array[String]] = js.native
}
object OutOptions {
  
  @scala.inline
  def apply(): OutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutOptions]
  }
  
  @scala.inline
  implicit class OutOptionsOps[Self <: OutOptions] (val x: Self) extends AnyVal {
    
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
    def setLanguageVarargs(value: String*): Self = this.set("language", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: String | js.Array[String]): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
}

package typings.cssWhat.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var lowerCaseAttributeNames: js.UndefOr[Boolean] = js.native
  
  var lowerCaseTags: js.UndefOr[Boolean] = js.native
  
  var xmlMode: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setLowerCaseAttributeNames(value: Boolean): Self = this.set("lowerCaseAttributeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerCaseAttributeNames: Self = this.set("lowerCaseAttributeNames", js.undefined)
    
    @scala.inline
    def setLowerCaseTags(value: Boolean): Self = this.set("lowerCaseTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerCaseTags: Self = this.set("lowerCaseTags", js.undefined)
    
    @scala.inline
    def setXmlMode(value: Boolean): Self = this.set("xmlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlMode: Self = this.set("xmlMode", js.undefined)
  }
}

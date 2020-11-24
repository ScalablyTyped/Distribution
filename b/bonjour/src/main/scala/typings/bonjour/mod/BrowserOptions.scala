package typings.bonjour.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserOptions extends js.Object {
  
  var protocol: js.UndefOr[String] = js.native
  
  var subtypes: js.UndefOr[js.Array[String]] = js.native
  
  var txt: js.UndefOr[StringDictionary[String]] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object BrowserOptions {
  
  @scala.inline
  def apply(): BrowserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserOptions]
  }
  
  @scala.inline
  implicit class BrowserOptionsOps[Self <: BrowserOptions] (val x: Self) extends AnyVal {
    
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
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setSubtypesVarargs(value: String*): Self = this.set("subtypes", js.Array(value :_*))
    
    @scala.inline
    def setSubtypes(value: js.Array[String]): Self = this.set("subtypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtypes: Self = this.set("subtypes", js.undefined)
    
    @scala.inline
    def setTxt(value: StringDictionary[String]): Self = this.set("txt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTxt: Self = this.set("txt", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

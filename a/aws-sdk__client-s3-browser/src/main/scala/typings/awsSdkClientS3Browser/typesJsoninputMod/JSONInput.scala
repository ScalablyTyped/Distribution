package typings.awsSdkClientS3Browser.typesJsoninputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.DOCUMENT
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.LINES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONInput extends js.Object {
  
  /**
    * <p>The type of JSON. Valid values: Document, Lines.</p>
    */
  var Type: js.UndefOr[DOCUMENT | LINES | String] = js.native
}
object JSONInput {
  
  @scala.inline
  def apply(): JSONInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONInput]
  }
  
  @scala.inline
  implicit class JSONInputOps[Self <: JSONInput] (val x: Self) extends AnyVal {
    
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
    def setType(value: DOCUMENT | LINES | String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}

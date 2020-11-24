package typings.contentfulManagement.webhookMod

import typings.contentfulManagement.contentfulManagementStrings.sysDotcontentTypeDotsysDotid
import typings.contentfulManagement.contentfulManagementStrings.sysDotenvironmentDotsysDotid
import typings.contentfulManagement.contentfulManagementStrings.sysDotid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Doc extends js.Object {
  
  var doc: sysDotid | sysDotcontentTypeDotsysDotid | sysDotenvironmentDotsysDotid = js.native
}
object Doc {
  
  @scala.inline
  def apply(doc: sysDotid | sysDotcontentTypeDotsysDotid | sysDotenvironmentDotsysDotid): Doc = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc]
  }
  
  @scala.inline
  implicit class DocOps[Self <: Doc] (val x: Self) extends AnyVal {
    
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
    def setDoc(value: sysDotid | sysDotcontentTypeDotsysDotid | sysDotenvironmentDotsysDotid): Self = this.set("doc", value.asInstanceOf[js.Any])
  }
}

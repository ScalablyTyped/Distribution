package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplacementEmailContent extends js.Object {
  
  /**
    * The ReplacementTemplate associated with ReplacementEmailContent.
    */
  var ReplacementTemplate: js.UndefOr[typings.awsSdk.sesv2Mod.ReplacementTemplate] = js.native
}
object ReplacementEmailContent {
  
  @scala.inline
  def apply(): ReplacementEmailContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplacementEmailContent]
  }
  
  @scala.inline
  implicit class ReplacementEmailContentOps[Self <: ReplacementEmailContent] (val x: Self) extends AnyVal {
    
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
    def setReplacementTemplate(value: ReplacementTemplate): Self = this.set("ReplacementTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacementTemplate: Self = this.set("ReplacementTemplate", js.undefined)
  }
}

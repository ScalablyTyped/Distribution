package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an Attachment. */
@js.native
trait IAttachment extends js.Object {
  
  /** Attachment data */
  var data: js.UndefOr[String | Null] = js.native
  
  /** Attachment media */
  var media: js.UndefOr[IMedia | Null] = js.native
  
  /** Attachment source */
  var source: js.UndefOr[ISourceReference | Null] = js.native
  
  /** Attachment testCaseStartedId */
  var testCaseStartedId: js.UndefOr[String | Null] = js.native
  
  /** Attachment testStepId */
  var testStepId: js.UndefOr[String | Null] = js.native
}
object IAttachment {
  
  @scala.inline
  def apply(): IAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAttachment]
  }
  
  @scala.inline
  implicit class IAttachmentOps[Self <: IAttachment] (val x: Self) extends AnyVal {
    
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    
    @scala.inline
    def setMedia(value: IMedia): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setMediaNull: Self = this.set("media", null)
    
    @scala.inline
    def setSource(value: ISourceReference): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
    
    @scala.inline
    def setTestCaseStartedId(value: String): Self = this.set("testCaseStartedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestCaseStartedId: Self = this.set("testCaseStartedId", js.undefined)
    
    @scala.inline
    def setTestCaseStartedIdNull: Self = this.set("testCaseStartedId", null)
    
    @scala.inline
    def setTestStepId(value: String): Self = this.set("testStepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestStepId: Self = this.set("testStepId", js.undefined)
    
    @scala.inline
    def setTestStepIdNull: Self = this.set("testStepId", null)
  }
}

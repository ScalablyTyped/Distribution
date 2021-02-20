package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an Attachment. */
@js.native
trait IAttachment extends StObject {
  
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
  implicit class IAttachmentMutableBuilder[Self <: IAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataNull: Self = StObject.set(x, "data", null)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setMedia(value: IMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaNull: Self = StObject.set(x, "media", null)
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setSource(value: ISourceReference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTestCaseStartedId(value: String): Self = StObject.set(x, "testCaseStartedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseStartedIdNull: Self = StObject.set(x, "testCaseStartedId", null)
    
    @scala.inline
    def setTestCaseStartedIdUndefined: Self = StObject.set(x, "testCaseStartedId", js.undefined)
    
    @scala.inline
    def setTestStepId(value: String): Self = StObject.set(x, "testStepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestStepIdNull: Self = StObject.set(x, "testStepId", null)
    
    @scala.inline
    def setTestStepIdUndefined: Self = StObject.set(x, "testStepId", js.undefined)
  }
}

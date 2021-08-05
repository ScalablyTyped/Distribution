package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an Attachment. */
trait IAttachment extends StObject {
  
  /** Attachment data */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /** Attachment media */
  var media: js.UndefOr[IMedia | Null] = js.undefined
  
  /** Attachment source */
  var source: js.UndefOr[ISourceReference | Null] = js.undefined
  
  /** Attachment testCaseStartedId */
  var testCaseStartedId: js.UndefOr[String | Null] = js.undefined
  
  /** Attachment testStepId */
  var testStepId: js.UndefOr[String | Null] = js.undefined
}
object IAttachment {
  
  inline def apply(): IAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAttachment]
  }
  
  extension [Self <: IAttachment](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setMedia(value: IMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaNull: Self = StObject.set(x, "media", null)
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setSource(value: ISourceReference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTestCaseStartedId(value: String): Self = StObject.set(x, "testCaseStartedId", value.asInstanceOf[js.Any])
    
    inline def setTestCaseStartedIdNull: Self = StObject.set(x, "testCaseStartedId", null)
    
    inline def setTestCaseStartedIdUndefined: Self = StObject.set(x, "testCaseStartedId", js.undefined)
    
    inline def setTestStepId(value: String): Self = StObject.set(x, "testStepId", value.asInstanceOf[js.Any])
    
    inline def setTestStepIdNull: Self = StObject.set(x, "testStepId", null)
    
    inline def setTestStepIdUndefined: Self = StObject.set(x, "testStepId", js.undefined)
  }
}

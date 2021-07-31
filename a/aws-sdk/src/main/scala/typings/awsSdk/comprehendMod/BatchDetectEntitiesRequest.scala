package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetectEntitiesRequest extends StObject {
  
  /**
    * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend. All documents must be in the same language.
    */
  var LanguageCode: typings.awsSdk.comprehendMod.LanguageCode
  
  /**
    * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document must contain fewer than 5,000 bytes of UTF-8 encoded characters.
    */
  var TextList: CustomerInputStringList
}
object BatchDetectEntitiesRequest {
  
  @scala.inline
  def apply(LanguageCode: LanguageCode, TextList: CustomerInputStringList): BatchDetectEntitiesRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], TextList = TextList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectEntitiesRequest]
  }
  
  @scala.inline
  implicit class BatchDetectEntitiesRequestMutableBuilder[Self <: BatchDetectEntitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextList(value: CustomerInputStringList): Self = StObject.set(x, "TextList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextListVarargs(value: CustomerInputString*): Self = StObject.set(x, "TextList", js.Array(value :_*))
  }
}

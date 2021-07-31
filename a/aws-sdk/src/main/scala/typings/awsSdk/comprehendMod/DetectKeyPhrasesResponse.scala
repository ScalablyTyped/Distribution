package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectKeyPhrasesResponse extends StObject {
  
  /**
    * A collection of key phrases that Amazon Comprehend identified in the input text. For each key phrase, the response provides the text of the key phrase, where the key phrase begins and ends, and the level of confidence that Amazon Comprehend has in the accuracy of the detection. 
    */
  var KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.undefined
}
object DetectKeyPhrasesResponse {
  
  @scala.inline
  def apply(): DetectKeyPhrasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectKeyPhrasesResponse]
  }
  
  @scala.inline
  implicit class DetectKeyPhrasesResponseMutableBuilder[Self <: DetectKeyPhrasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyPhrases(value: ListOfKeyPhrases): Self = StObject.set(x, "KeyPhrases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPhrasesUndefined: Self = StObject.set(x, "KeyPhrases", js.undefined)
    
    @scala.inline
    def setKeyPhrasesVarargs(value: KeyPhrase*): Self = StObject.set(x, "KeyPhrases", js.Array(value :_*))
  }
}

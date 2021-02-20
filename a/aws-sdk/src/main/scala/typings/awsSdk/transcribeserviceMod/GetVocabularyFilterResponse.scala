package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVocabularyFilterResponse extends StObject {
  
  /**
    * The URI of the list of words in the vocabulary filter. You can use this URI to get the list of words.
    */
  var DownloadUri: js.UndefOr[Uri] = js.native
  
  /**
    * The language code of the words in the vocabulary filter.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.native
  
  /**
    * The date and time that the contents of the vocabulary filter were updated.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The name of the vocabulary filter.
    */
  var VocabularyFilterName: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyFilterName] = js.native
}
object GetVocabularyFilterResponse {
  
  @scala.inline
  def apply(): GetVocabularyFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVocabularyFilterResponse]
  }
  
  @scala.inline
  implicit class GetVocabularyFilterResponseMutableBuilder[Self <: GetVocabularyFilterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadUri(value: Uri): Self = StObject.set(x, "DownloadUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUriUndefined: Self = StObject.set(x, "DownloadUri", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: DateTime): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyFilterNameUndefined: Self = StObject.set(x, "VocabularyFilterName", js.undefined)
  }
}

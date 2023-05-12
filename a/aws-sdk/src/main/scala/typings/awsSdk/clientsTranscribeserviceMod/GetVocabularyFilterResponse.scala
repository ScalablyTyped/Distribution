package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVocabularyFilterResponse extends StObject {
  
  /**
    * The Amazon S3 location where the custom vocabulary filter is stored; use this URI to view or download the custom vocabulary filter.
    */
  var DownloadUri: js.UndefOr[Uri] = js.undefined
  
  /**
    * The language code you selected for your custom vocabulary filter.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.LanguageCode] = js.undefined
  
  /**
    * The date and time the specified custom vocabulary filter was last modified. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.761000-07:00 represents 12:32 PM UTC-7 on May 4, 2022.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the custom vocabulary filter you requested information about.
    */
  var VocabularyFilterName: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.VocabularyFilterName] = js.undefined
}
object GetVocabularyFilterResponse {
  
  inline def apply(): GetVocabularyFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVocabularyFilterResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVocabularyFilterResponse] (val x: Self) extends AnyVal {
    
    inline def setDownloadUri(value: Uri): Self = StObject.set(x, "DownloadUri", value.asInstanceOf[js.Any])
    
    inline def setDownloadUriUndefined: Self = StObject.set(x, "DownloadUri", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
    
    inline def setVocabularyFilterNameUndefined: Self = StObject.set(x, "VocabularyFilterName", js.undefined)
  }
}

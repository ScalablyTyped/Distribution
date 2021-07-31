package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VocabularyFilterInfo extends StObject {
  
  /**
    * The language code of the words in the vocabulary filter.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.transcribeserviceMod.LanguageCode] = js.undefined
  
  /**
    * The date and time that the vocabulary was last updated.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The name of the vocabulary filter. The name must be unique in the account that holds the filter.
    */
  var VocabularyFilterName: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyFilterName] = js.undefined
}
object VocabularyFilterInfo {
  
  @scala.inline
  def apply(): VocabularyFilterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VocabularyFilterInfo]
  }
  
  @scala.inline
  implicit class VocabularyFilterInfoMutableBuilder[Self <: VocabularyFilterInfo] (val x: Self) extends AnyVal {
    
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

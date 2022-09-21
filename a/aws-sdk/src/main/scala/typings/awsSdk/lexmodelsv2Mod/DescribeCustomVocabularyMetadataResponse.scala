package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomVocabularyMetadataResponse extends StObject {
  
  /**
    * The identifier of the bot that contains the custom vocabulary.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot that contains the custom vocabulary to describe.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * The date and time that the custom vocabulary was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the custom vocabulary. If the status is Ready the custom vocabulary is ready to use.
    */
  var customVocabularyStatus: js.UndefOr[CustomVocabularyStatus] = js.undefined
  
  /**
    * The date and time that the custom vocabulary was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The locale that contains the custom vocabulary to describe.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
}
object DescribeCustomVocabularyMetadataResponse {
  
  inline def apply(): DescribeCustomVocabularyMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomVocabularyMetadataResponse]
  }
  
  extension [Self <: DescribeCustomVocabularyMetadataResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setCustomVocabularyStatus(value: CustomVocabularyStatus): Self = StObject.set(x, "customVocabularyStatus", value.asInstanceOf[js.Any])
    
    inline def setCustomVocabularyStatusUndefined: Self = StObject.set(x, "customVocabularyStatus", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
  }
}

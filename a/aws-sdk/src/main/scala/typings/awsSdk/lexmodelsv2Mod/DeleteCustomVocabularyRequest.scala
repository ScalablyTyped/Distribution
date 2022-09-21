package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomVocabularyRequest extends StObject {
  
  /**
    * The unique identifier of the bot to remove the custom vocabulary from.
    */
  var botId: Id
  
  /**
    * The version of the bot to remove the custom vocabulary from.
    */
  var botVersion: DraftBotVersion
  
  /**
    * The locale identifier for the locale that contains the custom vocabulary to remove.
    */
  var localeId: LocaleId
}
object DeleteCustomVocabularyRequest {
  
  inline def apply(botId: Id, botVersion: DraftBotVersion, localeId: LocaleId): DeleteCustomVocabularyRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomVocabularyRequest]
  }
  
  extension [Self <: DeleteCustomVocabularyRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBotResponse extends StObject {
  
  /**
    * The unique identifier of the bot.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the bot.
    */
  var botName: js.UndefOr[Name] = js.undefined
  
  /**
    * The current status of the bot. When the status is Available the bot is ready to be used in conversations with users.
    */
  var botStatus: js.UndefOr[BotStatus] = js.undefined
  
  /**
    * A timestamp of the date and time that the bot was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Settings for managing data privacy of the bot and its conversations with users.
    */
  var dataPrivacy: js.UndefOr[DataPrivacy] = js.undefined
  
  /**
    * The description of the bot. 
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation.
    */
  var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined
  
  /**
    * A timestamp of the date and time that the bot was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that has permission to access the bot.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}
object DescribeBotResponse {
  
  inline def apply(): DescribeBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBotResponse]
  }
  
  extension [Self <: DescribeBotResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotName(value: Name): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
    
    inline def setBotStatus(value: BotStatus): Self = StObject.set(x, "botStatus", value.asInstanceOf[js.Any])
    
    inline def setBotStatusUndefined: Self = StObject.set(x, "botStatus", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDataPrivacy(value: DataPrivacy): Self = StObject.set(x, "dataPrivacy", value.asInstanceOf[js.Any])
    
    inline def setDataPrivacyUndefined: Self = StObject.set(x, "dataPrivacy", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdleSessionTTLInSeconds(value: SessionTTL): Self = StObject.set(x, "idleSessionTTLInSeconds", value.asInstanceOf[js.Any])
    
    inline def setIdleSessionTTLInSecondsUndefined: Self = StObject.set(x, "idleSessionTTLInSeconds", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}

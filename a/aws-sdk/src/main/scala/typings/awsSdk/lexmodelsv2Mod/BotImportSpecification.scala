package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotImportSpecification extends StObject {
  
  /**
    * The name that Amazon Lex should use for the bot.
    */
  var botName: Name
  
  /**
    * A list of tags to add to the bot. You can only add tags when you import a bot. You can't use the UpdateBot operation to update tags. To update tags, use the TagResource operation.
    */
  var botTags: js.UndefOr[TagMap] = js.undefined
  
  var dataPrivacy: DataPrivacy
  
  /**
    * The time, in seconds, that Amazon Lex should keep information about a user's conversation with the bot.  A user interaction remains active for the amount of time specified. If no conversation occurs during this time, the session expires and Amazon Lex deletes any data provided before the timeout. You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
    */
  var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
    */
  var roleArn: RoleArn
  
  /**
    * A list of tags to add to the test alias for a bot. You can only add tags when you import a bot. You can't use the UpdateAlias operation to update tags. To update tags on the test alias, use the TagResource operation.
    */
  var testBotAliasTags: js.UndefOr[TagMap] = js.undefined
}
object BotImportSpecification {
  
  inline def apply(botName: Name, dataPrivacy: DataPrivacy, roleArn: RoleArn): BotImportSpecification = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], dataPrivacy = dataPrivacy.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotImportSpecification]
  }
  
  extension [Self <: BotImportSpecification](x: Self) {
    
    inline def setBotName(value: Name): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setBotTags(value: TagMap): Self = StObject.set(x, "botTags", value.asInstanceOf[js.Any])
    
    inline def setBotTagsUndefined: Self = StObject.set(x, "botTags", js.undefined)
    
    inline def setDataPrivacy(value: DataPrivacy): Self = StObject.set(x, "dataPrivacy", value.asInstanceOf[js.Any])
    
    inline def setIdleSessionTTLInSeconds(value: SessionTTL): Self = StObject.set(x, "idleSessionTTLInSeconds", value.asInstanceOf[js.Any])
    
    inline def setIdleSessionTTLInSecondsUndefined: Self = StObject.set(x, "idleSessionTTLInSeconds", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTestBotAliasTags(value: TagMap): Self = StObject.set(x, "testBotAliasTags", value.asInstanceOf[js.Any])
    
    inline def setTestBotAliasTagsUndefined: Self = StObject.set(x, "testBotAliasTags", js.undefined)
  }
}

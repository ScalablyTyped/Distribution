package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotAliasSummary extends StObject {
  
  /**
    * The unique identifier assigned to the bot alias. You can use this ID to get detailed information about the alias using the DescribeBotAlias operation.
    */
  var botAliasId: js.UndefOr[BotAliasId] = js.undefined
  
  /**
    * The name of the bot alias.
    */
  var botAliasName: js.UndefOr[Name] = js.undefined
  
  /**
    * The current state of the bot alias. If the status is Available, the alias is ready for use.
    */
  var botAliasStatus: js.UndefOr[BotAliasStatus] = js.undefined
  
  /**
    * The version of the bot that the bot alias references.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * A timestamp of the date and time that the bot alias was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the bot alias.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * A timestamp of the date and time that the bot alias was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
}
object BotAliasSummary {
  
  inline def apply(): BotAliasSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BotAliasSummary]
  }
  
  extension [Self <: BotAliasSummary](x: Self) {
    
    inline def setBotAliasId(value: BotAliasId): Self = StObject.set(x, "botAliasId", value.asInstanceOf[js.Any])
    
    inline def setBotAliasIdUndefined: Self = StObject.set(x, "botAliasId", js.undefined)
    
    inline def setBotAliasName(value: Name): Self = StObject.set(x, "botAliasName", value.asInstanceOf[js.Any])
    
    inline def setBotAliasNameUndefined: Self = StObject.set(x, "botAliasName", js.undefined)
    
    inline def setBotAliasStatus(value: BotAliasStatus): Self = StObject.set(x, "botAliasStatus", value.asInstanceOf[js.Any])
    
    inline def setBotAliasStatusUndefined: Self = StObject.set(x, "botAliasStatus", js.undefined)
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
  }
}

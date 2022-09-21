package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBotVersionResponse extends StObject {
  
  /**
    * The bot identifier specified in the request.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * When you send a request to create or update a bot, Amazon Lex sets the status response element to Creating. After Amazon Lex builds the bot, it sets status to Available. If Amazon Lex can't build the bot, it sets status to Failed.
    */
  var botStatus: js.UndefOr[BotStatus] = js.undefined
  
  /**
    * The version number assigned to the version.
    */
  var botVersion: js.UndefOr[NumericalBotVersion] = js.undefined
  
  /**
    * The source versions used for each locale in the new version.
    */
  var botVersionLocaleSpecification: js.UndefOr[BotVersionLocaleSpecification] = js.undefined
  
  /**
    * A timestamp of the date and time that the version was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the version specified in the request.
    */
  var description: js.UndefOr[Description] = js.undefined
}
object CreateBotVersionResponse {
  
  inline def apply(): CreateBotVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBotVersionResponse]
  }
  
  extension [Self <: CreateBotVersionResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotStatus(value: BotStatus): Self = StObject.set(x, "botStatus", value.asInstanceOf[js.Any])
    
    inline def setBotStatusUndefined: Self = StObject.set(x, "botStatus", js.undefined)
    
    inline def setBotVersion(value: NumericalBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionLocaleSpecification(value: BotVersionLocaleSpecification): Self = StObject.set(x, "botVersionLocaleSpecification", value.asInstanceOf[js.Any])
    
    inline def setBotVersionLocaleSpecificationUndefined: Self = StObject.set(x, "botVersionLocaleSpecification", js.undefined)
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}

package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBotChannelAssociationRequest extends StObject {
  
  /**
    * An alias that points to the specific version of the Amazon Lex bot to which this association is being made.
    */
  var botAlias: AliasName
  
  /**
    * The name of the Amazon Lex bot.
    */
  var botName: BotName
  
  /**
    * The name of the association. The name is case sensitive. 
    */
  var name: BotChannelName
}
object DeleteBotChannelAssociationRequest {
  
  @scala.inline
  def apply(botAlias: AliasName, botName: BotName, name: BotChannelName): DeleteBotChannelAssociationRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBotChannelAssociationRequest]
  }
  
  @scala.inline
  implicit class DeleteBotChannelAssociationRequestMutableBuilder[Self <: DeleteBotChannelAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBotAlias(value: AliasName): Self = StObject.set(x, "botAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: BotChannelName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

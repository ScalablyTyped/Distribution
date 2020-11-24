package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBotChannelAssociationResponse extends js.Object {
  
  /**
    * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
    */
  var botAlias: js.UndefOr[AliasName] = js.native
  
  /**
    * Provides information that the messaging platform needs to communicate with the Amazon Lex bot.
    */
  var botConfiguration: js.UndefOr[ChannelConfigurationMap] = js.native
  
  /**
    * The name of the Amazon Lex bot.
    */
  var botName: js.UndefOr[BotName] = js.native
  
  /**
    * The date that the association between the bot and the channel was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * A description of the association between the bot and the channel.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * If status is FAILED, Amazon Lex provides the reason that it failed to create the association.
    */
  var failureReason: js.UndefOr[String] = js.native
  
  /**
    * The name of the association between the bot and the channel.
    */
  var name: js.UndefOr[BotChannelName] = js.native
  
  /**
    * The status of the bot channel.     CREATED - The channel has been created and is ready for use.    IN_PROGRESS - Channel creation is in progress.    FAILED - There was an error creating the channel. For information about the reason for the failure, see the failureReason field.  
    */
  var status: js.UndefOr[ChannelStatus] = js.native
  
  /**
    * The type of the messaging platform.
    */
  var `type`: js.UndefOr[ChannelType] = js.native
}
object GetBotChannelAssociationResponse {
  
  @scala.inline
  def apply(): GetBotChannelAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotChannelAssociationResponse]
  }
  
  @scala.inline
  implicit class GetBotChannelAssociationResponseOps[Self <: GetBotChannelAssociationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBotAlias(value: AliasName): Self = this.set("botAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotAlias: Self = this.set("botAlias", js.undefined)
    
    @scala.inline
    def setBotConfiguration(value: ChannelConfigurationMap): Self = this.set("botConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotConfiguration: Self = this.set("botConfiguration", js.undefined)
    
    @scala.inline
    def setBotName(value: BotName): Self = this.set("botName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotName: Self = this.set("botName", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFailureReason(value: String): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    
    @scala.inline
    def setName(value: BotChannelName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStatus(value: ChannelStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setType(value: ChannelType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

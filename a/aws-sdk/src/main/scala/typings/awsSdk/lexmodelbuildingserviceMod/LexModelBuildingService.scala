package typings.awsSdk.lexmodelbuildingserviceMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LexModelBuildingService extends Service {
  
  @JSName("config")
  var config_LexModelBuildingService: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new version of the bot based on the $LATEST version. If the $LATEST version of this resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version. It returns the last created version.  You can update only the $LATEST version of the bot. You can't update the numbered versions that you create with the CreateBotVersion operation.   When you create the first version of a bot, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.   This operation requires permission for the lex:CreateBotVersion action. 
    */
  def createBotVersion(): Request[CreateBotVersionResponse, AWSError] = js.native
  def createBotVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateBotVersionResponse, Unit]): Request[CreateBotVersionResponse, AWSError] = js.native
  /**
    * Creates a new version of the bot based on the $LATEST version. If the $LATEST version of this resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version. It returns the last created version.  You can update only the $LATEST version of the bot. You can't update the numbered versions that you create with the CreateBotVersion operation.   When you create the first version of a bot, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.   This operation requires permission for the lex:CreateBotVersion action. 
    */
  def createBotVersion(params: CreateBotVersionRequest): Request[CreateBotVersionResponse, AWSError] = js.native
  def createBotVersion(
    params: CreateBotVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBotVersionResponse, Unit]
  ): Request[CreateBotVersionResponse, AWSError] = js.native
  
  /**
    * Creates a new version of an intent based on the $LATEST version of the intent. If the $LATEST version of this intent hasn't changed since you last updated it, Amazon Lex doesn't create a new version. It returns the last version you created.  You can update only the $LATEST version of the intent. You can't update the numbered versions that you create with the CreateIntentVersion operation.   When you create a version of an intent, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.  This operation requires permissions to perform the lex:CreateIntentVersion action. 
    */
  def createIntentVersion(): Request[CreateIntentVersionResponse, AWSError] = js.native
  def createIntentVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateIntentVersionResponse, Unit]): Request[CreateIntentVersionResponse, AWSError] = js.native
  /**
    * Creates a new version of an intent based on the $LATEST version of the intent. If the $LATEST version of this intent hasn't changed since you last updated it, Amazon Lex doesn't create a new version. It returns the last version you created.  You can update only the $LATEST version of the intent. You can't update the numbered versions that you create with the CreateIntentVersion operation.   When you create a version of an intent, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.  This operation requires permissions to perform the lex:CreateIntentVersion action. 
    */
  def createIntentVersion(params: CreateIntentVersionRequest): Request[CreateIntentVersionResponse, AWSError] = js.native
  def createIntentVersion(
    params: CreateIntentVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIntentVersionResponse, Unit]
  ): Request[CreateIntentVersionResponse, AWSError] = js.native
  
  /**
    * Creates a new version of a slot type based on the $LATEST version of the specified slot type. If the $LATEST version of this resource has not changed since the last version that you created, Amazon Lex doesn't create a new version. It returns the last version that you created.   You can update only the $LATEST version of a slot type. You can't update the numbered versions that you create with the CreateSlotTypeVersion operation.  When you create a version of a slot type, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.  This operation requires permissions for the lex:CreateSlotTypeVersion action.
    */
  def createSlotTypeVersion(): Request[CreateSlotTypeVersionResponse, AWSError] = js.native
  def createSlotTypeVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateSlotTypeVersionResponse, Unit]): Request[CreateSlotTypeVersionResponse, AWSError] = js.native
  /**
    * Creates a new version of a slot type based on the $LATEST version of the specified slot type. If the $LATEST version of this resource has not changed since the last version that you created, Amazon Lex doesn't create a new version. It returns the last version that you created.   You can update only the $LATEST version of a slot type. You can't update the numbered versions that you create with the CreateSlotTypeVersion operation.  When you create a version of a slot type, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.  This operation requires permissions for the lex:CreateSlotTypeVersion action.
    */
  def createSlotTypeVersion(params: CreateSlotTypeVersionRequest): Request[CreateSlotTypeVersionResponse, AWSError] = js.native
  def createSlotTypeVersion(
    params: CreateSlotTypeVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSlotTypeVersionResponse, Unit]
  ): Request[CreateSlotTypeVersionResponse, AWSError] = js.native
  
  /**
    * Deletes all versions of the bot, including the $LATEST version. To delete a specific version of the bot, use the DeleteBotVersion operation. The DeleteBot operation doesn't immediately remove the bot schema. Instead, it is marked for deletion and removed later. Amazon Lex stores utterances indefinitely for improving the ability of your bot to respond to user inputs. These utterances are not removed when the bot is deleted. To remove the utterances, use the DeleteUtterances operation. If a bot has an alias, you can't delete it. Instead, the DeleteBot operation returns a ResourceInUseException exception that includes a reference to the alias that refers to the bot. To remove the reference to the bot, delete the alias. If you get the same exception again, delete the referring alias until the DeleteBot operation is successful. This operation requires permissions for the lex:DeleteBot action.
    */
  def deleteBot(): Request[js.Object, AWSError] = js.native
  def deleteBot(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes all versions of the bot, including the $LATEST version. To delete a specific version of the bot, use the DeleteBotVersion operation. The DeleteBot operation doesn't immediately remove the bot schema. Instead, it is marked for deletion and removed later. Amazon Lex stores utterances indefinitely for improving the ability of your bot to respond to user inputs. These utterances are not removed when the bot is deleted. To remove the utterances, use the DeleteUtterances operation. If a bot has an alias, you can't delete it. Instead, the DeleteBot operation returns a ResourceInUseException exception that includes a reference to the alias that refers to the bot. To remove the reference to the bot, delete the alias. If you get the same exception again, delete the referring alias until the DeleteBot operation is successful. This operation requires permissions for the lex:DeleteBot action.
    */
  def deleteBot(params: DeleteBotRequest): Request[js.Object, AWSError] = js.native
  def deleteBot(params: DeleteBotRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an alias for the specified bot.  You can't delete an alias that is used in the association between a bot and a messaging channel. If an alias is used in a channel association, the DeleteBot operation returns a ResourceInUseException exception that includes a reference to the channel association that refers to the bot. You can remove the reference to the alias by deleting the channel association. If you get the same exception again, delete the referring association until the DeleteBotAlias operation is successful.
    */
  def deleteBotAlias(): Request[js.Object, AWSError] = js.native
  def deleteBotAlias(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an alias for the specified bot.  You can't delete an alias that is used in the association between a bot and a messaging channel. If an alias is used in a channel association, the DeleteBot operation returns a ResourceInUseException exception that includes a reference to the channel association that refers to the bot. You can remove the reference to the alias by deleting the channel association. If you get the same exception again, delete the referring association until the DeleteBotAlias operation is successful.
    */
  def deleteBotAlias(params: DeleteBotAliasRequest): Request[js.Object, AWSError] = js.native
  def deleteBotAlias(
    params: DeleteBotAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the association between an Amazon Lex bot and a messaging platform. This operation requires permission for the lex:DeleteBotChannelAssociation action.
    */
  def deleteBotChannelAssociation(): Request[js.Object, AWSError] = js.native
  def deleteBotChannelAssociation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the association between an Amazon Lex bot and a messaging platform. This operation requires permission for the lex:DeleteBotChannelAssociation action.
    */
  def deleteBotChannelAssociation(params: DeleteBotChannelAssociationRequest): Request[js.Object, AWSError] = js.native
  def deleteBotChannelAssociation(
    params: DeleteBotChannelAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a specific version of a bot. To delete all versions of a bot, use the DeleteBot operation.  This operation requires permissions for the lex:DeleteBotVersion action.
    */
  def deleteBotVersion(): Request[js.Object, AWSError] = js.native
  def deleteBotVersion(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a specific version of a bot. To delete all versions of a bot, use the DeleteBot operation.  This operation requires permissions for the lex:DeleteBotVersion action.
    */
  def deleteBotVersion(params: DeleteBotVersionRequest): Request[js.Object, AWSError] = js.native
  def deleteBotVersion(
    params: DeleteBotVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes all versions of the intent, including the $LATEST version. To delete a specific version of the intent, use the DeleteIntentVersion operation.  You can delete a version of an intent only if it is not referenced. To delete an intent that is referred to in one or more bots (see how-it-works), you must remove those references first.    If you get the ResourceInUseException exception, it provides an example reference that shows where the intent is referenced. To remove the reference to the intent, either update the bot or delete it. If you get the same exception when you attempt to delete the intent again, repeat until the intent has no references and the call to DeleteIntent is successful.    This operation requires permission for the lex:DeleteIntent action. 
    */
  def deleteIntent(): Request[js.Object, AWSError] = js.native
  def deleteIntent(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes all versions of the intent, including the $LATEST version. To delete a specific version of the intent, use the DeleteIntentVersion operation.  You can delete a version of an intent only if it is not referenced. To delete an intent that is referred to in one or more bots (see how-it-works), you must remove those references first.    If you get the ResourceInUseException exception, it provides an example reference that shows where the intent is referenced. To remove the reference to the intent, either update the bot or delete it. If you get the same exception when you attempt to delete the intent again, repeat until the intent has no references and the call to DeleteIntent is successful.    This operation requires permission for the lex:DeleteIntent action. 
    */
  def deleteIntent(params: DeleteIntentRequest): Request[js.Object, AWSError] = js.native
  def deleteIntent(
    params: DeleteIntentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a specific version of an intent. To delete all versions of a intent, use the DeleteIntent operation.  This operation requires permissions for the lex:DeleteIntentVersion action.
    */
  def deleteIntentVersion(): Request[js.Object, AWSError] = js.native
  def deleteIntentVersion(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a specific version of an intent. To delete all versions of a intent, use the DeleteIntent operation.  This operation requires permissions for the lex:DeleteIntentVersion action.
    */
  def deleteIntentVersion(params: DeleteIntentVersionRequest): Request[js.Object, AWSError] = js.native
  def deleteIntentVersion(
    params: DeleteIntentVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes all versions of the slot type, including the $LATEST version. To delete a specific version of the slot type, use the DeleteSlotTypeVersion operation.  You can delete a version of a slot type only if it is not referenced. To delete a slot type that is referred to in one or more intents, you must remove those references first.    If you get the ResourceInUseException exception, the exception provides an example reference that shows the intent where the slot type is referenced. To remove the reference to the slot type, either update the intent or delete it. If you get the same exception when you attempt to delete the slot type again, repeat until the slot type has no references and the DeleteSlotType call is successful.   This operation requires permission for the lex:DeleteSlotType action.
    */
  def deleteSlotType(): Request[js.Object, AWSError] = js.native
  def deleteSlotType(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes all versions of the slot type, including the $LATEST version. To delete a specific version of the slot type, use the DeleteSlotTypeVersion operation.  You can delete a version of a slot type only if it is not referenced. To delete a slot type that is referred to in one or more intents, you must remove those references first.    If you get the ResourceInUseException exception, the exception provides an example reference that shows the intent where the slot type is referenced. To remove the reference to the slot type, either update the intent or delete it. If you get the same exception when you attempt to delete the slot type again, repeat until the slot type has no references and the DeleteSlotType call is successful.   This operation requires permission for the lex:DeleteSlotType action.
    */
  def deleteSlotType(params: DeleteSlotTypeRequest): Request[js.Object, AWSError] = js.native
  def deleteSlotType(
    params: DeleteSlotTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a specific version of a slot type. To delete all versions of a slot type, use the DeleteSlotType operation.  This operation requires permissions for the lex:DeleteSlotTypeVersion action.
    */
  def deleteSlotTypeVersion(): Request[js.Object, AWSError] = js.native
  def deleteSlotTypeVersion(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a specific version of a slot type. To delete all versions of a slot type, use the DeleteSlotType operation.  This operation requires permissions for the lex:DeleteSlotTypeVersion action.
    */
  def deleteSlotTypeVersion(params: DeleteSlotTypeVersionRequest): Request[js.Object, AWSError] = js.native
  def deleteSlotTypeVersion(
    params: DeleteSlotTypeVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes stored utterances. Amazon Lex stores the utterances that users send to your bot. Utterances are stored for 15 days for use with the GetUtterancesView operation, and then stored indefinitely for use in improving the ability of your bot to respond to user input. Use the DeleteUtterances operation to manually delete stored utterances for a specific user. When you use the DeleteUtterances operation, utterances stored for improving your bot's ability to respond to user input are deleted immediately. Utterances stored for use with the GetUtterancesView operation are deleted after 15 days. This operation requires permissions for the lex:DeleteUtterances action.
    */
  def deleteUtterances(): Request[js.Object, AWSError] = js.native
  def deleteUtterances(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes stored utterances. Amazon Lex stores the utterances that users send to your bot. Utterances are stored for 15 days for use with the GetUtterancesView operation, and then stored indefinitely for use in improving the ability of your bot to respond to user input. Use the DeleteUtterances operation to manually delete stored utterances for a specific user. When you use the DeleteUtterances operation, utterances stored for improving your bot's ability to respond to user input are deleted immediately. Utterances stored for use with the GetUtterancesView operation are deleted after 15 days. This operation requires permissions for the lex:DeleteUtterances action.
    */
  def deleteUtterances(params: DeleteUtterancesRequest): Request[js.Object, AWSError] = js.native
  def deleteUtterances(
    params: DeleteUtterancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Returns metadata information for a specific bot. You must provide the bot name and the bot version or alias.   This operation requires permissions for the lex:GetBot action. 
    */
  def getBot(): Request[GetBotResponse, AWSError] = js.native
  def getBot(callback: js.Function2[/* err */ AWSError, /* data */ GetBotResponse, Unit]): Request[GetBotResponse, AWSError] = js.native
  /**
    * Returns metadata information for a specific bot. You must provide the bot name and the bot version or alias.   This operation requires permissions for the lex:GetBot action. 
    */
  def getBot(params: GetBotRequest): Request[GetBotResponse, AWSError] = js.native
  def getBot(params: GetBotRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetBotResponse, Unit]): Request[GetBotResponse, AWSError] = js.native
  
  /**
    * Returns information about an Amazon Lex bot alias. For more information about aliases, see versioning-aliases. This operation requires permissions for the lex:GetBotAlias action.
    */
  def getBotAlias(): Request[GetBotAliasResponse, AWSError] = js.native
  def getBotAlias(callback: js.Function2[/* err */ AWSError, /* data */ GetBotAliasResponse, Unit]): Request[GetBotAliasResponse, AWSError] = js.native
  /**
    * Returns information about an Amazon Lex bot alias. For more information about aliases, see versioning-aliases. This operation requires permissions for the lex:GetBotAlias action.
    */
  def getBotAlias(params: GetBotAliasRequest): Request[GetBotAliasResponse, AWSError] = js.native
  def getBotAlias(
    params: GetBotAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBotAliasResponse, Unit]
  ): Request[GetBotAliasResponse, AWSError] = js.native
  
  /**
    * Returns a list of aliases for a specified Amazon Lex bot. This operation requires permissions for the lex:GetBotAliases action.
    */
  def getBotAliases(): Request[GetBotAliasesResponse, AWSError] = js.native
  def getBotAliases(callback: js.Function2[/* err */ AWSError, /* data */ GetBotAliasesResponse, Unit]): Request[GetBotAliasesResponse, AWSError] = js.native
  /**
    * Returns a list of aliases for a specified Amazon Lex bot. This operation requires permissions for the lex:GetBotAliases action.
    */
  def getBotAliases(params: GetBotAliasesRequest): Request[GetBotAliasesResponse, AWSError] = js.native
  def getBotAliases(
    params: GetBotAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBotAliasesResponse, Unit]
  ): Request[GetBotAliasesResponse, AWSError] = js.native
  
  /**
    * Returns information about the association between an Amazon Lex bot and a messaging platform. This operation requires permissions for the lex:GetBotChannelAssociation action.
    */
  def getBotChannelAssociation(): Request[GetBotChannelAssociationResponse, AWSError] = js.native
  def getBotChannelAssociation(callback: js.Function2[/* err */ AWSError, /* data */ GetBotChannelAssociationResponse, Unit]): Request[GetBotChannelAssociationResponse, AWSError] = js.native
  /**
    * Returns information about the association between an Amazon Lex bot and a messaging platform. This operation requires permissions for the lex:GetBotChannelAssociation action.
    */
  def getBotChannelAssociation(params: GetBotChannelAssociationRequest): Request[GetBotChannelAssociationResponse, AWSError] = js.native
  def getBotChannelAssociation(
    params: GetBotChannelAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBotChannelAssociationResponse, Unit]
  ): Request[GetBotChannelAssociationResponse, AWSError] = js.native
  
  /**
    *  Returns a list of all of the channels associated with the specified bot.  The GetBotChannelAssociations operation requires permissions for the lex:GetBotChannelAssociations action.
    */
  def getBotChannelAssociations(): Request[GetBotChannelAssociationsResponse, AWSError] = js.native
  def getBotChannelAssociations(callback: js.Function2[/* err */ AWSError, /* data */ GetBotChannelAssociationsResponse, Unit]): Request[GetBotChannelAssociationsResponse, AWSError] = js.native
  /**
    *  Returns a list of all of the channels associated with the specified bot.  The GetBotChannelAssociations operation requires permissions for the lex:GetBotChannelAssociations action.
    */
  def getBotChannelAssociations(params: GetBotChannelAssociationsRequest): Request[GetBotChannelAssociationsResponse, AWSError] = js.native
  def getBotChannelAssociations(
    params: GetBotChannelAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBotChannelAssociationsResponse, Unit]
  ): Request[GetBotChannelAssociationsResponse, AWSError] = js.native
  
  /**
    * Gets information about all of the versions of a bot. The GetBotVersions operation returns a BotMetadata object for each version of a bot. For example, if a bot has three numbered versions, the GetBotVersions operation returns four BotMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetBotVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetBotVersions action.
    */
  def getBotVersions(): Request[GetBotVersionsResponse, AWSError] = js.native
  def getBotVersions(callback: js.Function2[/* err */ AWSError, /* data */ GetBotVersionsResponse, Unit]): Request[GetBotVersionsResponse, AWSError] = js.native
  /**
    * Gets information about all of the versions of a bot. The GetBotVersions operation returns a BotMetadata object for each version of a bot. For example, if a bot has three numbered versions, the GetBotVersions operation returns four BotMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetBotVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetBotVersions action.
    */
  def getBotVersions(params: GetBotVersionsRequest): Request[GetBotVersionsResponse, AWSError] = js.native
  def getBotVersions(
    params: GetBotVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBotVersionsResponse, Unit]
  ): Request[GetBotVersionsResponse, AWSError] = js.native
  
  /**
    * Returns bot information as follows:    If you provide the nameContains field, the response includes information for the $LATEST version of all bots whose name contains the specified string.   If you don't specify the nameContains field, the operation returns information about the $LATEST version of all of your bots.   This operation requires permission for the lex:GetBots action.
    */
  def getBots(): Request[GetBotsResponse, AWSError] = js.native
  def getBots(callback: js.Function2[/* err */ AWSError, /* data */ GetBotsResponse, Unit]): Request[GetBotsResponse, AWSError] = js.native
  /**
    * Returns bot information as follows:    If you provide the nameContains field, the response includes information for the $LATEST version of all bots whose name contains the specified string.   If you don't specify the nameContains field, the operation returns information about the $LATEST version of all of your bots.   This operation requires permission for the lex:GetBots action.
    */
  def getBots(params: GetBotsRequest): Request[GetBotsResponse, AWSError] = js.native
  def getBots(
    params: GetBotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBotsResponse, Unit]
  ): Request[GetBotsResponse, AWSError] = js.native
  
  /**
    * Returns information about a built-in intent. This operation requires permission for the lex:GetBuiltinIntent action.
    */
  def getBuiltinIntent(): Request[GetBuiltinIntentResponse, AWSError] = js.native
  def getBuiltinIntent(callback: js.Function2[/* err */ AWSError, /* data */ GetBuiltinIntentResponse, Unit]): Request[GetBuiltinIntentResponse, AWSError] = js.native
  /**
    * Returns information about a built-in intent. This operation requires permission for the lex:GetBuiltinIntent action.
    */
  def getBuiltinIntent(params: GetBuiltinIntentRequest): Request[GetBuiltinIntentResponse, AWSError] = js.native
  def getBuiltinIntent(
    params: GetBuiltinIntentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBuiltinIntentResponse, Unit]
  ): Request[GetBuiltinIntentResponse, AWSError] = js.native
  
  /**
    * Gets a list of built-in intents that meet the specified criteria. This operation requires permission for the lex:GetBuiltinIntents action.
    */
  def getBuiltinIntents(): Request[GetBuiltinIntentsResponse, AWSError] = js.native
  def getBuiltinIntents(callback: js.Function2[/* err */ AWSError, /* data */ GetBuiltinIntentsResponse, Unit]): Request[GetBuiltinIntentsResponse, AWSError] = js.native
  /**
    * Gets a list of built-in intents that meet the specified criteria. This operation requires permission for the lex:GetBuiltinIntents action.
    */
  def getBuiltinIntents(params: GetBuiltinIntentsRequest): Request[GetBuiltinIntentsResponse, AWSError] = js.native
  def getBuiltinIntents(
    params: GetBuiltinIntentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBuiltinIntentsResponse, Unit]
  ): Request[GetBuiltinIntentsResponse, AWSError] = js.native
  
  /**
    * Gets a list of built-in slot types that meet the specified criteria. For a list of built-in slot types, see Slot Type Reference in the Alexa Skills Kit. This operation requires permission for the lex:GetBuiltInSlotTypes action.
    */
  def getBuiltinSlotTypes(): Request[GetBuiltinSlotTypesResponse, AWSError] = js.native
  def getBuiltinSlotTypes(callback: js.Function2[/* err */ AWSError, /* data */ GetBuiltinSlotTypesResponse, Unit]): Request[GetBuiltinSlotTypesResponse, AWSError] = js.native
  /**
    * Gets a list of built-in slot types that meet the specified criteria. For a list of built-in slot types, see Slot Type Reference in the Alexa Skills Kit. This operation requires permission for the lex:GetBuiltInSlotTypes action.
    */
  def getBuiltinSlotTypes(params: GetBuiltinSlotTypesRequest): Request[GetBuiltinSlotTypesResponse, AWSError] = js.native
  def getBuiltinSlotTypes(
    params: GetBuiltinSlotTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBuiltinSlotTypesResponse, Unit]
  ): Request[GetBuiltinSlotTypesResponse, AWSError] = js.native
  
  /**
    * Exports the contents of a Amazon Lex resource in a specified format. 
    */
  def getExport(): Request[GetExportResponse, AWSError] = js.native
  def getExport(callback: js.Function2[/* err */ AWSError, /* data */ GetExportResponse, Unit]): Request[GetExportResponse, AWSError] = js.native
  /**
    * Exports the contents of a Amazon Lex resource in a specified format. 
    */
  def getExport(params: GetExportRequest): Request[GetExportResponse, AWSError] = js.native
  def getExport(
    params: GetExportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetExportResponse, Unit]
  ): Request[GetExportResponse, AWSError] = js.native
  
  /**
    * Gets information about an import job started with the StartImport operation.
    */
  def getImport(): Request[GetImportResponse, AWSError] = js.native
  def getImport(callback: js.Function2[/* err */ AWSError, /* data */ GetImportResponse, Unit]): Request[GetImportResponse, AWSError] = js.native
  /**
    * Gets information about an import job started with the StartImport operation.
    */
  def getImport(params: GetImportRequest): Request[GetImportResponse, AWSError] = js.native
  def getImport(
    params: GetImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetImportResponse, Unit]
  ): Request[GetImportResponse, AWSError] = js.native
  
  /**
    *  Returns information about an intent. In addition to the intent name, you must specify the intent version.   This operation requires permissions to perform the lex:GetIntent action. 
    */
  def getIntent(): Request[GetIntentResponse, AWSError] = js.native
  def getIntent(callback: js.Function2[/* err */ AWSError, /* data */ GetIntentResponse, Unit]): Request[GetIntentResponse, AWSError] = js.native
  /**
    *  Returns information about an intent. In addition to the intent name, you must specify the intent version.   This operation requires permissions to perform the lex:GetIntent action. 
    */
  def getIntent(params: GetIntentRequest): Request[GetIntentResponse, AWSError] = js.native
  def getIntent(
    params: GetIntentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIntentResponse, Unit]
  ): Request[GetIntentResponse, AWSError] = js.native
  
  /**
    * Gets information about all of the versions of an intent. The GetIntentVersions operation returns an IntentMetadata object for each version of an intent. For example, if an intent has three numbered versions, the GetIntentVersions operation returns four IntentMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetIntentVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetIntentVersions action.
    */
  def getIntentVersions(): Request[GetIntentVersionsResponse, AWSError] = js.native
  def getIntentVersions(callback: js.Function2[/* err */ AWSError, /* data */ GetIntentVersionsResponse, Unit]): Request[GetIntentVersionsResponse, AWSError] = js.native
  /**
    * Gets information about all of the versions of an intent. The GetIntentVersions operation returns an IntentMetadata object for each version of an intent. For example, if an intent has three numbered versions, the GetIntentVersions operation returns four IntentMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetIntentVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetIntentVersions action.
    */
  def getIntentVersions(params: GetIntentVersionsRequest): Request[GetIntentVersionsResponse, AWSError] = js.native
  def getIntentVersions(
    params: GetIntentVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIntentVersionsResponse, Unit]
  ): Request[GetIntentVersionsResponse, AWSError] = js.native
  
  /**
    * Returns intent information as follows:    If you specify the nameContains field, returns the $LATEST version of all intents that contain the specified string.    If you don't specify the nameContains field, returns information about the $LATEST version of all intents.     The operation requires permission for the lex:GetIntents action. 
    */
  def getIntents(): Request[GetIntentsResponse, AWSError] = js.native
  def getIntents(callback: js.Function2[/* err */ AWSError, /* data */ GetIntentsResponse, Unit]): Request[GetIntentsResponse, AWSError] = js.native
  /**
    * Returns intent information as follows:    If you specify the nameContains field, returns the $LATEST version of all intents that contain the specified string.    If you don't specify the nameContains field, returns information about the $LATEST version of all intents.     The operation requires permission for the lex:GetIntents action. 
    */
  def getIntents(params: GetIntentsRequest): Request[GetIntentsResponse, AWSError] = js.native
  def getIntents(
    params: GetIntentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIntentsResponse, Unit]
  ): Request[GetIntentsResponse, AWSError] = js.native
  
  /**
    * Provides details about an ongoing or complete migration from an Amazon Lex V1 bot to an Amazon Lex V2 bot. Use this operation to view the migration alerts and warnings related to the migration.
    */
  def getMigration(): Request[GetMigrationResponse, AWSError] = js.native
  def getMigration(callback: js.Function2[/* err */ AWSError, /* data */ GetMigrationResponse, Unit]): Request[GetMigrationResponse, AWSError] = js.native
  /**
    * Provides details about an ongoing or complete migration from an Amazon Lex V1 bot to an Amazon Lex V2 bot. Use this operation to view the migration alerts and warnings related to the migration.
    */
  def getMigration(params: GetMigrationRequest): Request[GetMigrationResponse, AWSError] = js.native
  def getMigration(
    params: GetMigrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMigrationResponse, Unit]
  ): Request[GetMigrationResponse, AWSError] = js.native
  
  /**
    * Gets a list of migrations between Amazon Lex V1 and Amazon Lex V2.
    */
  def getMigrations(): Request[GetMigrationsResponse, AWSError] = js.native
  def getMigrations(callback: js.Function2[/* err */ AWSError, /* data */ GetMigrationsResponse, Unit]): Request[GetMigrationsResponse, AWSError] = js.native
  /**
    * Gets a list of migrations between Amazon Lex V1 and Amazon Lex V2.
    */
  def getMigrations(params: GetMigrationsRequest): Request[GetMigrationsResponse, AWSError] = js.native
  def getMigrations(
    params: GetMigrationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMigrationsResponse, Unit]
  ): Request[GetMigrationsResponse, AWSError] = js.native
  
  /**
    * Returns information about a specific version of a slot type. In addition to specifying the slot type name, you must specify the slot type version. This operation requires permissions for the lex:GetSlotType action.
    */
  def getSlotType(): Request[GetSlotTypeResponse, AWSError] = js.native
  def getSlotType(callback: js.Function2[/* err */ AWSError, /* data */ GetSlotTypeResponse, Unit]): Request[GetSlotTypeResponse, AWSError] = js.native
  /**
    * Returns information about a specific version of a slot type. In addition to specifying the slot type name, you must specify the slot type version. This operation requires permissions for the lex:GetSlotType action.
    */
  def getSlotType(params: GetSlotTypeRequest): Request[GetSlotTypeResponse, AWSError] = js.native
  def getSlotType(
    params: GetSlotTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSlotTypeResponse, Unit]
  ): Request[GetSlotTypeResponse, AWSError] = js.native
  
  /**
    * Gets information about all versions of a slot type. The GetSlotTypeVersions operation returns a SlotTypeMetadata object for each version of a slot type. For example, if a slot type has three numbered versions, the GetSlotTypeVersions operation returns four SlotTypeMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetSlotTypeVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetSlotTypeVersions action.
    */
  def getSlotTypeVersions(): Request[GetSlotTypeVersionsResponse, AWSError] = js.native
  def getSlotTypeVersions(callback: js.Function2[/* err */ AWSError, /* data */ GetSlotTypeVersionsResponse, Unit]): Request[GetSlotTypeVersionsResponse, AWSError] = js.native
  /**
    * Gets information about all versions of a slot type. The GetSlotTypeVersions operation returns a SlotTypeMetadata object for each version of a slot type. For example, if a slot type has three numbered versions, the GetSlotTypeVersions operation returns four SlotTypeMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetSlotTypeVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetSlotTypeVersions action.
    */
  def getSlotTypeVersions(params: GetSlotTypeVersionsRequest): Request[GetSlotTypeVersionsResponse, AWSError] = js.native
  def getSlotTypeVersions(
    params: GetSlotTypeVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSlotTypeVersionsResponse, Unit]
  ): Request[GetSlotTypeVersionsResponse, AWSError] = js.native
  
  /**
    * Returns slot type information as follows:    If you specify the nameContains field, returns the $LATEST version of all slot types that contain the specified string.    If you don't specify the nameContains field, returns information about the $LATEST version of all slot types.     The operation requires permission for the lex:GetSlotTypes action. 
    */
  def getSlotTypes(): Request[GetSlotTypesResponse, AWSError] = js.native
  def getSlotTypes(callback: js.Function2[/* err */ AWSError, /* data */ GetSlotTypesResponse, Unit]): Request[GetSlotTypesResponse, AWSError] = js.native
  /**
    * Returns slot type information as follows:    If you specify the nameContains field, returns the $LATEST version of all slot types that contain the specified string.    If you don't specify the nameContains field, returns information about the $LATEST version of all slot types.     The operation requires permission for the lex:GetSlotTypes action. 
    */
  def getSlotTypes(params: GetSlotTypesRequest): Request[GetSlotTypesResponse, AWSError] = js.native
  def getSlotTypes(
    params: GetSlotTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSlotTypesResponse, Unit]
  ): Request[GetSlotTypesResponse, AWSError] = js.native
  
  /**
    * Use the GetUtterancesView operation to get information about the utterances that your users have made to your bot. You can use this list to tune the utterances that your bot responds to. For example, say that you have created a bot to order flowers. After your users have used your bot for a while, use the GetUtterancesView operation to see the requests that they have made and whether they have been successful. You might find that the utterance "I want flowers" is not being recognized. You could add this utterance to the OrderFlowers intent so that your bot recognizes that utterance. After you publish a new version of a bot, you can get information about the old version and the new so that you can compare the performance across the two versions.  Utterance statistics are generated once a day. Data is available for the last 15 days. You can request information for up to 5 versions of your bot in each request. Amazon Lex returns the most frequent utterances received by the bot in the last 15 days. The response contains information about a maximum of 100 utterances for each version. If you set childDirected field to true when you created your bot, if you are using slot obfuscation with one or more slots, or if you opted out of participating in improving Amazon Lex, utterances are not available. This operation requires permissions for the lex:GetUtterancesView action.
    */
  def getUtterancesView(): Request[GetUtterancesViewResponse, AWSError] = js.native
  def getUtterancesView(callback: js.Function2[/* err */ AWSError, /* data */ GetUtterancesViewResponse, Unit]): Request[GetUtterancesViewResponse, AWSError] = js.native
  /**
    * Use the GetUtterancesView operation to get information about the utterances that your users have made to your bot. You can use this list to tune the utterances that your bot responds to. For example, say that you have created a bot to order flowers. After your users have used your bot for a while, use the GetUtterancesView operation to see the requests that they have made and whether they have been successful. You might find that the utterance "I want flowers" is not being recognized. You could add this utterance to the OrderFlowers intent so that your bot recognizes that utterance. After you publish a new version of a bot, you can get information about the old version and the new so that you can compare the performance across the two versions.  Utterance statistics are generated once a day. Data is available for the last 15 days. You can request information for up to 5 versions of your bot in each request. Amazon Lex returns the most frequent utterances received by the bot in the last 15 days. The response contains information about a maximum of 100 utterances for each version. If you set childDirected field to true when you created your bot, if you are using slot obfuscation with one or more slots, or if you opted out of participating in improving Amazon Lex, utterances are not available. This operation requires permissions for the lex:GetUtterancesView action.
    */
  def getUtterancesView(params: GetUtterancesViewRequest): Request[GetUtterancesViewResponse, AWSError] = js.native
  def getUtterancesView(
    params: GetUtterancesViewRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUtterancesViewResponse, Unit]
  ): Request[GetUtterancesViewResponse, AWSError] = js.native
  
  /**
    * Gets a list of tags associated with the specified resource. Only bots, bot aliases, and bot channels can have tags associated with them.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Gets a list of tags associated with the specified resource. Only bots, bot aliases, and bot channels can have tags associated with them.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Lex conversational bot or replaces an existing bot. When you create or update a bot you are only required to specify a name, a locale, and whether the bot is directed toward children under age 13. You can use this to add intents later, or to remove intents from an existing bot. When you create a bot with the minimum information, the bot is created or updated but Amazon Lex returns the  response FAILED. You can build the bot after you add one or more intents. For more information about Amazon Lex bots, see how-it-works.  If you specify the name of an existing bot, the fields in the request replace the existing values in the $LATEST version of the bot. Amazon Lex removes any fields that you don't provide values for in the request, except for the idleTTLInSeconds and privacySettings fields, which are set to their default values. If you don't specify values for required fields, Amazon Lex throws an exception. This operation requires permissions for the lex:PutBot action. For more information, see security-iam.
    */
  def putBot(): Request[PutBotResponse, AWSError] = js.native
  def putBot(callback: js.Function2[/* err */ AWSError, /* data */ PutBotResponse, Unit]): Request[PutBotResponse, AWSError] = js.native
  /**
    * Creates an Amazon Lex conversational bot or replaces an existing bot. When you create or update a bot you are only required to specify a name, a locale, and whether the bot is directed toward children under age 13. You can use this to add intents later, or to remove intents from an existing bot. When you create a bot with the minimum information, the bot is created or updated but Amazon Lex returns the  response FAILED. You can build the bot after you add one or more intents. For more information about Amazon Lex bots, see how-it-works.  If you specify the name of an existing bot, the fields in the request replace the existing values in the $LATEST version of the bot. Amazon Lex removes any fields that you don't provide values for in the request, except for the idleTTLInSeconds and privacySettings fields, which are set to their default values. If you don't specify values for required fields, Amazon Lex throws an exception. This operation requires permissions for the lex:PutBot action. For more information, see security-iam.
    */
  def putBot(params: PutBotRequest): Request[PutBotResponse, AWSError] = js.native
  def putBot(params: PutBotRequest, callback: js.Function2[/* err */ AWSError, /* data */ PutBotResponse, Unit]): Request[PutBotResponse, AWSError] = js.native
  
  /**
    * Creates an alias for the specified version of the bot or replaces an alias for the specified bot. To change the version of the bot that the alias points to, replace the alias. For more information about aliases, see versioning-aliases. This operation requires permissions for the lex:PutBotAlias action. 
    */
  def putBotAlias(): Request[PutBotAliasResponse, AWSError] = js.native
  def putBotAlias(callback: js.Function2[/* err */ AWSError, /* data */ PutBotAliasResponse, Unit]): Request[PutBotAliasResponse, AWSError] = js.native
  /**
    * Creates an alias for the specified version of the bot or replaces an alias for the specified bot. To change the version of the bot that the alias points to, replace the alias. For more information about aliases, see versioning-aliases. This operation requires permissions for the lex:PutBotAlias action. 
    */
  def putBotAlias(params: PutBotAliasRequest): Request[PutBotAliasResponse, AWSError] = js.native
  def putBotAlias(
    params: PutBotAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutBotAliasResponse, Unit]
  ): Request[PutBotAliasResponse, AWSError] = js.native
  
  /**
    * Creates an intent or replaces an existing intent. To define the interaction between the user and your bot, you use one or more intents. For a pizza ordering bot, for example, you would create an OrderPizza intent.  To create an intent or replace an existing intent, you must provide the following:   Intent name. For example, OrderPizza.   Sample utterances. For example, "Can I order a pizza, please." and "I want to order a pizza."   Information to be gathered. You specify slot types for the information that your bot will request from the user. You can specify standard slot types, such as a date or a time, or custom slot types such as the size and crust of a pizza.   How the intent will be fulfilled. You can provide a Lambda function or configure the intent to return the intent information to the client application. If you use a Lambda function, when all of the intent information is available, Amazon Lex invokes your Lambda function. If you configure your intent to return the intent information to the client application.    You can specify other optional information in the request, such as:   A confirmation prompt to ask the user to confirm an intent. For example, "Shall I order your pizza?"   A conclusion statement to send to the user after the intent has been fulfilled. For example, "I placed your pizza order."   A follow-up prompt that asks the user for additional activity. For example, asking "Do you want to order a drink with your pizza?"   If you specify an existing intent name to update the intent, Amazon Lex replaces the values in the $LATEST version of the intent with the values in the request. Amazon Lex removes fields that you don't provide in the request. If you don't specify the required fields, Amazon Lex throws an exception. When you update the $LATEST version of an intent, the status field of any bot that uses the $LATEST version of the intent is set to NOT_BUILT. For more information, see how-it-works. This operation requires permissions for the lex:PutIntent action.
    */
  def putIntent(): Request[PutIntentResponse, AWSError] = js.native
  def putIntent(callback: js.Function2[/* err */ AWSError, /* data */ PutIntentResponse, Unit]): Request[PutIntentResponse, AWSError] = js.native
  /**
    * Creates an intent or replaces an existing intent. To define the interaction between the user and your bot, you use one or more intents. For a pizza ordering bot, for example, you would create an OrderPizza intent.  To create an intent or replace an existing intent, you must provide the following:   Intent name. For example, OrderPizza.   Sample utterances. For example, "Can I order a pizza, please." and "I want to order a pizza."   Information to be gathered. You specify slot types for the information that your bot will request from the user. You can specify standard slot types, such as a date or a time, or custom slot types such as the size and crust of a pizza.   How the intent will be fulfilled. You can provide a Lambda function or configure the intent to return the intent information to the client application. If you use a Lambda function, when all of the intent information is available, Amazon Lex invokes your Lambda function. If you configure your intent to return the intent information to the client application.    You can specify other optional information in the request, such as:   A confirmation prompt to ask the user to confirm an intent. For example, "Shall I order your pizza?"   A conclusion statement to send to the user after the intent has been fulfilled. For example, "I placed your pizza order."   A follow-up prompt that asks the user for additional activity. For example, asking "Do you want to order a drink with your pizza?"   If you specify an existing intent name to update the intent, Amazon Lex replaces the values in the $LATEST version of the intent with the values in the request. Amazon Lex removes fields that you don't provide in the request. If you don't specify the required fields, Amazon Lex throws an exception. When you update the $LATEST version of an intent, the status field of any bot that uses the $LATEST version of the intent is set to NOT_BUILT. For more information, see how-it-works. This operation requires permissions for the lex:PutIntent action.
    */
  def putIntent(params: PutIntentRequest): Request[PutIntentResponse, AWSError] = js.native
  def putIntent(
    params: PutIntentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutIntentResponse, Unit]
  ): Request[PutIntentResponse, AWSError] = js.native
  
  /**
    * Creates a custom slot type or replaces an existing custom slot type. To create a custom slot type, specify a name for the slot type and a set of enumeration values, which are the values that a slot of this type can assume. For more information, see how-it-works. If you specify the name of an existing slot type, the fields in the request replace the existing values in the $LATEST version of the slot type. Amazon Lex removes the fields that you don't provide in the request. If you don't specify required fields, Amazon Lex throws an exception. When you update the $LATEST version of a slot type, if a bot uses the $LATEST version of an intent that contains the slot type, the bot's status field is set to NOT_BUILT. This operation requires permissions for the lex:PutSlotType action.
    */
  def putSlotType(): Request[PutSlotTypeResponse, AWSError] = js.native
  def putSlotType(callback: js.Function2[/* err */ AWSError, /* data */ PutSlotTypeResponse, Unit]): Request[PutSlotTypeResponse, AWSError] = js.native
  /**
    * Creates a custom slot type or replaces an existing custom slot type. To create a custom slot type, specify a name for the slot type and a set of enumeration values, which are the values that a slot of this type can assume. For more information, see how-it-works. If you specify the name of an existing slot type, the fields in the request replace the existing values in the $LATEST version of the slot type. Amazon Lex removes the fields that you don't provide in the request. If you don't specify required fields, Amazon Lex throws an exception. When you update the $LATEST version of a slot type, if a bot uses the $LATEST version of an intent that contains the slot type, the bot's status field is set to NOT_BUILT. This operation requires permissions for the lex:PutSlotType action.
    */
  def putSlotType(params: PutSlotTypeRequest): Request[PutSlotTypeResponse, AWSError] = js.native
  def putSlotType(
    params: PutSlotTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutSlotTypeResponse, Unit]
  ): Request[PutSlotTypeResponse, AWSError] = js.native
  
  /**
    * Starts a job to import a resource to Amazon Lex.
    */
  def startImport(): Request[StartImportResponse, AWSError] = js.native
  def startImport(callback: js.Function2[/* err */ AWSError, /* data */ StartImportResponse, Unit]): Request[StartImportResponse, AWSError] = js.native
  /**
    * Starts a job to import a resource to Amazon Lex.
    */
  def startImport(params: StartImportRequest): Request[StartImportResponse, AWSError] = js.native
  def startImport(
    params: StartImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartImportResponse, Unit]
  ): Request[StartImportResponse, AWSError] = js.native
  
  /**
    * Starts migrating a bot from Amazon Lex V1 to Amazon Lex V2. Migrate your bot when you want to take advantage of the new features of Amazon Lex V2. For more information, see Migrating a bot in the Amazon Lex developer guide.
    */
  def startMigration(): Request[StartMigrationResponse, AWSError] = js.native
  def startMigration(callback: js.Function2[/* err */ AWSError, /* data */ StartMigrationResponse, Unit]): Request[StartMigrationResponse, AWSError] = js.native
  /**
    * Starts migrating a bot from Amazon Lex V1 to Amazon Lex V2. Migrate your bot when you want to take advantage of the new features of Amazon Lex V2. For more information, see Migrating a bot in the Amazon Lex developer guide.
    */
  def startMigration(params: StartMigrationRequest): Request[StartMigrationResponse, AWSError] = js.native
  def startMigration(
    params: StartMigrationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartMigrationResponse, Unit]
  ): Request[StartMigrationResponse, AWSError] = js.native
  
  /**
    * Adds the specified tags to the specified resource. If a tag key already exists, the existing value is replaced with the new value.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource. If a tag key already exists, the existing value is replaced with the new value.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from a bot, bot alias or bot channel.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from a bot, bot alias or bot channel.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
}

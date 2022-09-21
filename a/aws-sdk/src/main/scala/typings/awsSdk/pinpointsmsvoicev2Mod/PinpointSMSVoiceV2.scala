package typings.awsSdk.pinpointsmsvoicev2Mod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinpointSMSVoiceV2 extends Service {
  
  /**
    * Associates the specified origination identity with a pool. If the origination identity is a phone number and is already associated with another pool, an Error is returned. A sender ID can be associated with multiple pools. If the origination identity configuration doesn't match the pool's configuration, an Error is returned.
    */
  def associateOriginationIdentity(): Request[AssociateOriginationIdentityResult, AWSError] = js.native
  def associateOriginationIdentity(callback: js.Function2[/* err */ AWSError, /* data */ AssociateOriginationIdentityResult, Unit]): Request[AssociateOriginationIdentityResult, AWSError] = js.native
  /**
    * Associates the specified origination identity with a pool. If the origination identity is a phone number and is already associated with another pool, an Error is returned. A sender ID can be associated with multiple pools. If the origination identity configuration doesn't match the pool's configuration, an Error is returned.
    */
  def associateOriginationIdentity(params: AssociateOriginationIdentityRequest): Request[AssociateOriginationIdentityResult, AWSError] = js.native
  def associateOriginationIdentity(
    params: AssociateOriginationIdentityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateOriginationIdentityResult, Unit]
  ): Request[AssociateOriginationIdentityResult, AWSError] = js.native
  
  @JSName("config")
  var config_PinpointSMSVoiceV2: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new configuration set. After you create the configuration set, you can add one or more event destinations to it. A configuration set is a set of rules that you apply to the SMS and voice messages that you send. When you send a message, you can optionally specify a single configuration set.
    */
  def createConfigurationSet(): Request[CreateConfigurationSetResult, AWSError] = js.native
  def createConfigurationSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetResult, Unit]): Request[CreateConfigurationSetResult, AWSError] = js.native
  /**
    * Creates a new configuration set. After you create the configuration set, you can add one or more event destinations to it. A configuration set is a set of rules that you apply to the SMS and voice messages that you send. When you send a message, you can optionally specify a single configuration set.
    */
  def createConfigurationSet(params: CreateConfigurationSetRequest): Request[CreateConfigurationSetResult, AWSError] = js.native
  def createConfigurationSet(
    params: CreateConfigurationSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationSetResult, Unit]
  ): Request[CreateConfigurationSetResult, AWSError] = js.native
  
  /**
    * Creates a new event destination in a configuration set. An event destination is a location where you send message events. The event options are Amazon CloudWatch, Amazon Kinesis Data Firehose, or Amazon SNS. For example, when a message is delivered successfully, you can send information about that event to an event destination, or send notifications to endpoints that are subscribed to an Amazon SNS topic. Each configuration set can contain between 0 and 5 event destinations. Each event destination can contain a reference to a single destination, such as a CloudWatch or Kinesis Data Firehose destination.
    */
  def createEventDestination(): Request[CreateEventDestinationResult, AWSError] = js.native
  def createEventDestination(callback: js.Function2[/* err */ AWSError, /* data */ CreateEventDestinationResult, Unit]): Request[CreateEventDestinationResult, AWSError] = js.native
  /**
    * Creates a new event destination in a configuration set. An event destination is a location where you send message events. The event options are Amazon CloudWatch, Amazon Kinesis Data Firehose, or Amazon SNS. For example, when a message is delivered successfully, you can send information about that event to an event destination, or send notifications to endpoints that are subscribed to an Amazon SNS topic. Each configuration set can contain between 0 and 5 event destinations. Each event destination can contain a reference to a single destination, such as a CloudWatch or Kinesis Data Firehose destination.
    */
  def createEventDestination(params: CreateEventDestinationRequest): Request[CreateEventDestinationResult, AWSError] = js.native
  def createEventDestination(
    params: CreateEventDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEventDestinationResult, Unit]
  ): Request[CreateEventDestinationResult, AWSError] = js.native
  
  /**
    * Creates a new opt-out list. If the opt-out list name already exists, an Error is returned. An opt-out list is a list of phone numbers that are opted out, meaning you can't send SMS or voice messages to them. If end user replies with the keyword "STOP," an entry for the phone number is added to the opt-out list. In addition to STOP, your recipients can use any supported opt-out keyword, such as CANCEL or OPTOUT. For a list of supported opt-out keywords, see  SMS opt out  in the Amazon Pinpoint User Guide.
    */
  def createOptOutList(): Request[CreateOptOutListResult, AWSError] = js.native
  def createOptOutList(callback: js.Function2[/* err */ AWSError, /* data */ CreateOptOutListResult, Unit]): Request[CreateOptOutListResult, AWSError] = js.native
  /**
    * Creates a new opt-out list. If the opt-out list name already exists, an Error is returned. An opt-out list is a list of phone numbers that are opted out, meaning you can't send SMS or voice messages to them. If end user replies with the keyword "STOP," an entry for the phone number is added to the opt-out list. In addition to STOP, your recipients can use any supported opt-out keyword, such as CANCEL or OPTOUT. For a list of supported opt-out keywords, see  SMS opt out  in the Amazon Pinpoint User Guide.
    */
  def createOptOutList(params: CreateOptOutListRequest): Request[CreateOptOutListResult, AWSError] = js.native
  def createOptOutList(
    params: CreateOptOutListRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateOptOutListResult, Unit]
  ): Request[CreateOptOutListResult, AWSError] = js.native
  
  /**
    * Creates a new pool and associates the specified origination identity to the pool. A pool can include one or more phone numbers and SenderIds that are associated with your Amazon Web Services account. The new pool inherits its configuration from the specified origination identity. This includes keywords, message type, opt-out list, two-way configuration, and self-managed opt-out configuration. Deletion protection isn't inherited from the origination identity and defaults to false. If the origination identity is a phone number and is already associated with another pool, an Error is returned. A sender ID can be associated with multiple pools.
    */
  def createPool(): Request[CreatePoolResult, AWSError] = js.native
  def createPool(callback: js.Function2[/* err */ AWSError, /* data */ CreatePoolResult, Unit]): Request[CreatePoolResult, AWSError] = js.native
  /**
    * Creates a new pool and associates the specified origination identity to the pool. A pool can include one or more phone numbers and SenderIds that are associated with your Amazon Web Services account. The new pool inherits its configuration from the specified origination identity. This includes keywords, message type, opt-out list, two-way configuration, and self-managed opt-out configuration. Deletion protection isn't inherited from the origination identity and defaults to false. If the origination identity is a phone number and is already associated with another pool, an Error is returned. A sender ID can be associated with multiple pools.
    */
  def createPool(params: CreatePoolRequest): Request[CreatePoolResult, AWSError] = js.native
  def createPool(
    params: CreatePoolRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePoolResult, Unit]
  ): Request[CreatePoolResult, AWSError] = js.native
  
  /**
    * Deletes an existing configuration set. A configuration set is a set of rules that you apply to voice and SMS messages that you send. In a configuration set, you can specify a destination for specific types of events related to voice and SMS messages. 
    */
  def deleteConfigurationSet(): Request[DeleteConfigurationSetResult, AWSError] = js.native
  def deleteConfigurationSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetResult, Unit]): Request[DeleteConfigurationSetResult, AWSError] = js.native
  /**
    * Deletes an existing configuration set. A configuration set is a set of rules that you apply to voice and SMS messages that you send. In a configuration set, you can specify a destination for specific types of events related to voice and SMS messages. 
    */
  def deleteConfigurationSet(params: DeleteConfigurationSetRequest): Request[DeleteConfigurationSetResult, AWSError] = js.native
  def deleteConfigurationSet(
    params: DeleteConfigurationSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConfigurationSetResult, Unit]
  ): Request[DeleteConfigurationSetResult, AWSError] = js.native
  
  /**
    * Deletes an existing default message type on a configuration set.  A message type is a type of messages that you plan to send. If you send account-related messages or time-sensitive messages such as one-time passcodes, choose Transactional. If you plan to send messages that contain marketing material or other promotional content, choose Promotional. This setting applies to your entire Amazon Web Services account. 
    */
  def deleteDefaultMessageType(): Request[DeleteDefaultMessageTypeResult, AWSError] = js.native
  def deleteDefaultMessageType(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDefaultMessageTypeResult, Unit]): Request[DeleteDefaultMessageTypeResult, AWSError] = js.native
  /**
    * Deletes an existing default message type on a configuration set.  A message type is a type of messages that you plan to send. If you send account-related messages or time-sensitive messages such as one-time passcodes, choose Transactional. If you plan to send messages that contain marketing material or other promotional content, choose Promotional. This setting applies to your entire Amazon Web Services account. 
    */
  def deleteDefaultMessageType(params: DeleteDefaultMessageTypeRequest): Request[DeleteDefaultMessageTypeResult, AWSError] = js.native
  def deleteDefaultMessageType(
    params: DeleteDefaultMessageTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDefaultMessageTypeResult, Unit]
  ): Request[DeleteDefaultMessageTypeResult, AWSError] = js.native
  
  /**
    * Deletes an existing default sender ID on a configuration set. A default sender ID is the identity that appears on recipients' devices when they receive SMS messages. Support for sender ID capabilities varies by country or region.
    */
  def deleteDefaultSenderId(): Request[DeleteDefaultSenderIdResult, AWSError] = js.native
  def deleteDefaultSenderId(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDefaultSenderIdResult, Unit]): Request[DeleteDefaultSenderIdResult, AWSError] = js.native
  /**
    * Deletes an existing default sender ID on a configuration set. A default sender ID is the identity that appears on recipients' devices when they receive SMS messages. Support for sender ID capabilities varies by country or region.
    */
  def deleteDefaultSenderId(params: DeleteDefaultSenderIdRequest): Request[DeleteDefaultSenderIdResult, AWSError] = js.native
  def deleteDefaultSenderId(
    params: DeleteDefaultSenderIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDefaultSenderIdResult, Unit]
  ): Request[DeleteDefaultSenderIdResult, AWSError] = js.native
  
  /**
    * Deletes an existing event destination. An event destination is a location where you send response information about the messages that you send. For example, when a message is delivered successfully, you can send information about that event to an Amazon CloudWatch destination, or send notifications to endpoints that are subscribed to an Amazon SNS topic.
    */
  def deleteEventDestination(): Request[DeleteEventDestinationResult, AWSError] = js.native
  def deleteEventDestination(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventDestinationResult, Unit]): Request[DeleteEventDestinationResult, AWSError] = js.native
  /**
    * Deletes an existing event destination. An event destination is a location where you send response information about the messages that you send. For example, when a message is delivered successfully, you can send information about that event to an Amazon CloudWatch destination, or send notifications to endpoints that are subscribed to an Amazon SNS topic.
    */
  def deleteEventDestination(params: DeleteEventDestinationRequest): Request[DeleteEventDestinationResult, AWSError] = js.native
  def deleteEventDestination(
    params: DeleteEventDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventDestinationResult, Unit]
  ): Request[DeleteEventDestinationResult, AWSError] = js.native
  
  /**
    * Deletes an existing keyword from an origination phone number or pool. A keyword is a word that you can search for on a particular phone number or pool. It is also a specific word or phrase that an end user can send to your number to elicit a response, such as an informational message or a special offer. When your number receives a message that begins with a keyword, Amazon Pinpoint responds with a customizable message. Keywords "HELP" and "STOP" can't be deleted or modified.
    */
  def deleteKeyword(): Request[DeleteKeywordResult, AWSError] = js.native
  def deleteKeyword(callback: js.Function2[/* err */ AWSError, /* data */ DeleteKeywordResult, Unit]): Request[DeleteKeywordResult, AWSError] = js.native
  /**
    * Deletes an existing keyword from an origination phone number or pool. A keyword is a word that you can search for on a particular phone number or pool. It is also a specific word or phrase that an end user can send to your number to elicit a response, such as an informational message or a special offer. When your number receives a message that begins with a keyword, Amazon Pinpoint responds with a customizable message. Keywords "HELP" and "STOP" can't be deleted or modified.
    */
  def deleteKeyword(params: DeleteKeywordRequest): Request[DeleteKeywordResult, AWSError] = js.native
  def deleteKeyword(
    params: DeleteKeywordRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteKeywordResult, Unit]
  ): Request[DeleteKeywordResult, AWSError] = js.native
  
  /**
    * Deletes an existing opt-out list. All opted out phone numbers in the opt-out list are deleted. If the specified opt-out list name doesn't exist or is in-use by an origination phone number or pool, an Error is returned.
    */
  def deleteOptOutList(): Request[DeleteOptOutListResult, AWSError] = js.native
  def deleteOptOutList(callback: js.Function2[/* err */ AWSError, /* data */ DeleteOptOutListResult, Unit]): Request[DeleteOptOutListResult, AWSError] = js.native
  /**
    * Deletes an existing opt-out list. All opted out phone numbers in the opt-out list are deleted. If the specified opt-out list name doesn't exist or is in-use by an origination phone number or pool, an Error is returned.
    */
  def deleteOptOutList(params: DeleteOptOutListRequest): Request[DeleteOptOutListResult, AWSError] = js.native
  def deleteOptOutList(
    params: DeleteOptOutListRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteOptOutListResult, Unit]
  ): Request[DeleteOptOutListResult, AWSError] = js.native
  
  /**
    * Deletes an existing opted out destination phone number from the specified opt-out list. Each destination phone number can only be deleted once every 30 days. If the specified destination phone number doesn't exist or if the opt-out list doesn't exist, an Error is returned.
    */
  def deleteOptedOutNumber(): Request[DeleteOptedOutNumberResult, AWSError] = js.native
  def deleteOptedOutNumber(callback: js.Function2[/* err */ AWSError, /* data */ DeleteOptedOutNumberResult, Unit]): Request[DeleteOptedOutNumberResult, AWSError] = js.native
  /**
    * Deletes an existing opted out destination phone number from the specified opt-out list. Each destination phone number can only be deleted once every 30 days. If the specified destination phone number doesn't exist or if the opt-out list doesn't exist, an Error is returned.
    */
  def deleteOptedOutNumber(params: DeleteOptedOutNumberRequest): Request[DeleteOptedOutNumberResult, AWSError] = js.native
  def deleteOptedOutNumber(
    params: DeleteOptedOutNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteOptedOutNumberResult, Unit]
  ): Request[DeleteOptedOutNumberResult, AWSError] = js.native
  
  /**
    * Deletes an existing pool. Deleting a pool disassociates all origination identities from that pool. If the pool status isn't active or if deletion protection is enabled, an Error is returned. A pool is a collection of phone numbers and SenderIds. A pool can include one or more phone numbers and SenderIds that are associated with your Amazon Web Services account.
    */
  def deletePool(): Request[DeletePoolResult, AWSError] = js.native
  def deletePool(callback: js.Function2[/* err */ AWSError, /* data */ DeletePoolResult, Unit]): Request[DeletePoolResult, AWSError] = js.native
  /**
    * Deletes an existing pool. Deleting a pool disassociates all origination identities from that pool. If the pool status isn't active or if deletion protection is enabled, an Error is returned. A pool is a collection of phone numbers and SenderIds. A pool can include one or more phone numbers and SenderIds that are associated with your Amazon Web Services account.
    */
  def deletePool(params: DeletePoolRequest): Request[DeletePoolResult, AWSError] = js.native
  def deletePool(
    params: DeletePoolRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePoolResult, Unit]
  ): Request[DeletePoolResult, AWSError] = js.native
  
  /**
    * Deletes an account-level monthly spending limit override for sending text messages. Deleting a spend limit override will set the EnforcedLimit to equal the MaxLimit, which is controlled by Amazon Web Services. For more information on spend limits (quotas) see Amazon Pinpoint quotas  in the Amazon Pinpoint Developer Guide.
    */
  def deleteTextMessageSpendLimitOverride(): Request[DeleteTextMessageSpendLimitOverrideResult, AWSError] = js.native
  def deleteTextMessageSpendLimitOverride(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTextMessageSpendLimitOverrideResult, Unit]
  ): Request[DeleteTextMessageSpendLimitOverrideResult, AWSError] = js.native
  /**
    * Deletes an account-level monthly spending limit override for sending text messages. Deleting a spend limit override will set the EnforcedLimit to equal the MaxLimit, which is controlled by Amazon Web Services. For more information on spend limits (quotas) see Amazon Pinpoint quotas  in the Amazon Pinpoint Developer Guide.
    */
  def deleteTextMessageSpendLimitOverride(params: DeleteTextMessageSpendLimitOverrideRequest): Request[DeleteTextMessageSpendLimitOverrideResult, AWSError] = js.native
  def deleteTextMessageSpendLimitOverride(
    params: DeleteTextMessageSpendLimitOverrideRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTextMessageSpendLimitOverrideResult, Unit]
  ): Request[DeleteTextMessageSpendLimitOverrideResult, AWSError] = js.native
  
  /**
    * Deletes an account level monthly spend limit override for sending voice messages. Deleting a spend limit override sets the EnforcedLimit equal to the MaxLimit, which is controlled by Amazon Web Services. For more information on spending limits (quotas) see Amazon Pinpoint quotas in the Amazon Pinpoint Developer Guide.
    */
  def deleteVoiceMessageSpendLimitOverride(): Request[DeleteVoiceMessageSpendLimitOverrideResult, AWSError] = js.native
  def deleteVoiceMessageSpendLimitOverride(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVoiceMessageSpendLimitOverrideResult, Unit]
  ): Request[DeleteVoiceMessageSpendLimitOverrideResult, AWSError] = js.native
  /**
    * Deletes an account level monthly spend limit override for sending voice messages. Deleting a spend limit override sets the EnforcedLimit equal to the MaxLimit, which is controlled by Amazon Web Services. For more information on spending limits (quotas) see Amazon Pinpoint quotas in the Amazon Pinpoint Developer Guide.
    */
  def deleteVoiceMessageSpendLimitOverride(params: DeleteVoiceMessageSpendLimitOverrideRequest): Request[DeleteVoiceMessageSpendLimitOverrideResult, AWSError] = js.native
  def deleteVoiceMessageSpendLimitOverride(
    params: DeleteVoiceMessageSpendLimitOverrideRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVoiceMessageSpendLimitOverrideResult, Unit]
  ): Request[DeleteVoiceMessageSpendLimitOverrideResult, AWSError] = js.native
  
  /**
    * Describes attributes of your Amazon Web Services account. The supported account attributes include account tier, which indicates whether your account is in the sandbox or production environment. When you're ready to move your account out of the sandbox, create an Amazon Web Services Support case for a service limit increase request. New Amazon Pinpoint accounts are placed into an SMS or voice sandbox. The sandbox protects both Amazon Web Services end recipients and SMS or voice recipients from fraud and abuse. 
    */
  def describeAccountAttributes(): Request[DescribeAccountAttributesResult, AWSError] = js.native
  def describeAccountAttributes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountAttributesResult, Unit]): Request[DescribeAccountAttributesResult, AWSError] = js.native
  /**
    * Describes attributes of your Amazon Web Services account. The supported account attributes include account tier, which indicates whether your account is in the sandbox or production environment. When you're ready to move your account out of the sandbox, create an Amazon Web Services Support case for a service limit increase request. New Amazon Pinpoint accounts are placed into an SMS or voice sandbox. The sandbox protects both Amazon Web Services end recipients and SMS or voice recipients from fraud and abuse. 
    */
  def describeAccountAttributes(params: DescribeAccountAttributesRequest): Request[DescribeAccountAttributesResult, AWSError] = js.native
  def describeAccountAttributes(
    params: DescribeAccountAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountAttributesResult, Unit]
  ): Request[DescribeAccountAttributesResult, AWSError] = js.native
  
  /**
    * Describes the current Amazon Pinpoint SMS Voice V2 resource quotas for your account. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. When you establish an Amazon Web Services account, the account has initial quotas on the maximum number of configuration sets, opt-out lists, phone numbers, and pools that you can create in a given Region. For more information see  Amazon Pinpoint quotas  in the Amazon Pinpoint Developer Guide.
    */
  def describeAccountLimits(): Request[DescribeAccountLimitsResult, AWSError] = js.native
  def describeAccountLimits(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountLimitsResult, Unit]): Request[DescribeAccountLimitsResult, AWSError] = js.native
  /**
    * Describes the current Amazon Pinpoint SMS Voice V2 resource quotas for your account. The description for a quota includes the quota name, current usage toward that quota, and the quota's maximum value. When you establish an Amazon Web Services account, the account has initial quotas on the maximum number of configuration sets, opt-out lists, phone numbers, and pools that you can create in a given Region. For more information see  Amazon Pinpoint quotas  in the Amazon Pinpoint Developer Guide.
    */
  def describeAccountLimits(params: DescribeAccountLimitsRequest): Request[DescribeAccountLimitsResult, AWSError] = js.native
  def describeAccountLimits(
    params: DescribeAccountLimitsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountLimitsResult, Unit]
  ): Request[DescribeAccountLimitsResult, AWSError] = js.native
  
  /**
    * Describes the specified configuration sets or all in your account. If you specify configuration set names, the output includes information for only the specified configuration sets. If you specify filters, the output includes information for only those configuration sets that meet the filter criteria. If you don't specify configuration set names or filters, the output includes information for all configuration sets. If you specify a configuration set name that isn't valid, an error is returned.
    */
  def describeConfigurationSets(): Request[DescribeConfigurationSetsResult, AWSError] = js.native
  def describeConfigurationSets(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationSetsResult, Unit]): Request[DescribeConfigurationSetsResult, AWSError] = js.native
  /**
    * Describes the specified configuration sets or all in your account. If you specify configuration set names, the output includes information for only the specified configuration sets. If you specify filters, the output includes information for only those configuration sets that meet the filter criteria. If you don't specify configuration set names or filters, the output includes information for all configuration sets. If you specify a configuration set name that isn't valid, an error is returned.
    */
  def describeConfigurationSets(params: DescribeConfigurationSetsRequest): Request[DescribeConfigurationSetsResult, AWSError] = js.native
  def describeConfigurationSets(
    params: DescribeConfigurationSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationSetsResult, Unit]
  ): Request[DescribeConfigurationSetsResult, AWSError] = js.native
  
  /**
    * Describes the specified keywords or all keywords on your origination phone number or pool. A keyword is a word that you can search for on a particular phone number or pool. It is also a specific word or phrase that an end user can send to your number to elicit a response, such as an informational message or a special offer. When your number receives a message that begins with a keyword, Amazon Pinpoint responds with a customizable message. If you specify a keyword that isn't valid, an Error is returned.
    */
  def describeKeywords(): Request[DescribeKeywordsResult, AWSError] = js.native
  def describeKeywords(callback: js.Function2[/* err */ AWSError, /* data */ DescribeKeywordsResult, Unit]): Request[DescribeKeywordsResult, AWSError] = js.native
  /**
    * Describes the specified keywords or all keywords on your origination phone number or pool. A keyword is a word that you can search for on a particular phone number or pool. It is also a specific word or phrase that an end user can send to your number to elicit a response, such as an informational message or a special offer. When your number receives a message that begins with a keyword, Amazon Pinpoint responds with a customizable message. If you specify a keyword that isn't valid, an Error is returned.
    */
  def describeKeywords(params: DescribeKeywordsRequest): Request[DescribeKeywordsResult, AWSError] = js.native
  def describeKeywords(
    params: DescribeKeywordsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeKeywordsResult, Unit]
  ): Request[DescribeKeywordsResult, AWSError] = js.native
  
  /**
    * Describes the specified opt-out list or all opt-out lists in your account. If you specify opt-out list names, the output includes information for only the specified opt-out lists. Opt-out lists include only those that meet the filter criteria. If you don't specify opt-out list names or filters, the output includes information for all opt-out lists. If you specify an opt-out list name that isn't valid, an Error is returned.
    */
  def describeOptOutLists(): Request[DescribeOptOutListsResult, AWSError] = js.native
  def describeOptOutLists(callback: js.Function2[/* err */ AWSError, /* data */ DescribeOptOutListsResult, Unit]): Request[DescribeOptOutListsResult, AWSError] = js.native
  /**
    * Describes the specified opt-out list or all opt-out lists in your account. If you specify opt-out list names, the output includes information for only the specified opt-out lists. Opt-out lists include only those that meet the filter criteria. If you don't specify opt-out list names or filters, the output includes information for all opt-out lists. If you specify an opt-out list name that isn't valid, an Error is returned.
    */
  def describeOptOutLists(params: DescribeOptOutListsRequest): Request[DescribeOptOutListsResult, AWSError] = js.native
  def describeOptOutLists(
    params: DescribeOptOutListsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOptOutListsResult, Unit]
  ): Request[DescribeOptOutListsResult, AWSError] = js.native
  
  /**
    * Describes the specified opted out destination numbers or all opted out destination numbers in an opt-out list. If you specify opted out numbers, the output includes information for only the specified opted out numbers. If you specify filters, the output includes information for only those opted out numbers that meet the filter criteria. If you don't specify opted out numbers or filters, the output includes information for all opted out destination numbers in your opt-out list. If you specify an opted out number that isn't valid, an Error is returned.
    */
  def describeOptedOutNumbers(): Request[DescribeOptedOutNumbersResult, AWSError] = js.native
  def describeOptedOutNumbers(callback: js.Function2[/* err */ AWSError, /* data */ DescribeOptedOutNumbersResult, Unit]): Request[DescribeOptedOutNumbersResult, AWSError] = js.native
  /**
    * Describes the specified opted out destination numbers or all opted out destination numbers in an opt-out list. If you specify opted out numbers, the output includes information for only the specified opted out numbers. If you specify filters, the output includes information for only those opted out numbers that meet the filter criteria. If you don't specify opted out numbers or filters, the output includes information for all opted out destination numbers in your opt-out list. If you specify an opted out number that isn't valid, an Error is returned.
    */
  def describeOptedOutNumbers(params: DescribeOptedOutNumbersRequest): Request[DescribeOptedOutNumbersResult, AWSError] = js.native
  def describeOptedOutNumbers(
    params: DescribeOptedOutNumbersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOptedOutNumbersResult, Unit]
  ): Request[DescribeOptedOutNumbersResult, AWSError] = js.native
  
  /**
    * Describes the specified origination phone number, or all the phone numbers in your account. If you specify phone number IDs, the output includes information for only the specified phone numbers. If you specify filters, the output includes information for only those phone numbers that meet the filter criteria. If you don't specify phone number IDs or filters, the output includes information for all phone numbers. If you specify a phone number ID that isn't valid, an Error is returned.
    */
  def describePhoneNumbers(): Request[DescribePhoneNumbersResult, AWSError] = js.native
  def describePhoneNumbers(callback: js.Function2[/* err */ AWSError, /* data */ DescribePhoneNumbersResult, Unit]): Request[DescribePhoneNumbersResult, AWSError] = js.native
  /**
    * Describes the specified origination phone number, or all the phone numbers in your account. If you specify phone number IDs, the output includes information for only the specified phone numbers. If you specify filters, the output includes information for only those phone numbers that meet the filter criteria. If you don't specify phone number IDs or filters, the output includes information for all phone numbers. If you specify a phone number ID that isn't valid, an Error is returned.
    */
  def describePhoneNumbers(params: DescribePhoneNumbersRequest): Request[DescribePhoneNumbersResult, AWSError] = js.native
  def describePhoneNumbers(
    params: DescribePhoneNumbersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePhoneNumbersResult, Unit]
  ): Request[DescribePhoneNumbersResult, AWSError] = js.native
  
  /**
    * Retrieves the specified pools or all pools associated with your Amazon Web Services account. If you specify pool IDs, the output includes information for only the specified pools. If you specify filters, the output includes information for only those pools that meet the filter criteria. If you don't specify pool IDs or filters, the output includes information for all pools. If you specify a pool ID that isn't valid, an Error is returned. A pool is a collection of phone numbers and SenderIds. A pool can include one or more phone numbers and SenderIds that are associated with your Amazon Web Services account.
    */
  def describePools(): Request[DescribePoolsResult, AWSError] = js.native
  def describePools(callback: js.Function2[/* err */ AWSError, /* data */ DescribePoolsResult, Unit]): Request[DescribePoolsResult, AWSError] = js.native
  /**
    * Retrieves the specified pools or all pools associated with your Amazon Web Services account. If you specify pool IDs, the output includes information for only the specified pools. If you specify filters, the output includes information for only those pools that meet the filter criteria. If you don't specify pool IDs or filters, the output includes information for all pools. If you specify a pool ID that isn't valid, an Error is returned. A pool is a collection of phone numbers and SenderIds. A pool can include one or more phone numbers and SenderIds that are associated with your Amazon Web Services account.
    */
  def describePools(params: DescribePoolsRequest): Request[DescribePoolsResult, AWSError] = js.native
  def describePools(
    params: DescribePoolsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePoolsResult, Unit]
  ): Request[DescribePoolsResult, AWSError] = js.native
  
  /**
    * Describes the specified SenderIds or all SenderIds associated with your Amazon Web Services account. If you specify SenderIds, the output includes information for only the specified SenderIds. If you specify filters, the output includes information for only those SenderIds that meet the filter criteria. If you don't specify SenderIds or filters, the output includes information for all SenderIds. f you specify a sender ID that isn't valid, an Error is returned.
    */
  def describeSenderIds(): Request[DescribeSenderIdsResult, AWSError] = js.native
  def describeSenderIds(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSenderIdsResult, Unit]): Request[DescribeSenderIdsResult, AWSError] = js.native
  /**
    * Describes the specified SenderIds or all SenderIds associated with your Amazon Web Services account. If you specify SenderIds, the output includes information for only the specified SenderIds. If you specify filters, the output includes information for only those SenderIds that meet the filter criteria. If you don't specify SenderIds or filters, the output includes information for all SenderIds. f you specify a sender ID that isn't valid, an Error is returned.
    */
  def describeSenderIds(params: DescribeSenderIdsRequest): Request[DescribeSenderIdsResult, AWSError] = js.native
  def describeSenderIds(
    params: DescribeSenderIdsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSenderIdsResult, Unit]
  ): Request[DescribeSenderIdsResult, AWSError] = js.native
  
  /**
    * Describes the current Amazon Pinpoint monthly spend limits for sending voice and text messages. When you establish an Amazon Web Services account, the account has initial monthly spend limit in a given Region. For more information on increasing your monthly spend limit, see  Requesting increases to your monthly SMS spending quota for Amazon Pinpoint  in the Amazon Pinpoint User Guide.
    */
  def describeSpendLimits(): Request[DescribeSpendLimitsResult, AWSError] = js.native
  def describeSpendLimits(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpendLimitsResult, Unit]): Request[DescribeSpendLimitsResult, AWSError] = js.native
  /**
    * Describes the current Amazon Pinpoint monthly spend limits for sending voice and text messages. When you establish an Amazon Web Services account, the account has initial monthly spend limit in a given Region. For more information on increasing your monthly spend limit, see  Requesting increases to your monthly SMS spending quota for Amazon Pinpoint  in the Amazon Pinpoint User Guide.
    */
  def describeSpendLimits(params: DescribeSpendLimitsRequest): Request[DescribeSpendLimitsResult, AWSError] = js.native
  def describeSpendLimits(
    params: DescribeSpendLimitsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpendLimitsResult, Unit]
  ): Request[DescribeSpendLimitsResult, AWSError] = js.native
  
  /**
    * Removes the specified origination identity from an existing pool. If the origination identity isn't associated with the specified pool, an Error is returned.
    */
  def disassociateOriginationIdentity(): Request[DisassociateOriginationIdentityResult, AWSError] = js.native
  def disassociateOriginationIdentity(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateOriginationIdentityResult, Unit]): Request[DisassociateOriginationIdentityResult, AWSError] = js.native
  /**
    * Removes the specified origination identity from an existing pool. If the origination identity isn't associated with the specified pool, an Error is returned.
    */
  def disassociateOriginationIdentity(params: DisassociateOriginationIdentityRequest): Request[DisassociateOriginationIdentityResult, AWSError] = js.native
  def disassociateOriginationIdentity(
    params: DisassociateOriginationIdentityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateOriginationIdentityResult, Unit]
  ): Request[DisassociateOriginationIdentityResult, AWSError] = js.native
  
  /**
    * Lists all associated origination identities in your pool. If you specify filters, the output includes information for only those origination identities that meet the filter criteria.
    */
  def listPoolOriginationIdentities(): Request[ListPoolOriginationIdentitiesResult, AWSError] = js.native
  def listPoolOriginationIdentities(callback: js.Function2[/* err */ AWSError, /* data */ ListPoolOriginationIdentitiesResult, Unit]): Request[ListPoolOriginationIdentitiesResult, AWSError] = js.native
  /**
    * Lists all associated origination identities in your pool. If you specify filters, the output includes information for only those origination identities that meet the filter criteria.
    */
  def listPoolOriginationIdentities(params: ListPoolOriginationIdentitiesRequest): Request[ListPoolOriginationIdentitiesResult, AWSError] = js.native
  def listPoolOriginationIdentities(
    params: ListPoolOriginationIdentitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPoolOriginationIdentitiesResult, Unit]
  ): Request[ListPoolOriginationIdentitiesResult, AWSError] = js.native
  
  /**
    * List all tags associated with a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]): Request[ListTagsForResourceResult, AWSError] = js.native
  /**
    * List all tags associated with a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]
  ): Request[ListTagsForResourceResult, AWSError] = js.native
  
  /**
    * Creates or updates a keyword configuration on an origination phone number or pool.  A keyword is a word that you can search for on a particular phone number or pool. It is also a specific word or phrase that an end user can send to your number to elicit a response, such as an informational message or a special offer. When your number receives a message that begins with a keyword, Amazon Pinpoint responds with a customizable message. If you specify a keyword that isn't valid, an Error is returned.
    */
  def putKeyword(): Request[PutKeywordResult, AWSError] = js.native
  def putKeyword(callback: js.Function2[/* err */ AWSError, /* data */ PutKeywordResult, Unit]): Request[PutKeywordResult, AWSError] = js.native
  /**
    * Creates or updates a keyword configuration on an origination phone number or pool.  A keyword is a word that you can search for on a particular phone number or pool. It is also a specific word or phrase that an end user can send to your number to elicit a response, such as an informational message or a special offer. When your number receives a message that begins with a keyword, Amazon Pinpoint responds with a customizable message. If you specify a keyword that isn't valid, an Error is returned.
    */
  def putKeyword(params: PutKeywordRequest): Request[PutKeywordResult, AWSError] = js.native
  def putKeyword(
    params: PutKeywordRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutKeywordResult, Unit]
  ): Request[PutKeywordResult, AWSError] = js.native
  
  /**
    * Creates an opted out destination phone number in the opt-out list. If the destination phone number isn't valid or if the specified opt-out list doesn't exist, an Error is returned.
    */
  def putOptedOutNumber(): Request[PutOptedOutNumberResult, AWSError] = js.native
  def putOptedOutNumber(callback: js.Function2[/* err */ AWSError, /* data */ PutOptedOutNumberResult, Unit]): Request[PutOptedOutNumberResult, AWSError] = js.native
  /**
    * Creates an opted out destination phone number in the opt-out list. If the destination phone number isn't valid or if the specified opt-out list doesn't exist, an Error is returned.
    */
  def putOptedOutNumber(params: PutOptedOutNumberRequest): Request[PutOptedOutNumberResult, AWSError] = js.native
  def putOptedOutNumber(
    params: PutOptedOutNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutOptedOutNumberResult, Unit]
  ): Request[PutOptedOutNumberResult, AWSError] = js.native
  
  /**
    * Releases an existing origination phone number in your account. Once released, a phone number is no longer available for sending messages. If the origination phone number has deletion protection enabled or is associated with a pool, an Error is returned.
    */
  def releasePhoneNumber(): Request[ReleasePhoneNumberResult, AWSError] = js.native
  def releasePhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ ReleasePhoneNumberResult, Unit]): Request[ReleasePhoneNumberResult, AWSError] = js.native
  /**
    * Releases an existing origination phone number in your account. Once released, a phone number is no longer available for sending messages. If the origination phone number has deletion protection enabled or is associated with a pool, an Error is returned.
    */
  def releasePhoneNumber(params: ReleasePhoneNumberRequest): Request[ReleasePhoneNumberResult, AWSError] = js.native
  def releasePhoneNumber(
    params: ReleasePhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ReleasePhoneNumberResult, Unit]
  ): Request[ReleasePhoneNumberResult, AWSError] = js.native
  
  /**
    * Request an origination phone number for use in your account. For more information on phone number request see  Requesting a number  in the Amazon Pinpoint User Guide.
    */
  def requestPhoneNumber(): Request[RequestPhoneNumberResult, AWSError] = js.native
  def requestPhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ RequestPhoneNumberResult, Unit]): Request[RequestPhoneNumberResult, AWSError] = js.native
  /**
    * Request an origination phone number for use in your account. For more information on phone number request see  Requesting a number  in the Amazon Pinpoint User Guide.
    */
  def requestPhoneNumber(params: RequestPhoneNumberRequest): Request[RequestPhoneNumberResult, AWSError] = js.native
  def requestPhoneNumber(
    params: RequestPhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RequestPhoneNumberResult, Unit]
  ): Request[RequestPhoneNumberResult, AWSError] = js.native
  
  /**
    * Creates a new text message and sends it to a recipient's phone number. SMS throughput limits are measured in Message Parts per Second (MPS). Your MPS limit depends on the destination country of your messages, as well as the type of phone number (origination number) that you use to send the message. For more information, see Message Parts per Second (MPS) limits in the Amazon Pinpoint User Guide.
    */
  def sendTextMessage(): Request[SendTextMessageResult, AWSError] = js.native
  def sendTextMessage(callback: js.Function2[/* err */ AWSError, /* data */ SendTextMessageResult, Unit]): Request[SendTextMessageResult, AWSError] = js.native
  /**
    * Creates a new text message and sends it to a recipient's phone number. SMS throughput limits are measured in Message Parts per Second (MPS). Your MPS limit depends on the destination country of your messages, as well as the type of phone number (origination number) that you use to send the message. For more information, see Message Parts per Second (MPS) limits in the Amazon Pinpoint User Guide.
    */
  def sendTextMessage(params: SendTextMessageRequest): Request[SendTextMessageResult, AWSError] = js.native
  def sendTextMessage(
    params: SendTextMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendTextMessageResult, Unit]
  ): Request[SendTextMessageResult, AWSError] = js.native
  
  /**
    * Allows you to send a request that sends a text message through Amazon Pinpoint. This operation uses Amazon Polly to convert a text script into a voice message.
    */
  def sendVoiceMessage(): Request[SendVoiceMessageResult, AWSError] = js.native
  def sendVoiceMessage(callback: js.Function2[/* err */ AWSError, /* data */ SendVoiceMessageResult, Unit]): Request[SendVoiceMessageResult, AWSError] = js.native
  /**
    * Allows you to send a request that sends a text message through Amazon Pinpoint. This operation uses Amazon Polly to convert a text script into a voice message.
    */
  def sendVoiceMessage(params: SendVoiceMessageRequest): Request[SendVoiceMessageResult, AWSError] = js.native
  def sendVoiceMessage(
    params: SendVoiceMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendVoiceMessageResult, Unit]
  ): Request[SendVoiceMessageResult, AWSError] = js.native
  
  /**
    * Sets the default message type on a configuration set. Choose the category of SMS messages that you plan to send from this account. If you send account-related messages or time-sensitive messages such as one-time passcodes, choose Transactional. If you plan to send messages that contain marketing material or other promotional content, choose Promotional. This setting applies to your entire Amazon Web Services account.
    */
  def setDefaultMessageType(): Request[SetDefaultMessageTypeResult, AWSError] = js.native
  def setDefaultMessageType(callback: js.Function2[/* err */ AWSError, /* data */ SetDefaultMessageTypeResult, Unit]): Request[SetDefaultMessageTypeResult, AWSError] = js.native
  /**
    * Sets the default message type on a configuration set. Choose the category of SMS messages that you plan to send from this account. If you send account-related messages or time-sensitive messages such as one-time passcodes, choose Transactional. If you plan to send messages that contain marketing material or other promotional content, choose Promotional. This setting applies to your entire Amazon Web Services account.
    */
  def setDefaultMessageType(params: SetDefaultMessageTypeRequest): Request[SetDefaultMessageTypeResult, AWSError] = js.native
  def setDefaultMessageType(
    params: SetDefaultMessageTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetDefaultMessageTypeResult, Unit]
  ): Request[SetDefaultMessageTypeResult, AWSError] = js.native
  
  /**
    * Sets default sender ID on a configuration set. When sending a text message to a destination country that supports sender IDs, the default sender ID on the configuration set specified will be used if no dedicated origination phone numbers or registered sender IDs are available in your account.
    */
  def setDefaultSenderId(): Request[SetDefaultSenderIdResult, AWSError] = js.native
  def setDefaultSenderId(callback: js.Function2[/* err */ AWSError, /* data */ SetDefaultSenderIdResult, Unit]): Request[SetDefaultSenderIdResult, AWSError] = js.native
  /**
    * Sets default sender ID on a configuration set. When sending a text message to a destination country that supports sender IDs, the default sender ID on the configuration set specified will be used if no dedicated origination phone numbers or registered sender IDs are available in your account.
    */
  def setDefaultSenderId(params: SetDefaultSenderIdRequest): Request[SetDefaultSenderIdResult, AWSError] = js.native
  def setDefaultSenderId(
    params: SetDefaultSenderIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetDefaultSenderIdResult, Unit]
  ): Request[SetDefaultSenderIdResult, AWSError] = js.native
  
  /**
    * Sets an account level monthly spend limit override for sending text messages. The requested spend limit must be less than or equal to the MaxLimit, which is set by Amazon Web Services. 
    */
  def setTextMessageSpendLimitOverride(): Request[SetTextMessageSpendLimitOverrideResult, AWSError] = js.native
  def setTextMessageSpendLimitOverride(
    callback: js.Function2[/* err */ AWSError, /* data */ SetTextMessageSpendLimitOverrideResult, Unit]
  ): Request[SetTextMessageSpendLimitOverrideResult, AWSError] = js.native
  /**
    * Sets an account level monthly spend limit override for sending text messages. The requested spend limit must be less than or equal to the MaxLimit, which is set by Amazon Web Services. 
    */
  def setTextMessageSpendLimitOverride(params: SetTextMessageSpendLimitOverrideRequest): Request[SetTextMessageSpendLimitOverrideResult, AWSError] = js.native
  def setTextMessageSpendLimitOverride(
    params: SetTextMessageSpendLimitOverrideRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetTextMessageSpendLimitOverrideResult, Unit]
  ): Request[SetTextMessageSpendLimitOverrideResult, AWSError] = js.native
  
  /**
    * Sets an account level monthly spend limit override for sending voice messages. The requested spend limit must be less than or equal to the MaxLimit, which is set by Amazon Web Services. 
    */
  def setVoiceMessageSpendLimitOverride(): Request[SetVoiceMessageSpendLimitOverrideResult, AWSError] = js.native
  def setVoiceMessageSpendLimitOverride(
    callback: js.Function2[/* err */ AWSError, /* data */ SetVoiceMessageSpendLimitOverrideResult, Unit]
  ): Request[SetVoiceMessageSpendLimitOverrideResult, AWSError] = js.native
  /**
    * Sets an account level monthly spend limit override for sending voice messages. The requested spend limit must be less than or equal to the MaxLimit, which is set by Amazon Web Services. 
    */
  def setVoiceMessageSpendLimitOverride(params: SetVoiceMessageSpendLimitOverrideRequest): Request[SetVoiceMessageSpendLimitOverrideResult, AWSError] = js.native
  def setVoiceMessageSpendLimitOverride(
    params: SetVoiceMessageSpendLimitOverrideRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetVoiceMessageSpendLimitOverrideResult, Unit]
  ): Request[SetVoiceMessageSpendLimitOverrideResult, AWSError] = js.native
  
  /**
    * Adds or overwrites only the specified tags for the specified Amazon Pinpoint SMS Voice, version 2 resource. When you specify an existing tag key, the value is overwritten with the new value. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see  Tagging Amazon Pinpoint resources in the Amazon Pinpoint Developer Guide.
    */
  def tagResource(): Request[TagResourceResult, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]): Request[TagResourceResult, AWSError] = js.native
  /**
    * Adds or overwrites only the specified tags for the specified Amazon Pinpoint SMS Voice, version 2 resource. When you specify an existing tag key, the value is overwritten with the new value. Each resource can have a maximum of 50 tags. Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information about tags, see  Tagging Amazon Pinpoint resources in the Amazon Pinpoint Developer Guide.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResult, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]
  ): Request[TagResourceResult, AWSError] = js.native
  
  /**
    * Removes the association of the specified tags from an Amazon Pinpoint SMS Voice V2 resource. For more information on tags see  Tagging Amazon Pinpoint resources in the Amazon Pinpoint Developer Guide. 
    */
  def untagResource(): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]): Request[UntagResourceResult, AWSError] = js.native
  /**
    * Removes the association of the specified tags from an Amazon Pinpoint SMS Voice V2 resource. For more information on tags see  Tagging Amazon Pinpoint resources in the Amazon Pinpoint Developer Guide. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]
  ): Request[UntagResourceResult, AWSError] = js.native
  
  /**
    * Updates an existing event destination in a configuration set. You can update the IAM role ARN for CloudWatch Logs and Kinesis Data Firehose. You can also enable or disable the event destination. You may want to update an event destination to change its matching event types or updating the destination resource ARN. You can't change an event destination's type between CloudWatch Logs, Kinesis Data Firehose, and Amazon SNS.
    */
  def updateEventDestination(): Request[UpdateEventDestinationResult, AWSError] = js.native
  def updateEventDestination(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEventDestinationResult, Unit]): Request[UpdateEventDestinationResult, AWSError] = js.native
  /**
    * Updates an existing event destination in a configuration set. You can update the IAM role ARN for CloudWatch Logs and Kinesis Data Firehose. You can also enable or disable the event destination. You may want to update an event destination to change its matching event types or updating the destination resource ARN. You can't change an event destination's type between CloudWatch Logs, Kinesis Data Firehose, and Amazon SNS.
    */
  def updateEventDestination(params: UpdateEventDestinationRequest): Request[UpdateEventDestinationResult, AWSError] = js.native
  def updateEventDestination(
    params: UpdateEventDestinationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEventDestinationResult, Unit]
  ): Request[UpdateEventDestinationResult, AWSError] = js.native
  
  /**
    * Updates the configuration of an existing origination phone number. You can update the opt-out list, enable or disable two-way messaging, change the TwoWayChannelArn, enable or disable self-managed opt-outs, and enable or disable deletion protection. If the origination phone number is associated with a pool, an Error is returned.
    */
  def updatePhoneNumber(): Request[UpdatePhoneNumberResult, AWSError] = js.native
  def updatePhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePhoneNumberResult, Unit]): Request[UpdatePhoneNumberResult, AWSError] = js.native
  /**
    * Updates the configuration of an existing origination phone number. You can update the opt-out list, enable or disable two-way messaging, change the TwoWayChannelArn, enable or disable self-managed opt-outs, and enable or disable deletion protection. If the origination phone number is associated with a pool, an Error is returned.
    */
  def updatePhoneNumber(params: UpdatePhoneNumberRequest): Request[UpdatePhoneNumberResult, AWSError] = js.native
  def updatePhoneNumber(
    params: UpdatePhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePhoneNumberResult, Unit]
  ): Request[UpdatePhoneNumberResult, AWSError] = js.native
  
  /**
    * Updates the configuration of an existing pool. You can update the opt-out list, enable or disable two-way messaging, change the TwoWayChannelArn, enable or disable self-managed opt-outs, enable or disable deletion protection, and enable or disable shared routes.
    */
  def updatePool(): Request[UpdatePoolResult, AWSError] = js.native
  def updatePool(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePoolResult, Unit]): Request[UpdatePoolResult, AWSError] = js.native
  /**
    * Updates the configuration of an existing pool. You can update the opt-out list, enable or disable two-way messaging, change the TwoWayChannelArn, enable or disable self-managed opt-outs, enable or disable deletion protection, and enable or disable shared routes.
    */
  def updatePool(params: UpdatePoolRequest): Request[UpdatePoolResult, AWSError] = js.native
  def updatePool(
    params: UpdatePoolRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePoolResult, Unit]
  ): Request[UpdatePoolResult, AWSError] = js.native
}

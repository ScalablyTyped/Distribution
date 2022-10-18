package typings.awsSdk.clientsSupportappMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportApp extends Service {
  
  @JSName("config")
  var config_SupportApp: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a Slack channel configuration for your Amazon Web Services account.    You can add up to 5 Slack workspaces for your account.   You can add up to 20 Slack channels for your account.    A Slack channel can have up to 100 Amazon Web Services accounts. This means that only 100 accounts can add the same Slack channel to the Amazon Web Services Support App. We recommend that you only add the accounts that you need to manage support cases for your organization. This can reduce the notifications about case updates that you receive in the Slack channel.  We recommend that you choose a private Slack channel so that only members in that channel have read and write access to your support cases. Anyone in your Slack channel can create, update, or resolve support cases for your account. Users require an invitation to join private channels.  
    */
  def createSlackChannelConfiguration(): Request[CreateSlackChannelConfigurationResult, AWSError] = js.native
  def createSlackChannelConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ CreateSlackChannelConfigurationResult, Unit]): Request[CreateSlackChannelConfigurationResult, AWSError] = js.native
  /**
    * Creates a Slack channel configuration for your Amazon Web Services account.    You can add up to 5 Slack workspaces for your account.   You can add up to 20 Slack channels for your account.    A Slack channel can have up to 100 Amazon Web Services accounts. This means that only 100 accounts can add the same Slack channel to the Amazon Web Services Support App. We recommend that you only add the accounts that you need to manage support cases for your organization. This can reduce the notifications about case updates that you receive in the Slack channel.  We recommend that you choose a private Slack channel so that only members in that channel have read and write access to your support cases. Anyone in your Slack channel can create, update, or resolve support cases for your account. Users require an invitation to join private channels.  
    */
  def createSlackChannelConfiguration(params: CreateSlackChannelConfigurationRequest): Request[CreateSlackChannelConfigurationResult, AWSError] = js.native
  def createSlackChannelConfiguration(
    params: CreateSlackChannelConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSlackChannelConfigurationResult, Unit]
  ): Request[CreateSlackChannelConfigurationResult, AWSError] = js.native
  
  /**
    * Deletes an alias for an Amazon Web Services account ID. The alias appears in the Amazon Web Services Support App page of the Amazon Web Services Support Center. The alias also appears in Slack messages from the Amazon Web Services Support App.
    */
  def deleteAccountAlias(): Request[DeleteAccountAliasResult, AWSError] = js.native
  def deleteAccountAlias(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountAliasResult, Unit]): Request[DeleteAccountAliasResult, AWSError] = js.native
  /**
    * Deletes an alias for an Amazon Web Services account ID. The alias appears in the Amazon Web Services Support App page of the Amazon Web Services Support Center. The alias also appears in Slack messages from the Amazon Web Services Support App.
    */
  def deleteAccountAlias(params: DeleteAccountAliasRequest): Request[DeleteAccountAliasResult, AWSError] = js.native
  def deleteAccountAlias(
    params: DeleteAccountAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountAliasResult, Unit]
  ): Request[DeleteAccountAliasResult, AWSError] = js.native
  
  /**
    * Deletes a Slack channel configuration from your Amazon Web Services account. This operation doesn't delete your Slack channel.
    */
  def deleteSlackChannelConfiguration(): Request[DeleteSlackChannelConfigurationResult, AWSError] = js.native
  def deleteSlackChannelConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSlackChannelConfigurationResult, Unit]): Request[DeleteSlackChannelConfigurationResult, AWSError] = js.native
  /**
    * Deletes a Slack channel configuration from your Amazon Web Services account. This operation doesn't delete your Slack channel.
    */
  def deleteSlackChannelConfiguration(params: DeleteSlackChannelConfigurationRequest): Request[DeleteSlackChannelConfigurationResult, AWSError] = js.native
  def deleteSlackChannelConfiguration(
    params: DeleteSlackChannelConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSlackChannelConfigurationResult, Unit]
  ): Request[DeleteSlackChannelConfigurationResult, AWSError] = js.native
  
  /**
    * Deletes a Slack workspace configuration from your Amazon Web Services account. This operation doesn't delete your Slack workspace.
    */
  def deleteSlackWorkspaceConfiguration(): Request[DeleteSlackWorkspaceConfigurationResult, AWSError] = js.native
  def deleteSlackWorkspaceConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSlackWorkspaceConfigurationResult, Unit]
  ): Request[DeleteSlackWorkspaceConfigurationResult, AWSError] = js.native
  /**
    * Deletes a Slack workspace configuration from your Amazon Web Services account. This operation doesn't delete your Slack workspace.
    */
  def deleteSlackWorkspaceConfiguration(params: DeleteSlackWorkspaceConfigurationRequest): Request[DeleteSlackWorkspaceConfigurationResult, AWSError] = js.native
  def deleteSlackWorkspaceConfiguration(
    params: DeleteSlackWorkspaceConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSlackWorkspaceConfigurationResult, Unit]
  ): Request[DeleteSlackWorkspaceConfigurationResult, AWSError] = js.native
  
  /**
    * Retrieves the alias from an Amazon Web Services account ID. The alias appears in the Amazon Web Services Support App page of the Amazon Web Services Support Center. The alias also appears in Slack messages from the Amazon Web Services Support App.
    */
  def getAccountAlias(): Request[GetAccountAliasResult, AWSError] = js.native
  def getAccountAlias(callback: js.Function2[/* err */ AWSError, /* data */ GetAccountAliasResult, Unit]): Request[GetAccountAliasResult, AWSError] = js.native
  /**
    * Retrieves the alias from an Amazon Web Services account ID. The alias appears in the Amazon Web Services Support App page of the Amazon Web Services Support Center. The alias also appears in Slack messages from the Amazon Web Services Support App.
    */
  def getAccountAlias(params: GetAccountAliasRequest): Request[GetAccountAliasResult, AWSError] = js.native
  def getAccountAlias(
    params: GetAccountAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccountAliasResult, Unit]
  ): Request[GetAccountAliasResult, AWSError] = js.native
  
  /**
    * Lists the Slack channel configurations for an Amazon Web Services account.
    */
  def listSlackChannelConfigurations(): Request[ListSlackChannelConfigurationsResult, AWSError] = js.native
  def listSlackChannelConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListSlackChannelConfigurationsResult, Unit]): Request[ListSlackChannelConfigurationsResult, AWSError] = js.native
  /**
    * Lists the Slack channel configurations for an Amazon Web Services account.
    */
  def listSlackChannelConfigurations(params: ListSlackChannelConfigurationsRequest): Request[ListSlackChannelConfigurationsResult, AWSError] = js.native
  def listSlackChannelConfigurations(
    params: ListSlackChannelConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSlackChannelConfigurationsResult, Unit]
  ): Request[ListSlackChannelConfigurationsResult, AWSError] = js.native
  
  /**
    * Lists the Slack workspace configurations for an Amazon Web Services account.
    */
  def listSlackWorkspaceConfigurations(): Request[ListSlackWorkspaceConfigurationsResult, AWSError] = js.native
  def listSlackWorkspaceConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListSlackWorkspaceConfigurationsResult, Unit]
  ): Request[ListSlackWorkspaceConfigurationsResult, AWSError] = js.native
  /**
    * Lists the Slack workspace configurations for an Amazon Web Services account.
    */
  def listSlackWorkspaceConfigurations(params: ListSlackWorkspaceConfigurationsRequest): Request[ListSlackWorkspaceConfigurationsResult, AWSError] = js.native
  def listSlackWorkspaceConfigurations(
    params: ListSlackWorkspaceConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSlackWorkspaceConfigurationsResult, Unit]
  ): Request[ListSlackWorkspaceConfigurationsResult, AWSError] = js.native
  
  /**
    * Creates or updates an individual alias for each Amazon Web Services account ID. The alias appears in the Amazon Web Services Support App page of the Amazon Web Services Support Center. The alias also appears in Slack messages from the Amazon Web Services Support App.
    */
  def putAccountAlias(): Request[PutAccountAliasResult, AWSError] = js.native
  def putAccountAlias(callback: js.Function2[/* err */ AWSError, /* data */ PutAccountAliasResult, Unit]): Request[PutAccountAliasResult, AWSError] = js.native
  /**
    * Creates or updates an individual alias for each Amazon Web Services account ID. The alias appears in the Amazon Web Services Support App page of the Amazon Web Services Support Center. The alias also appears in Slack messages from the Amazon Web Services Support App.
    */
  def putAccountAlias(params: PutAccountAliasRequest): Request[PutAccountAliasResult, AWSError] = js.native
  def putAccountAlias(
    params: PutAccountAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAccountAliasResult, Unit]
  ): Request[PutAccountAliasResult, AWSError] = js.native
  
  /**
    * Updates the configuration for a Slack channel, such as case update notifications.
    */
  def updateSlackChannelConfiguration(): Request[UpdateSlackChannelConfigurationResult, AWSError] = js.native
  def updateSlackChannelConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSlackChannelConfigurationResult, Unit]): Request[UpdateSlackChannelConfigurationResult, AWSError] = js.native
  /**
    * Updates the configuration for a Slack channel, such as case update notifications.
    */
  def updateSlackChannelConfiguration(params: UpdateSlackChannelConfigurationRequest): Request[UpdateSlackChannelConfigurationResult, AWSError] = js.native
  def updateSlackChannelConfiguration(
    params: UpdateSlackChannelConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSlackChannelConfigurationResult, Unit]
  ): Request[UpdateSlackChannelConfigurationResult, AWSError] = js.native
}

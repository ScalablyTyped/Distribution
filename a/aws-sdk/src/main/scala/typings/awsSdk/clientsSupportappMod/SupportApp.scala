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
    * Registers a Slack workspace for your Amazon Web Services account. To call this API, your account must be part of an organization in Organizations. If you're the management account and you want to register Slack workspaces for your organization, you must complete the following tasks:   Sign in to the Amazon Web Services Support Center and authorize the Slack workspaces where you want your organization to have access to. See Authorize a Slack workspace in the Amazon Web Services Support User Guide.   Call the RegisterSlackWorkspaceForOrganization API to authorize each Slack workspace for the organization.   After the management account authorizes the Slack workspace, member accounts can call this API to authorize the same Slack workspace for their individual accounts. Member accounts don't need to authorize the Slack workspace manually through the Amazon Web Services Support Center. To use the Amazon Web Services Support App, each account must then complete the following tasks:   Create an Identity and Access Management (IAM) role with the required permission. For more information, see Managing access to the Amazon Web Services Support App.   Configure a Slack channel to use the Amazon Web Services Support App for support cases for that account. For more information, see Configuring a Slack channel.  
    */
  def registerSlackWorkspaceForOrganization(): Request[RegisterSlackWorkspaceForOrganizationResult, AWSError] = js.native
  def registerSlackWorkspaceForOrganization(
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterSlackWorkspaceForOrganizationResult, Unit]
  ): Request[RegisterSlackWorkspaceForOrganizationResult, AWSError] = js.native
  /**
    * Registers a Slack workspace for your Amazon Web Services account. To call this API, your account must be part of an organization in Organizations. If you're the management account and you want to register Slack workspaces for your organization, you must complete the following tasks:   Sign in to the Amazon Web Services Support Center and authorize the Slack workspaces where you want your organization to have access to. See Authorize a Slack workspace in the Amazon Web Services Support User Guide.   Call the RegisterSlackWorkspaceForOrganization API to authorize each Slack workspace for the organization.   After the management account authorizes the Slack workspace, member accounts can call this API to authorize the same Slack workspace for their individual accounts. Member accounts don't need to authorize the Slack workspace manually through the Amazon Web Services Support Center. To use the Amazon Web Services Support App, each account must then complete the following tasks:   Create an Identity and Access Management (IAM) role with the required permission. For more information, see Managing access to the Amazon Web Services Support App.   Configure a Slack channel to use the Amazon Web Services Support App for support cases for that account. For more information, see Configuring a Slack channel.  
    */
  def registerSlackWorkspaceForOrganization(params: RegisterSlackWorkspaceForOrganizationRequest): Request[RegisterSlackWorkspaceForOrganizationResult, AWSError] = js.native
  def registerSlackWorkspaceForOrganization(
    params: RegisterSlackWorkspaceForOrganizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterSlackWorkspaceForOrganizationResult, Unit]
  ): Request[RegisterSlackWorkspaceForOrganizationResult, AWSError] = js.native
  
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

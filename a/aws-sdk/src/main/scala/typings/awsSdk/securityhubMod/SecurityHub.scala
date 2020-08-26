package typings.awsSdk.securityhubMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityHub extends Service {
  @JSName("config")
  var config_SecurityHub: ConfigBase with ClientConfiguration = js.native
  /**
    * Accepts the invitation to be a member account and be monitored by the Security Hub master account that the invitation was sent from. When the member account accepts the invitation, permission is granted to the master account to view findings generated in the member account.
    */
  def acceptInvitation(): Request[AcceptInvitationResponse, AWSError] = js.native
  def acceptInvitation(callback: js.Function2[/* err */ AWSError, /* data */ AcceptInvitationResponse, Unit]): Request[AcceptInvitationResponse, AWSError] = js.native
  /**
    * Accepts the invitation to be a member account and be monitored by the Security Hub master account that the invitation was sent from. When the member account accepts the invitation, permission is granted to the master account to view findings generated in the member account.
    */
  def acceptInvitation(params: AcceptInvitationRequest): Request[AcceptInvitationResponse, AWSError] = js.native
  def acceptInvitation(
    params: AcceptInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AcceptInvitationResponse, Unit]
  ): Request[AcceptInvitationResponse, AWSError] = js.native
  /**
    * Disables the standards specified by the provided StandardsSubscriptionArns. For more information, see Security Standards section of the AWS Security Hub User Guide.
    */
  def batchDisableStandards(): Request[BatchDisableStandardsResponse, AWSError] = js.native
  def batchDisableStandards(callback: js.Function2[/* err */ AWSError, /* data */ BatchDisableStandardsResponse, Unit]): Request[BatchDisableStandardsResponse, AWSError] = js.native
  /**
    * Disables the standards specified by the provided StandardsSubscriptionArns. For more information, see Security Standards section of the AWS Security Hub User Guide.
    */
  def batchDisableStandards(params: BatchDisableStandardsRequest): Request[BatchDisableStandardsResponse, AWSError] = js.native
  def batchDisableStandards(
    params: BatchDisableStandardsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDisableStandardsResponse, Unit]
  ): Request[BatchDisableStandardsResponse, AWSError] = js.native
  /**
    * Enables the standards specified by the provided StandardsArn. To obtain the ARN for a standard, use the  DescribeStandards  operation. For more information, see the Security Standards section of the AWS Security Hub User Guide.
    */
  def batchEnableStandards(): Request[BatchEnableStandardsResponse, AWSError] = js.native
  def batchEnableStandards(callback: js.Function2[/* err */ AWSError, /* data */ BatchEnableStandardsResponse, Unit]): Request[BatchEnableStandardsResponse, AWSError] = js.native
  /**
    * Enables the standards specified by the provided StandardsArn. To obtain the ARN for a standard, use the  DescribeStandards  operation. For more information, see the Security Standards section of the AWS Security Hub User Guide.
    */
  def batchEnableStandards(params: BatchEnableStandardsRequest): Request[BatchEnableStandardsResponse, AWSError] = js.native
  def batchEnableStandards(
    params: BatchEnableStandardsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchEnableStandardsResponse, Unit]
  ): Request[BatchEnableStandardsResponse, AWSError] = js.native
  /**
    * Imports security findings generated from an integrated third-party product into Security Hub. This action is requested by the integrated product to import its findings into Security Hub. The maximum allowed size for a finding is 240 Kb. An error is returned for any finding larger than 240 Kb. After a finding is created, BatchImportFindings cannot be used to update the following finding fields and objects, which Security Hub customers use to manage their investigation workflow.    Confidence     Criticality     Note     RelatedFindings     Severity     Types     UserDefinedFields     VerificationState     Workflow   
    */
  def batchImportFindings(): Request[BatchImportFindingsResponse, AWSError] = js.native
  def batchImportFindings(callback: js.Function2[/* err */ AWSError, /* data */ BatchImportFindingsResponse, Unit]): Request[BatchImportFindingsResponse, AWSError] = js.native
  /**
    * Imports security findings generated from an integrated third-party product into Security Hub. This action is requested by the integrated product to import its findings into Security Hub. The maximum allowed size for a finding is 240 Kb. An error is returned for any finding larger than 240 Kb. After a finding is created, BatchImportFindings cannot be used to update the following finding fields and objects, which Security Hub customers use to manage their investigation workflow.    Confidence     Criticality     Note     RelatedFindings     Severity     Types     UserDefinedFields     VerificationState     Workflow   
    */
  def batchImportFindings(params: BatchImportFindingsRequest): Request[BatchImportFindingsResponse, AWSError] = js.native
  def batchImportFindings(
    params: BatchImportFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchImportFindingsResponse, Unit]
  ): Request[BatchImportFindingsResponse, AWSError] = js.native
  /**
    * Used by Security Hub customers to update information about their investigation into a finding. Requested by master accounts or member accounts. Master accounts can update findings for their account and their member accounts. Member accounts can update findings for their account. Updates from BatchUpdateFindings do not affect the value of UpdatedAt for a finding. Master accounts can use BatchUpdateFindings to update the following finding fields and objects.    Confidence     Criticality     Note     RelatedFindings     Severity     Types     UserDefinedFields     VerificationState     Workflow    Member accounts can only use BatchUpdateFindings to update the Note object.
    */
  def batchUpdateFindings(): Request[BatchUpdateFindingsResponse, AWSError] = js.native
  def batchUpdateFindings(callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateFindingsResponse, Unit]): Request[BatchUpdateFindingsResponse, AWSError] = js.native
  /**
    * Used by Security Hub customers to update information about their investigation into a finding. Requested by master accounts or member accounts. Master accounts can update findings for their account and their member accounts. Member accounts can update findings for their account. Updates from BatchUpdateFindings do not affect the value of UpdatedAt for a finding. Master accounts can use BatchUpdateFindings to update the following finding fields and objects.    Confidence     Criticality     Note     RelatedFindings     Severity     Types     UserDefinedFields     VerificationState     Workflow    Member accounts can only use BatchUpdateFindings to update the Note object.
    */
  def batchUpdateFindings(params: BatchUpdateFindingsRequest): Request[BatchUpdateFindingsResponse, AWSError] = js.native
  def batchUpdateFindings(
    params: BatchUpdateFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateFindingsResponse, Unit]
  ): Request[BatchUpdateFindingsResponse, AWSError] = js.native
  /**
    * Creates a custom action target in Security Hub. You can use custom actions on findings and insights in Security Hub to trigger target actions in Amazon CloudWatch Events.
    */
  def createActionTarget(): Request[CreateActionTargetResponse, AWSError] = js.native
  def createActionTarget(callback: js.Function2[/* err */ AWSError, /* data */ CreateActionTargetResponse, Unit]): Request[CreateActionTargetResponse, AWSError] = js.native
  /**
    * Creates a custom action target in Security Hub. You can use custom actions on findings and insights in Security Hub to trigger target actions in Amazon CloudWatch Events.
    */
  def createActionTarget(params: CreateActionTargetRequest): Request[CreateActionTargetResponse, AWSError] = js.native
  def createActionTarget(
    params: CreateActionTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateActionTargetResponse, Unit]
  ): Request[CreateActionTargetResponse, AWSError] = js.native
  /**
    * Creates a custom insight in Security Hub. An insight is a consolidation of findings that relate to a security issue that requires attention or remediation. To group the related findings in the insight, use the GroupByAttribute.
    */
  def createInsight(): Request[CreateInsightResponse, AWSError] = js.native
  def createInsight(callback: js.Function2[/* err */ AWSError, /* data */ CreateInsightResponse, Unit]): Request[CreateInsightResponse, AWSError] = js.native
  /**
    * Creates a custom insight in Security Hub. An insight is a consolidation of findings that relate to a security issue that requires attention or remediation. To group the related findings in the insight, use the GroupByAttribute.
    */
  def createInsight(params: CreateInsightRequest): Request[CreateInsightResponse, AWSError] = js.native
  def createInsight(
    params: CreateInsightRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInsightResponse, Unit]
  ): Request[CreateInsightResponse, AWSError] = js.native
  /**
    * Creates a member association in Security Hub between the specified accounts and the account used to make the request, which is the master account. To successfully create a member, you must use this action from an account that already has Security Hub enabled. To enable Security Hub, you can use the  EnableSecurityHub  operation. After you use CreateMembers to create member account associations in Security Hub, you must use the  InviteMembers  operation to invite the accounts to enable Security Hub and become member accounts in Security Hub. If the account owner accepts the invitation, the account becomes a member account in Security Hub. A permissions policy is added that permits the master account to view the findings generated in the member account. When Security Hub is enabled in the invited account, findings start to be sent to both the member and master accounts. To remove the association between the master and member accounts, use the  DisassociateFromMasterAccount  or  DisassociateMembers  operation.
    */
  def createMembers(): Request[CreateMembersResponse, AWSError] = js.native
  def createMembers(callback: js.Function2[/* err */ AWSError, /* data */ CreateMembersResponse, Unit]): Request[CreateMembersResponse, AWSError] = js.native
  /**
    * Creates a member association in Security Hub between the specified accounts and the account used to make the request, which is the master account. To successfully create a member, you must use this action from an account that already has Security Hub enabled. To enable Security Hub, you can use the  EnableSecurityHub  operation. After you use CreateMembers to create member account associations in Security Hub, you must use the  InviteMembers  operation to invite the accounts to enable Security Hub and become member accounts in Security Hub. If the account owner accepts the invitation, the account becomes a member account in Security Hub. A permissions policy is added that permits the master account to view the findings generated in the member account. When Security Hub is enabled in the invited account, findings start to be sent to both the member and master accounts. To remove the association between the master and member accounts, use the  DisassociateFromMasterAccount  or  DisassociateMembers  operation.
    */
  def createMembers(params: CreateMembersRequest): Request[CreateMembersResponse, AWSError] = js.native
  def createMembers(
    params: CreateMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMembersResponse, Unit]
  ): Request[CreateMembersResponse, AWSError] = js.native
  /**
    * Declines invitations to become a member account.
    */
  def declineInvitations(): Request[DeclineInvitationsResponse, AWSError] = js.native
  def declineInvitations(callback: js.Function2[/* err */ AWSError, /* data */ DeclineInvitationsResponse, Unit]): Request[DeclineInvitationsResponse, AWSError] = js.native
  /**
    * Declines invitations to become a member account.
    */
  def declineInvitations(params: DeclineInvitationsRequest): Request[DeclineInvitationsResponse, AWSError] = js.native
  def declineInvitations(
    params: DeclineInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeclineInvitationsResponse, Unit]
  ): Request[DeclineInvitationsResponse, AWSError] = js.native
  /**
    * Deletes a custom action target from Security Hub. Deleting a custom action target does not affect any findings or insights that were already sent to Amazon CloudWatch Events using the custom action.
    */
  def deleteActionTarget(): Request[DeleteActionTargetResponse, AWSError] = js.native
  def deleteActionTarget(callback: js.Function2[/* err */ AWSError, /* data */ DeleteActionTargetResponse, Unit]): Request[DeleteActionTargetResponse, AWSError] = js.native
  /**
    * Deletes a custom action target from Security Hub. Deleting a custom action target does not affect any findings or insights that were already sent to Amazon CloudWatch Events using the custom action.
    */
  def deleteActionTarget(params: DeleteActionTargetRequest): Request[DeleteActionTargetResponse, AWSError] = js.native
  def deleteActionTarget(
    params: DeleteActionTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteActionTargetResponse, Unit]
  ): Request[DeleteActionTargetResponse, AWSError] = js.native
  /**
    * Deletes the insight specified by the InsightArn.
    */
  def deleteInsight(): Request[DeleteInsightResponse, AWSError] = js.native
  def deleteInsight(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInsightResponse, Unit]): Request[DeleteInsightResponse, AWSError] = js.native
  /**
    * Deletes the insight specified by the InsightArn.
    */
  def deleteInsight(params: DeleteInsightRequest): Request[DeleteInsightResponse, AWSError] = js.native
  def deleteInsight(
    params: DeleteInsightRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInsightResponse, Unit]
  ): Request[DeleteInsightResponse, AWSError] = js.native
  /**
    * Deletes invitations received by the AWS account to become a member account.
    */
  def deleteInvitations(): Request[DeleteInvitationsResponse, AWSError] = js.native
  def deleteInvitations(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInvitationsResponse, Unit]): Request[DeleteInvitationsResponse, AWSError] = js.native
  /**
    * Deletes invitations received by the AWS account to become a member account.
    */
  def deleteInvitations(params: DeleteInvitationsRequest): Request[DeleteInvitationsResponse, AWSError] = js.native
  def deleteInvitations(
    params: DeleteInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInvitationsResponse, Unit]
  ): Request[DeleteInvitationsResponse, AWSError] = js.native
  /**
    * Deletes the specified member accounts from Security Hub.
    */
  def deleteMembers(): Request[DeleteMembersResponse, AWSError] = js.native
  def deleteMembers(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMembersResponse, Unit]): Request[DeleteMembersResponse, AWSError] = js.native
  /**
    * Deletes the specified member accounts from Security Hub.
    */
  def deleteMembers(params: DeleteMembersRequest): Request[DeleteMembersResponse, AWSError] = js.native
  def deleteMembers(
    params: DeleteMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMembersResponse, Unit]
  ): Request[DeleteMembersResponse, AWSError] = js.native
  /**
    * Returns a list of the custom action targets in Security Hub in your account.
    */
  def describeActionTargets(): Request[DescribeActionTargetsResponse, AWSError] = js.native
  def describeActionTargets(callback: js.Function2[/* err */ AWSError, /* data */ DescribeActionTargetsResponse, Unit]): Request[DescribeActionTargetsResponse, AWSError] = js.native
  /**
    * Returns a list of the custom action targets in Security Hub in your account.
    */
  def describeActionTargets(params: DescribeActionTargetsRequest): Request[DescribeActionTargetsResponse, AWSError] = js.native
  def describeActionTargets(
    params: DescribeActionTargetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeActionTargetsResponse, Unit]
  ): Request[DescribeActionTargetsResponse, AWSError] = js.native
  /**
    * Returns details about the Hub resource in your account, including the HubArn and the time when you enabled Security Hub.
    */
  def describeHub(): Request[DescribeHubResponse, AWSError] = js.native
  def describeHub(callback: js.Function2[/* err */ AWSError, /* data */ DescribeHubResponse, Unit]): Request[DescribeHubResponse, AWSError] = js.native
  /**
    * Returns details about the Hub resource in your account, including the HubArn and the time when you enabled Security Hub.
    */
  def describeHub(params: DescribeHubRequest): Request[DescribeHubResponse, AWSError] = js.native
  def describeHub(
    params: DescribeHubRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHubResponse, Unit]
  ): Request[DescribeHubResponse, AWSError] = js.native
  /**
    * Returns information about the available products that you can subscribe to and integrate with Security Hub in order to consolidate findings.
    */
  def describeProducts(): Request[DescribeProductsResponse, AWSError] = js.native
  def describeProducts(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProductsResponse, Unit]): Request[DescribeProductsResponse, AWSError] = js.native
  /**
    * Returns information about the available products that you can subscribe to and integrate with Security Hub in order to consolidate findings.
    */
  def describeProducts(params: DescribeProductsRequest): Request[DescribeProductsResponse, AWSError] = js.native
  def describeProducts(
    params: DescribeProductsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProductsResponse, Unit]
  ): Request[DescribeProductsResponse, AWSError] = js.native
  /**
    * Returns a list of the available standards in Security Hub. For each standard, the results include the standard ARN, the name, and a description. 
    */
  def describeStandards(): Request[DescribeStandardsResponse, AWSError] = js.native
  def describeStandards(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStandardsResponse, Unit]): Request[DescribeStandardsResponse, AWSError] = js.native
  /**
    * Returns a list of the available standards in Security Hub. For each standard, the results include the standard ARN, the name, and a description. 
    */
  def describeStandards(params: DescribeStandardsRequest): Request[DescribeStandardsResponse, AWSError] = js.native
  def describeStandards(
    params: DescribeStandardsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStandardsResponse, Unit]
  ): Request[DescribeStandardsResponse, AWSError] = js.native
  /**
    * Returns a list of security standards controls. For each control, the results include information about whether it is currently enabled, the severity, and a link to remediation information.
    */
  def describeStandardsControls(): Request[DescribeStandardsControlsResponse, AWSError] = js.native
  def describeStandardsControls(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStandardsControlsResponse, Unit]): Request[DescribeStandardsControlsResponse, AWSError] = js.native
  /**
    * Returns a list of security standards controls. For each control, the results include information about whether it is currently enabled, the severity, and a link to remediation information.
    */
  def describeStandardsControls(params: DescribeStandardsControlsRequest): Request[DescribeStandardsControlsResponse, AWSError] = js.native
  def describeStandardsControls(
    params: DescribeStandardsControlsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStandardsControlsResponse, Unit]
  ): Request[DescribeStandardsControlsResponse, AWSError] = js.native
  /**
    * Disables the integration of the specified product with Security Hub. After the integration is disabled, findings from that product are no longer sent to Security Hub.
    */
  def disableImportFindingsForProduct(): Request[DisableImportFindingsForProductResponse, AWSError] = js.native
  def disableImportFindingsForProduct(
    callback: js.Function2[/* err */ AWSError, /* data */ DisableImportFindingsForProductResponse, Unit]
  ): Request[DisableImportFindingsForProductResponse, AWSError] = js.native
  /**
    * Disables the integration of the specified product with Security Hub. After the integration is disabled, findings from that product are no longer sent to Security Hub.
    */
  def disableImportFindingsForProduct(params: DisableImportFindingsForProductRequest): Request[DisableImportFindingsForProductResponse, AWSError] = js.native
  def disableImportFindingsForProduct(
    params: DisableImportFindingsForProductRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableImportFindingsForProductResponse, Unit]
  ): Request[DisableImportFindingsForProductResponse, AWSError] = js.native
  /**
    * Disables Security Hub in your account only in the current Region. To disable Security Hub in all Regions, you must submit one request per Region where you have enabled Security Hub. When you disable Security Hub for a master account, it doesn't disable Security Hub for any associated member accounts. When you disable Security Hub, your existing findings and insights and any Security Hub configuration settings are deleted after 90 days and cannot be recovered. Any standards that were enabled are disabled, and your master and member account associations are removed. If you want to save your existing findings, you must export them before you disable Security Hub.
    */
  def disableSecurityHub(): Request[DisableSecurityHubResponse, AWSError] = js.native
  def disableSecurityHub(callback: js.Function2[/* err */ AWSError, /* data */ DisableSecurityHubResponse, Unit]): Request[DisableSecurityHubResponse, AWSError] = js.native
  /**
    * Disables Security Hub in your account only in the current Region. To disable Security Hub in all Regions, you must submit one request per Region where you have enabled Security Hub. When you disable Security Hub for a master account, it doesn't disable Security Hub for any associated member accounts. When you disable Security Hub, your existing findings and insights and any Security Hub configuration settings are deleted after 90 days and cannot be recovered. Any standards that were enabled are disabled, and your master and member account associations are removed. If you want to save your existing findings, you must export them before you disable Security Hub.
    */
  def disableSecurityHub(params: DisableSecurityHubRequest): Request[DisableSecurityHubResponse, AWSError] = js.native
  def disableSecurityHub(
    params: DisableSecurityHubRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableSecurityHubResponse, Unit]
  ): Request[DisableSecurityHubResponse, AWSError] = js.native
  /**
    * Disassociates the current Security Hub member account from the associated master account.
    */
  def disassociateFromMasterAccount(): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  def disassociateFromMasterAccount(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateFromMasterAccountResponse, Unit]): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  /**
    * Disassociates the current Security Hub member account from the associated master account.
    */
  def disassociateFromMasterAccount(params: DisassociateFromMasterAccountRequest): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  def disassociateFromMasterAccount(
    params: DisassociateFromMasterAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateFromMasterAccountResponse, Unit]
  ): Request[DisassociateFromMasterAccountResponse, AWSError] = js.native
  /**
    * Disassociates the specified member accounts from the associated master account.
    */
  def disassociateMembers(): Request[DisassociateMembersResponse, AWSError] = js.native
  def disassociateMembers(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMembersResponse, Unit]): Request[DisassociateMembersResponse, AWSError] = js.native
  /**
    * Disassociates the specified member accounts from the associated master account.
    */
  def disassociateMembers(params: DisassociateMembersRequest): Request[DisassociateMembersResponse, AWSError] = js.native
  def disassociateMembers(
    params: DisassociateMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateMembersResponse, Unit]
  ): Request[DisassociateMembersResponse, AWSError] = js.native
  /**
    * Enables the integration of a partner product with Security Hub. Integrated products send findings to Security Hub. When you enable a product integration, a permissions policy that grants permission for the product to send findings to Security Hub is applied.
    */
  def enableImportFindingsForProduct(): Request[EnableImportFindingsForProductResponse, AWSError] = js.native
  def enableImportFindingsForProduct(
    callback: js.Function2[/* err */ AWSError, /* data */ EnableImportFindingsForProductResponse, Unit]
  ): Request[EnableImportFindingsForProductResponse, AWSError] = js.native
  /**
    * Enables the integration of a partner product with Security Hub. Integrated products send findings to Security Hub. When you enable a product integration, a permissions policy that grants permission for the product to send findings to Security Hub is applied.
    */
  def enableImportFindingsForProduct(params: EnableImportFindingsForProductRequest): Request[EnableImportFindingsForProductResponse, AWSError] = js.native
  def enableImportFindingsForProduct(
    params: EnableImportFindingsForProductRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableImportFindingsForProductResponse, Unit]
  ): Request[EnableImportFindingsForProductResponse, AWSError] = js.native
  /**
    * Enables Security Hub for your account in the current Region or the Region you specify in the request. When you enable Security Hub, you grant to Security Hub the permissions necessary to gather findings from other services that are integrated with Security Hub. When you use the EnableSecurityHub operation to enable Security Hub, you also automatically enable the following standards.   CIS AWS Foundations   AWS Foundational Security Best Practices   You do not enable the Payment Card Industry Data Security Standard (PCI DSS) standard.  To not enable the automatically enabled standards, set EnableDefaultStandards to false. After you enable Security Hub, to enable a standard, use the  BatchEnableStandards  operation. To disable a standard, use the  BatchDisableStandards  operation. To learn more, see Setting Up AWS Security Hub in the AWS Security Hub User Guide.
    */
  def enableSecurityHub(): Request[EnableSecurityHubResponse, AWSError] = js.native
  def enableSecurityHub(callback: js.Function2[/* err */ AWSError, /* data */ EnableSecurityHubResponse, Unit]): Request[EnableSecurityHubResponse, AWSError] = js.native
  /**
    * Enables Security Hub for your account in the current Region or the Region you specify in the request. When you enable Security Hub, you grant to Security Hub the permissions necessary to gather findings from other services that are integrated with Security Hub. When you use the EnableSecurityHub operation to enable Security Hub, you also automatically enable the following standards.   CIS AWS Foundations   AWS Foundational Security Best Practices   You do not enable the Payment Card Industry Data Security Standard (PCI DSS) standard.  To not enable the automatically enabled standards, set EnableDefaultStandards to false. After you enable Security Hub, to enable a standard, use the  BatchEnableStandards  operation. To disable a standard, use the  BatchDisableStandards  operation. To learn more, see Setting Up AWS Security Hub in the AWS Security Hub User Guide.
    */
  def enableSecurityHub(params: EnableSecurityHubRequest): Request[EnableSecurityHubResponse, AWSError] = js.native
  def enableSecurityHub(
    params: EnableSecurityHubRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableSecurityHubResponse, Unit]
  ): Request[EnableSecurityHubResponse, AWSError] = js.native
  /**
    * Returns a list of the standards that are currently enabled.
    */
  def getEnabledStandards(): Request[GetEnabledStandardsResponse, AWSError] = js.native
  def getEnabledStandards(callback: js.Function2[/* err */ AWSError, /* data */ GetEnabledStandardsResponse, Unit]): Request[GetEnabledStandardsResponse, AWSError] = js.native
  /**
    * Returns a list of the standards that are currently enabled.
    */
  def getEnabledStandards(params: GetEnabledStandardsRequest): Request[GetEnabledStandardsResponse, AWSError] = js.native
  def getEnabledStandards(
    params: GetEnabledStandardsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnabledStandardsResponse, Unit]
  ): Request[GetEnabledStandardsResponse, AWSError] = js.native
  /**
    * Returns a list of findings that match the specified criteria.
    */
  def getFindings(): Request[GetFindingsResponse, AWSError] = js.native
  def getFindings(callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsResponse, Unit]): Request[GetFindingsResponse, AWSError] = js.native
  /**
    * Returns a list of findings that match the specified criteria.
    */
  def getFindings(params: GetFindingsRequest): Request[GetFindingsResponse, AWSError] = js.native
  def getFindings(
    params: GetFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFindingsResponse, Unit]
  ): Request[GetFindingsResponse, AWSError] = js.native
  /**
    * Lists the results of the Security Hub insight specified by the insight ARN.
    */
  def getInsightResults(): Request[GetInsightResultsResponse, AWSError] = js.native
  def getInsightResults(callback: js.Function2[/* err */ AWSError, /* data */ GetInsightResultsResponse, Unit]): Request[GetInsightResultsResponse, AWSError] = js.native
  /**
    * Lists the results of the Security Hub insight specified by the insight ARN.
    */
  def getInsightResults(params: GetInsightResultsRequest): Request[GetInsightResultsResponse, AWSError] = js.native
  def getInsightResults(
    params: GetInsightResultsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInsightResultsResponse, Unit]
  ): Request[GetInsightResultsResponse, AWSError] = js.native
  /**
    * Lists and describes insights for the specified insight ARNs.
    */
  def getInsights(): Request[GetInsightsResponse, AWSError] = js.native
  def getInsights(callback: js.Function2[/* err */ AWSError, /* data */ GetInsightsResponse, Unit]): Request[GetInsightsResponse, AWSError] = js.native
  /**
    * Lists and describes insights for the specified insight ARNs.
    */
  def getInsights(params: GetInsightsRequest): Request[GetInsightsResponse, AWSError] = js.native
  def getInsights(
    params: GetInsightsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInsightsResponse, Unit]
  ): Request[GetInsightsResponse, AWSError] = js.native
  /**
    * Returns the count of all Security Hub membership invitations that were sent to the current member account, not including the currently accepted invitation. 
    */
  def getInvitationsCount(): Request[GetInvitationsCountResponse, AWSError] = js.native
  def getInvitationsCount(callback: js.Function2[/* err */ AWSError, /* data */ GetInvitationsCountResponse, Unit]): Request[GetInvitationsCountResponse, AWSError] = js.native
  /**
    * Returns the count of all Security Hub membership invitations that were sent to the current member account, not including the currently accepted invitation. 
    */
  def getInvitationsCount(params: GetInvitationsCountRequest): Request[GetInvitationsCountResponse, AWSError] = js.native
  def getInvitationsCount(
    params: GetInvitationsCountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInvitationsCountResponse, Unit]
  ): Request[GetInvitationsCountResponse, AWSError] = js.native
  /**
    * Provides the details for the Security Hub master account for the current member account. 
    */
  def getMasterAccount(): Request[GetMasterAccountResponse, AWSError] = js.native
  def getMasterAccount(callback: js.Function2[/* err */ AWSError, /* data */ GetMasterAccountResponse, Unit]): Request[GetMasterAccountResponse, AWSError] = js.native
  /**
    * Provides the details for the Security Hub master account for the current member account. 
    */
  def getMasterAccount(params: GetMasterAccountRequest): Request[GetMasterAccountResponse, AWSError] = js.native
  def getMasterAccount(
    params: GetMasterAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMasterAccountResponse, Unit]
  ): Request[GetMasterAccountResponse, AWSError] = js.native
  /**
    * Returns the details for the Security Hub member accounts for the specified account IDs.
    */
  def getMembers(): Request[GetMembersResponse, AWSError] = js.native
  def getMembers(callback: js.Function2[/* err */ AWSError, /* data */ GetMembersResponse, Unit]): Request[GetMembersResponse, AWSError] = js.native
  /**
    * Returns the details for the Security Hub member accounts for the specified account IDs.
    */
  def getMembers(params: GetMembersRequest): Request[GetMembersResponse, AWSError] = js.native
  def getMembers(
    params: GetMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMembersResponse, Unit]
  ): Request[GetMembersResponse, AWSError] = js.native
  /**
    * Invites other AWS accounts to become member accounts for the Security Hub master account that the invitation is sent from. Before you can use this action to invite a member, you must first use the  CreateMembers  action to create the member account in Security Hub. When the account owner accepts the invitation to become a member account and enables Security Hub, the master account can view the findings generated from the member account.
    */
  def inviteMembers(): Request[InviteMembersResponse, AWSError] = js.native
  def inviteMembers(callback: js.Function2[/* err */ AWSError, /* data */ InviteMembersResponse, Unit]): Request[InviteMembersResponse, AWSError] = js.native
  /**
    * Invites other AWS accounts to become member accounts for the Security Hub master account that the invitation is sent from. Before you can use this action to invite a member, you must first use the  CreateMembers  action to create the member account in Security Hub. When the account owner accepts the invitation to become a member account and enables Security Hub, the master account can view the findings generated from the member account.
    */
  def inviteMembers(params: InviteMembersRequest): Request[InviteMembersResponse, AWSError] = js.native
  def inviteMembers(
    params: InviteMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InviteMembersResponse, Unit]
  ): Request[InviteMembersResponse, AWSError] = js.native
  /**
    * Lists all findings-generating solutions (products) that you are subscribed to receive findings from in Security Hub.
    */
  def listEnabledProductsForImport(): Request[ListEnabledProductsForImportResponse, AWSError] = js.native
  def listEnabledProductsForImport(callback: js.Function2[/* err */ AWSError, /* data */ ListEnabledProductsForImportResponse, Unit]): Request[ListEnabledProductsForImportResponse, AWSError] = js.native
  /**
    * Lists all findings-generating solutions (products) that you are subscribed to receive findings from in Security Hub.
    */
  def listEnabledProductsForImport(params: ListEnabledProductsForImportRequest): Request[ListEnabledProductsForImportResponse, AWSError] = js.native
  def listEnabledProductsForImport(
    params: ListEnabledProductsForImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnabledProductsForImportResponse, Unit]
  ): Request[ListEnabledProductsForImportResponse, AWSError] = js.native
  /**
    * Lists all Security Hub membership invitations that were sent to the current AWS account. 
    */
  def listInvitations(): Request[ListInvitationsResponse, AWSError] = js.native
  def listInvitations(callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsResponse, Unit]): Request[ListInvitationsResponse, AWSError] = js.native
  /**
    * Lists all Security Hub membership invitations that were sent to the current AWS account. 
    */
  def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse, AWSError] = js.native
  def listInvitations(
    params: ListInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsResponse, Unit]
  ): Request[ListInvitationsResponse, AWSError] = js.native
  /**
    * Lists details about all member accounts for the current Security Hub master account.
    */
  def listMembers(): Request[ListMembersResponse, AWSError] = js.native
  def listMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListMembersResponse, Unit]): Request[ListMembersResponse, AWSError] = js.native
  /**
    * Lists details about all member accounts for the current Security Hub master account.
    */
  def listMembers(params: ListMembersRequest): Request[ListMembersResponse, AWSError] = js.native
  def listMembers(
    params: ListMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMembersResponse, Unit]
  ): Request[ListMembersResponse, AWSError] = js.native
  /**
    * Returns a list of tags associated with a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of tags associated with a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Adds one or more tags to a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds one or more tags to a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes one or more tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates the name and description of a custom action target in Security Hub.
    */
  def updateActionTarget(): Request[UpdateActionTargetResponse, AWSError] = js.native
  def updateActionTarget(callback: js.Function2[/* err */ AWSError, /* data */ UpdateActionTargetResponse, Unit]): Request[UpdateActionTargetResponse, AWSError] = js.native
  /**
    * Updates the name and description of a custom action target in Security Hub.
    */
  def updateActionTarget(params: UpdateActionTargetRequest): Request[UpdateActionTargetResponse, AWSError] = js.native
  def updateActionTarget(
    params: UpdateActionTargetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateActionTargetResponse, Unit]
  ): Request[UpdateActionTargetResponse, AWSError] = js.native
  /**
    *  UpdateFindings is deprecated. Instead of UpdateFindings, use BatchUpdateFindings. Updates the Note and RecordState of the Security Hub-aggregated findings that the filter attributes specify. Any member account that can view the finding also sees the update to the finding.
    */
  def updateFindings(): Request[UpdateFindingsResponse, AWSError] = js.native
  def updateFindings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFindingsResponse, Unit]): Request[UpdateFindingsResponse, AWSError] = js.native
  /**
    *  UpdateFindings is deprecated. Instead of UpdateFindings, use BatchUpdateFindings. Updates the Note and RecordState of the Security Hub-aggregated findings that the filter attributes specify. Any member account that can view the finding also sees the update to the finding.
    */
  def updateFindings(params: UpdateFindingsRequest): Request[UpdateFindingsResponse, AWSError] = js.native
  def updateFindings(
    params: UpdateFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFindingsResponse, Unit]
  ): Request[UpdateFindingsResponse, AWSError] = js.native
  /**
    * Updates the Security Hub insight identified by the specified insight ARN.
    */
  def updateInsight(): Request[UpdateInsightResponse, AWSError] = js.native
  def updateInsight(callback: js.Function2[/* err */ AWSError, /* data */ UpdateInsightResponse, Unit]): Request[UpdateInsightResponse, AWSError] = js.native
  /**
    * Updates the Security Hub insight identified by the specified insight ARN.
    */
  def updateInsight(params: UpdateInsightRequest): Request[UpdateInsightResponse, AWSError] = js.native
  def updateInsight(
    params: UpdateInsightRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateInsightResponse, Unit]
  ): Request[UpdateInsightResponse, AWSError] = js.native
  /**
    * Updates configuration options for Security Hub.
    */
  def updateSecurityHubConfiguration(): Request[UpdateSecurityHubConfigurationResponse, AWSError] = js.native
  def updateSecurityHubConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSecurityHubConfigurationResponse, Unit]
  ): Request[UpdateSecurityHubConfigurationResponse, AWSError] = js.native
  /**
    * Updates configuration options for Security Hub.
    */
  def updateSecurityHubConfiguration(params: UpdateSecurityHubConfigurationRequest): Request[UpdateSecurityHubConfigurationResponse, AWSError] = js.native
  def updateSecurityHubConfiguration(
    params: UpdateSecurityHubConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSecurityHubConfigurationResponse, Unit]
  ): Request[UpdateSecurityHubConfigurationResponse, AWSError] = js.native
  /**
    * Used to control whether an individual security standard control is enabled or disabled.
    */
  def updateStandardsControl(): Request[UpdateStandardsControlResponse, AWSError] = js.native
  def updateStandardsControl(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStandardsControlResponse, Unit]): Request[UpdateStandardsControlResponse, AWSError] = js.native
  /**
    * Used to control whether an individual security standard control is enabled or disabled.
    */
  def updateStandardsControl(params: UpdateStandardsControlRequest): Request[UpdateStandardsControlResponse, AWSError] = js.native
  def updateStandardsControl(
    params: UpdateStandardsControlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStandardsControlResponse, Unit]
  ): Request[UpdateStandardsControlResponse, AWSError] = js.native
}


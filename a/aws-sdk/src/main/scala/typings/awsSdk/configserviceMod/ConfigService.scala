package typings.awsSdk.configserviceMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigService extends Service {
  
  /**
    * Returns the current configuration items for resources that are present in your Config aggregator. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceIdentifiers list.     The API does not return results for deleted resources.    The API does not return tags and relationships.   
    */
  def batchGetAggregateResourceConfig(): Request[BatchGetAggregateResourceConfigResponse, AWSError] = js.native
  def batchGetAggregateResourceConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetAggregateResourceConfigResponse, Unit]
  ): Request[BatchGetAggregateResourceConfigResponse, AWSError] = js.native
  /**
    * Returns the current configuration items for resources that are present in your Config aggregator. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceIdentifiers list.     The API does not return results for deleted resources.    The API does not return tags and relationships.   
    */
  def batchGetAggregateResourceConfig(params: BatchGetAggregateResourceConfigRequest): Request[BatchGetAggregateResourceConfigResponse, AWSError] = js.native
  def batchGetAggregateResourceConfig(
    params: BatchGetAggregateResourceConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetAggregateResourceConfigResponse, Unit]
  ): Request[BatchGetAggregateResourceConfigResponse, AWSError] = js.native
  
  /**
    * Returns the BaseConfigurationItem for one or more requested resources. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceKeys list.     The API does not return results for deleted resources.    The API does not return any tags for the requested resources. This information is filtered out of the supplementaryConfiguration section of the API response.   
    */
  def batchGetResourceConfig(): Request[BatchGetResourceConfigResponse, AWSError] = js.native
  def batchGetResourceConfig(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetResourceConfigResponse, Unit]): Request[BatchGetResourceConfigResponse, AWSError] = js.native
  /**
    * Returns the BaseConfigurationItem for one or more requested resources. The operation also returns a list of resources that are not processed in the current request. If there are no unprocessed resources, the operation returns an empty unprocessedResourceKeys list.     The API does not return results for deleted resources.    The API does not return any tags for the requested resources. This information is filtered out of the supplementaryConfiguration section of the API response.   
    */
  def batchGetResourceConfig(params: BatchGetResourceConfigRequest): Request[BatchGetResourceConfigResponse, AWSError] = js.native
  def batchGetResourceConfig(
    params: BatchGetResourceConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetResourceConfigResponse, Unit]
  ): Request[BatchGetResourceConfigResponse, AWSError] = js.native
  
  @JSName("config")
  var config_ConfigService: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Deletes the authorization granted to the specified configuration aggregator account in a specified region.
    */
  def deleteAggregationAuthorization(): Request[js.Object, AWSError] = js.native
  def deleteAggregationAuthorization(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the authorization granted to the specified configuration aggregator account in a specified region.
    */
  def deleteAggregationAuthorization(params: DeleteAggregationAuthorizationRequest): Request[js.Object, AWSError] = js.native
  def deleteAggregationAuthorization(
    params: DeleteAggregationAuthorizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified Config rule and all of its evaluation results. Config sets the state of a rule to DELETING until the deletion is complete. You cannot update a rule while it is in this state. If you make a PutConfigRule or DeleteConfigRule request for the rule, you will receive a ResourceInUseException. You can check the state of a rule by using the DescribeConfigRules request.
    */
  def deleteConfigRule(): Request[js.Object, AWSError] = js.native
  def deleteConfigRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Config rule and all of its evaluation results. Config sets the state of a rule to DELETING until the deletion is complete. You cannot update a rule while it is in this state. If you make a PutConfigRule or DeleteConfigRule request for the rule, you will receive a ResourceInUseException. You can check the state of a rule by using the DescribeConfigRules request.
    */
  def deleteConfigRule(params: DeleteConfigRuleRequest): Request[js.Object, AWSError] = js.native
  def deleteConfigRule(
    params: DeleteConfigRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.
    */
  def deleteConfigurationAggregator(): Request[js.Object, AWSError] = js.native
  def deleteConfigurationAggregator(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified configuration aggregator and the aggregated data associated with the aggregator.
    */
  def deleteConfigurationAggregator(params: DeleteConfigurationAggregatorRequest): Request[js.Object, AWSError] = js.native
  def deleteConfigurationAggregator(
    params: DeleteConfigurationAggregatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the configuration recorder. After the configuration recorder is deleted, Config will not record resource configuration changes until you create a new configuration recorder. This action does not delete the configuration information that was previously recorded. You will be able to access the previously recorded information by using the GetResourceConfigHistory action, but you will not be able to access this information in the Config console until you create a new configuration recorder.
    */
  def deleteConfigurationRecorder(): Request[js.Object, AWSError] = js.native
  def deleteConfigurationRecorder(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the configuration recorder. After the configuration recorder is deleted, Config will not record resource configuration changes until you create a new configuration recorder. This action does not delete the configuration information that was previously recorded. You will be able to access the previously recorded information by using the GetResourceConfigHistory action, but you will not be able to access this information in the Config console until you create a new configuration recorder.
    */
  def deleteConfigurationRecorder(params: DeleteConfigurationRecorderRequest): Request[js.Object, AWSError] = js.native
  def deleteConfigurationRecorder(
    params: DeleteConfigurationRecorderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified conformance pack and all the Config rules, remediation actions, and all evaluation results within that conformance pack. Config sets the conformance pack to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a conformance pack while it is in this state.
    */
  def deleteConformancePack(): Request[js.Object, AWSError] = js.native
  def deleteConformancePack(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified conformance pack and all the Config rules, remediation actions, and all evaluation results within that conformance pack. Config sets the conformance pack to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a conformance pack while it is in this state.
    */
  def deleteConformancePack(params: DeleteConformancePackRequest): Request[js.Object, AWSError] = js.native
  def deleteConformancePack(
    params: DeleteConformancePackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the delivery channel. Before you can delete the delivery channel, you must stop the configuration recorder by using the StopConfigurationRecorder action.
    */
  def deleteDeliveryChannel(): Request[js.Object, AWSError] = js.native
  def deleteDeliveryChannel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the delivery channel. Before you can delete the delivery channel, you must stop the configuration recorder by using the StopConfigurationRecorder action.
    */
  def deleteDeliveryChannel(params: DeleteDeliveryChannelRequest): Request[js.Object, AWSError] = js.native
  def deleteDeliveryChannel(
    params: DeleteDeliveryChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the evaluation results for the specified Config rule. You can specify one Config rule per request. After you delete the evaluation results, you can call the StartConfigRulesEvaluation API to start evaluating your Amazon Web Services resources against the rule.
    */
  def deleteEvaluationResults(): Request[DeleteEvaluationResultsResponse, AWSError] = js.native
  def deleteEvaluationResults(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEvaluationResultsResponse, Unit]): Request[DeleteEvaluationResultsResponse, AWSError] = js.native
  /**
    * Deletes the evaluation results for the specified Config rule. You can specify one Config rule per request. After you delete the evaluation results, you can call the StartConfigRulesEvaluation API to start evaluating your Amazon Web Services resources against the rule.
    */
  def deleteEvaluationResults(params: DeleteEvaluationResultsRequest): Request[DeleteEvaluationResultsResponse, AWSError] = js.native
  def deleteEvaluationResults(
    params: DeleteEvaluationResultsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEvaluationResultsResponse, Unit]
  ): Request[DeleteEvaluationResultsResponse, AWSError] = js.native
  
  /**
    * Deletes the specified organization Config rule and all of its evaluation results from all member accounts in that organization.  Only a master account and a delegated administrator account can delete an organization Config rule. When calling this API with a delegated administrator, you must ensure Organizations ListDelegatedAdministrator permissions are added. Config sets the state of a rule to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a rule while it is in this state.
    */
  def deleteOrganizationConfigRule(): Request[js.Object, AWSError] = js.native
  def deleteOrganizationConfigRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified organization Config rule and all of its evaluation results from all member accounts in that organization.  Only a master account and a delegated administrator account can delete an organization Config rule. When calling this API with a delegated administrator, you must ensure Organizations ListDelegatedAdministrator permissions are added. Config sets the state of a rule to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a rule while it is in this state.
    */
  def deleteOrganizationConfigRule(params: DeleteOrganizationConfigRuleRequest): Request[js.Object, AWSError] = js.native
  def deleteOrganizationConfigRule(
    params: DeleteOrganizationConfigRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified organization conformance pack and all of the Config rules and remediation actions from all member accounts in that organization.   Only a master account or a delegated administrator account can delete an organization conformance pack. When calling this API with a delegated administrator, you must ensure Organizations ListDelegatedAdministrator permissions are added. Config sets the state of a conformance pack to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a conformance pack while it is in this state. 
    */
  def deleteOrganizationConformancePack(): Request[js.Object, AWSError] = js.native
  def deleteOrganizationConformancePack(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified organization conformance pack and all of the Config rules and remediation actions from all member accounts in that organization.   Only a master account or a delegated administrator account can delete an organization conformance pack. When calling this API with a delegated administrator, you must ensure Organizations ListDelegatedAdministrator permissions are added. Config sets the state of a conformance pack to DELETE_IN_PROGRESS until the deletion is complete. You cannot update a conformance pack while it is in this state. 
    */
  def deleteOrganizationConformancePack(params: DeleteOrganizationConformancePackRequest): Request[js.Object, AWSError] = js.native
  def deleteOrganizationConformancePack(
    params: DeleteOrganizationConformancePackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes pending authorization requests for a specified aggregator account in a specified region.
    */
  def deletePendingAggregationRequest(): Request[js.Object, AWSError] = js.native
  def deletePendingAggregationRequest(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes pending authorization requests for a specified aggregator account in a specified region.
    */
  def deletePendingAggregationRequest(params: DeletePendingAggregationRequestRequest): Request[js.Object, AWSError] = js.native
  def deletePendingAggregationRequest(
    params: DeletePendingAggregationRequestRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the remediation configuration.
    */
  def deleteRemediationConfiguration(): Request[DeleteRemediationConfigurationResponse, AWSError] = js.native
  def deleteRemediationConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRemediationConfigurationResponse, Unit]
  ): Request[DeleteRemediationConfigurationResponse, AWSError] = js.native
  /**
    * Deletes the remediation configuration.
    */
  def deleteRemediationConfiguration(params: DeleteRemediationConfigurationRequest): Request[DeleteRemediationConfigurationResponse, AWSError] = js.native
  def deleteRemediationConfiguration(
    params: DeleteRemediationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRemediationConfigurationResponse, Unit]
  ): Request[DeleteRemediationConfigurationResponse, AWSError] = js.native
  
  /**
    * Deletes one or more remediation exceptions mentioned in the resource keys.  Config generates a remediation exception when a problem occurs executing a remediation action to a specific resource. Remediation exceptions blocks auto-remediation until the exception is cleared. 
    */
  def deleteRemediationExceptions(): Request[DeleteRemediationExceptionsResponse, AWSError] = js.native
  def deleteRemediationExceptions(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRemediationExceptionsResponse, Unit]): Request[DeleteRemediationExceptionsResponse, AWSError] = js.native
  /**
    * Deletes one or more remediation exceptions mentioned in the resource keys.  Config generates a remediation exception when a problem occurs executing a remediation action to a specific resource. Remediation exceptions blocks auto-remediation until the exception is cleared. 
    */
  def deleteRemediationExceptions(params: DeleteRemediationExceptionsRequest): Request[DeleteRemediationExceptionsResponse, AWSError] = js.native
  def deleteRemediationExceptions(
    params: DeleteRemediationExceptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRemediationExceptionsResponse, Unit]
  ): Request[DeleteRemediationExceptionsResponse, AWSError] = js.native
  
  /**
    * Records the configuration state for a custom resource that has been deleted. This API records a new ConfigurationItem with a ResourceDeleted status. You can retrieve the ConfigurationItems recorded for this resource in your Config History. 
    */
  def deleteResourceConfig(): Request[js.Object, AWSError] = js.native
  def deleteResourceConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Records the configuration state for a custom resource that has been deleted. This API records a new ConfigurationItem with a ResourceDeleted status. You can retrieve the ConfigurationItems recorded for this resource in your Config History. 
    */
  def deleteResourceConfig(params: DeleteResourceConfigRequest): Request[js.Object, AWSError] = js.native
  def deleteResourceConfig(
    params: DeleteResourceConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the retention configuration.
    */
  def deleteRetentionConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteRetentionConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the retention configuration.
    */
  def deleteRetentionConfiguration(params: DeleteRetentionConfigurationRequest): Request[js.Object, AWSError] = js.native
  def deleteRetentionConfiguration(
    params: DeleteRetentionConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the stored query for a single Amazon Web Services account and a single Amazon Web Services Region.
    */
  def deleteStoredQuery(): Request[DeleteStoredQueryResponse, AWSError] = js.native
  def deleteStoredQuery(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStoredQueryResponse, Unit]): Request[DeleteStoredQueryResponse, AWSError] = js.native
  /**
    * Deletes the stored query for a single Amazon Web Services account and a single Amazon Web Services Region.
    */
  def deleteStoredQuery(params: DeleteStoredQueryRequest): Request[DeleteStoredQueryResponse, AWSError] = js.native
  def deleteStoredQuery(
    params: DeleteStoredQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStoredQueryResponse, Unit]
  ): Request[DeleteStoredQueryResponse, AWSError] = js.native
  
  /**
    * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After the delivery has started, Config sends the following notifications using an Amazon SNS topic that you have specified.   Notification of the start of the delivery.   Notification of the completion of the delivery, if the delivery was successfully completed.   Notification of delivery failure, if the delivery failed.  
    */
  def deliverConfigSnapshot(): Request[DeliverConfigSnapshotResponse, AWSError] = js.native
  def deliverConfigSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ DeliverConfigSnapshotResponse, Unit]): Request[DeliverConfigSnapshotResponse, AWSError] = js.native
  /**
    * Schedules delivery of a configuration snapshot to the Amazon S3 bucket in the specified delivery channel. After the delivery has started, Config sends the following notifications using an Amazon SNS topic that you have specified.   Notification of the start of the delivery.   Notification of the completion of the delivery, if the delivery was successfully completed.   Notification of delivery failure, if the delivery failed.  
    */
  def deliverConfigSnapshot(params: DeliverConfigSnapshotRequest): Request[DeliverConfigSnapshotResponse, AWSError] = js.native
  def deliverConfigSnapshot(
    params: DeliverConfigSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeliverConfigSnapshotResponse, Unit]
  ): Request[DeliverConfigSnapshotResponse, AWSError] = js.native
  
  /**
    * Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant rules. Does not display rules that do not have compliance results.   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def describeAggregateComplianceByConfigRules(): Request[DescribeAggregateComplianceByConfigRulesResponse, AWSError] = js.native
  def describeAggregateComplianceByConfigRules(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeAggregateComplianceByConfigRulesResponse, 
      Unit
    ]
  ): Request[DescribeAggregateComplianceByConfigRulesResponse, AWSError] = js.native
  /**
    * Returns a list of compliant and noncompliant rules with the number of resources for compliant and noncompliant rules. Does not display rules that do not have compliance results.   The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def describeAggregateComplianceByConfigRules(params: DescribeAggregateComplianceByConfigRulesRequest): Request[DescribeAggregateComplianceByConfigRulesResponse, AWSError] = js.native
  def describeAggregateComplianceByConfigRules(
    params: DescribeAggregateComplianceByConfigRulesRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeAggregateComplianceByConfigRulesResponse, 
      Unit
    ]
  ): Request[DescribeAggregateComplianceByConfigRulesResponse, AWSError] = js.native
  
  /**
    * Returns a list of the conformance packs and their associated compliance status with the count of compliant and noncompliant Config rules within each conformance pack. Also returns the total rule count which includes compliant rules, noncompliant rules, and rules that cannot be evaluated due to insufficient data.  The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def describeAggregateComplianceByConformancePacks(): Request[DescribeAggregateComplianceByConformancePacksResponse, AWSError] = js.native
  def describeAggregateComplianceByConformancePacks(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeAggregateComplianceByConformancePacksResponse, 
      Unit
    ]
  ): Request[DescribeAggregateComplianceByConformancePacksResponse, AWSError] = js.native
  /**
    * Returns a list of the conformance packs and their associated compliance status with the count of compliant and noncompliant Config rules within each conformance pack. Also returns the total rule count which includes compliant rules, noncompliant rules, and rules that cannot be evaluated due to insufficient data.  The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def describeAggregateComplianceByConformancePacks(params: DescribeAggregateComplianceByConformancePacksRequest): Request[DescribeAggregateComplianceByConformancePacksResponse, AWSError] = js.native
  def describeAggregateComplianceByConformancePacks(
    params: DescribeAggregateComplianceByConformancePacksRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeAggregateComplianceByConformancePacksResponse, 
      Unit
    ]
  ): Request[DescribeAggregateComplianceByConformancePacksResponse, AWSError] = js.native
  
  /**
    * Returns a list of authorizations granted to various aggregator accounts and regions.
    */
  def describeAggregationAuthorizations(): Request[DescribeAggregationAuthorizationsResponse, AWSError] = js.native
  def describeAggregationAuthorizations(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAggregationAuthorizationsResponse, Unit]
  ): Request[DescribeAggregationAuthorizationsResponse, AWSError] = js.native
  /**
    * Returns a list of authorizations granted to various aggregator accounts and regions.
    */
  def describeAggregationAuthorizations(params: DescribeAggregationAuthorizationsRequest): Request[DescribeAggregationAuthorizationsResponse, AWSError] = js.native
  def describeAggregationAuthorizations(
    params: DescribeAggregationAuthorizationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAggregationAuthorizationsResponse, Unit]
  ): Request[DescribeAggregationAuthorizationsResponse, AWSError] = js.native
  
  /**
    * Indicates whether the specified Config rules are compliant. If a rule is noncompliant, this action returns the number of Amazon Web Services resources that do not comply with the rule. A rule is compliant if all of the evaluated resources comply with it. It is noncompliant if any of these resources do not comply. If Config has no current evaluation results for the rule, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions:   Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's Lambda function is failing to send evaluation results to Config. Verify that the role you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the Lambda execution role includes the config:PutEvaluations permission.   The rule's Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
    */
  def describeComplianceByConfigRule(): Request[DescribeComplianceByConfigRuleResponse, AWSError] = js.native
  def describeComplianceByConfigRule(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeComplianceByConfigRuleResponse, Unit]
  ): Request[DescribeComplianceByConfigRuleResponse, AWSError] = js.native
  /**
    * Indicates whether the specified Config rules are compliant. If a rule is noncompliant, this action returns the number of Amazon Web Services resources that do not comply with the rule. A rule is compliant if all of the evaluated resources comply with it. It is noncompliant if any of these resources do not comply. If Config has no current evaluation results for the rule, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions:   Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's Lambda function is failing to send evaluation results to Config. Verify that the role you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the Lambda execution role includes the config:PutEvaluations permission.   The rule's Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
    */
  def describeComplianceByConfigRule(params: DescribeComplianceByConfigRuleRequest): Request[DescribeComplianceByConfigRuleResponse, AWSError] = js.native
  def describeComplianceByConfigRule(
    params: DescribeComplianceByConfigRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeComplianceByConfigRuleResponse, Unit]
  ): Request[DescribeComplianceByConfigRuleResponse, AWSError] = js.native
  
  /**
    * Indicates whether the specified Amazon Web Services resources are compliant. If a resource is noncompliant, this action returns the number of Config rules that the resource does not comply with. A resource is compliant if it complies with all the Config rules that evaluate it. It is noncompliant if it does not comply with one or more of these rules. If Config has no current evaluation results for the resource, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions about the rules that evaluate the resource:   Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's Lambda function is failing to send evaluation results to Config. Verify that the role that you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the Lambda execution role includes the config:PutEvaluations permission.   The rule's Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
    */
  def describeComplianceByResource(): Request[DescribeComplianceByResourceResponse, AWSError] = js.native
  def describeComplianceByResource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeComplianceByResourceResponse, Unit]): Request[DescribeComplianceByResourceResponse, AWSError] = js.native
  /**
    * Indicates whether the specified Amazon Web Services resources are compliant. If a resource is noncompliant, this action returns the number of Config rules that the resource does not comply with. A resource is compliant if it complies with all the Config rules that evaluate it. It is noncompliant if it does not comply with one or more of these rules. If Config has no current evaluation results for the resource, it returns INSUFFICIENT_DATA. This result might indicate one of the following conditions about the rules that evaluate the resource:   Config has never invoked an evaluation for the rule. To check whether it has, use the DescribeConfigRuleEvaluationStatus action to get the LastSuccessfulInvocationTime and LastFailedInvocationTime.   The rule's Lambda function is failing to send evaluation results to Config. Verify that the role that you assigned to your configuration recorder includes the config:PutEvaluations permission. If the rule is a custom rule, verify that the Lambda execution role includes the config:PutEvaluations permission.   The rule's Lambda function has returned NOT_APPLICABLE for all evaluation results. This can occur if the resources were deleted or removed from the rule's scope.  
    */
  def describeComplianceByResource(params: DescribeComplianceByResourceRequest): Request[DescribeComplianceByResourceResponse, AWSError] = js.native
  def describeComplianceByResource(
    params: DescribeComplianceByResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeComplianceByResourceResponse, Unit]
  ): Request[DescribeComplianceByResourceResponse, AWSError] = js.native
  
  /**
    * Returns status information for each of your Config managed rules. The status includes information such as the last time Config invoked the rule, the last time Config failed to invoke the rule, and the related error for the last failure.
    */
  def describeConfigRuleEvaluationStatus(): Request[DescribeConfigRuleEvaluationStatusResponse, AWSError] = js.native
  def describeConfigRuleEvaluationStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigRuleEvaluationStatusResponse, Unit]
  ): Request[DescribeConfigRuleEvaluationStatusResponse, AWSError] = js.native
  /**
    * Returns status information for each of your Config managed rules. The status includes information such as the last time Config invoked the rule, the last time Config failed to invoke the rule, and the related error for the last failure.
    */
  def describeConfigRuleEvaluationStatus(params: DescribeConfigRuleEvaluationStatusRequest): Request[DescribeConfigRuleEvaluationStatusResponse, AWSError] = js.native
  def describeConfigRuleEvaluationStatus(
    params: DescribeConfigRuleEvaluationStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigRuleEvaluationStatusResponse, Unit]
  ): Request[DescribeConfigRuleEvaluationStatusResponse, AWSError] = js.native
  
  /**
    * Returns details about your Config rules.
    */
  def describeConfigRules(): Request[DescribeConfigRulesResponse, AWSError] = js.native
  def describeConfigRules(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigRulesResponse, Unit]): Request[DescribeConfigRulesResponse, AWSError] = js.native
  /**
    * Returns details about your Config rules.
    */
  def describeConfigRules(params: DescribeConfigRulesRequest): Request[DescribeConfigRulesResponse, AWSError] = js.native
  def describeConfigRules(
    params: DescribeConfigRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigRulesResponse, Unit]
  ): Request[DescribeConfigRulesResponse, AWSError] = js.native
  
  /**
    * Returns status information for sources within an aggregator. The status includes information about the last time Config verified authorization between the source account and an aggregator account. In case of a failure, the status contains the related error code or message. 
    */
  def describeConfigurationAggregatorSourcesStatus(): Request[DescribeConfigurationAggregatorSourcesStatusResponse, AWSError] = js.native
  def describeConfigurationAggregatorSourcesStatus(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeConfigurationAggregatorSourcesStatusResponse, 
      Unit
    ]
  ): Request[DescribeConfigurationAggregatorSourcesStatusResponse, AWSError] = js.native
  /**
    * Returns status information for sources within an aggregator. The status includes information about the last time Config verified authorization between the source account and an aggregator account. In case of a failure, the status contains the related error code or message. 
    */
  def describeConfigurationAggregatorSourcesStatus(params: DescribeConfigurationAggregatorSourcesStatusRequest): Request[DescribeConfigurationAggregatorSourcesStatusResponse, AWSError] = js.native
  def describeConfigurationAggregatorSourcesStatus(
    params: DescribeConfigurationAggregatorSourcesStatusRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeConfigurationAggregatorSourcesStatusResponse, 
      Unit
    ]
  ): Request[DescribeConfigurationAggregatorSourcesStatusResponse, AWSError] = js.native
  
  /**
    * Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified, this action returns the details for all the configuration aggregators associated with the account. 
    */
  def describeConfigurationAggregators(): Request[DescribeConfigurationAggregatorsResponse, AWSError] = js.native
  def describeConfigurationAggregators(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationAggregatorsResponse, Unit]
  ): Request[DescribeConfigurationAggregatorsResponse, AWSError] = js.native
  /**
    * Returns the details of one or more configuration aggregators. If the configuration aggregator is not specified, this action returns the details for all the configuration aggregators associated with the account. 
    */
  def describeConfigurationAggregators(params: DescribeConfigurationAggregatorsRequest): Request[DescribeConfigurationAggregatorsResponse, AWSError] = js.native
  def describeConfigurationAggregators(
    params: DescribeConfigurationAggregatorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationAggregatorsResponse, Unit]
  ): Request[DescribeConfigurationAggregatorsResponse, AWSError] = js.native
  
  /**
    * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified, this action returns the status of all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
    */
  def describeConfigurationRecorderStatus(): Request[DescribeConfigurationRecorderStatusResponse, AWSError] = js.native
  def describeConfigurationRecorderStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationRecorderStatusResponse, Unit]
  ): Request[DescribeConfigurationRecorderStatusResponse, AWSError] = js.native
  /**
    * Returns the current status of the specified configuration recorder. If a configuration recorder is not specified, this action returns the status of all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
    */
  def describeConfigurationRecorderStatus(params: DescribeConfigurationRecorderStatusRequest): Request[DescribeConfigurationRecorderStatusResponse, AWSError] = js.native
  def describeConfigurationRecorderStatus(
    params: DescribeConfigurationRecorderStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationRecorderStatusResponse, Unit]
  ): Request[DescribeConfigurationRecorderStatusResponse, AWSError] = js.native
  
  /**
    * Returns the details for the specified configuration recorders. If the configuration recorder is not specified, this action returns the details for all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
    */
  def describeConfigurationRecorders(): Request[DescribeConfigurationRecordersResponse, AWSError] = js.native
  def describeConfigurationRecorders(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationRecordersResponse, Unit]
  ): Request[DescribeConfigurationRecordersResponse, AWSError] = js.native
  /**
    * Returns the details for the specified configuration recorders. If the configuration recorder is not specified, this action returns the details for all configuration recorders associated with the account.  Currently, you can specify only one configuration recorder per region in your account. 
    */
  def describeConfigurationRecorders(params: DescribeConfigurationRecordersRequest): Request[DescribeConfigurationRecordersResponse, AWSError] = js.native
  def describeConfigurationRecorders(
    params: DescribeConfigurationRecordersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationRecordersResponse, Unit]
  ): Request[DescribeConfigurationRecordersResponse, AWSError] = js.native
  
  /**
    * Returns compliance details for each rule in that conformance pack.  You must provide exact rule names. 
    */
  def describeConformancePackCompliance(): Request[DescribeConformancePackComplianceResponse, AWSError] = js.native
  def describeConformancePackCompliance(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConformancePackComplianceResponse, Unit]
  ): Request[DescribeConformancePackComplianceResponse, AWSError] = js.native
  /**
    * Returns compliance details for each rule in that conformance pack.  You must provide exact rule names. 
    */
  def describeConformancePackCompliance(params: DescribeConformancePackComplianceRequest): Request[DescribeConformancePackComplianceResponse, AWSError] = js.native
  def describeConformancePackCompliance(
    params: DescribeConformancePackComplianceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConformancePackComplianceResponse, Unit]
  ): Request[DescribeConformancePackComplianceResponse, AWSError] = js.native
  
  /**
    * Provides one or more conformance packs deployment status.  If there are no conformance packs then you will see an empty result. 
    */
  def describeConformancePackStatus(): Request[DescribeConformancePackStatusResponse, AWSError] = js.native
  def describeConformancePackStatus(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConformancePackStatusResponse, Unit]): Request[DescribeConformancePackStatusResponse, AWSError] = js.native
  /**
    * Provides one or more conformance packs deployment status.  If there are no conformance packs then you will see an empty result. 
    */
  def describeConformancePackStatus(params: DescribeConformancePackStatusRequest): Request[DescribeConformancePackStatusResponse, AWSError] = js.native
  def describeConformancePackStatus(
    params: DescribeConformancePackStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConformancePackStatusResponse, Unit]
  ): Request[DescribeConformancePackStatusResponse, AWSError] = js.native
  
  /**
    * Returns a list of one or more conformance packs.
    */
  def describeConformancePacks(): Request[DescribeConformancePacksResponse, AWSError] = js.native
  def describeConformancePacks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConformancePacksResponse, Unit]): Request[DescribeConformancePacksResponse, AWSError] = js.native
  /**
    * Returns a list of one or more conformance packs.
    */
  def describeConformancePacks(params: DescribeConformancePacksRequest): Request[DescribeConformancePacksResponse, AWSError] = js.native
  def describeConformancePacks(
    params: DescribeConformancePacksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConformancePacksResponse, Unit]
  ): Request[DescribeConformancePacksResponse, AWSError] = js.native
  
  /**
    * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action returns the current status of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
    */
  def describeDeliveryChannelStatus(): Request[DescribeDeliveryChannelStatusResponse, AWSError] = js.native
  def describeDeliveryChannelStatus(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeliveryChannelStatusResponse, Unit]): Request[DescribeDeliveryChannelStatusResponse, AWSError] = js.native
  /**
    * Returns the current status of the specified delivery channel. If a delivery channel is not specified, this action returns the current status of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
    */
  def describeDeliveryChannelStatus(params: DescribeDeliveryChannelStatusRequest): Request[DescribeDeliveryChannelStatusResponse, AWSError] = js.native
  def describeDeliveryChannelStatus(
    params: DescribeDeliveryChannelStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeliveryChannelStatusResponse, Unit]
  ): Request[DescribeDeliveryChannelStatusResponse, AWSError] = js.native
  
  /**
    * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns the details of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
    */
  def describeDeliveryChannels(): Request[DescribeDeliveryChannelsResponse, AWSError] = js.native
  def describeDeliveryChannels(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeliveryChannelsResponse, Unit]): Request[DescribeDeliveryChannelsResponse, AWSError] = js.native
  /**
    * Returns details about the specified delivery channel. If a delivery channel is not specified, this action returns the details of all delivery channels associated with the account.  Currently, you can specify only one delivery channel per region in your account. 
    */
  def describeDeliveryChannels(params: DescribeDeliveryChannelsRequest): Request[DescribeDeliveryChannelsResponse, AWSError] = js.native
  def describeDeliveryChannels(
    params: DescribeDeliveryChannelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeliveryChannelsResponse, Unit]
  ): Request[DescribeDeliveryChannelsResponse, AWSError] = js.native
  
  /**
    * Provides organization Config rule deployment status for an organization.  The status is not considered successful until organization Config rule is successfully deployed in all the member accounts with an exception of excluded accounts. When you specify the limit and the next token, you receive a paginated response. Limit and next token are not applicable if you specify organization Config rule names. It is only applicable, when you request all the organization Config rules. 
    */
  def describeOrganizationConfigRuleStatuses(): Request[DescribeOrganizationConfigRuleStatusesResponse, AWSError] = js.native
  def describeOrganizationConfigRuleStatuses(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigRuleStatusesResponse, Unit]
  ): Request[DescribeOrganizationConfigRuleStatusesResponse, AWSError] = js.native
  /**
    * Provides organization Config rule deployment status for an organization.  The status is not considered successful until organization Config rule is successfully deployed in all the member accounts with an exception of excluded accounts. When you specify the limit and the next token, you receive a paginated response. Limit and next token are not applicable if you specify organization Config rule names. It is only applicable, when you request all the organization Config rules. 
    */
  def describeOrganizationConfigRuleStatuses(params: DescribeOrganizationConfigRuleStatusesRequest): Request[DescribeOrganizationConfigRuleStatusesResponse, AWSError] = js.native
  def describeOrganizationConfigRuleStatuses(
    params: DescribeOrganizationConfigRuleStatusesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigRuleStatusesResponse, Unit]
  ): Request[DescribeOrganizationConfigRuleStatusesResponse, AWSError] = js.native
  
  /**
    * Returns a list of organization Config rules.   When you specify the limit and the next token, you receive a paginated response. Limit and next token are not applicable if you specify organization Config rule names. It is only applicable, when you request all the organization Config rules.  For accounts within an organzation  If you deploy an organizational rule or conformance pack in an organization administrator account, and then establish a delegated administrator and deploy an organizational rule or conformance pack in the delegated administrator account, you won't be able to see the organizational rule or conformance pack in the organization administrator account from the delegated administrator account or see the organizational rule or conformance pack in the delegated administrator account from organization administrator account. The DescribeOrganizationConfigRules and DescribeOrganizationConformancePacks APIs can only see and interact with the organization-related resource that were deployed from within the account calling those APIs. 
    */
  def describeOrganizationConfigRules(): Request[DescribeOrganizationConfigRulesResponse, AWSError] = js.native
  def describeOrganizationConfigRules(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigRulesResponse, Unit]
  ): Request[DescribeOrganizationConfigRulesResponse, AWSError] = js.native
  /**
    * Returns a list of organization Config rules.   When you specify the limit and the next token, you receive a paginated response. Limit and next token are not applicable if you specify organization Config rule names. It is only applicable, when you request all the organization Config rules.  For accounts within an organzation  If you deploy an organizational rule or conformance pack in an organization administrator account, and then establish a delegated administrator and deploy an organizational rule or conformance pack in the delegated administrator account, you won't be able to see the organizational rule or conformance pack in the organization administrator account from the delegated administrator account or see the organizational rule or conformance pack in the delegated administrator account from organization administrator account. The DescribeOrganizationConfigRules and DescribeOrganizationConformancePacks APIs can only see and interact with the organization-related resource that were deployed from within the account calling those APIs. 
    */
  def describeOrganizationConfigRules(params: DescribeOrganizationConfigRulesRequest): Request[DescribeOrganizationConfigRulesResponse, AWSError] = js.native
  def describeOrganizationConfigRules(
    params: DescribeOrganizationConfigRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConfigRulesResponse, Unit]
  ): Request[DescribeOrganizationConfigRulesResponse, AWSError] = js.native
  
  /**
    * Provides organization conformance pack deployment status for an organization.   The status is not considered successful until organization conformance pack is successfully deployed in all the member accounts with an exception of excluded accounts. When you specify the limit and the next token, you receive a paginated response. Limit and next token are not applicable if you specify organization conformance pack names. They are only applicable, when you request all the organization conformance packs. 
    */
  def describeOrganizationConformancePackStatuses(): Request[DescribeOrganizationConformancePackStatusesResponse, AWSError] = js.native
  def describeOrganizationConformancePackStatuses(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeOrganizationConformancePackStatusesResponse, 
      Unit
    ]
  ): Request[DescribeOrganizationConformancePackStatusesResponse, AWSError] = js.native
  /**
    * Provides organization conformance pack deployment status for an organization.   The status is not considered successful until organization conformance pack is successfully deployed in all the member accounts with an exception of excluded accounts. When you specify the limit and the next token, you receive a paginated response. Limit and next token are not applicable if you specify organization conformance pack names. They are only applicable, when you request all the organization conformance packs. 
    */
  def describeOrganizationConformancePackStatuses(params: DescribeOrganizationConformancePackStatusesRequest): Request[DescribeOrganizationConformancePackStatusesResponse, AWSError] = js.native
  def describeOrganizationConformancePackStatuses(
    params: DescribeOrganizationConformancePackStatusesRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DescribeOrganizationConformancePackStatusesResponse, 
      Unit
    ]
  ): Request[DescribeOrganizationConformancePackStatusesResponse, AWSError] = js.native
  
  /**
    * Returns a list of organization conformance packs.   When you specify the limit and the next token, you receive a paginated response.  Limit and next token are not applicable if you specify organization conformance packs names. They are only applicable, when you request all the organization conformance packs.   For accounts within an organzation  If you deploy an organizational rule or conformance pack in an organization administrator account, and then establish a delegated administrator and deploy an organizational rule or conformance pack in the delegated administrator account, you won't be able to see the organizational rule or conformance pack in the organization administrator account from the delegated administrator account or see the organizational rule or conformance pack in the delegated administrator account from organization administrator account. The DescribeOrganizationConfigRules and DescribeOrganizationConformancePacks APIs can only see and interact with the organization-related resource that were deployed from within the account calling those APIs. 
    */
  def describeOrganizationConformancePacks(): Request[DescribeOrganizationConformancePacksResponse, AWSError] = js.native
  def describeOrganizationConformancePacks(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConformancePacksResponse, Unit]
  ): Request[DescribeOrganizationConformancePacksResponse, AWSError] = js.native
  /**
    * Returns a list of organization conformance packs.   When you specify the limit and the next token, you receive a paginated response.  Limit and next token are not applicable if you specify organization conformance packs names. They are only applicable, when you request all the organization conformance packs.   For accounts within an organzation  If you deploy an organizational rule or conformance pack in an organization administrator account, and then establish a delegated administrator and deploy an organizational rule or conformance pack in the delegated administrator account, you won't be able to see the organizational rule or conformance pack in the organization administrator account from the delegated administrator account or see the organizational rule or conformance pack in the delegated administrator account from organization administrator account. The DescribeOrganizationConfigRules and DescribeOrganizationConformancePacks APIs can only see and interact with the organization-related resource that were deployed from within the account calling those APIs. 
    */
  def describeOrganizationConformancePacks(params: DescribeOrganizationConformancePacksRequest): Request[DescribeOrganizationConformancePacksResponse, AWSError] = js.native
  def describeOrganizationConformancePacks(
    params: DescribeOrganizationConformancePacksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeOrganizationConformancePacksResponse, Unit]
  ): Request[DescribeOrganizationConformancePacksResponse, AWSError] = js.native
  
  /**
    * Returns a list of all pending aggregation requests.
    */
  def describePendingAggregationRequests(): Request[DescribePendingAggregationRequestsResponse, AWSError] = js.native
  def describePendingAggregationRequests(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePendingAggregationRequestsResponse, Unit]
  ): Request[DescribePendingAggregationRequestsResponse, AWSError] = js.native
  /**
    * Returns a list of all pending aggregation requests.
    */
  def describePendingAggregationRequests(params: DescribePendingAggregationRequestsRequest): Request[DescribePendingAggregationRequestsResponse, AWSError] = js.native
  def describePendingAggregationRequests(
    params: DescribePendingAggregationRequestsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePendingAggregationRequestsResponse, Unit]
  ): Request[DescribePendingAggregationRequestsResponse, AWSError] = js.native
  
  /**
    * Returns the details of one or more remediation configurations.
    */
  def describeRemediationConfigurations(): Request[DescribeRemediationConfigurationsResponse, AWSError] = js.native
  def describeRemediationConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRemediationConfigurationsResponse, Unit]
  ): Request[DescribeRemediationConfigurationsResponse, AWSError] = js.native
  /**
    * Returns the details of one or more remediation configurations.
    */
  def describeRemediationConfigurations(params: DescribeRemediationConfigurationsRequest): Request[DescribeRemediationConfigurationsResponse, AWSError] = js.native
  def describeRemediationConfigurations(
    params: DescribeRemediationConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRemediationConfigurationsResponse, Unit]
  ): Request[DescribeRemediationConfigurationsResponse, AWSError] = js.native
  
  /**
    * Returns the details of one or more remediation exceptions. A detailed view of a remediation exception for a set of resources that includes an explanation of an exception and the time when the exception will be deleted. When you specify the limit and the next token, you receive a paginated response.   Config generates a remediation exception when a problem occurs executing a remediation action to a specific resource. Remediation exceptions blocks auto-remediation until the exception is cleared. When you specify the limit and the next token, you receive a paginated response.  Limit and next token are not applicable if you request resources in batch. It is only applicable, when you request all resources. 
    */
  def describeRemediationExceptions(): Request[DescribeRemediationExceptionsResponse, AWSError] = js.native
  def describeRemediationExceptions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRemediationExceptionsResponse, Unit]): Request[DescribeRemediationExceptionsResponse, AWSError] = js.native
  /**
    * Returns the details of one or more remediation exceptions. A detailed view of a remediation exception for a set of resources that includes an explanation of an exception and the time when the exception will be deleted. When you specify the limit and the next token, you receive a paginated response.   Config generates a remediation exception when a problem occurs executing a remediation action to a specific resource. Remediation exceptions blocks auto-remediation until the exception is cleared. When you specify the limit and the next token, you receive a paginated response.  Limit and next token are not applicable if you request resources in batch. It is only applicable, when you request all resources. 
    */
  def describeRemediationExceptions(params: DescribeRemediationExceptionsRequest): Request[DescribeRemediationExceptionsResponse, AWSError] = js.native
  def describeRemediationExceptions(
    params: DescribeRemediationExceptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRemediationExceptionsResponse, Unit]
  ): Request[DescribeRemediationExceptionsResponse, AWSError] = js.native
  
  /**
    * Provides a detailed view of a Remediation Execution for a set of resources including state, timestamps for when steps for the remediation execution occur, and any error messages for steps that have failed. When you specify the limit and the next token, you receive a paginated response.
    */
  def describeRemediationExecutionStatus(): Request[DescribeRemediationExecutionStatusResponse, AWSError] = js.native
  def describeRemediationExecutionStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRemediationExecutionStatusResponse, Unit]
  ): Request[DescribeRemediationExecutionStatusResponse, AWSError] = js.native
  /**
    * Provides a detailed view of a Remediation Execution for a set of resources including state, timestamps for when steps for the remediation execution occur, and any error messages for steps that have failed. When you specify the limit and the next token, you receive a paginated response.
    */
  def describeRemediationExecutionStatus(params: DescribeRemediationExecutionStatusRequest): Request[DescribeRemediationExecutionStatusResponse, AWSError] = js.native
  def describeRemediationExecutionStatus(
    params: DescribeRemediationExecutionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRemediationExecutionStatusResponse, Unit]
  ): Request[DescribeRemediationExecutionStatusResponse, AWSError] = js.native
  
  /**
    * Returns the details of one or more retention configurations. If the retention configuration name is not specified, this action returns the details for all the retention configurations for that account.  Currently, Config supports only one retention configuration per region in your account. 
    */
  def describeRetentionConfigurations(): Request[DescribeRetentionConfigurationsResponse, AWSError] = js.native
  def describeRetentionConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRetentionConfigurationsResponse, Unit]
  ): Request[DescribeRetentionConfigurationsResponse, AWSError] = js.native
  /**
    * Returns the details of one or more retention configurations. If the retention configuration name is not specified, this action returns the details for all the retention configurations for that account.  Currently, Config supports only one retention configuration per region in your account. 
    */
  def describeRetentionConfigurations(params: DescribeRetentionConfigurationsRequest): Request[DescribeRetentionConfigurationsResponse, AWSError] = js.native
  def describeRetentionConfigurations(
    params: DescribeRetentionConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRetentionConfigurationsResponse, Unit]
  ): Request[DescribeRetentionConfigurationsResponse, AWSError] = js.native
  
  /**
    * Returns the evaluation results for the specified Config rule for a specific resource in a rule. The results indicate which Amazon Web Services resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.   The results can return an empty result page. But if you have a nextToken, the results are displayed on the next page. 
    */
  def getAggregateComplianceDetailsByConfigRule(): Request[GetAggregateComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  def getAggregateComplianceDetailsByConfigRule(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetAggregateComplianceDetailsByConfigRuleResponse, 
      Unit
    ]
  ): Request[GetAggregateComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  /**
    * Returns the evaluation results for the specified Config rule for a specific resource in a rule. The results indicate which Amazon Web Services resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.   The results can return an empty result page. But if you have a nextToken, the results are displayed on the next page. 
    */
  def getAggregateComplianceDetailsByConfigRule(params: GetAggregateComplianceDetailsByConfigRuleRequest): Request[GetAggregateComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  def getAggregateComplianceDetailsByConfigRule(
    params: GetAggregateComplianceDetailsByConfigRuleRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetAggregateComplianceDetailsByConfigRuleResponse, 
      Unit
    ]
  ): Request[GetAggregateComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  
  /**
    * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.  The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def getAggregateConfigRuleComplianceSummary(): Request[GetAggregateConfigRuleComplianceSummaryResponse, AWSError] = js.native
  def getAggregateConfigRuleComplianceSummary(
    callback: js.Function2[/* err */ AWSError, /* data */ GetAggregateConfigRuleComplianceSummaryResponse, Unit]
  ): Request[GetAggregateConfigRuleComplianceSummaryResponse, AWSError] = js.native
  /**
    * Returns the number of compliant and noncompliant rules for one or more accounts and regions in an aggregator.  The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def getAggregateConfigRuleComplianceSummary(params: GetAggregateConfigRuleComplianceSummaryRequest): Request[GetAggregateConfigRuleComplianceSummaryResponse, AWSError] = js.native
  def getAggregateConfigRuleComplianceSummary(
    params: GetAggregateConfigRuleComplianceSummaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAggregateConfigRuleComplianceSummaryResponse, Unit]
  ): Request[GetAggregateConfigRuleComplianceSummaryResponse, AWSError] = js.native
  
  /**
    * Returns the count of compliant and noncompliant conformance packs across all Amazon Web Services accounts and Amazon Web Services Regions in an aggregator. You can filter based on Amazon Web Services account ID or Amazon Web Services Region.  The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def getAggregateConformancePackComplianceSummary(): Request[GetAggregateConformancePackComplianceSummaryResponse, AWSError] = js.native
  def getAggregateConformancePackComplianceSummary(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetAggregateConformancePackComplianceSummaryResponse, 
      Unit
    ]
  ): Request[GetAggregateConformancePackComplianceSummaryResponse, AWSError] = js.native
  /**
    * Returns the count of compliant and noncompliant conformance packs across all Amazon Web Services accounts and Amazon Web Services Regions in an aggregator. You can filter based on Amazon Web Services account ID or Amazon Web Services Region.  The results can return an empty result page, but if you have a nextToken, the results are displayed on the next page. 
    */
  def getAggregateConformancePackComplianceSummary(params: GetAggregateConformancePackComplianceSummaryRequest): Request[GetAggregateConformancePackComplianceSummaryResponse, AWSError] = js.native
  def getAggregateConformancePackComplianceSummary(
    params: GetAggregateConformancePackComplianceSummaryRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetAggregateConformancePackComplianceSummaryResponse, 
      Unit
    ]
  ): Request[GetAggregateConformancePackComplianceSummaryResponse, AWSError] = js.native
  
  /**
    * Returns the resource counts across accounts and regions that are present in your Config aggregator. You can request the resource counts by providing filters and GroupByKey. For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.
    */
  def getAggregateDiscoveredResourceCounts(): Request[GetAggregateDiscoveredResourceCountsResponse, AWSError] = js.native
  def getAggregateDiscoveredResourceCounts(
    callback: js.Function2[/* err */ AWSError, /* data */ GetAggregateDiscoveredResourceCountsResponse, Unit]
  ): Request[GetAggregateDiscoveredResourceCountsResponse, AWSError] = js.native
  /**
    * Returns the resource counts across accounts and regions that are present in your Config aggregator. You can request the resource counts by providing filters and GroupByKey. For example, if the input contains accountID 12345678910 and region us-east-1 in filters, the API returns the count of resources in account ID 12345678910 and region us-east-1. If the input contains ACCOUNT_ID as a GroupByKey, the API returns resource counts for all source accounts that are present in your aggregator.
    */
  def getAggregateDiscoveredResourceCounts(params: GetAggregateDiscoveredResourceCountsRequest): Request[GetAggregateDiscoveredResourceCountsResponse, AWSError] = js.native
  def getAggregateDiscoveredResourceCounts(
    params: GetAggregateDiscoveredResourceCountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAggregateDiscoveredResourceCountsResponse, Unit]
  ): Request[GetAggregateDiscoveredResourceCountsResponse, AWSError] = js.native
  
  /**
    * Returns configuration item that is aggregated for your specific resource in a specific source account and region.
    */
  def getAggregateResourceConfig(): Request[GetAggregateResourceConfigResponse, AWSError] = js.native
  def getAggregateResourceConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetAggregateResourceConfigResponse, Unit]): Request[GetAggregateResourceConfigResponse, AWSError] = js.native
  /**
    * Returns configuration item that is aggregated for your specific resource in a specific source account and region.
    */
  def getAggregateResourceConfig(params: GetAggregateResourceConfigRequest): Request[GetAggregateResourceConfigResponse, AWSError] = js.native
  def getAggregateResourceConfig(
    params: GetAggregateResourceConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAggregateResourceConfigResponse, Unit]
  ): Request[GetAggregateResourceConfigResponse, AWSError] = js.native
  
  /**
    * Returns the evaluation results for the specified Config rule. The results indicate which Amazon Web Services resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.
    */
  def getComplianceDetailsByConfigRule(): Request[GetComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  def getComplianceDetailsByConfigRule(
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceDetailsByConfigRuleResponse, Unit]
  ): Request[GetComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  /**
    * Returns the evaluation results for the specified Config rule. The results indicate which Amazon Web Services resources were evaluated by the rule, when each resource was last evaluated, and whether each resource complies with the rule.
    */
  def getComplianceDetailsByConfigRule(params: GetComplianceDetailsByConfigRuleRequest): Request[GetComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  def getComplianceDetailsByConfigRule(
    params: GetComplianceDetailsByConfigRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceDetailsByConfigRuleResponse, Unit]
  ): Request[GetComplianceDetailsByConfigRuleResponse, AWSError] = js.native
  
  /**
    * Returns the evaluation results for the specified Amazon Web Services resource. The results indicate which Config rules were used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.
    */
  def getComplianceDetailsByResource(): Request[GetComplianceDetailsByResourceResponse, AWSError] = js.native
  def getComplianceDetailsByResource(
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceDetailsByResourceResponse, Unit]
  ): Request[GetComplianceDetailsByResourceResponse, AWSError] = js.native
  /**
    * Returns the evaluation results for the specified Amazon Web Services resource. The results indicate which Config rules were used to evaluate the resource, when each rule was last used, and whether the resource complies with each rule.
    */
  def getComplianceDetailsByResource(params: GetComplianceDetailsByResourceRequest): Request[GetComplianceDetailsByResourceResponse, AWSError] = js.native
  def getComplianceDetailsByResource(
    params: GetComplianceDetailsByResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceDetailsByResourceResponse, Unit]
  ): Request[GetComplianceDetailsByResourceResponse, AWSError] = js.native
  
  /**
    * Returns the number of Config rules that are compliant and noncompliant, up to a maximum of 25 for each.
    */
  def getComplianceSummaryByConfigRule(): Request[GetComplianceSummaryByConfigRuleResponse, AWSError] = js.native
  def getComplianceSummaryByConfigRule(
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceSummaryByConfigRuleResponse, Unit]
  ): Request[GetComplianceSummaryByConfigRuleResponse, AWSError] = js.native
  
  /**
    * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or more resource types to get these numbers for each resource type. The maximum number returned is 100.
    */
  def getComplianceSummaryByResourceType(): Request[GetComplianceSummaryByResourceTypeResponse, AWSError] = js.native
  def getComplianceSummaryByResourceType(
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceSummaryByResourceTypeResponse, Unit]
  ): Request[GetComplianceSummaryByResourceTypeResponse, AWSError] = js.native
  /**
    * Returns the number of resources that are compliant and the number that are noncompliant. You can specify one or more resource types to get these numbers for each resource type. The maximum number returned is 100.
    */
  def getComplianceSummaryByResourceType(params: GetComplianceSummaryByResourceTypeRequest): Request[GetComplianceSummaryByResourceTypeResponse, AWSError] = js.native
  def getComplianceSummaryByResourceType(
    params: GetComplianceSummaryByResourceTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceSummaryByResourceTypeResponse, Unit]
  ): Request[GetComplianceSummaryByResourceTypeResponse, AWSError] = js.native
  
  /**
    * Returns compliance details of a conformance pack for all Amazon Web Services resources that are monitered by conformance pack.
    */
  def getConformancePackComplianceDetails(): Request[GetConformancePackComplianceDetailsResponse, AWSError] = js.native
  def getConformancePackComplianceDetails(
    callback: js.Function2[/* err */ AWSError, /* data */ GetConformancePackComplianceDetailsResponse, Unit]
  ): Request[GetConformancePackComplianceDetailsResponse, AWSError] = js.native
  /**
    * Returns compliance details of a conformance pack for all Amazon Web Services resources that are monitered by conformance pack.
    */
  def getConformancePackComplianceDetails(params: GetConformancePackComplianceDetailsRequest): Request[GetConformancePackComplianceDetailsResponse, AWSError] = js.native
  def getConformancePackComplianceDetails(
    params: GetConformancePackComplianceDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConformancePackComplianceDetailsResponse, Unit]
  ): Request[GetConformancePackComplianceDetailsResponse, AWSError] = js.native
  
  /**
    * Returns compliance details for the conformance pack based on the cumulative compliance results of all the rules in that conformance pack.
    */
  def getConformancePackComplianceSummary(): Request[GetConformancePackComplianceSummaryResponse, AWSError] = js.native
  def getConformancePackComplianceSummary(
    callback: js.Function2[/* err */ AWSError, /* data */ GetConformancePackComplianceSummaryResponse, Unit]
  ): Request[GetConformancePackComplianceSummaryResponse, AWSError] = js.native
  /**
    * Returns compliance details for the conformance pack based on the cumulative compliance results of all the rules in that conformance pack.
    */
  def getConformancePackComplianceSummary(params: GetConformancePackComplianceSummaryRequest): Request[GetConformancePackComplianceSummaryResponse, AWSError] = js.native
  def getConformancePackComplianceSummary(
    params: GetConformancePackComplianceSummaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConformancePackComplianceSummaryResponse, Unit]
  ): Request[GetConformancePackComplianceSummaryResponse, AWSError] = js.native
  
  /**
    * Returns the policy definition containing the logic for your Config Custom Policy rule.
    */
  def getCustomRulePolicy(): Request[GetCustomRulePolicyResponse, AWSError] = js.native
  def getCustomRulePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetCustomRulePolicyResponse, Unit]): Request[GetCustomRulePolicyResponse, AWSError] = js.native
  /**
    * Returns the policy definition containing the logic for your Config Custom Policy rule.
    */
  def getCustomRulePolicy(params: GetCustomRulePolicyRequest): Request[GetCustomRulePolicyResponse, AWSError] = js.native
  def getCustomRulePolicy(
    params: GetCustomRulePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCustomRulePolicyResponse, Unit]
  ): Request[GetCustomRulePolicyResponse, AWSError] = js.native
  
  /**
    * Returns the resource types, the number of each resource type, and the total number of resources that Config is recording in this region for your Amazon Web Services account.   Example    Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20 IAM users, and 15 S3 buckets.   You make a call to the GetDiscoveredResourceCounts action and specify that you want all resource types.    Config returns the following:   The resource types (EC2 instances, IAM users, and S3 buckets).   The number of each resource type (25, 20, and 15).   The total number of all resources (60).     The response is paginated. By default, Config lists 100 ResourceCount objects on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  If you make a call to the GetDiscoveredResourceCounts action, you might not immediately receive resource counts in the following situations:   You are a new Config customer.   You just enabled resource recording.   It might take a few minutes for Config to record and count your resources. Wait a few minutes and then retry the GetDiscoveredResourceCounts action.  
    */
  def getDiscoveredResourceCounts(): Request[GetDiscoveredResourceCountsResponse, AWSError] = js.native
  def getDiscoveredResourceCounts(callback: js.Function2[/* err */ AWSError, /* data */ GetDiscoveredResourceCountsResponse, Unit]): Request[GetDiscoveredResourceCountsResponse, AWSError] = js.native
  /**
    * Returns the resource types, the number of each resource type, and the total number of resources that Config is recording in this region for your Amazon Web Services account.   Example    Config is recording three resource types in the US East (Ohio) Region for your account: 25 EC2 instances, 20 IAM users, and 15 S3 buckets.   You make a call to the GetDiscoveredResourceCounts action and specify that you want all resource types.    Config returns the following:   The resource types (EC2 instances, IAM users, and S3 buckets).   The number of each resource type (25, 20, and 15).   The total number of all resources (60).     The response is paginated. By default, Config lists 100 ResourceCount objects on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  If you make a call to the GetDiscoveredResourceCounts action, you might not immediately receive resource counts in the following situations:   You are a new Config customer.   You just enabled resource recording.   It might take a few minutes for Config to record and count your resources. Wait a few minutes and then retry the GetDiscoveredResourceCounts action.  
    */
  def getDiscoveredResourceCounts(params: GetDiscoveredResourceCountsRequest): Request[GetDiscoveredResourceCountsResponse, AWSError] = js.native
  def getDiscoveredResourceCounts(
    params: GetDiscoveredResourceCountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDiscoveredResourceCountsResponse, Unit]
  ): Request[GetDiscoveredResourceCountsResponse, AWSError] = js.native
  
  /**
    * Returns detailed status for each member account within an organization for a given organization Config rule.
    */
  def getOrganizationConfigRuleDetailedStatus(): Request[GetOrganizationConfigRuleDetailedStatusResponse, AWSError] = js.native
  def getOrganizationConfigRuleDetailedStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ GetOrganizationConfigRuleDetailedStatusResponse, Unit]
  ): Request[GetOrganizationConfigRuleDetailedStatusResponse, AWSError] = js.native
  /**
    * Returns detailed status for each member account within an organization for a given organization Config rule.
    */
  def getOrganizationConfigRuleDetailedStatus(params: GetOrganizationConfigRuleDetailedStatusRequest): Request[GetOrganizationConfigRuleDetailedStatusResponse, AWSError] = js.native
  def getOrganizationConfigRuleDetailedStatus(
    params: GetOrganizationConfigRuleDetailedStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOrganizationConfigRuleDetailedStatusResponse, Unit]
  ): Request[GetOrganizationConfigRuleDetailedStatusResponse, AWSError] = js.native
  
  /**
    * Returns detailed status for each member account within an organization for a given organization conformance pack.
    */
  def getOrganizationConformancePackDetailedStatus(): Request[GetOrganizationConformancePackDetailedStatusResponse, AWSError] = js.native
  def getOrganizationConformancePackDetailedStatus(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetOrganizationConformancePackDetailedStatusResponse, 
      Unit
    ]
  ): Request[GetOrganizationConformancePackDetailedStatusResponse, AWSError] = js.native
  /**
    * Returns detailed status for each member account within an organization for a given organization conformance pack.
    */
  def getOrganizationConformancePackDetailedStatus(params: GetOrganizationConformancePackDetailedStatusRequest): Request[GetOrganizationConformancePackDetailedStatusResponse, AWSError] = js.native
  def getOrganizationConformancePackDetailedStatus(
    params: GetOrganizationConformancePackDetailedStatusRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetOrganizationConformancePackDetailedStatusResponse, 
      Unit
    ]
  ): Request[GetOrganizationConformancePackDetailedStatusResponse, AWSError] = js.native
  
  /**
    * Returns the policy definition containing the logic for your organization Config Custom Policy rule.
    */
  def getOrganizationCustomRulePolicy(): Request[GetOrganizationCustomRulePolicyResponse, AWSError] = js.native
  def getOrganizationCustomRulePolicy(
    callback: js.Function2[/* err */ AWSError, /* data */ GetOrganizationCustomRulePolicyResponse, Unit]
  ): Request[GetOrganizationCustomRulePolicyResponse, AWSError] = js.native
  /**
    * Returns the policy definition containing the logic for your organization Config Custom Policy rule.
    */
  def getOrganizationCustomRulePolicy(params: GetOrganizationCustomRulePolicyRequest): Request[GetOrganizationCustomRulePolicyResponse, AWSError] = js.native
  def getOrganizationCustomRulePolicy(
    params: GetOrganizationCustomRulePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOrganizationCustomRulePolicyResponse, Unit]
  ): Request[GetOrganizationCustomRulePolicyResponse, AWSError] = js.native
  
  /**
    * Returns a list of ConfigurationItems for the specified resource. The list contains details about each state of the resource during the specified time interval. If you specified a retention period to retain your ConfigurationItems between a minimum of 30 days and a maximum of 7 years (2557 days), Config returns the ConfigurationItems for the specified retention period.  The response is paginated. By default, Config returns a limit of 10 configuration items per page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  Each call to the API is limited to span a duration of seven days. It is likely that the number of records returned is smaller than the specified limit. In such cases, you can make another call, using the nextToken. 
    */
  def getResourceConfigHistory(): Request[GetResourceConfigHistoryResponse, AWSError] = js.native
  def getResourceConfigHistory(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceConfigHistoryResponse, Unit]): Request[GetResourceConfigHistoryResponse, AWSError] = js.native
  /**
    * Returns a list of ConfigurationItems for the specified resource. The list contains details about each state of the resource during the specified time interval. If you specified a retention period to retain your ConfigurationItems between a minimum of 30 days and a maximum of 7 years (2557 days), Config returns the ConfigurationItems for the specified retention period.  The response is paginated. By default, Config returns a limit of 10 configuration items per page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.  Each call to the API is limited to span a duration of seven days. It is likely that the number of records returned is smaller than the specified limit. In such cases, you can make another call, using the nextToken. 
    */
  def getResourceConfigHistory(params: GetResourceConfigHistoryRequest): Request[GetResourceConfigHistoryResponse, AWSError] = js.native
  def getResourceConfigHistory(
    params: GetResourceConfigHistoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceConfigHistoryResponse, Unit]
  ): Request[GetResourceConfigHistoryResponse, AWSError] = js.native
  
  /**
    * Returns the details of a specific stored query.
    */
  def getStoredQuery(): Request[GetStoredQueryResponse, AWSError] = js.native
  def getStoredQuery(callback: js.Function2[/* err */ AWSError, /* data */ GetStoredQueryResponse, Unit]): Request[GetStoredQueryResponse, AWSError] = js.native
  /**
    * Returns the details of a specific stored query.
    */
  def getStoredQuery(params: GetStoredQueryRequest): Request[GetStoredQueryResponse, AWSError] = js.native
  def getStoredQuery(
    params: GetStoredQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStoredQueryResponse, Unit]
  ): Request[GetStoredQueryResponse, AWSError] = js.native
  
  /**
    * Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom resource name, source account, and source region. You can narrow the results to include only resources that have specific resource IDs, or a resource name, or source account ID, or source region. For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type AWS::EC2::Instance then the API returns all the EC2 instance identifiers of accountID 12345678910 and region us-east-1.
    */
  def listAggregateDiscoveredResources(): Request[ListAggregateDiscoveredResourcesResponse, AWSError] = js.native
  def listAggregateDiscoveredResources(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAggregateDiscoveredResourcesResponse, Unit]
  ): Request[ListAggregateDiscoveredResourcesResponse, AWSError] = js.native
  /**
    * Accepts a resource type and returns a list of resource identifiers that are aggregated for a specific resource type across accounts and regions. A resource identifier includes the resource type, ID, (if available) the custom resource name, source account, and source region. You can narrow the results to include only resources that have specific resource IDs, or a resource name, or source account ID, or source region. For example, if the input consists of accountID 12345678910 and the region is us-east-1 for resource type AWS::EC2::Instance then the API returns all the EC2 instance identifiers of accountID 12345678910 and region us-east-1.
    */
  def listAggregateDiscoveredResources(params: ListAggregateDiscoveredResourcesRequest): Request[ListAggregateDiscoveredResourcesResponse, AWSError] = js.native
  def listAggregateDiscoveredResources(
    params: ListAggregateDiscoveredResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAggregateDiscoveredResourcesResponse, Unit]
  ): Request[ListAggregateDiscoveredResourcesResponse, AWSError] = js.native
  
  /**
    * Returns a list of conformance pack compliance scores. A compliance score is the percentage of the number of compliant rule-resource combinations in a conformance pack compared to the number of total possible rule-resource combinations in the conformance pack. This metric provides you with a high-level view of the compliance state of your conformance packs, and can be used to identify, investigate, and understand the level of compliance in your conformance packs.  Conformance packs with no evaluation results will have a compliance score of INSUFFICIENT_DATA. 
    */
  def listConformancePackComplianceScores(): Request[ListConformancePackComplianceScoresResponse, AWSError] = js.native
  def listConformancePackComplianceScores(
    callback: js.Function2[/* err */ AWSError, /* data */ ListConformancePackComplianceScoresResponse, Unit]
  ): Request[ListConformancePackComplianceScoresResponse, AWSError] = js.native
  /**
    * Returns a list of conformance pack compliance scores. A compliance score is the percentage of the number of compliant rule-resource combinations in a conformance pack compared to the number of total possible rule-resource combinations in the conformance pack. This metric provides you with a high-level view of the compliance state of your conformance packs, and can be used to identify, investigate, and understand the level of compliance in your conformance packs.  Conformance packs with no evaluation results will have a compliance score of INSUFFICIENT_DATA. 
    */
  def listConformancePackComplianceScores(params: ListConformancePackComplianceScoresRequest): Request[ListConformancePackComplianceScoresResponse, AWSError] = js.native
  def listConformancePackComplianceScores(
    params: ListConformancePackComplianceScoresRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConformancePackComplianceScoresResponse, Unit]
  ): Request[ListConformancePackComplianceScoresResponse, AWSError] = js.native
  
  /**
    * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of resources that Config has discovered, including those that Config is not currently recording. You can narrow the results to include only resources that have specific resource IDs or a resource name.  You can specify either resource IDs or a resource name, but not both, in the same request.  The response is paginated. By default, Config lists 100 resource identifiers on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.
    */
  def listDiscoveredResources(): Request[ListDiscoveredResourcesResponse, AWSError] = js.native
  def listDiscoveredResources(callback: js.Function2[/* err */ AWSError, /* data */ ListDiscoveredResourcesResponse, Unit]): Request[ListDiscoveredResourcesResponse, AWSError] = js.native
  /**
    * Accepts a resource type and returns a list of resource identifiers for the resources of that type. A resource identifier includes the resource type, ID, and (if available) the custom resource name. The results consist of resources that Config has discovered, including those that Config is not currently recording. You can narrow the results to include only resources that have specific resource IDs or a resource name.  You can specify either resource IDs or a resource name, but not both, in the same request.  The response is paginated. By default, Config lists 100 resource identifiers on each page. You can customize this number with the limit parameter. The response includes a nextToken string. To get the next page of results, run the request again and specify the string for the nextToken parameter.
    */
  def listDiscoveredResources(params: ListDiscoveredResourcesRequest): Request[ListDiscoveredResourcesResponse, AWSError] = js.native
  def listDiscoveredResources(
    params: ListDiscoveredResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDiscoveredResourcesResponse, Unit]
  ): Request[ListDiscoveredResourcesResponse, AWSError] = js.native
  
  /**
    * Lists the stored queries for a single Amazon Web Services account and a single Amazon Web Services Region. The default is 100. 
    */
  def listStoredQueries(): Request[ListStoredQueriesResponse, AWSError] = js.native
  def listStoredQueries(callback: js.Function2[/* err */ AWSError, /* data */ ListStoredQueriesResponse, Unit]): Request[ListStoredQueriesResponse, AWSError] = js.native
  /**
    * Lists the stored queries for a single Amazon Web Services account and a single Amazon Web Services Region. The default is 100. 
    */
  def listStoredQueries(params: ListStoredQueriesRequest): Request[ListStoredQueriesResponse, AWSError] = js.native
  def listStoredQueries(
    params: ListStoredQueriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStoredQueriesResponse, Unit]
  ): Request[ListStoredQueriesResponse, AWSError] = js.native
  
  /**
    * List the tags for Config resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List the tags for Config resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Authorizes the aggregator account and region to collect data from the source account and region. 
    */
  def putAggregationAuthorization(): Request[PutAggregationAuthorizationResponse, AWSError] = js.native
  def putAggregationAuthorization(callback: js.Function2[/* err */ AWSError, /* data */ PutAggregationAuthorizationResponse, Unit]): Request[PutAggregationAuthorizationResponse, AWSError] = js.native
  /**
    * Authorizes the aggregator account and region to collect data from the source account and region. 
    */
  def putAggregationAuthorization(params: PutAggregationAuthorizationRequest): Request[PutAggregationAuthorizationResponse, AWSError] = js.native
  def putAggregationAuthorization(
    params: PutAggregationAuthorizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAggregationAuthorizationResponse, Unit]
  ): Request[PutAggregationAuthorizationResponse, AWSError] = js.native
  
  /**
    * Adds or updates an Config rule to evaluate if your Amazon Web Services resources comply with your desired configurations. For information on how many Config rules you can have per account, see  Service Limits  in the Config Developer Guide. There are two types of rules: Config Custom Rules and Config Managed Rules. You can use PutConfigRule to create both Config custom rules and Config managed rules. Custom rules are rules that you can create using either Guard or Lambda functions. Guard (Guard GitHub Repository) is a policy-as-code language that allows you to write policies that are enforced by Config Custom Policy rules. Lambda uses custom code that you upload to evaluate a custom rule. If you are adding a new Custom Lambda rule, you first need to create an Lambda function that the rule invokes to evaluate your resources. When you use PutConfigRule to add a Custom Lambda rule to Config, you must specify the Amazon Resource Name (ARN) that Lambda assigns to the function. You specify the ARN in the SourceIdentifier key. This key is part of the Source object, which is part of the ConfigRule object.  Managed rules are predefined, customizable rules created by Config. For a list of managed rules, see List of Config Managed Rules. If you are adding an Config managed rule, you must specify the rule's identifier for the SourceIdentifier key. For any new rule that you add, specify the ConfigRuleName in the ConfigRule object. Do not specify the ConfigRuleArn or the ConfigRuleId. These values are generated by Config for new rules. If you are updating a rule that you added previously, you can specify the rule by ConfigRuleName, ConfigRuleId, or ConfigRuleArn in the ConfigRule data type that you use in this request. For more information about developing and using Config rules, see Evaluating Amazon Web Services resource Configurations with Config in the Config Developer Guide.
    */
  def putConfigRule(): Request[js.Object, AWSError] = js.native
  def putConfigRule(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or updates an Config rule to evaluate if your Amazon Web Services resources comply with your desired configurations. For information on how many Config rules you can have per account, see  Service Limits  in the Config Developer Guide. There are two types of rules: Config Custom Rules and Config Managed Rules. You can use PutConfigRule to create both Config custom rules and Config managed rules. Custom rules are rules that you can create using either Guard or Lambda functions. Guard (Guard GitHub Repository) is a policy-as-code language that allows you to write policies that are enforced by Config Custom Policy rules. Lambda uses custom code that you upload to evaluate a custom rule. If you are adding a new Custom Lambda rule, you first need to create an Lambda function that the rule invokes to evaluate your resources. When you use PutConfigRule to add a Custom Lambda rule to Config, you must specify the Amazon Resource Name (ARN) that Lambda assigns to the function. You specify the ARN in the SourceIdentifier key. This key is part of the Source object, which is part of the ConfigRule object.  Managed rules are predefined, customizable rules created by Config. For a list of managed rules, see List of Config Managed Rules. If you are adding an Config managed rule, you must specify the rule's identifier for the SourceIdentifier key. For any new rule that you add, specify the ConfigRuleName in the ConfigRule object. Do not specify the ConfigRuleArn or the ConfigRuleId. These values are generated by Config for new rules. If you are updating a rule that you added previously, you can specify the rule by ConfigRuleName, ConfigRuleId, or ConfigRuleArn in the ConfigRule data type that you use in this request. For more information about developing and using Config rules, see Evaluating Amazon Web Services resource Configurations with Config in the Config Developer Guide.
    */
  def putConfigRule(params: PutConfigRuleRequest): Request[js.Object, AWSError] = js.native
  def putConfigRule(
    params: PutConfigRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates and updates the configuration aggregator with the selected source accounts and regions. The source account can be individual account(s) or an organization.  accountIds that are passed will be replaced with existing accounts. If you want to add additional accounts into the aggregator, call DescribeConfigurationAggregators to get the previous accounts and then append new ones.  Config should be enabled in source accounts and regions you want to aggregate. If your source type is an organization, you must be signed in to the management account or a registered delegated administrator and all the features must be enabled in your organization. If the caller is a management account, Config calls EnableAwsServiceAccess API to enable integration between Config and Organizations. If the caller is a registered delegated administrator, Config calls ListDelegatedAdministrators API to verify whether the caller is a valid delegated administrator. To register a delegated administrator, see Register a Delegated Administrator in the Config developer guide.  
    */
  def putConfigurationAggregator(): Request[PutConfigurationAggregatorResponse, AWSError] = js.native
  def putConfigurationAggregator(callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationAggregatorResponse, Unit]): Request[PutConfigurationAggregatorResponse, AWSError] = js.native
  /**
    * Creates and updates the configuration aggregator with the selected source accounts and regions. The source account can be individual account(s) or an organization.  accountIds that are passed will be replaced with existing accounts. If you want to add additional accounts into the aggregator, call DescribeConfigurationAggregators to get the previous accounts and then append new ones.  Config should be enabled in source accounts and regions you want to aggregate. If your source type is an organization, you must be signed in to the management account or a registered delegated administrator and all the features must be enabled in your organization. If the caller is a management account, Config calls EnableAwsServiceAccess API to enable integration between Config and Organizations. If the caller is a registered delegated administrator, Config calls ListDelegatedAdministrators API to verify whether the caller is a valid delegated administrator. To register a delegated administrator, see Register a Delegated Administrator in the Config developer guide.  
    */
  def putConfigurationAggregator(params: PutConfigurationAggregatorRequest): Request[PutConfigurationAggregatorResponse, AWSError] = js.native
  def putConfigurationAggregator(
    params: PutConfigurationAggregatorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutConfigurationAggregatorResponse, Unit]
  ): Request[PutConfigurationAggregatorResponse, AWSError] = js.native
  
  /**
    * Creates a new configuration recorder to record the selected resource configurations. You can use this action to change the role roleARN or the recordingGroup of an existing recorder. To change the role, call the action on the existing configuration recorder and specify a role.  Currently, you can specify only one configuration recorder per region in your account. If ConfigurationRecorder does not have the recordingGroup parameter specified, the default is to record all supported resource types. 
    */
  def putConfigurationRecorder(): Request[js.Object, AWSError] = js.native
  def putConfigurationRecorder(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a new configuration recorder to record the selected resource configurations. You can use this action to change the role roleARN or the recordingGroup of an existing recorder. To change the role, call the action on the existing configuration recorder and specify a role.  Currently, you can specify only one configuration recorder per region in your account. If ConfigurationRecorder does not have the recordingGroup parameter specified, the default is to record all supported resource types. 
    */
  def putConfigurationRecorder(params: PutConfigurationRecorderRequest): Request[js.Object, AWSError] = js.native
  def putConfigurationRecorder(
    params: PutConfigurationRecorderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates or updates a conformance pack. A conformance pack is a collection of Config rules that can be easily deployed in an account and a region and across Amazon Web Services Organization. For information on how many conformance packs you can have per account, see  Service Limits  in the Config Developer Guide. This API creates a service-linked role AWSServiceRoleForConfigConforms in your account. The service-linked role is created only when the role does not exist in your account.   You must specify one and only one of theTemplateS3Uri, TemplateBody or TemplateSSMDocumentDetails parameters. 
    */
  def putConformancePack(): Request[PutConformancePackResponse, AWSError] = js.native
  def putConformancePack(callback: js.Function2[/* err */ AWSError, /* data */ PutConformancePackResponse, Unit]): Request[PutConformancePackResponse, AWSError] = js.native
  /**
    * Creates or updates a conformance pack. A conformance pack is a collection of Config rules that can be easily deployed in an account and a region and across Amazon Web Services Organization. For information on how many conformance packs you can have per account, see  Service Limits  in the Config Developer Guide. This API creates a service-linked role AWSServiceRoleForConfigConforms in your account. The service-linked role is created only when the role does not exist in your account.   You must specify one and only one of theTemplateS3Uri, TemplateBody or TemplateSSMDocumentDetails parameters. 
    */
  def putConformancePack(params: PutConformancePackRequest): Request[PutConformancePackResponse, AWSError] = js.native
  def putConformancePack(
    params: PutConformancePackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutConformancePackResponse, Unit]
  ): Request[PutConformancePackResponse, AWSError] = js.native
  
  /**
    * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS topic. Before you can create a delivery channel, you must create a configuration recorder. You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel. To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3 bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action will keep the existing value for the parameter that is not changed.  You can have only one delivery channel per region in your account. 
    */
  def putDeliveryChannel(): Request[js.Object, AWSError] = js.native
  def putDeliveryChannel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates a delivery channel object to deliver configuration information to an Amazon S3 bucket and Amazon SNS topic. Before you can create a delivery channel, you must create a configuration recorder. You can use this action to change the Amazon S3 bucket or an Amazon SNS topic of the existing delivery channel. To change the Amazon S3 bucket or an Amazon SNS topic, call this action and specify the changed values for the S3 bucket and the SNS topic. If you specify a different value for either the S3 bucket or the SNS topic, this action will keep the existing value for the parameter that is not changed.  You can have only one delivery channel per region in your account. 
    */
  def putDeliveryChannel(params: PutDeliveryChannelRequest): Request[js.Object, AWSError] = js.native
  def putDeliveryChannel(
    params: PutDeliveryChannelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Used by an Lambda function to deliver evaluation results to Config. This action is required in every Lambda function that is invoked by an Config rule.
    */
  def putEvaluations(): Request[PutEvaluationsResponse, AWSError] = js.native
  def putEvaluations(callback: js.Function2[/* err */ AWSError, /* data */ PutEvaluationsResponse, Unit]): Request[PutEvaluationsResponse, AWSError] = js.native
  /**
    * Used by an Lambda function to deliver evaluation results to Config. This action is required in every Lambda function that is invoked by an Config rule.
    */
  def putEvaluations(params: PutEvaluationsRequest): Request[PutEvaluationsResponse, AWSError] = js.native
  def putEvaluations(
    params: PutEvaluationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutEvaluationsResponse, Unit]
  ): Request[PutEvaluationsResponse, AWSError] = js.native
  
  /**
    * Add or updates the evaluations for process checks. This API checks if the rule is a process check when the name of the Config rule is provided.
    */
  def putExternalEvaluation(): Request[PutExternalEvaluationResponse, AWSError] = js.native
  def putExternalEvaluation(callback: js.Function2[/* err */ AWSError, /* data */ PutExternalEvaluationResponse, Unit]): Request[PutExternalEvaluationResponse, AWSError] = js.native
  /**
    * Add or updates the evaluations for process checks. This API checks if the rule is a process check when the name of the Config rule is provided.
    */
  def putExternalEvaluation(params: PutExternalEvaluationRequest): Request[PutExternalEvaluationResponse, AWSError] = js.native
  def putExternalEvaluation(
    params: PutExternalEvaluationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutExternalEvaluationResponse, Unit]
  ): Request[PutExternalEvaluationResponse, AWSError] = js.native
  
  /**
    * Adds or updates an Config rule for your entire organization to evaluate if your Amazon Web Services resources comply with your desired configurations. For information on how many organization Config rules you can have per account, see  Service Limits  in the Config Developer Guide.  Only a master account and a delegated administrator can create or update an organization Config rule. When calling this API with a delegated administrator, you must ensure Organizations ListDelegatedAdministrator permissions are added. An organization can have up to 3 delegated administrators. This API enables organization service access through the EnableAWSServiceAccess action and creates a service-linked role AWSServiceRoleForConfigMultiAccountSetup in the master or delegated administrator account of your organization. The service-linked role is created only when the role does not exist in the caller account. Config verifies the existence of role with GetRole action. To use this API with delegated administrator, register a delegated administrator by calling Amazon Web Services Organization register-delegated-administrator for config-multiaccountsetup.amazonaws.com.  There are two types of rules: Config Custom Rules and Config Managed Rules. You can use PutOrganizationConfigRule to create both Config custom rules and Config managed rules. Custom rules are rules that you can create using either Guard or Lambda functions. Guard (Guard GitHub Repository) is a policy-as-code language that allows you to write policies that are enforced by Config Custom Policy rules. Lambda uses custom code that you upload to evaluate a custom rule. If you are adding a new Custom Lambda rule, you first need to create an Lambda function in the master account or a delegated administrator that the rule invokes to evaluate your resources. You also need to create an IAM role in the managed account that can be assumed by the Lambda function. When you use PutOrganizationConfigRule to add a Custom Lambda rule to Config, you must specify the Amazon Resource Name (ARN) that Lambda assigns to the function. Managed rules are predefined, customizable rules created by Config. For a list of managed rules, see List of Config Managed Rules. If you are adding an Config managed rule, you must specify the rule's identifier for the RuleIdentifier key.  Prerequisite: Ensure you call EnableAllFeatures API to enable all features in an organization. Make sure to specify one of either OrganizationCustomPolicyRuleMetadata for Custom Policy rules, OrganizationCustomRuleMetadata for Custom Lambda rules, or OrganizationManagedRuleMetadata for managed rules. 
    */
  def putOrganizationConfigRule(): Request[PutOrganizationConfigRuleResponse, AWSError] = js.native
  def putOrganizationConfigRule(callback: js.Function2[/* err */ AWSError, /* data */ PutOrganizationConfigRuleResponse, Unit]): Request[PutOrganizationConfigRuleResponse, AWSError] = js.native
  /**
    * Adds or updates an Config rule for your entire organization to evaluate if your Amazon Web Services resources comply with your desired configurations. For information on how many organization Config rules you can have per account, see  Service Limits  in the Config Developer Guide.  Only a master account and a delegated administrator can create or update an organization Config rule. When calling this API with a delegated administrator, you must ensure Organizations ListDelegatedAdministrator permissions are added. An organization can have up to 3 delegated administrators. This API enables organization service access through the EnableAWSServiceAccess action and creates a service-linked role AWSServiceRoleForConfigMultiAccountSetup in the master or delegated administrator account of your organization. The service-linked role is created only when the role does not exist in the caller account. Config verifies the existence of role with GetRole action. To use this API with delegated administrator, register a delegated administrator by calling Amazon Web Services Organization register-delegated-administrator for config-multiaccountsetup.amazonaws.com.  There are two types of rules: Config Custom Rules and Config Managed Rules. You can use PutOrganizationConfigRule to create both Config custom rules and Config managed rules. Custom rules are rules that you can create using either Guard or Lambda functions. Guard (Guard GitHub Repository) is a policy-as-code language that allows you to write policies that are enforced by Config Custom Policy rules. Lambda uses custom code that you upload to evaluate a custom rule. If you are adding a new Custom Lambda rule, you first need to create an Lambda function in the master account or a delegated administrator that the rule invokes to evaluate your resources. You also need to create an IAM role in the managed account that can be assumed by the Lambda function. When you use PutOrganizationConfigRule to add a Custom Lambda rule to Config, you must specify the Amazon Resource Name (ARN) that Lambda assigns to the function. Managed rules are predefined, customizable rules created by Config. For a list of managed rules, see List of Config Managed Rules. If you are adding an Config managed rule, you must specify the rule's identifier for the RuleIdentifier key.  Prerequisite: Ensure you call EnableAllFeatures API to enable all features in an organization. Make sure to specify one of either OrganizationCustomPolicyRuleMetadata for Custom Policy rules, OrganizationCustomRuleMetadata for Custom Lambda rules, or OrganizationManagedRuleMetadata for managed rules. 
    */
  def putOrganizationConfigRule(params: PutOrganizationConfigRuleRequest): Request[PutOrganizationConfigRuleResponse, AWSError] = js.native
  def putOrganizationConfigRule(
    params: PutOrganizationConfigRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutOrganizationConfigRuleResponse, Unit]
  ): Request[PutOrganizationConfigRuleResponse, AWSError] = js.native
  
  /**
    * Deploys conformance packs across member accounts in an Amazon Web Services Organization. For information on how many organization conformance packs and how many Config rules you can have per account, see  Service Limits  in the Config Developer Guide. Only a master account and a delegated administrator can call this API. When calling this API with a delegated administrator, you must ensure Organizations ListDelegatedAdministrator permissions are added. An organization can have up to 3 delegated administrators. This API enables organization service access for config-multiaccountsetup.amazonaws.com through the EnableAWSServiceAccess action and creates a service-linked role AWSServiceRoleForConfigMultiAccountSetup in the master or delegated administrator account of your organization. The service-linked role is created only when the role does not exist in the caller account. To use this API with delegated administrator, register a delegated administrator by calling Amazon Web Services Organization register-delegate-admin for config-multiaccountsetup.amazonaws.com.  Prerequisite: Ensure you call EnableAllFeatures API to enable all features in an organization. You must specify either the TemplateS3Uri or the TemplateBody parameter, but not both. If you provide both Config uses the TemplateS3Uri parameter and ignores the TemplateBody parameter. Config sets the state of a conformance pack to CREATE_IN_PROGRESS and UPDATE_IN_PROGRESS until the conformance pack is created or updated. You cannot update a conformance pack while it is in this state. 
    */
  def putOrganizationConformancePack(): Request[PutOrganizationConformancePackResponse, AWSError] = js.native
  def putOrganizationConformancePack(
    callback: js.Function2[/* err */ AWSError, /* data */ PutOrganizationConformancePackResponse, Unit]
  ): Request[PutOrganizationConformancePackResponse, AWSError] = js.native
  /**
    * Deploys conformance packs across member accounts in an Amazon Web Services Organization. For information on how many organization conformance packs and how many Config rules you can have per account, see  Service Limits  in the Config Developer Guide. Only a master account and a delegated administrator can call this API. When calling this API with a delegated administrator, you must ensure Organizations ListDelegatedAdministrator permissions are added. An organization can have up to 3 delegated administrators. This API enables organization service access for config-multiaccountsetup.amazonaws.com through the EnableAWSServiceAccess action and creates a service-linked role AWSServiceRoleForConfigMultiAccountSetup in the master or delegated administrator account of your organization. The service-linked role is created only when the role does not exist in the caller account. To use this API with delegated administrator, register a delegated administrator by calling Amazon Web Services Organization register-delegate-admin for config-multiaccountsetup.amazonaws.com.  Prerequisite: Ensure you call EnableAllFeatures API to enable all features in an organization. You must specify either the TemplateS3Uri or the TemplateBody parameter, but not both. If you provide both Config uses the TemplateS3Uri parameter and ignores the TemplateBody parameter. Config sets the state of a conformance pack to CREATE_IN_PROGRESS and UPDATE_IN_PROGRESS until the conformance pack is created or updated. You cannot update a conformance pack while it is in this state. 
    */
  def putOrganizationConformancePack(params: PutOrganizationConformancePackRequest): Request[PutOrganizationConformancePackResponse, AWSError] = js.native
  def putOrganizationConformancePack(
    params: PutOrganizationConformancePackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutOrganizationConformancePackResponse, Unit]
  ): Request[PutOrganizationConformancePackResponse, AWSError] = js.native
  
  /**
    * Adds or updates the remediation configuration with a specific Config rule with the selected target or action. The API creates the RemediationConfiguration object for the Config rule. The Config rule must already exist for you to add a remediation configuration. The target (SSM document) must exist and have permissions to use the target.   If you make backward incompatible changes to the SSM document, you must call this again to ensure the remediations can run. This API does not support adding remediation configurations for service-linked Config Rules such as Organization Config rules, the rules deployed by conformance packs, and rules deployed by Amazon Web Services Security Hub.   For manual remediation configuration, you need to provide a value for automationAssumeRole or use a value in the assumeRolefield to remediate your resources. The SSM automation document can use either as long as it maps to a valid parameter. However, for automatic remediation configuration, the only valid assumeRole field value is AutomationAssumeRole and you need to provide a value for AutomationAssumeRole to remediate your resources. 
    */
  def putRemediationConfigurations(): Request[PutRemediationConfigurationsResponse, AWSError] = js.native
  def putRemediationConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ PutRemediationConfigurationsResponse, Unit]): Request[PutRemediationConfigurationsResponse, AWSError] = js.native
  /**
    * Adds or updates the remediation configuration with a specific Config rule with the selected target or action. The API creates the RemediationConfiguration object for the Config rule. The Config rule must already exist for you to add a remediation configuration. The target (SSM document) must exist and have permissions to use the target.   If you make backward incompatible changes to the SSM document, you must call this again to ensure the remediations can run. This API does not support adding remediation configurations for service-linked Config Rules such as Organization Config rules, the rules deployed by conformance packs, and rules deployed by Amazon Web Services Security Hub.   For manual remediation configuration, you need to provide a value for automationAssumeRole or use a value in the assumeRolefield to remediate your resources. The SSM automation document can use either as long as it maps to a valid parameter. However, for automatic remediation configuration, the only valid assumeRole field value is AutomationAssumeRole and you need to provide a value for AutomationAssumeRole to remediate your resources. 
    */
  def putRemediationConfigurations(params: PutRemediationConfigurationsRequest): Request[PutRemediationConfigurationsResponse, AWSError] = js.native
  def putRemediationConfigurations(
    params: PutRemediationConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRemediationConfigurationsResponse, Unit]
  ): Request[PutRemediationConfigurationsResponse, AWSError] = js.native
  
  /**
    * A remediation exception is when a specific resource is no longer considered for auto-remediation. This API adds a new exception or updates an existing exception for a specific resource with a specific Config rule.   Config generates a remediation exception when a problem occurs executing a remediation action to a specific resource. Remediation exceptions blocks auto-remediation until the exception is cleared. 
    */
  def putRemediationExceptions(): Request[PutRemediationExceptionsResponse, AWSError] = js.native
  def putRemediationExceptions(callback: js.Function2[/* err */ AWSError, /* data */ PutRemediationExceptionsResponse, Unit]): Request[PutRemediationExceptionsResponse, AWSError] = js.native
  /**
    * A remediation exception is when a specific resource is no longer considered for auto-remediation. This API adds a new exception or updates an existing exception for a specific resource with a specific Config rule.   Config generates a remediation exception when a problem occurs executing a remediation action to a specific resource. Remediation exceptions blocks auto-remediation until the exception is cleared. 
    */
  def putRemediationExceptions(params: PutRemediationExceptionsRequest): Request[PutRemediationExceptionsResponse, AWSError] = js.native
  def putRemediationExceptions(
    params: PutRemediationExceptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRemediationExceptionsResponse, Unit]
  ): Request[PutRemediationExceptionsResponse, AWSError] = js.native
  
  /**
    * Records the configuration state for the resource provided in the request. The configuration state of a resource is represented in Config as Configuration Items. Once this API records the configuration item, you can retrieve the list of configuration items for the custom resource type using existing Config APIs.   The custom resource type must be registered with CloudFormation. This API accepts the configuration item registered with CloudFormation. When you call this API, Config only stores configuration state of the resource provided in the request. This API does not change or remediate the configuration of the resource.  Write-only schema properites are not recorded as part of the published configuration item. 
    */
  def putResourceConfig(): Request[js.Object, AWSError] = js.native
  def putResourceConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Records the configuration state for the resource provided in the request. The configuration state of a resource is represented in Config as Configuration Items. Once this API records the configuration item, you can retrieve the list of configuration items for the custom resource type using existing Config APIs.   The custom resource type must be registered with CloudFormation. This API accepts the configuration item registered with CloudFormation. When you call this API, Config only stores configuration state of the resource provided in the request. This API does not change or remediate the configuration of the resource.  Write-only schema properites are not recorded as part of the published configuration item. 
    */
  def putResourceConfig(params: PutResourceConfigRequest): Request[js.Object, AWSError] = js.native
  def putResourceConfig(
    params: PutResourceConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates and updates the retention configuration with details about retention period (number of days) that Config stores your historical information. The API creates the RetentionConfiguration object and names the object as default. When you have a RetentionConfiguration object named default, calling the API modifies the default object.   Currently, Config supports only one retention configuration per region in your account. 
    */
  def putRetentionConfiguration(): Request[PutRetentionConfigurationResponse, AWSError] = js.native
  def putRetentionConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutRetentionConfigurationResponse, Unit]): Request[PutRetentionConfigurationResponse, AWSError] = js.native
  /**
    * Creates and updates the retention configuration with details about retention period (number of days) that Config stores your historical information. The API creates the RetentionConfiguration object and names the object as default. When you have a RetentionConfiguration object named default, calling the API modifies the default object.   Currently, Config supports only one retention configuration per region in your account. 
    */
  def putRetentionConfiguration(params: PutRetentionConfigurationRequest): Request[PutRetentionConfigurationResponse, AWSError] = js.native
  def putRetentionConfiguration(
    params: PutRetentionConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRetentionConfigurationResponse, Unit]
  ): Request[PutRetentionConfigurationResponse, AWSError] = js.native
  
  /**
    * Saves a new query or updates an existing saved query. The QueryName must be unique for a single Amazon Web Services account and a single Amazon Web Services Region. You can create upto 300 queries in a single Amazon Web Services account and a single Amazon Web Services Region.
    */
  def putStoredQuery(): Request[PutStoredQueryResponse, AWSError] = js.native
  def putStoredQuery(callback: js.Function2[/* err */ AWSError, /* data */ PutStoredQueryResponse, Unit]): Request[PutStoredQueryResponse, AWSError] = js.native
  /**
    * Saves a new query or updates an existing saved query. The QueryName must be unique for a single Amazon Web Services account and a single Amazon Web Services Region. You can create upto 300 queries in a single Amazon Web Services account and a single Amazon Web Services Region.
    */
  def putStoredQuery(params: PutStoredQueryRequest): Request[PutStoredQueryResponse, AWSError] = js.native
  def putStoredQuery(
    params: PutStoredQueryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutStoredQueryResponse, Unit]
  ): Request[PutStoredQueryResponse, AWSError] = js.native
  
  /**
    * Accepts a structured query language (SQL) SELECT command and an aggregator to query configuration state of Amazon Web Services resources across multiple accounts and regions, performs the corresponding search, and returns resource configurations matching the properties. For more information about query components, see the  Query Components  section in the Config Developer Guide.  If you run an aggregation query (i.e., using GROUP BY or using aggregate functions such as COUNT; e.g., SELECT resourceId, COUNT(*) WHERE resourceType = 'AWS::IAM::Role' GROUP BY resourceId) and do not specify the MaxResults or the Limit query parameters, the default page size is set to 500. If you run a non-aggregation query (i.e., not using GROUP BY or aggregate function; e.g., SELECT * WHERE resourceType = 'AWS::IAM::Role') and do not specify the MaxResults or the Limit query parameters, the default page size is set to 25. 
    */
  def selectAggregateResourceConfig(): Request[SelectAggregateResourceConfigResponse, AWSError] = js.native
  def selectAggregateResourceConfig(callback: js.Function2[/* err */ AWSError, /* data */ SelectAggregateResourceConfigResponse, Unit]): Request[SelectAggregateResourceConfigResponse, AWSError] = js.native
  /**
    * Accepts a structured query language (SQL) SELECT command and an aggregator to query configuration state of Amazon Web Services resources across multiple accounts and regions, performs the corresponding search, and returns resource configurations matching the properties. For more information about query components, see the  Query Components  section in the Config Developer Guide.  If you run an aggregation query (i.e., using GROUP BY or using aggregate functions such as COUNT; e.g., SELECT resourceId, COUNT(*) WHERE resourceType = 'AWS::IAM::Role' GROUP BY resourceId) and do not specify the MaxResults or the Limit query parameters, the default page size is set to 500. If you run a non-aggregation query (i.e., not using GROUP BY or aggregate function; e.g., SELECT * WHERE resourceType = 'AWS::IAM::Role') and do not specify the MaxResults or the Limit query parameters, the default page size is set to 25. 
    */
  def selectAggregateResourceConfig(params: SelectAggregateResourceConfigRequest): Request[SelectAggregateResourceConfigResponse, AWSError] = js.native
  def selectAggregateResourceConfig(
    params: SelectAggregateResourceConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SelectAggregateResourceConfigResponse, Unit]
  ): Request[SelectAggregateResourceConfigResponse, AWSError] = js.native
  
  /**
    * Accepts a structured query language (SQL) SELECT command, performs the corresponding search, and returns resource configurations matching the properties. For more information about query components, see the  Query Components  section in the Config Developer Guide.
    */
  def selectResourceConfig(): Request[SelectResourceConfigResponse, AWSError] = js.native
  def selectResourceConfig(callback: js.Function2[/* err */ AWSError, /* data */ SelectResourceConfigResponse, Unit]): Request[SelectResourceConfigResponse, AWSError] = js.native
  /**
    * Accepts a structured query language (SQL) SELECT command, performs the corresponding search, and returns resource configurations matching the properties. For more information about query components, see the  Query Components  section in the Config Developer Guide.
    */
  def selectResourceConfig(params: SelectResourceConfigRequest): Request[SelectResourceConfigResponse, AWSError] = js.native
  def selectResourceConfig(
    params: SelectResourceConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SelectResourceConfigResponse, Unit]
  ): Request[SelectResourceConfigResponse, AWSError] = js.native
  
  /**
    * Runs an on-demand evaluation for the specified Config rules against the last known configuration state of the resources. Use StartConfigRulesEvaluation when you want to test that a rule you updated is working as expected. StartConfigRulesEvaluation does not re-record the latest configuration state for your resources. It re-runs an evaluation against the last known state of your resources.  You can specify up to 25 Config rules per request.  An existing StartConfigRulesEvaluation call for the specified rules must complete before you can call the API again. If you chose to have Config stream to an Amazon SNS topic, you will receive a ConfigRuleEvaluationStarted notification when the evaluation starts.  You don't need to call the StartConfigRulesEvaluation API to run an evaluation for a new rule. When you create a rule, Config evaluates your resources against the rule automatically.   The StartConfigRulesEvaluation API is useful if you want to run on-demand evaluations, such as the following example:   You have a custom rule that evaluates your IAM resources every 24 hours.   You update your Lambda function to add additional conditions to your rule.   Instead of waiting for the next periodic evaluation, you call the StartConfigRulesEvaluation API.   Config invokes your Lambda function and evaluates your IAM resources.   Your custom rule will still run periodic evaluations every 24 hours.  
    */
  def startConfigRulesEvaluation(): Request[StartConfigRulesEvaluationResponse, AWSError] = js.native
  def startConfigRulesEvaluation(callback: js.Function2[/* err */ AWSError, /* data */ StartConfigRulesEvaluationResponse, Unit]): Request[StartConfigRulesEvaluationResponse, AWSError] = js.native
  /**
    * Runs an on-demand evaluation for the specified Config rules against the last known configuration state of the resources. Use StartConfigRulesEvaluation when you want to test that a rule you updated is working as expected. StartConfigRulesEvaluation does not re-record the latest configuration state for your resources. It re-runs an evaluation against the last known state of your resources.  You can specify up to 25 Config rules per request.  An existing StartConfigRulesEvaluation call for the specified rules must complete before you can call the API again. If you chose to have Config stream to an Amazon SNS topic, you will receive a ConfigRuleEvaluationStarted notification when the evaluation starts.  You don't need to call the StartConfigRulesEvaluation API to run an evaluation for a new rule. When you create a rule, Config evaluates your resources against the rule automatically.   The StartConfigRulesEvaluation API is useful if you want to run on-demand evaluations, such as the following example:   You have a custom rule that evaluates your IAM resources every 24 hours.   You update your Lambda function to add additional conditions to your rule.   Instead of waiting for the next periodic evaluation, you call the StartConfigRulesEvaluation API.   Config invokes your Lambda function and evaluates your IAM resources.   Your custom rule will still run periodic evaluations every 24 hours.  
    */
  def startConfigRulesEvaluation(params: StartConfigRulesEvaluationRequest): Request[StartConfigRulesEvaluationResponse, AWSError] = js.native
  def startConfigRulesEvaluation(
    params: StartConfigRulesEvaluationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartConfigRulesEvaluationResponse, Unit]
  ): Request[StartConfigRulesEvaluationResponse, AWSError] = js.native
  
  /**
    * Starts recording configurations of the Amazon Web Services resources you have selected to record in your Amazon Web Services account. You must have created at least one delivery channel to successfully start the configuration recorder.
    */
  def startConfigurationRecorder(): Request[js.Object, AWSError] = js.native
  def startConfigurationRecorder(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Starts recording configurations of the Amazon Web Services resources you have selected to record in your Amazon Web Services account. You must have created at least one delivery channel to successfully start the configuration recorder.
    */
  def startConfigurationRecorder(params: StartConfigurationRecorderRequest): Request[js.Object, AWSError] = js.native
  def startConfigurationRecorder(
    params: StartConfigurationRecorderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Runs an on-demand remediation for the specified Config rules against the last known remediation configuration. It runs an execution against the current state of your resources. Remediation execution is asynchronous. You can specify up to 100 resource keys per request. An existing StartRemediationExecution call for the specified resource keys must complete before you can call the API again.
    */
  def startRemediationExecution(): Request[StartRemediationExecutionResponse, AWSError] = js.native
  def startRemediationExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartRemediationExecutionResponse, Unit]): Request[StartRemediationExecutionResponse, AWSError] = js.native
  /**
    * Runs an on-demand remediation for the specified Config rules against the last known remediation configuration. It runs an execution against the current state of your resources. Remediation execution is asynchronous. You can specify up to 100 resource keys per request. An existing StartRemediationExecution call for the specified resource keys must complete before you can call the API again.
    */
  def startRemediationExecution(params: StartRemediationExecutionRequest): Request[StartRemediationExecutionResponse, AWSError] = js.native
  def startRemediationExecution(
    params: StartRemediationExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartRemediationExecutionResponse, Unit]
  ): Request[StartRemediationExecutionResponse, AWSError] = js.native
  
  /**
    * Stops recording configurations of the Amazon Web Services resources you have selected to record in your Amazon Web Services account.
    */
  def stopConfigurationRecorder(): Request[js.Object, AWSError] = js.native
  def stopConfigurationRecorder(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops recording configurations of the Amazon Web Services resources you have selected to record in your Amazon Web Services account.
    */
  def stopConfigurationRecorder(params: StopConfigurationRecorderRequest): Request[js.Object, AWSError] = js.native
  def stopConfigurationRecorder(
    params: StopConfigurationRecorderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}

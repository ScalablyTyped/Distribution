package typings.awsSdk.computeoptimizerMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeOptimizer extends Service {
  @JSName("config")
  var config_ComputeOptimizer: ConfigBase with ClientConfiguration = js.native
  /**
    * Returns Auto Scaling group recommendations. AWS Compute Optimizer currently generates recommendations for Auto Scaling groups that are configured to run instances of the M, C, R, T, and X instance families. The service does not generate recommendations for Auto Scaling groups that have a scaling policy attached to them, or that do not have the same values for desired, minimum, and maximum capacity. In order for Compute Optimizer to analyze your Auto Scaling groups, they must be of a fixed size. For more information, see the AWS Compute Optimizer User Guide.
    */
  def getAutoScalingGroupRecommendations(): Request[GetAutoScalingGroupRecommendationsResponse, AWSError] = js.native
  def getAutoScalingGroupRecommendations(
    callback: js.Function2[/* err */ AWSError, /* data */ GetAutoScalingGroupRecommendationsResponse, Unit]
  ): Request[GetAutoScalingGroupRecommendationsResponse, AWSError] = js.native
  /**
    * Returns Auto Scaling group recommendations. AWS Compute Optimizer currently generates recommendations for Auto Scaling groups that are configured to run instances of the M, C, R, T, and X instance families. The service does not generate recommendations for Auto Scaling groups that have a scaling policy attached to them, or that do not have the same values for desired, minimum, and maximum capacity. In order for Compute Optimizer to analyze your Auto Scaling groups, they must be of a fixed size. For more information, see the AWS Compute Optimizer User Guide.
    */
  def getAutoScalingGroupRecommendations(params: GetAutoScalingGroupRecommendationsRequest): Request[GetAutoScalingGroupRecommendationsResponse, AWSError] = js.native
  def getAutoScalingGroupRecommendations(
    params: GetAutoScalingGroupRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAutoScalingGroupRecommendationsResponse, Unit]
  ): Request[GetAutoScalingGroupRecommendationsResponse, AWSError] = js.native
  /**
    * Returns Amazon EC2 instance recommendations. AWS Compute Optimizer currently generates recommendations for Amazon Elastic Compute Cloud (Amazon EC2) and Amazon EC2 Auto Scaling. It generates recommendations for M, C, R, T, and X instance families. For more information, see the AWS Compute Optimizer User Guide.
    */
  def getEC2InstanceRecommendations(): Request[GetEC2InstanceRecommendationsResponse, AWSError] = js.native
  def getEC2InstanceRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ GetEC2InstanceRecommendationsResponse, Unit]): Request[GetEC2InstanceRecommendationsResponse, AWSError] = js.native
  /**
    * Returns Amazon EC2 instance recommendations. AWS Compute Optimizer currently generates recommendations for Amazon Elastic Compute Cloud (Amazon EC2) and Amazon EC2 Auto Scaling. It generates recommendations for M, C, R, T, and X instance families. For more information, see the AWS Compute Optimizer User Guide.
    */
  def getEC2InstanceRecommendations(params: GetEC2InstanceRecommendationsRequest): Request[GetEC2InstanceRecommendationsResponse, AWSError] = js.native
  def getEC2InstanceRecommendations(
    params: GetEC2InstanceRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEC2InstanceRecommendationsResponse, Unit]
  ): Request[GetEC2InstanceRecommendationsResponse, AWSError] = js.native
  /**
    * Returns the projected utilization metrics of Amazon EC2 instance recommendations.
    */
  def getEC2RecommendationProjectedMetrics(): Request[GetEC2RecommendationProjectedMetricsResponse, AWSError] = js.native
  def getEC2RecommendationProjectedMetrics(
    callback: js.Function2[/* err */ AWSError, /* data */ GetEC2RecommendationProjectedMetricsResponse, Unit]
  ): Request[GetEC2RecommendationProjectedMetricsResponse, AWSError] = js.native
  /**
    * Returns the projected utilization metrics of Amazon EC2 instance recommendations.
    */
  def getEC2RecommendationProjectedMetrics(params: GetEC2RecommendationProjectedMetricsRequest): Request[GetEC2RecommendationProjectedMetricsResponse, AWSError] = js.native
  def getEC2RecommendationProjectedMetrics(
    params: GetEC2RecommendationProjectedMetricsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEC2RecommendationProjectedMetricsResponse, Unit]
  ): Request[GetEC2RecommendationProjectedMetricsResponse, AWSError] = js.native
  /**
    * Returns the enrollment (opt in) status of an account to the AWS Compute Optimizer service. If the account is a master account of an organization, this operation also confirms the enrollment status of member accounts within the organization.
    */
  def getEnrollmentStatus(): Request[GetEnrollmentStatusResponse, AWSError] = js.native
  def getEnrollmentStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetEnrollmentStatusResponse, Unit]): Request[GetEnrollmentStatusResponse, AWSError] = js.native
  /**
    * Returns the enrollment (opt in) status of an account to the AWS Compute Optimizer service. If the account is a master account of an organization, this operation also confirms the enrollment status of member accounts within the organization.
    */
  def getEnrollmentStatus(params: GetEnrollmentStatusRequest): Request[GetEnrollmentStatusResponse, AWSError] = js.native
  def getEnrollmentStatus(
    params: GetEnrollmentStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnrollmentStatusResponse, Unit]
  ): Request[GetEnrollmentStatusResponse, AWSError] = js.native
  /**
    * Returns the optimization findings for an account. For example, it returns the number of Amazon EC2 instances in an account that are under-provisioned, over-provisioned, or optimized. It also returns the number of Auto Scaling groups in an account that are not optimized, or optimized.
    */
  def getRecommendationSummaries(): Request[GetRecommendationSummariesResponse, AWSError] = js.native
  def getRecommendationSummaries(callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationSummariesResponse, Unit]): Request[GetRecommendationSummariesResponse, AWSError] = js.native
  /**
    * Returns the optimization findings for an account. For example, it returns the number of Amazon EC2 instances in an account that are under-provisioned, over-provisioned, or optimized. It also returns the number of Auto Scaling groups in an account that are not optimized, or optimized.
    */
  def getRecommendationSummaries(params: GetRecommendationSummariesRequest): Request[GetRecommendationSummariesResponse, AWSError] = js.native
  def getRecommendationSummaries(
    params: GetRecommendationSummariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationSummariesResponse, Unit]
  ): Request[GetRecommendationSummariesResponse, AWSError] = js.native
  /**
    * Updates the enrollment (opt in) status of an account to the AWS Compute Optimizer service. If the account is a master account of an organization, this operation can also enroll member accounts within the organization.
    */
  def updateEnrollmentStatus(): Request[UpdateEnrollmentStatusResponse, AWSError] = js.native
  def updateEnrollmentStatus(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnrollmentStatusResponse, Unit]): Request[UpdateEnrollmentStatusResponse, AWSError] = js.native
  /**
    * Updates the enrollment (opt in) status of an account to the AWS Compute Optimizer service. If the account is a master account of an organization, this operation can also enroll member accounts within the organization.
    */
  def updateEnrollmentStatus(params: UpdateEnrollmentStatusRequest): Request[UpdateEnrollmentStatusResponse, AWSError] = js.native
  def updateEnrollmentStatus(
    params: UpdateEnrollmentStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnrollmentStatusResponse, Unit]
  ): Request[UpdateEnrollmentStatusResponse, AWSError] = js.native
}


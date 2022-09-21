package typings.awsSdk.cloud9Mod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cloud9 extends Service {
  
  @JSName("config")
  var config_Cloud9: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance, and then connects from the instance to the environment.
    */
  def createEnvironmentEC2(): Request[CreateEnvironmentEC2Result, AWSError] = js.native
  def createEnvironmentEC2(callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentEC2Result, Unit]): Request[CreateEnvironmentEC2Result, AWSError] = js.native
  /**
    * Creates an Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance, and then connects from the instance to the environment.
    */
  def createEnvironmentEC2(params: CreateEnvironmentEC2Request): Request[CreateEnvironmentEC2Result, AWSError] = js.native
  def createEnvironmentEC2(
    params: CreateEnvironmentEC2Request,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentEC2Result, Unit]
  ): Request[CreateEnvironmentEC2Result, AWSError] = js.native
  
  /**
    * Adds an environment member to an Cloud9 development environment.
    */
  def createEnvironmentMembership(): Request[CreateEnvironmentMembershipResult, AWSError] = js.native
  def createEnvironmentMembership(callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentMembershipResult, Unit]): Request[CreateEnvironmentMembershipResult, AWSError] = js.native
  /**
    * Adds an environment member to an Cloud9 development environment.
    */
  def createEnvironmentMembership(params: CreateEnvironmentMembershipRequest): Request[CreateEnvironmentMembershipResult, AWSError] = js.native
  def createEnvironmentMembership(
    params: CreateEnvironmentMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentMembershipResult, Unit]
  ): Request[CreateEnvironmentMembershipResult, AWSError] = js.native
  
  /**
    * Deletes an Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also terminates the instance.
    */
  def deleteEnvironment(): Request[DeleteEnvironmentResult, AWSError] = js.native
  def deleteEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentResult, Unit]): Request[DeleteEnvironmentResult, AWSError] = js.native
  /**
    * Deletes an Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also terminates the instance.
    */
  def deleteEnvironment(params: DeleteEnvironmentRequest): Request[DeleteEnvironmentResult, AWSError] = js.native
  def deleteEnvironment(
    params: DeleteEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentResult, Unit]
  ): Request[DeleteEnvironmentResult, AWSError] = js.native
  
  /**
    * Deletes an environment member from an Cloud9 development environment.
    */
  def deleteEnvironmentMembership(): Request[DeleteEnvironmentMembershipResult, AWSError] = js.native
  def deleteEnvironmentMembership(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentMembershipResult, Unit]): Request[DeleteEnvironmentMembershipResult, AWSError] = js.native
  /**
    * Deletes an environment member from an Cloud9 development environment.
    */
  def deleteEnvironmentMembership(params: DeleteEnvironmentMembershipRequest): Request[DeleteEnvironmentMembershipResult, AWSError] = js.native
  def deleteEnvironmentMembership(
    params: DeleteEnvironmentMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentMembershipResult, Unit]
  ): Request[DeleteEnvironmentMembershipResult, AWSError] = js.native
  
  /**
    * Gets information about environment members for an Cloud9 development environment.
    */
  def describeEnvironmentMemberships(): Request[DescribeEnvironmentMembershipsResult, AWSError] = js.native
  def describeEnvironmentMemberships(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEnvironmentMembershipsResult, Unit]): Request[DescribeEnvironmentMembershipsResult, AWSError] = js.native
  /**
    * Gets information about environment members for an Cloud9 development environment.
    */
  def describeEnvironmentMemberships(params: DescribeEnvironmentMembershipsRequest): Request[DescribeEnvironmentMembershipsResult, AWSError] = js.native
  def describeEnvironmentMemberships(
    params: DescribeEnvironmentMembershipsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEnvironmentMembershipsResult, Unit]
  ): Request[DescribeEnvironmentMembershipsResult, AWSError] = js.native
  
  /**
    * Gets status information for an Cloud9 development environment.
    */
  def describeEnvironmentStatus(): Request[DescribeEnvironmentStatusResult, AWSError] = js.native
  def describeEnvironmentStatus(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEnvironmentStatusResult, Unit]): Request[DescribeEnvironmentStatusResult, AWSError] = js.native
  /**
    * Gets status information for an Cloud9 development environment.
    */
  def describeEnvironmentStatus(params: DescribeEnvironmentStatusRequest): Request[DescribeEnvironmentStatusResult, AWSError] = js.native
  def describeEnvironmentStatus(
    params: DescribeEnvironmentStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEnvironmentStatusResult, Unit]
  ): Request[DescribeEnvironmentStatusResult, AWSError] = js.native
  
  /**
    * Gets information about Cloud9 development environments.
    */
  def describeEnvironments(): Request[DescribeEnvironmentsResult, AWSError] = js.native
  def describeEnvironments(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEnvironmentsResult, Unit]): Request[DescribeEnvironmentsResult, AWSError] = js.native
  /**
    * Gets information about Cloud9 development environments.
    */
  def describeEnvironments(params: DescribeEnvironmentsRequest): Request[DescribeEnvironmentsResult, AWSError] = js.native
  def describeEnvironments(
    params: DescribeEnvironmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEnvironmentsResult, Unit]
  ): Request[DescribeEnvironmentsResult, AWSError] = js.native
  
  /**
    * Gets a list of Cloud9 development environment identifiers.
    */
  def listEnvironments(): Request[ListEnvironmentsResult, AWSError] = js.native
  def listEnvironments(callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentsResult, Unit]): Request[ListEnvironmentsResult, AWSError] = js.native
  /**
    * Gets a list of Cloud9 development environment identifiers.
    */
  def listEnvironments(params: ListEnvironmentsRequest): Request[ListEnvironmentsResult, AWSError] = js.native
  def listEnvironments(
    params: ListEnvironmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentsResult, Unit]
  ): Request[ListEnvironmentsResult, AWSError] = js.native
  
  /**
    * Gets a list of the tags associated with an Cloud9 development environment.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Gets a list of the tags associated with an Cloud9 development environment.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Adds tags to an Cloud9 development environment.  Tags that you add to an Cloud9 environment by using this method will NOT be automatically propagated to underlying resources. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds tags to an Cloud9 development environment.  Tags that you add to an Cloud9 environment by using this method will NOT be automatically propagated to underlying resources. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from an Cloud9 development environment.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from an Cloud9 development environment.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Changes the settings of an existing Cloud9 development environment.
    */
  def updateEnvironment(): Request[UpdateEnvironmentResult, AWSError] = js.native
  def updateEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentResult, Unit]): Request[UpdateEnvironmentResult, AWSError] = js.native
  /**
    * Changes the settings of an existing Cloud9 development environment.
    */
  def updateEnvironment(params: UpdateEnvironmentRequest): Request[UpdateEnvironmentResult, AWSError] = js.native
  def updateEnvironment(
    params: UpdateEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentResult, Unit]
  ): Request[UpdateEnvironmentResult, AWSError] = js.native
  
  /**
    * Changes the settings of an existing environment member for an Cloud9 development environment.
    */
  def updateEnvironmentMembership(): Request[UpdateEnvironmentMembershipResult, AWSError] = js.native
  def updateEnvironmentMembership(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentMembershipResult, Unit]): Request[UpdateEnvironmentMembershipResult, AWSError] = js.native
  /**
    * Changes the settings of an existing environment member for an Cloud9 development environment.
    */
  def updateEnvironmentMembership(params: UpdateEnvironmentMembershipRequest): Request[UpdateEnvironmentMembershipResult, AWSError] = js.native
  def updateEnvironmentMembership(
    params: UpdateEnvironmentMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentMembershipResult, Unit]
  ): Request[UpdateEnvironmentMembershipResult, AWSError] = js.native
}

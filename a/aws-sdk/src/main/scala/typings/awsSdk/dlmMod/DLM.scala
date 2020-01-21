package typings.awsSdk.dlmMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DLM extends Service {
  @JSName("config")
  var config_DLM: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a policy to manage the lifecycle of the specified AWS resources. You can create up to 100 lifecycle policies.
    */
  def createLifecyclePolicy(): Request[CreateLifecyclePolicyResponse, AWSError] = js.native
  def createLifecyclePolicy(callback: js.Function2[/* err */ AWSError, /* data */ CreateLifecyclePolicyResponse, Unit]): Request[CreateLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Creates a policy to manage the lifecycle of the specified AWS resources. You can create up to 100 lifecycle policies.
    */
  def createLifecyclePolicy(params: CreateLifecyclePolicyRequest): Request[CreateLifecyclePolicyResponse, AWSError] = js.native
  def createLifecyclePolicy(
    params: CreateLifecyclePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLifecyclePolicyResponse, Unit]
  ): Request[CreateLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Deletes the specified lifecycle policy and halts the automated operations that the policy specified.
    */
  def deleteLifecyclePolicy(): Request[DeleteLifecyclePolicyResponse, AWSError] = js.native
  def deleteLifecyclePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLifecyclePolicyResponse, Unit]): Request[DeleteLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Deletes the specified lifecycle policy and halts the automated operations that the policy specified.
    */
  def deleteLifecyclePolicy(params: DeleteLifecyclePolicyRequest): Request[DeleteLifecyclePolicyResponse, AWSError] = js.native
  def deleteLifecyclePolicy(
    params: DeleteLifecyclePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLifecyclePolicyResponse, Unit]
  ): Request[DeleteLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Gets summary information about all or the specified data lifecycle policies. To get complete information about a policy, use GetLifecyclePolicy.
    */
  def getLifecyclePolicies(): Request[GetLifecyclePoliciesResponse, AWSError] = js.native
  def getLifecyclePolicies(callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePoliciesResponse, Unit]): Request[GetLifecyclePoliciesResponse, AWSError] = js.native
  /**
    * Gets summary information about all or the specified data lifecycle policies. To get complete information about a policy, use GetLifecyclePolicy.
    */
  def getLifecyclePolicies(params: GetLifecyclePoliciesRequest): Request[GetLifecyclePoliciesResponse, AWSError] = js.native
  def getLifecyclePolicies(
    params: GetLifecyclePoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePoliciesResponse, Unit]
  ): Request[GetLifecyclePoliciesResponse, AWSError] = js.native
  /**
    * Gets detailed information about the specified lifecycle policy.
    */
  def getLifecyclePolicy(): Request[GetLifecyclePolicyResponse, AWSError] = js.native
  def getLifecyclePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePolicyResponse, Unit]): Request[GetLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Gets detailed information about the specified lifecycle policy.
    */
  def getLifecyclePolicy(params: GetLifecyclePolicyRequest): Request[GetLifecyclePolicyResponse, AWSError] = js.native
  def getLifecyclePolicy(
    params: GetLifecyclePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePolicyResponse, Unit]
  ): Request[GetLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates the specified lifecycle policy.
    */
  def updateLifecyclePolicy(): Request[UpdateLifecyclePolicyResponse, AWSError] = js.native
  def updateLifecyclePolicy(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLifecyclePolicyResponse, Unit]): Request[UpdateLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Updates the specified lifecycle policy.
    */
  def updateLifecyclePolicy(params: UpdateLifecyclePolicyRequest): Request[UpdateLifecyclePolicyResponse, AWSError] = js.native
  def updateLifecyclePolicy(
    params: UpdateLifecyclePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLifecyclePolicyResponse, Unit]
  ): Request[UpdateLifecyclePolicyResponse, AWSError] = js.native
}


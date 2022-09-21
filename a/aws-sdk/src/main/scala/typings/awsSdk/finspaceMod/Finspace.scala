package typings.awsSdk.finspaceMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Finspace extends Service {
  
  @JSName("config")
  var config_Finspace: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Create a new FinSpace environment.
    */
  def createEnvironment(): Request[CreateEnvironmentResponse, AWSError] = js.native
  def createEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentResponse, Unit]): Request[CreateEnvironmentResponse, AWSError] = js.native
  /**
    * Create a new FinSpace environment.
    */
  def createEnvironment(params: CreateEnvironmentRequest): Request[CreateEnvironmentResponse, AWSError] = js.native
  def createEnvironment(
    params: CreateEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEnvironmentResponse, Unit]
  ): Request[CreateEnvironmentResponse, AWSError] = js.native
  
  /**
    * Delete an FinSpace environment.
    */
  def deleteEnvironment(): Request[DeleteEnvironmentResponse, AWSError] = js.native
  def deleteEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentResponse, Unit]): Request[DeleteEnvironmentResponse, AWSError] = js.native
  /**
    * Delete an FinSpace environment.
    */
  def deleteEnvironment(params: DeleteEnvironmentRequest): Request[DeleteEnvironmentResponse, AWSError] = js.native
  def deleteEnvironment(
    params: DeleteEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEnvironmentResponse, Unit]
  ): Request[DeleteEnvironmentResponse, AWSError] = js.native
  
  /**
    * Returns the FinSpace environment object.
    */
  def getEnvironment(): Request[GetEnvironmentResponse, AWSError] = js.native
  def getEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentResponse, Unit]): Request[GetEnvironmentResponse, AWSError] = js.native
  /**
    * Returns the FinSpace environment object.
    */
  def getEnvironment(params: GetEnvironmentRequest): Request[GetEnvironmentResponse, AWSError] = js.native
  def getEnvironment(
    params: GetEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEnvironmentResponse, Unit]
  ): Request[GetEnvironmentResponse, AWSError] = js.native
  
  /**
    * A list of all of your FinSpace environments.
    */
  def listEnvironments(): Request[ListEnvironmentsResponse, AWSError] = js.native
  def listEnvironments(callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentsResponse, Unit]): Request[ListEnvironmentsResponse, AWSError] = js.native
  /**
    * A list of all of your FinSpace environments.
    */
  def listEnvironments(params: ListEnvironmentsRequest): Request[ListEnvironmentsResponse, AWSError] = js.native
  def listEnvironments(
    params: ListEnvironmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEnvironmentsResponse, Unit]
  ): Request[ListEnvironmentsResponse, AWSError] = js.native
  
  /**
    * A list of all tags for a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * A list of all tags for a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Adds metadata tags to a FinSpace resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds metadata tags to a FinSpace resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes metadata tags from a FinSpace resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes metadata tags from a FinSpace resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Update your FinSpace environment.
    */
  def updateEnvironment(): Request[UpdateEnvironmentResponse, AWSError] = js.native
  def updateEnvironment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentResponse, Unit]): Request[UpdateEnvironmentResponse, AWSError] = js.native
  /**
    * Update your FinSpace environment.
    */
  def updateEnvironment(params: UpdateEnvironmentRequest): Request[UpdateEnvironmentResponse, AWSError] = js.native
  def updateEnvironment(
    params: UpdateEnvironmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEnvironmentResponse, Unit]
  ): Request[UpdateEnvironmentResponse, AWSError] = js.native
}

package typings.awsSdk.mqMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MQ extends Service {
  
  @JSName("config")
  var config_MQ: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a broker. Note: This API is asynchronous.
    */
  def createBroker(): Request[CreateBrokerResponse, AWSError] = js.native
  def createBroker(callback: js.Function2[/* err */ AWSError, /* data */ CreateBrokerResponse, Unit]): Request[CreateBrokerResponse, AWSError] = js.native
  /**
    * Creates a broker. Note: This API is asynchronous.
    */
  def createBroker(params: CreateBrokerRequest): Request[CreateBrokerResponse, AWSError] = js.native
  def createBroker(
    params: CreateBrokerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBrokerResponse, Unit]
  ): Request[CreateBrokerResponse, AWSError] = js.native
  
  /**
    * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version).
    */
  def createConfiguration(): Request[CreateConfigurationResponse, AWSError] = js.native
  def createConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationResponse, Unit]): Request[CreateConfigurationResponse, AWSError] = js.native
  /**
    * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version).
    */
  def createConfiguration(params: CreateConfigurationRequest): Request[CreateConfigurationResponse, AWSError] = js.native
  def createConfiguration(
    params: CreateConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConfigurationResponse, Unit]
  ): Request[CreateConfigurationResponse, AWSError] = js.native
  
  /**
    * Add a tag to a resource.
    */
  def createTags(): Request[js.Object, AWSError] = js.native
  def createTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Add a tag to a resource.
    */
  def createTags(params: CreateTagsRequest): Request[js.Object, AWSError] = js.native
  def createTags(params: CreateTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates an ActiveMQ user.
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates an ActiveMQ user.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  
  /**
    * Deletes a broker. Note: This API is asynchronous.
    */
  def deleteBroker(): Request[DeleteBrokerResponse, AWSError] = js.native
  def deleteBroker(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBrokerResponse, Unit]): Request[DeleteBrokerResponse, AWSError] = js.native
  /**
    * Deletes a broker. Note: This API is asynchronous.
    */
  def deleteBroker(params: DeleteBrokerRequest): Request[DeleteBrokerResponse, AWSError] = js.native
  def deleteBroker(
    params: DeleteBrokerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBrokerResponse, Unit]
  ): Request[DeleteBrokerResponse, AWSError] = js.native
  
  /**
    * Removes a tag from a resource.
    */
  def deleteTags(): Request[js.Object, AWSError] = js.native
  def deleteTags(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a tag from a resource.
    */
  def deleteTags(params: DeleteTagsRequest): Request[js.Object, AWSError] = js.native
  def deleteTags(params: DeleteTagsRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an ActiveMQ user.
    */
  def deleteUser(): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]): Request[DeleteUserResponse, AWSError] = js.native
  /**
    * Deletes an ActiveMQ user.
    */
  def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]
  ): Request[DeleteUserResponse, AWSError] = js.native
  
  /**
    * Returns information about the specified broker.
    */
  def describeBroker(): Request[DescribeBrokerResponse, AWSError] = js.native
  def describeBroker(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBrokerResponse, Unit]): Request[DescribeBrokerResponse, AWSError] = js.native
  /**
    * Returns information about the specified broker.
    */
  def describeBroker(params: DescribeBrokerRequest): Request[DescribeBrokerResponse, AWSError] = js.native
  def describeBroker(
    params: DescribeBrokerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBrokerResponse, Unit]
  ): Request[DescribeBrokerResponse, AWSError] = js.native
  
  /**
    * Describe available engine types and versions.
    */
  def describeBrokerEngineTypes(): Request[DescribeBrokerEngineTypesResponse, AWSError] = js.native
  def describeBrokerEngineTypes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBrokerEngineTypesResponse, Unit]): Request[DescribeBrokerEngineTypesResponse, AWSError] = js.native
  /**
    * Describe available engine types and versions.
    */
  def describeBrokerEngineTypes(params: DescribeBrokerEngineTypesRequest): Request[DescribeBrokerEngineTypesResponse, AWSError] = js.native
  def describeBrokerEngineTypes(
    params: DescribeBrokerEngineTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBrokerEngineTypesResponse, Unit]
  ): Request[DescribeBrokerEngineTypesResponse, AWSError] = js.native
  
  /**
    * Describe available broker instance options.
    */
  def describeBrokerInstanceOptions(): Request[DescribeBrokerInstanceOptionsResponse, AWSError] = js.native
  def describeBrokerInstanceOptions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBrokerInstanceOptionsResponse, Unit]): Request[DescribeBrokerInstanceOptionsResponse, AWSError] = js.native
  /**
    * Describe available broker instance options.
    */
  def describeBrokerInstanceOptions(params: DescribeBrokerInstanceOptionsRequest): Request[DescribeBrokerInstanceOptionsResponse, AWSError] = js.native
  def describeBrokerInstanceOptions(
    params: DescribeBrokerInstanceOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBrokerInstanceOptionsResponse, Unit]
  ): Request[DescribeBrokerInstanceOptionsResponse, AWSError] = js.native
  
  /**
    * Returns information about the specified configuration.
    */
  def describeConfiguration(): Request[DescribeConfigurationResponse, AWSError] = js.native
  def describeConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationResponse, Unit]): Request[DescribeConfigurationResponse, AWSError] = js.native
  /**
    * Returns information about the specified configuration.
    */
  def describeConfiguration(params: DescribeConfigurationRequest): Request[DescribeConfigurationResponse, AWSError] = js.native
  def describeConfiguration(
    params: DescribeConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationResponse, Unit]
  ): Request[DescribeConfigurationResponse, AWSError] = js.native
  
  /**
    * Returns the specified configuration revision for the specified configuration.
    */
  def describeConfigurationRevision(): Request[DescribeConfigurationRevisionResponse, AWSError] = js.native
  def describeConfigurationRevision(callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationRevisionResponse, Unit]): Request[DescribeConfigurationRevisionResponse, AWSError] = js.native
  /**
    * Returns the specified configuration revision for the specified configuration.
    */
  def describeConfigurationRevision(params: DescribeConfigurationRevisionRequest): Request[DescribeConfigurationRevisionResponse, AWSError] = js.native
  def describeConfigurationRevision(
    params: DescribeConfigurationRevisionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeConfigurationRevisionResponse, Unit]
  ): Request[DescribeConfigurationRevisionResponse, AWSError] = js.native
  
  /**
    * Returns information about an ActiveMQ user.
    */
  def describeUser(): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Returns information about an ActiveMQ user.
    */
  def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]
  ): Request[DescribeUserResponse, AWSError] = js.native
  
  /**
    * Returns a list of all brokers.
    */
  def listBrokers(): Request[ListBrokersResponse, AWSError] = js.native
  def listBrokers(callback: js.Function2[/* err */ AWSError, /* data */ ListBrokersResponse, Unit]): Request[ListBrokersResponse, AWSError] = js.native
  /**
    * Returns a list of all brokers.
    */
  def listBrokers(params: ListBrokersRequest): Request[ListBrokersResponse, AWSError] = js.native
  def listBrokers(
    params: ListBrokersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBrokersResponse, Unit]
  ): Request[ListBrokersResponse, AWSError] = js.native
  
  /**
    * Returns a list of all revisions for the specified configuration.
    */
  def listConfigurationRevisions(): Request[ListConfigurationRevisionsResponse, AWSError] = js.native
  def listConfigurationRevisions(callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationRevisionsResponse, Unit]): Request[ListConfigurationRevisionsResponse, AWSError] = js.native
  /**
    * Returns a list of all revisions for the specified configuration.
    */
  def listConfigurationRevisions(params: ListConfigurationRevisionsRequest): Request[ListConfigurationRevisionsResponse, AWSError] = js.native
  def listConfigurationRevisions(
    params: ListConfigurationRevisionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationRevisionsResponse, Unit]
  ): Request[ListConfigurationRevisionsResponse, AWSError] = js.native
  
  /**
    * Returns a list of all configurations.
    */
  def listConfigurations(): Request[ListConfigurationsResponse, AWSError] = js.native
  def listConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationsResponse, Unit]): Request[ListConfigurationsResponse, AWSError] = js.native
  /**
    * Returns a list of all configurations.
    */
  def listConfigurations(params: ListConfigurationsRequest): Request[ListConfigurationsResponse, AWSError] = js.native
  def listConfigurations(
    params: ListConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConfigurationsResponse, Unit]
  ): Request[ListConfigurationsResponse, AWSError] = js.native
  
  /**
    * Lists tags for a resource.
    */
  def listTags(): Request[ListTagsResponse, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]): Request[ListTagsResponse, AWSError] = js.native
  /**
    * Lists tags for a resource.
    */
  def listTags(params: ListTagsRequest): Request[ListTagsResponse, AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]
  ): Request[ListTagsResponse, AWSError] = js.native
  
  /**
    * Returns a list of all ActiveMQ users.
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Returns a list of all ActiveMQ users.
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  
  /**
    * Reboots a broker. Note: This API is asynchronous.
    */
  def rebootBroker(): Request[RebootBrokerResponse, AWSError] = js.native
  def rebootBroker(callback: js.Function2[/* err */ AWSError, /* data */ RebootBrokerResponse, Unit]): Request[RebootBrokerResponse, AWSError] = js.native
  /**
    * Reboots a broker. Note: This API is asynchronous.
    */
  def rebootBroker(params: RebootBrokerRequest): Request[RebootBrokerResponse, AWSError] = js.native
  def rebootBroker(
    params: RebootBrokerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RebootBrokerResponse, Unit]
  ): Request[RebootBrokerResponse, AWSError] = js.native
  
  /**
    * Adds a pending configuration change to a broker.
    */
  def updateBroker(): Request[UpdateBrokerResponse, AWSError] = js.native
  def updateBroker(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBrokerResponse, Unit]): Request[UpdateBrokerResponse, AWSError] = js.native
  /**
    * Adds a pending configuration change to a broker.
    */
  def updateBroker(params: UpdateBrokerRequest): Request[UpdateBrokerResponse, AWSError] = js.native
  def updateBroker(
    params: UpdateBrokerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBrokerResponse, Unit]
  ): Request[UpdateBrokerResponse, AWSError] = js.native
  
  /**
    * Updates the specified configuration.
    */
  def updateConfiguration(): Request[UpdateConfigurationResponse, AWSError] = js.native
  def updateConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfigurationResponse, Unit]): Request[UpdateConfigurationResponse, AWSError] = js.native
  /**
    * Updates the specified configuration.
    */
  def updateConfiguration(params: UpdateConfigurationRequest): Request[UpdateConfigurationResponse, AWSError] = js.native
  def updateConfiguration(
    params: UpdateConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConfigurationResponse, Unit]
  ): Request[UpdateConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates the information for an ActiveMQ user.
    */
  def updateUser(): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]): Request[UpdateUserResponse, AWSError] = js.native
  /**
    * Updates the information for an ActiveMQ user.
    */
  def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(
    params: UpdateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]
  ): Request[UpdateUserResponse, AWSError] = js.native
}

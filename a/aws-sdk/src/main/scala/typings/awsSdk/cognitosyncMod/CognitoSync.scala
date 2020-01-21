package typings.awsSdk.cognitosyncMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoSync extends Service {
  @JSName("config")
  var config_CognitoSync: ConfigBase with ClientConfiguration = js.native
  /**
    * Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see the status of the request via the GetBulkPublishDetails operation. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def bulkPublish(): Request[BulkPublishResponse, AWSError] = js.native
  def bulkPublish(callback: js.Function2[/* err */ AWSError, /* data */ BulkPublishResponse, Unit]): Request[BulkPublishResponse, AWSError] = js.native
  /**
    * Initiates a bulk publish of all existing datasets for an Identity Pool to the configured stream. Customers are limited to one successful bulk publish per 24 hours. Bulk publish is an asynchronous request, customers can see the status of the request via the GetBulkPublishDetails operation. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def bulkPublish(params: BulkPublishRequest): Request[BulkPublishResponse, AWSError] = js.native
  def bulkPublish(
    params: BulkPublishRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BulkPublishResponse, Unit]
  ): Request[BulkPublishResponse, AWSError] = js.native
  /**
    * Deletes the specific dataset. The dataset will be deleted permanently, and the action can't be undone. Datasets that this dataset was merged with will no longer report the merge. Any subsequent operation on this dataset will result in a ResourceNotFoundException. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
    */
  def deleteDataset(): Request[DeleteDatasetResponse, AWSError] = js.native
  def deleteDataset(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatasetResponse, Unit]): Request[DeleteDatasetResponse, AWSError] = js.native
  /**
    * Deletes the specific dataset. The dataset will be deleted permanently, and the action can't be undone. Datasets that this dataset was merged with will no longer report the merge. Any subsequent operation on this dataset will result in a ResourceNotFoundException. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
    */
  def deleteDataset(params: DeleteDatasetRequest): Request[DeleteDatasetResponse, AWSError] = js.native
  def deleteDataset(
    params: DeleteDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatasetResponse, Unit]
  ): Request[DeleteDatasetResponse, AWSError] = js.native
  /**
    * Gets meta data about a dataset by identity and dataset name. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
    */
  def describeDataset(): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]): Request[DescribeDatasetResponse, AWSError] = js.native
  /**
    * Gets meta data about a dataset by identity and dataset name. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
    */
  def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(
    params: DescribeDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]
  ): Request[DescribeDatasetResponse, AWSError] = js.native
  /**
    * Gets usage details (for example, data storage) about a particular identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def describeIdentityPoolUsage(): Request[DescribeIdentityPoolUsageResponse, AWSError] = js.native
  def describeIdentityPoolUsage(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIdentityPoolUsageResponse, Unit]): Request[DescribeIdentityPoolUsageResponse, AWSError] = js.native
  /**
    * Gets usage details (for example, data storage) about a particular identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def describeIdentityPoolUsage(params: DescribeIdentityPoolUsageRequest): Request[DescribeIdentityPoolUsageResponse, AWSError] = js.native
  def describeIdentityPoolUsage(
    params: DescribeIdentityPoolUsageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIdentityPoolUsageResponse, Unit]
  ): Request[DescribeIdentityPoolUsageResponse, AWSError] = js.native
  /**
    * Gets usage information for an identity, including number of datasets and data usage. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
    */
  def describeIdentityUsage(): Request[DescribeIdentityUsageResponse, AWSError] = js.native
  def describeIdentityUsage(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIdentityUsageResponse, Unit]): Request[DescribeIdentityUsageResponse, AWSError] = js.native
  /**
    * Gets usage information for an identity, including number of datasets and data usage. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
    */
  def describeIdentityUsage(params: DescribeIdentityUsageRequest): Request[DescribeIdentityUsageResponse, AWSError] = js.native
  def describeIdentityUsage(
    params: DescribeIdentityUsageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIdentityUsageResponse, Unit]
  ): Request[DescribeIdentityUsageResponse, AWSError] = js.native
  /**
    * Get the status of the last BulkPublish operation for an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def getBulkPublishDetails(): Request[GetBulkPublishDetailsResponse, AWSError] = js.native
  def getBulkPublishDetails(callback: js.Function2[/* err */ AWSError, /* data */ GetBulkPublishDetailsResponse, Unit]): Request[GetBulkPublishDetailsResponse, AWSError] = js.native
  /**
    * Get the status of the last BulkPublish operation for an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def getBulkPublishDetails(params: GetBulkPublishDetailsRequest): Request[GetBulkPublishDetailsResponse, AWSError] = js.native
  def getBulkPublishDetails(
    params: GetBulkPublishDetailsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBulkPublishDetailsResponse, Unit]
  ): Request[GetBulkPublishDetailsResponse, AWSError] = js.native
  /**
    * Gets the events and the corresponding Lambda functions associated with an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def getCognitoEvents(): Request[GetCognitoEventsResponse, AWSError] = js.native
  def getCognitoEvents(callback: js.Function2[/* err */ AWSError, /* data */ GetCognitoEventsResponse, Unit]): Request[GetCognitoEventsResponse, AWSError] = js.native
  /**
    * Gets the events and the corresponding Lambda functions associated with an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def getCognitoEvents(params: GetCognitoEventsRequest): Request[GetCognitoEventsResponse, AWSError] = js.native
  def getCognitoEvents(
    params: GetCognitoEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCognitoEventsResponse, Unit]
  ): Request[GetCognitoEventsResponse, AWSError] = js.native
  /**
    * Gets the configuration settings of an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def getIdentityPoolConfiguration(): Request[GetIdentityPoolConfigurationResponse, AWSError] = js.native
  def getIdentityPoolConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityPoolConfigurationResponse, Unit]): Request[GetIdentityPoolConfigurationResponse, AWSError] = js.native
  /**
    * Gets the configuration settings of an identity pool. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def getIdentityPoolConfiguration(params: GetIdentityPoolConfigurationRequest): Request[GetIdentityPoolConfigurationResponse, AWSError] = js.native
  def getIdentityPoolConfiguration(
    params: GetIdentityPoolConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetIdentityPoolConfigurationResponse, Unit]
  ): Request[GetIdentityPoolConfigurationResponse, AWSError] = js.native
  /**
    * Lists datasets for an identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListDatasets can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use the Cognito Identity credentials to make this API call.
    */
  def listDatasets(): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]): Request[ListDatasetsResponse, AWSError] = js.native
  /**
    * Lists datasets for an identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListDatasets can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use the Cognito Identity credentials to make this API call.
    */
  def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(
    params: ListDatasetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]
  ): Request[ListDatasetsResponse, AWSError] = js.native
  /**
    * Gets a list of identity pools registered with Cognito. ListIdentityPoolUsage can only be called with developer credentials. You cannot make this API call with the temporary user credentials provided by Cognito Identity.
    */
  def listIdentityPoolUsage(): Request[ListIdentityPoolUsageResponse, AWSError] = js.native
  def listIdentityPoolUsage(callback: js.Function2[/* err */ AWSError, /* data */ ListIdentityPoolUsageResponse, Unit]): Request[ListIdentityPoolUsageResponse, AWSError] = js.native
  /**
    * Gets a list of identity pools registered with Cognito. ListIdentityPoolUsage can only be called with developer credentials. You cannot make this API call with the temporary user credentials provided by Cognito Identity.
    */
  def listIdentityPoolUsage(params: ListIdentityPoolUsageRequest): Request[ListIdentityPoolUsageResponse, AWSError] = js.native
  def listIdentityPoolUsage(
    params: ListIdentityPoolUsageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIdentityPoolUsageResponse, Unit]
  ): Request[ListIdentityPoolUsageResponse, AWSError] = js.native
  /**
    * Gets paginated records, optionally changed after a particular sync count for a dataset and identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListRecords can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
    */
  def listRecords(): Request[ListRecordsResponse, AWSError] = js.native
  def listRecords(callback: js.Function2[/* err */ AWSError, /* data */ ListRecordsResponse, Unit]): Request[ListRecordsResponse, AWSError] = js.native
  /**
    * Gets paginated records, optionally changed after a particular sync count for a dataset and identity. With Amazon Cognito Sync, each identity has access only to its own data. Thus, the credentials used to make this API call need to have access to the identity data. ListRecords can be called with temporary user credentials provided by Cognito Identity or with developer credentials. You should use Cognito Identity credentials to make this API call.
    */
  def listRecords(params: ListRecordsRequest): Request[ListRecordsResponse, AWSError] = js.native
  def listRecords(
    params: ListRecordsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecordsResponse, Unit]
  ): Request[ListRecordsResponse, AWSError] = js.native
  /**
    * Registers a device to receive push sync notifications. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
    */
  def registerDevice(): Request[RegisterDeviceResponse, AWSError] = js.native
  def registerDevice(callback: js.Function2[/* err */ AWSError, /* data */ RegisterDeviceResponse, Unit]): Request[RegisterDeviceResponse, AWSError] = js.native
  /**
    * Registers a device to receive push sync notifications. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
    */
  def registerDevice(params: RegisterDeviceRequest): Request[RegisterDeviceResponse, AWSError] = js.native
  def registerDevice(
    params: RegisterDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterDeviceResponse, Unit]
  ): Request[RegisterDeviceResponse, AWSError] = js.native
  /**
    * Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the particular key. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def setCognitoEvents(): Request[js.Object, AWSError] = js.native
  def setCognitoEvents(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets the AWS Lambda function for a given event type for an identity pool. This request only updates the key/value pair specified. Other key/values pairs are not updated. To remove a key value pair, pass a empty value for the particular key. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def setCognitoEvents(params: SetCognitoEventsRequest): Request[js.Object, AWSError] = js.native
  def setCognitoEvents(
    params: SetCognitoEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Sets the necessary configuration for push sync. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def setIdentityPoolConfiguration(): Request[SetIdentityPoolConfigurationResponse, AWSError] = js.native
  def setIdentityPoolConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ SetIdentityPoolConfigurationResponse, Unit]): Request[SetIdentityPoolConfigurationResponse, AWSError] = js.native
  /**
    * Sets the necessary configuration for push sync. This API can only be called with developer credentials. You cannot call this API with the temporary user credentials provided by Cognito Identity.
    */
  def setIdentityPoolConfiguration(params: SetIdentityPoolConfigurationRequest): Request[SetIdentityPoolConfigurationResponse, AWSError] = js.native
  def setIdentityPoolConfiguration(
    params: SetIdentityPoolConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetIdentityPoolConfigurationResponse, Unit]
  ): Request[SetIdentityPoolConfigurationResponse, AWSError] = js.native
  /**
    * Subscribes to receive notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
    */
  def subscribeToDataset(): Request[SubscribeToDatasetResponse, AWSError] = js.native
  def subscribeToDataset(callback: js.Function2[/* err */ AWSError, /* data */ SubscribeToDatasetResponse, Unit]): Request[SubscribeToDatasetResponse, AWSError] = js.native
  /**
    * Subscribes to receive notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
    */
  def subscribeToDataset(params: SubscribeToDatasetRequest): Request[SubscribeToDatasetResponse, AWSError] = js.native
  def subscribeToDataset(
    params: SubscribeToDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SubscribeToDatasetResponse, Unit]
  ): Request[SubscribeToDatasetResponse, AWSError] = js.native
  /**
    * Unsubscribes from receiving notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
    */
  def unsubscribeFromDataset(): Request[UnsubscribeFromDatasetResponse, AWSError] = js.native
  def unsubscribeFromDataset(callback: js.Function2[/* err */ AWSError, /* data */ UnsubscribeFromDatasetResponse, Unit]): Request[UnsubscribeFromDatasetResponse, AWSError] = js.native
  /**
    * Unsubscribes from receiving notifications when a dataset is modified by another device. This API can only be called with temporary credentials provided by Cognito Identity. You cannot call this API with developer credentials.
    */
  def unsubscribeFromDataset(params: UnsubscribeFromDatasetRequest): Request[UnsubscribeFromDatasetResponse, AWSError] = js.native
  def unsubscribeFromDataset(
    params: UnsubscribeFromDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UnsubscribeFromDatasetResponse, Unit]
  ): Request[UnsubscribeFromDatasetResponse, AWSError] = js.native
  /**
    * Posts updates to records and adds and deletes records for a dataset and user. The sync count in the record patch is your last known sync count for that record. The server will reject an UpdateRecords request with a ResourceConflictException if you try to patch a record with a new value but a stale sync count. For example, if the sync count on the server is 5 for a key called highScore and you try and submit a new highScore with sync count of 4, the request will be rejected. To obtain the current sync count for a record, call ListRecords. On a successful update of the record, the response returns the new sync count for that record. You should present that sync count the next time you try to update that same record. When the record does not exist, specify the sync count as 0. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
    */
  def updateRecords(): Request[UpdateRecordsResponse, AWSError] = js.native
  def updateRecords(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecordsResponse, Unit]): Request[UpdateRecordsResponse, AWSError] = js.native
  /**
    * Posts updates to records and adds and deletes records for a dataset and user. The sync count in the record patch is your last known sync count for that record. The server will reject an UpdateRecords request with a ResourceConflictException if you try to patch a record with a new value but a stale sync count. For example, if the sync count on the server is 5 for a key called highScore and you try and submit a new highScore with sync count of 4, the request will be rejected. To obtain the current sync count for a record, call ListRecords. On a successful update of the record, the response returns the new sync count for that record. You should present that sync count the next time you try to update that same record. When the record does not exist, specify the sync count as 0. This API can be called with temporary user credentials provided by Cognito Identity or with developer credentials.
    */
  def updateRecords(params: UpdateRecordsRequest): Request[UpdateRecordsResponse, AWSError] = js.native
  def updateRecords(
    params: UpdateRecordsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecordsResponse, Unit]
  ): Request[UpdateRecordsResponse, AWSError] = js.native
}


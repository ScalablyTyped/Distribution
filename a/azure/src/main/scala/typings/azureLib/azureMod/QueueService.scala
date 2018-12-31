package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "QueueService")
@js.native
//#region Constructors
/**
  * Creates a new BlobService object.
  * Uses the AZURE_STORAGE_ACCOUNT and AZURE_STORAGE_ACCESS_KEY environment variables.
  *
  * @constructor
  * @extends {StorageServiceClient}
  */
class QueueService () extends StorageServiceClient {
  /**
    * Creates a new BlobService object.
    * Uses a connectionString to connect
    *
    * @constructor
    * @extends {StorageServiceClient}
    * @param {string} connectionString The connection string.
    */
  def this(connectionString: java.lang.String) = this()
  /**
    * Creates a new BlobService object.
    * Uses a storage account and an access key.
    *
    * @constructor
    * @extends {StorageServiceClient}
    * @param {string} storageAccount                    The storage account or the connection string.
    * @param {string} storageAccessKey                  The storage access key.
    * @param {string} host                              The host address.
    * @param {object} sasToken                          The Shared Access Signature token.
    */
  def this(storageAccount: java.lang.String, storageAccessKey: java.lang.String) = this()
  def this(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String) = this()
  def this(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String, sasToken: java.lang.String) = this()
  var authenticationProvider: SharedKey = js.native
  /**
    * Clears all messages from the queue.
    */
  def clearMessages(queue: java.lang.String, callback: StorageCallbackVoid): scala.Unit = js.native
  def clearMessages(queue: java.lang.String, options: TimeoutIntervalOptions, callback: StorageCallbackVoid): scala.Unit = js.native
  //#endregion
  //#region Message Methods
  /**
    * Adds a new message to the back of the message queue. A visibility timeout can also be specified to make the message
    * invisible until the visibility timeout expires. A message must be in a format that can be included in an XML request
    * with UTF-8 encoding. The encoded message can be up to 64KB in size for versions 2011-08-18 and newer, or 8KB in size
    * for previous versions.
    */
  def createMessage(
    queue: java.lang.String,
    messageText: java.lang.String,
    callback: StorageCallback[QueueMessageResult]
  ): scala.Unit = js.native
  def createMessage(
    queue: java.lang.String,
    messageText: java.lang.String,
    options: CreateQueueMessageOptions,
    callback: StorageCallback[QueueMessageResult]
  ): scala.Unit = js.native
  /**
    * Creates a new queue under the given account.
    */
  def createQueue(queue: java.lang.String, callback: StorageCallback[QueueResult]): scala.Unit = js.native
  def createQueue(queue: java.lang.String, options: MetadataOptions, callback: StorageCallback[QueueResult]): scala.Unit = js.native
  /**
    * Creates a new queue under the given account if it doesn't exist.
    */
  def createQueueIfNotExists(queue: java.lang.String, callback: StorageCallback[scala.Boolean]): scala.Unit = js.native
  def createQueueIfNotExists(queue: java.lang.String, options: MetadataOptions, callback: StorageCallback[scala.Boolean]): scala.Unit = js.native
  /**
    * Deletes a specified message from the queue.
    */
  def deleteMessage(
    queue: java.lang.String,
    messageId: java.lang.String,
    popreceipt: java.lang.String,
    callback: StorageCallback[scala.Boolean]
  ): scala.Unit = js.native
  def deleteMessage(
    queue: java.lang.String,
    messageId: java.lang.String,
    popreceipt: java.lang.String,
    options: TimeoutIntervalOptions,
    callback: StorageCallback[scala.Boolean]
  ): scala.Unit = js.native
  /**
    * Permanently deletes the specified queue.
    */
  def deleteQueue(queue: java.lang.String, callback: StorageCallback[scala.Boolean]): scala.Unit = js.native
  def deleteQueue(queue: java.lang.String, options: TimeoutIntervalOptions, callback: StorageCallback[scala.Boolean]): scala.Unit = js.native
  /**
    * Retrieves a message from the queue and makes it invisible to other consumers.
    */
  def getMessages(queue: java.lang.String, callback: StorageCallback[js.Array[QueueMessageResult]]): scala.Unit = js.native
  def getMessages(
    queue: java.lang.String,
    options: GetQueueMessagesOptions,
    callback: StorageCallback[js.Array[QueueMessageResult]]
  ): scala.Unit = js.native
  /**
    * Returns queue properties, including user-defined metadata.
    */
  def getQueueMetadata(queue: java.lang.String, callback: StorageCallback[QueueResult]): scala.Unit = js.native
  def getQueueMetadata(queue: java.lang.String, options: TimeoutIntervalOptions, callback: StorageCallback[QueueResult]): scala.Unit = js.native
  //#endregion
  //#region Service Methods
  /**
    * Gets the properties of a storage account's Blob service, including Azure Storage Analytics.
    */
  def getServiceProperties(callback: StorageServicePropertiesCallback): scala.Unit = js.native
  def getServiceProperties(options: TimeoutIntervalOptions, callback: StorageServicePropertiesCallback): scala.Unit = js.native
  //#endregion
  //#region Queue Methods
  /**
    * Lists all queues under the given account.
    */
  def listQueues(callback: ListQueuesCallback): scala.Unit = js.native
  def listQueues(options: ListQueuesOptions, callback: ListQueuesCallback): scala.Unit = js.native
  /**
    * Retrieves a message from the front of the queue, without changing the message visibility.
    */
  def peekMessages(queue: java.lang.String, callback: StorageCallback[js.Array[QueueMessageResult]]): scala.Unit = js.native
  def peekMessages(
    queue: java.lang.String,
    options: PeekQueueMessagesOptions,
    callback: StorageCallback[js.Array[QueueMessageResult]]
  ): scala.Unit = js.native
  /**
    * Sets user-defined metadata on the specified queue. Metadata is associated with the queue as name-value pairs.
    */
  def setQueueMetadata(queue: java.lang.String, metadata: StorageMetadata, callback: StorageCallback[QueueResult]): scala.Unit = js.native
  def setQueueMetadata(
    queue: java.lang.String,
    metadata: StorageMetadata,
    options: TimeoutIntervalOptions,
    callback: StorageCallback[QueueResult]
  ): scala.Unit = js.native
  /**
    * Sets the properties of a storage account's Blob service, including Azure Storage Analytics.
    * You can also use this operation to set the default request version for all incoming requests that do not have a version specified.
    */
  def setServiceProperties(serviceProperties: StorageServiceProperties, callback: StorageCallbackVoid): scala.Unit = js.native
  def setServiceProperties(
    serviceProperties: StorageServiceProperties,
    options: TimeoutIntervalOptions,
    callback: StorageCallbackVoid
  ): scala.Unit = js.native
  /**
    * Deletes a specified message from the queue.
    */
  def updateMessage(
    queue: java.lang.String,
    messageId: java.lang.String,
    popreceipt: java.lang.String,
    visibilitytimeout: scala.Double,
    callback: StorageCallback[QueueMessageResult]
  ): scala.Unit = js.native
  def updateMessage(
    queue: java.lang.String,
    messageId: java.lang.String,
    popreceipt: java.lang.String,
    visibilitytimeout: scala.Double,
    options: UpdateQueueMessagesOptions,
    callback: StorageCallback[QueueMessageResult]
  ): scala.Unit = js.native
}


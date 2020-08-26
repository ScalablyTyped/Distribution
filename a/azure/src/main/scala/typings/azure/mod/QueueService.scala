package typings.azure.mod

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
  def this(connectionString: String) = this()
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
  def this(storageAccount: String, storageAccessKey: String) = this()
  def this(storageAccount: String, storageAccessKey: String, host: String) = this()
  def this(
    storageAccount: String,
    storageAccessKey: String,
    host: js.UndefOr[scala.Nothing],
    sasToken: String
  ) = this()
  def this(storageAccount: String, storageAccessKey: String, host: String, sasToken: String) = this()
  var authenticationProvider: SharedKey = js.native
  /**
    * Clears all messages from the queue.
    */
  def clearMessages(queue: String, callback: StorageCallbackVoid): Unit = js.native
  def clearMessages(queue: String, options: TimeoutIntervalOptions, callback: StorageCallbackVoid): Unit = js.native
  //#endregion
  //#region Message Methods
  /**
    * Adds a new message to the back of the message queue. A visibility timeout can also be specified to make the message
    * invisible until the visibility timeout expires. A message must be in a format that can be included in an XML request
    * with UTF-8 encoding. The encoded message can be up to 64KB in size for versions 2011-08-18 and newer, or 8KB in size
    * for previous versions.
    */
  def createMessage(queue: String, messageText: String, callback: StorageCallback[QueueMessageResult]): Unit = js.native
  def createMessage(
    queue: String,
    messageText: String,
    options: CreateQueueMessageOptions,
    callback: StorageCallback[QueueMessageResult]
  ): Unit = js.native
  /**
    * Creates a new queue under the given account.
    */
  def createQueue(queue: String, callback: StorageCallback[QueueResult]): Unit = js.native
  def createQueue(queue: String, options: MetadataOptions, callback: StorageCallback[QueueResult]): Unit = js.native
  /**
    * Creates a new queue under the given account if it doesn't exist.
    */
  def createQueueIfNotExists(queue: String, callback: StorageCallback[Boolean]): Unit = js.native
  def createQueueIfNotExists(queue: String, options: MetadataOptions, callback: StorageCallback[Boolean]): Unit = js.native
  /**
    * Deletes a specified message from the queue.
    */
  def deleteMessage(queue: String, messageId: String, popreceipt: String, callback: StorageCallback[Boolean]): Unit = js.native
  def deleteMessage(
    queue: String,
    messageId: String,
    popreceipt: String,
    options: TimeoutIntervalOptions,
    callback: StorageCallback[Boolean]
  ): Unit = js.native
  /**
    * Permanently deletes the specified queue.
    */
  def deleteQueue(queue: String, callback: StorageCallback[Boolean]): Unit = js.native
  def deleteQueue(queue: String, options: TimeoutIntervalOptions, callback: StorageCallback[Boolean]): Unit = js.native
  /**
    * Retrieves a message from the queue and makes it invisible to other consumers.
    */
  def getMessages(queue: String, callback: StorageCallback[js.Array[QueueMessageResult]]): Unit = js.native
  def getMessages(
    queue: String,
    options: GetQueueMessagesOptions,
    callback: StorageCallback[js.Array[QueueMessageResult]]
  ): Unit = js.native
  /**
    * Returns queue properties, including user-defined metadata.
    */
  def getQueueMetadata(queue: String, callback: StorageCallback[QueueResult]): Unit = js.native
  def getQueueMetadata(queue: String, options: TimeoutIntervalOptions, callback: StorageCallback[QueueResult]): Unit = js.native
  //#endregion
  //#region Service Methods
  /**
    * Gets the properties of a storage account's Blob service, including Azure Storage Analytics.
    */
  def getServiceProperties(callback: StorageServicePropertiesCallback): Unit = js.native
  def getServiceProperties(options: TimeoutIntervalOptions, callback: StorageServicePropertiesCallback): Unit = js.native
  //#endregion
  //#region Queue Methods
  /**
    * Lists all queues under the given account.
    */
  def listQueues(callback: ListQueuesCallback): Unit = js.native
  def listQueues(options: ListQueuesOptions, callback: ListQueuesCallback): Unit = js.native
  /**
    * Retrieves a message from the front of the queue, without changing the message visibility.
    */
  def peekMessages(queue: String, callback: StorageCallback[js.Array[QueueMessageResult]]): Unit = js.native
  def peekMessages(
    queue: String,
    options: PeekQueueMessagesOptions,
    callback: StorageCallback[js.Array[QueueMessageResult]]
  ): Unit = js.native
  /**
    * Sets user-defined metadata on the specified queue. Metadata is associated with the queue as name-value pairs.
    */
  def setQueueMetadata(queue: String, metadata: StorageMetadata, callback: StorageCallback[QueueResult]): Unit = js.native
  def setQueueMetadata(
    queue: String,
    metadata: StorageMetadata,
    options: TimeoutIntervalOptions,
    callback: StorageCallback[QueueResult]
  ): Unit = js.native
  /**
    * Sets the properties of a storage account's Blob service, including Azure Storage Analytics.
    * You can also use this operation to set the default request version for all incoming requests that do not have a version specified.
    */
  def setServiceProperties(serviceProperties: StorageServiceProperties, callback: StorageCallbackVoid): Unit = js.native
  def setServiceProperties(
    serviceProperties: StorageServiceProperties,
    options: TimeoutIntervalOptions,
    callback: StorageCallbackVoid
  ): Unit = js.native
  /**
    * Deletes a specified message from the queue.
    */
  def updateMessage(
    queue: String,
    messageId: String,
    popreceipt: String,
    visibilitytimeout: Double,
    callback: StorageCallback[QueueMessageResult]
  ): Unit = js.native
  def updateMessage(
    queue: String,
    messageId: String,
    popreceipt: String,
    visibilitytimeout: Double,
    options: UpdateQueueMessagesOptions,
    callback: StorageCallback[QueueMessageResult]
  ): Unit = js.native
}


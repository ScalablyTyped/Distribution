package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "BlobService")
@js.native
class BlobService () extends StorageServiceClient {
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
  def this(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String) = this()
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
  def this(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String, sasToken: java.lang.String) = this()
  var SpeedSummary: org.scalablytyped.runtime.Instantiable1[/* name */ java.lang.String, SpeedSummary] = js.native
  var parallelOperationThreadCount: scala.Double = js.native
  var singleBlobPutThresholdInBytes: scala.Double = js.native
  /**
       * Creates a read-only snapshot of a blob.
       */
  def abortCopyBlob(
    container: java.lang.String,
    blob: java.lang.String,
    copyId: java.lang.String,
    callback: StorageCallbackVoid
  ): scala.Unit = js.native
  def abortCopyBlob(
    container: java.lang.String,
    blob: java.lang.String,
    copyId: java.lang.String,
    options: LeaseIdOptions,
    callback: StorageCallbackVoid
  ): scala.Unit = js.native
  //#endregion
  //#region Lease Methods
  /**
       * Acquires a new lease.
       * If container and blob are specified, acquires a blob lease.
       * Otherwise, if only container is specified and blob is null, acquires a container lease.
       */
  def acquireLease(container: java.lang.String, blob: java.lang.String, callback: StorageCallback[LeaseResult]): scala.Unit = js.native
  def acquireLease(
    container: java.lang.String,
    blob: java.lang.String,
    options: LeaseOptions,
    callback: StorageCallback[LeaseResult]
  ): scala.Unit = js.native
  /**
       * Breaks the lease but ensures that another client cannot acquire a new lease until the current lease period has expired.
       * If container and blob are specified, breaks the blob lease.
       * Otherwise, if only container is specified and blob is null, breaks the container lease.
       */
  def breakLease(
    container: java.lang.String,
    blob: java.lang.String,
    leaseId: java.lang.String,
    callback: StorageCallback[LeaseResult]
  ): scala.Unit = js.native
  def breakLease(
    container: java.lang.String,
    blob: java.lang.String,
    leaseId: java.lang.String,
    options: BreakLeaseOptions,
    callback: StorageCallback[LeaseResult]
  ): scala.Unit = js.native
  /**
       * Clears a range of pages.
       */
  def clearBlobPages(
    container: java.lang.String,
    blob: java.lang.String,
    rangeStart: scala.Double,
    rangeEnd: scala.Double,
    callback: StorageCallbackVoid
  ): scala.Unit = js.native
  def clearBlobPages(
    container: java.lang.String,
    blob: java.lang.String,
    rangeStart: scala.Double,
    rangeEnd: scala.Double,
    options: LeaseAccessConditionsOptions,
    callback: StorageCallbackVoid
  ): scala.Unit = js.native
  /**
       * Writes a blob by specifying the list of block IDs that make up the blob.
       * In order to be written as part of a blob, a block must have been successfully written to the server in a prior
       * createBlock operation.
       */
  def commitBlobBlocks(
    container: java.lang.String,
    blob: java.lang.String,
    blockList: BlockList,
    callback: StorageCallback[BlockList]
  ): scala.Unit = js.native
  def commitBlobBlocks(
    container: java.lang.String,
    blob: java.lang.String,
    blockList: BlockList,
    options: CreateBlockOptions,
    callback: StorageCallback[BlockList]
  ): scala.Unit = js.native
  /**
       * Starts to copy a blob to a destination within the storage account. The Copy Blob operation copies the entire committed blob.
       */
  def copyBlob(
    sourceUri: java.lang.String,
    targetContainer: java.lang.String,
    targetBlob: java.lang.String,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  def copyBlob(
    sourceUri: java.lang.String,
    targetContainer: java.lang.String,
    targetBlob: java.lang.String,
    options: CopyBlobOptions,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  /**
       * Uploads a blob.
       */
  def createBlob(
    container: java.lang.String,
    blob: java.lang.String,
    blobType: java.lang.String,
    callback: StorageCallback[java.lang.String]
  ): nodeLib.streamMod.Writable = js.native
  def createBlob(
    container: java.lang.String,
    blob: java.lang.String,
    blobType: java.lang.String,
    options: UploadBlockBlobOptions,
    callback: StorageCallback[java.lang.String]
  ): nodeLib.streamMod.Writable = js.native
  /**
       * Creates a new block to be committed as part of a blob.
       */
  def createBlobBlockFromStream(
    blockId: java.lang.String,
    container: java.lang.String,
    blob: java.lang.String,
    readStream: nodeLib.streamMod.Stream,
    streamLength: scala.Double,
    callback: StorageCallbackVoid
  ): scala.Unit = js.native
  def createBlobBlockFromStream(
    blockId: java.lang.String,
    container: java.lang.String,
    blob: java.lang.String,
    readStream: nodeLib.streamMod.Stream,
    streamLength: scala.Double,
    options: CreateBlockOptions,
    callback: StorageCallbackVoid
  ): scala.Unit = js.native
  /**
       * Creates a new block to be committed as part of a blob.
       */
  def createBlobBlockFromText(
    blockId: java.lang.String,
    container: java.lang.String,
    blob: java.lang.String,
    text: java.lang.String,
    callback: StorageCallbackVoid
  ): scala.Unit = js.native
  def createBlobBlockFromText(
    blockId: java.lang.String,
    container: java.lang.String,
    blob: java.lang.String,
    text: java.lang.String,
    options: CreateBlockOptions,
    callback: StorageCallbackVoid
  ): scala.Unit = js.native
  /**
       * Updates a page blob from a stream.
       */
  def createBlobPagesFromStream(
    container: java.lang.String,
    blob: java.lang.String,
    readStream: nodeLib.streamMod.Readable,
    rangeStart: scala.Double,
    rangeEnd: scala.Double,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  def createBlobPagesFromStream(
    container: java.lang.String,
    blob: java.lang.String,
    readStream: nodeLib.streamMod.Readable,
    rangeStart: scala.Double,
    rangeEnd: scala.Double,
    options: CreatePagesOptions,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  /**
       * Updates a page blob from a text string.
       */
  def createBlobPagesFromText(
    container: java.lang.String,
    blob: java.lang.String,
    text: java.lang.String,
    rangeStart: scala.Double,
    rangeEnd: scala.Double,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  def createBlobPagesFromText(
    container: java.lang.String,
    blob: java.lang.String,
    text: java.lang.String,
    rangeStart: scala.Double,
    rangeEnd: scala.Double,
    options: CreatePagesOptions,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  /**
       * Creates a read-only snapshot of a blob.
       */
  def createBlobSnapshot(container: java.lang.String, blob: java.lang.String, callback: StorageCallback[java.lang.String]): scala.Unit = js.native
  def createBlobSnapshot(
    container: java.lang.String,
    blob: java.lang.String,
    options: BlobSnapshotOptions,
    callback: StorageCallback[java.lang.String]
  ): scala.Unit = js.native
  def createBlockBlobFromFile(
    container: java.lang.String,
    blob: java.lang.String,
    localFileName: java.lang.String,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  def createBlockBlobFromFile(
    container: java.lang.String,
    blob: java.lang.String,
    localFileName: java.lang.String,
    options: UploadBlockBlobOptions,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  def createBlockBlobFromStream(
    container: java.lang.String,
    blob: java.lang.String,
    stream: nodeLib.streamMod.Stream,
    streamLength: scala.Double,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  def createBlockBlobFromStream(
    container: java.lang.String,
    blob: java.lang.String,
    stream: nodeLib.streamMod.Stream,
    streamLength: scala.Double,
    options: UploadBlockBlobOptions,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  /**
       * Uploads a block blob from a text string.
       */
  def createBlockBlobFromText(
    container: java.lang.String,
    blob: java.lang.String,
    text: java.lang.String,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  def createBlockBlobFromText(
    container: java.lang.String,
    blob: java.lang.String,
    text: java.lang.String,
    options: UploadBlockBlobOptions,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  /**
       * Creates a new container under the specified account.
       * If a container with the same name already exists, the operation fails.
       */
  def createContainer(container: java.lang.String, callback: StorageCallback[ContainerResult]): scala.Unit = js.native
  def createContainer(
    container: java.lang.String,
    options: CreateContainerOptions,
    callback: StorageCallback[ContainerResult]
  ): scala.Unit = js.native
  /**
       * Creates a new container under the specified account if the container does not exists.
       */
  def createContainerIfNotExists(container: java.lang.String, callback: StorageCallback[scala.Boolean]): scala.Unit = js.native
  def createContainerIfNotExists(
    container: java.lang.String,
    options: CreateContainerOptions,
    callback: StorageCallback[scala.Boolean]
  ): scala.Unit = js.native
  //#endregion
  //#region Page Blob Methods
  /**
       * Creates a page blob of the specified length.
       */
  def createPageBlob(
    container: java.lang.String,
    blob: java.lang.String,
    length: scala.Double,
    callback: StorageCallbackVoid
  ): scala.Unit = js.native
  def createPageBlob(
    container: java.lang.String,
    blob: java.lang.String,
    length: scala.Double,
    options: SetBlobPropertiesOptions,
    callback: StorageCallbackVoid
  ): scala.Unit = js.native
  /**
       * Marks the specified blob or snapshot for deletion. The blob is later deleted during garbage collection.
       * If a blob has snapshots, you must delete them when deleting the blob. Using the deleteSnapshots option, you can choose either to delete both the blob and its snapshots,
       * or to delete only the snapshots but not the blob itself. If the blob has snapshots, you must include the deleteSnapshots option or the blob service will return an error
       * and nothing will be deleted.
       * If you are deleting a specific snapshot using the snapshotId option, the deleteSnapshots option must NOT be included.
       */
  def deleteBlob(container: java.lang.String, blob: java.lang.String, callback: StorageCallback[scala.Boolean]): scala.Unit = js.native
  def deleteBlob(
    container: java.lang.String,
    blob: java.lang.String,
    options: DeleteBlobOptions,
    callback: StorageCallback[scala.Boolean]
  ): scala.Unit = js.native
  /**
       * Marks the specified container for deletion.
       * The container and any blobs contained within it are later deleted during garbage collection.
       */
  def deleteContainer(container: java.lang.String, callback: StorageCallbackVoid): scala.Unit = js.native
  def deleteContainer(container: java.lang.String, options: LeaseIdOptions, callback: StorageCallbackVoid): scala.Unit = js.native
  /**
       * Generate a random block id prefix.
       */
  def generateBlockIdPrefix(): java.lang.String = js.native
  /**
       * Retrieves a shared access signature token.
       */
  def generateSharedAccessSignature(container: java.lang.String, blob: java.lang.String, sharedAccessPolicy: SharedAccessPolicy): SharedAccessSignatureResult = js.native
  /**
       * Provides a stream to read from a blob.
       */
  def getBlob(container: java.lang.String, blob: java.lang.String, callback: StorageCallback[BlobResult]): nodeLib.streamMod.Readable = js.native
  def getBlob(
    container: java.lang.String,
    blob: java.lang.String,
    options: ReadBlobOptions,
    callback: StorageCallback[BlobResult]
  ): nodeLib.streamMod.Readable = js.native
  /**
       * Returns all user-defined metadata, standard HTTP properties, and system properties for the blob.
       * It does not return or modify the content of the blob.
       */
  def getBlobProperties(container: java.lang.String, blob: java.lang.String, callback: StorageCallback[BlobResult]): scala.Unit = js.native
  def getBlobProperties(
    container: java.lang.String,
    blob: java.lang.String,
    options: GetBlobPropertiesOptions,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  /**
       * Downloads a blob into a file.
       */
  def getBlobToFile(
    container: java.lang.String,
    blob: java.lang.String,
    localFileName: java.lang.String,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  def getBlobToFile(
    container: java.lang.String,
    blob: java.lang.String,
    localFileName: java.lang.String,
    options: ReadBlobOptions,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  /**
       * Downloads a blob into a stream.
       */
  def getBlobToStream(
    container: java.lang.String,
    blob: java.lang.String,
    stream: nodeLib.streamMod.Writable,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  def getBlobToStream(
    container: java.lang.String,
    blob: java.lang.String,
    stream: nodeLib.streamMod.Writable,
    options: ReadBlobOptions,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  /**
       * Downloads a blob into a text string.
       */
  def getBlobToText(container: java.lang.String, blob: java.lang.String, callback: GetBlobToTextCallback): scala.Unit = js.native
  def getBlobToText(
    container: java.lang.String,
    blob: java.lang.String,
    options: ReadBlobOptions,
    callback: GetBlobToTextCallback
  ): scala.Unit = js.native
  /**
       * Retrieves a blob or container URL.
       */
  def getBlobUrl(container: java.lang.String): java.lang.String = js.native
  def getBlobUrl(container: java.lang.String, blob: java.lang.String): java.lang.String = js.native
  def getBlobUrl(container: java.lang.String, blob: java.lang.String, sharedAccessPolicy: SharedAccessPolicy): java.lang.String = js.native
  /**
       * Get a block id according to prefix and block number.
       */
  def getBlockId(prefix: java.lang.String, number: scala.Double): java.lang.String = js.native
  /**
       * Gets the container's ACL.
       */
  def getContainerAcl(container: java.lang.String, callback: StorageCallback[ContainerResult]): scala.Unit = js.native
  def getContainerAcl(
    container: java.lang.String,
    options: GetContainerPropertiesOptions,
    callback: StorageCallback[ContainerResult]
  ): scala.Unit = js.native
  /**
       * Returns all user-defined metadata for the container.
       */
  def getContainerMetadata(container: java.lang.String, callback: StorageCallback[ContainerResult]): scala.Unit = js.native
  def getContainerMetadata(
    container: java.lang.String,
    options: GetContainerPropertiesOptions,
    callback: StorageCallback[ContainerResult]
  ): scala.Unit = js.native
  /**
       * Retrieves a container and its properties from a specified account.
       */
  def getContainerProperties(container: java.lang.String, callback: StorageCallback[ContainerResult]): scala.Unit = js.native
  def getContainerProperties(
    container: java.lang.String,
    options: GetContainerPropertiesOptions,
    callback: StorageCallback[ContainerResult]
  ): scala.Unit = js.native
  //#endregion
  //#region Service Methods
  /**
      * Gets the properties of a storage account's Blob service, including Azure Storage Analytics.
      */
  def getServiceProperties(callback: StorageServicePropertiesCallback): scala.Unit = js.native
  def getServiceProperties(options: TimeoutIntervalOptions, callback: StorageServicePropertiesCallback): scala.Unit = js.native
  /**
       * Retrieves the list of blocks that have been uploaded as part of a block blob.
       */
  def listBlobBlocks(
    container: java.lang.String,
    blob: java.lang.String,
    blockListType: java.lang.String,
    callback: StorageCallback[BlockList]
  ): scala.Unit = js.native
  def listBlobBlocks(
    container: java.lang.String,
    blob: java.lang.String,
    blockListType: java.lang.String,
    options: GetBlobPropertiesOptions,
    callback: StorageCallback[BlockList]
  ): scala.Unit = js.native
  /**
       * Lists page ranges.
       * Lists all of the page ranges by default, or only the page ranges over a specific range of bytes if rangeStart and rangeEnd are specified.
       */
  def listBlobRegions(
    container: java.lang.String,
    blob: java.lang.String,
    callback: StorageCallback[js.Array[PageRange]]
  ): scala.Unit = js.native
  def listBlobRegions(
    container: java.lang.String,
    blob: java.lang.String,
    options: PageRangeOptions,
    callback: StorageCallback[js.Array[PageRange]]
  ): scala.Unit = js.native
  //#endregion
  //#region Blob Methods
  /**
      * Lists all of the blobs in the given container.
      */
  def listBlobs(container: java.lang.String, callback: ListBlobsCallback): scala.Unit = js.native
  def listBlobs(container: java.lang.String, options: ListBlobsOptions, callback: ListBlobsCallback): scala.Unit = js.native
  //#endregion
  //#region Containers Methods
  /**
      * Lists a segment containing a collection of container items under the specified account.
      */
  def listContainers(callback: ListContainersCallback): scala.Unit = js.native
  def listContainers(options: ListContainersOptions, callback: ListContainersCallback): scala.Unit = js.native
  //#endregion
  //#region Block Blob Methods
  /**
       * Uploads a block blob from file.
       */
  def putBlockBlobFromFile(
    container: java.lang.String,
    blob: java.lang.String,
    localFileName: java.lang.String,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  def putBlockBlobFromFile(
    container: java.lang.String,
    blob: java.lang.String,
    localFileName: java.lang.String,
    options: UploadBlockBlobOptions,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  /**
       * Uploads a block blob from a stream.
       */
  def putBlockBlobFromStream(
    container: java.lang.String,
    blob: java.lang.String,
    stream: nodeLib.streamMod.Stream,
    streamLength: scala.Double,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  def putBlockBlobFromStream(
    container: java.lang.String,
    blob: java.lang.String,
    stream: nodeLib.streamMod.Stream,
    streamLength: scala.Double,
    options: UploadBlockBlobOptions,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  /**
       * Releases the lease.
       * If container and blob are specified, releases the blob lease.
       * Otherwise, if only container is specified and blob is null, releases the container lease.
       */
  def releaseLease(
    container: java.lang.String,
    blob: java.lang.String,
    leaseId: java.lang.String,
    callback: StorageCallback[LeaseResult]
  ): scala.Unit = js.native
  def releaseLease(
    container: java.lang.String,
    blob: java.lang.String,
    leaseId: java.lang.String,
    options: AccessConditionsOptions,
    callback: StorageCallback[LeaseResult]
  ): scala.Unit = js.native
  /**
       * Renews an existing lease.
       * If container and blob are specified, renews the blob lease.
       * Otherwise, if only container is specified and blob is null, renews the container lease.
       */
  def renewLease(
    container: java.lang.String,
    blob: java.lang.String,
    leaseId: java.lang.String,
    callback: StorageCallback[LeaseResult]
  ): scala.Unit = js.native
  def renewLease(
    container: java.lang.String,
    blob: java.lang.String,
    leaseId: java.lang.String,
    options: AccessConditionsOptions,
    callback: StorageCallback[LeaseResult]
  ): scala.Unit = js.native
  /**
       * Resizes a page blob.
       */
  def resizePageBlob(
    container: java.lang.String,
    blob: java.lang.String,
    size: scala.Double,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  def resizePageBlob(
    container: java.lang.String,
    blob: java.lang.String,
    size: scala.Double,
    options: LeaseAccessConditionsOptions,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  /**
       * Sets user-defined metadata for the specified blob or snapshot as one or more name-value pairs
       * It does not return or modify the content of the blob.
       */
  def setBlobMetadata(
    container: java.lang.String,
    blob: java.lang.String,
    metadata: StorageMetadata,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  def setBlobMetadata(
    container: java.lang.String,
    blob: java.lang.String,
    metadata: StorageMetadata,
    options: GetBlobPropertiesOptions,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  /**
       * Sets user-defined properties for the specified blob or snapshot.
       * It does not return or modify the content of the blob.
       */
  def setBlobProperties(container: java.lang.String, blob: java.lang.String, callback: StorageCallback[BlobResult]): scala.Unit = js.native
  def setBlobProperties(
    container: java.lang.String,
    blob: java.lang.String,
    options: SetBlobPropertiesOptions,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  /**
       * Updates the container's ACL.
       */
  def setContainerAcl(
    container: java.lang.String,
    publicAccessLevel: java.lang.String,
    callback: StorageCallback[ContainerResult]
  ): scala.Unit = js.native
  def setContainerAcl(
    container: java.lang.String,
    publicAccessLevel: java.lang.String,
    options: StorageAclOptions,
    callback: StorageCallback[ContainerResult]
  ): scala.Unit = js.native
  /**
       * Sets the container's metadata.
       */
  def setContainerMetadata(container: java.lang.String, metadata: StorageMetadata, callback: StorageCallback[ContainerResult]): scala.Unit = js.native
  def setContainerMetadata(
    container: java.lang.String,
    metadata: StorageMetadata,
    options: AccessConditionsOptions,
    callback: StorageCallback[ContainerResult]
  ): scala.Unit = js.native
  /**
       * Sets the page blob's sequence number.
       */
  def setPageBlobSequenceNumber(
    container: java.lang.String,
    blob: java.lang.String,
    sequenceNumberAction: java.lang.String,
    sequenceNumber: java.lang.String,
    callback: StorageCallback[BlobResult]
  ): scala.Unit = js.native
  def setPageBlobSequenceNumber(
    container: java.lang.String,
    blob: java.lang.String,
    sequenceNumberAction: java.lang.String,
    sequenceNumber: java.lang.String,
    options: AccessConditionsOptions,
    callback: StorageCallback[BlobResult]
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
}


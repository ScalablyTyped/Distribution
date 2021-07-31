package typings.azure.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "BlobService")
@js.native
//#region Constructors
/**
  * Creates a new BlobService object.
  * Uses the AZURE_STORAGE_ACCOUNT and AZURE_STORAGE_ACCESS_KEY environment variables.
  *
  * @constructor
  * @extends {StorageServiceClient}
  */
class BlobService () extends StorageServiceClient {
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
  def this(storageAccount: String, storageAccessKey: String, host: String, sasToken: String) = this()
  def this(storageAccount: String, storageAccessKey: String, host: Unit, sasToken: String) = this()
  
  var SpeedSummary: Instantiable1[/* name */ String, typings.azure.mod.SpeedSummary] = js.native
  
  /**
    * Creates a read-only snapshot of a blob.
    */
  def abortCopyBlob(container: String, blob: String, copyId: String, callback: StorageCallbackVoid): Unit = js.native
  def abortCopyBlob(
    container: String,
    blob: String,
    copyId: String,
    options: LeaseIdOptions,
    callback: StorageCallbackVoid
  ): Unit = js.native
  
  //#endregion
  //#region Lease Methods
  /**
    * Acquires a new lease.
    * If container and blob are specified, acquires a blob lease.
    * Otherwise, if only container is specified and blob is null, acquires a container lease.
    */
  def acquireLease(container: String, blob: String, callback: StorageCallback[LeaseResult]): Unit = js.native
  def acquireLease(container: String, blob: String, options: LeaseOptions, callback: StorageCallback[LeaseResult]): Unit = js.native
  
  /**
    * Breaks the lease but ensures that another client cannot acquire a new lease until the current lease period has expired.
    * If container and blob are specified, breaks the blob lease.
    * Otherwise, if only container is specified and blob is null, breaks the container lease.
    */
  def breakLease(container: String, blob: String, leaseId: String, callback: StorageCallback[LeaseResult]): Unit = js.native
  def breakLease(
    container: String,
    blob: String,
    leaseId: String,
    options: BreakLeaseOptions,
    callback: StorageCallback[LeaseResult]
  ): Unit = js.native
  
  /**
    * Clears a range of pages.
    */
  def clearBlobPages(
    container: String,
    blob: String,
    rangeStart: Double,
    rangeEnd: Double,
    callback: StorageCallbackVoid
  ): Unit = js.native
  def clearBlobPages(
    container: String,
    blob: String,
    rangeStart: Double,
    rangeEnd: Double,
    options: LeaseAccessConditionsOptions,
    callback: StorageCallbackVoid
  ): Unit = js.native
  
  /**
    * Writes a blob by specifying the list of block IDs that make up the blob.
    * In order to be written as part of a blob, a block must have been successfully written to the server in a prior
    * createBlock operation.
    */
  def commitBlobBlocks(container: String, blob: String, blockList: BlockList, callback: StorageCallback[BlockList]): Unit = js.native
  def commitBlobBlocks(
    container: String,
    blob: String,
    blockList: BlockList,
    options: CreateBlockOptions,
    callback: StorageCallback[BlockList]
  ): Unit = js.native
  
  /**
    * Starts to copy a blob to a destination within the storage account. The Copy Blob operation copies the entire committed blob.
    */
  def copyBlob(
    sourceUri: String,
    targetContainer: String,
    targetBlob: String,
    callback: StorageCallback[BlobResult]
  ): Unit = js.native
  def copyBlob(
    sourceUri: String,
    targetContainer: String,
    targetBlob: String,
    options: CopyBlobOptions,
    callback: StorageCallback[BlobResult]
  ): Unit = js.native
  
  /**
    * Uploads a blob.
    */
  def createBlob(container: String, blob: String, blobType: String, callback: StorageCallback[String]): Writable = js.native
  def createBlob(
    container: String,
    blob: String,
    blobType: String,
    options: UploadBlockBlobOptions,
    callback: StorageCallback[String]
  ): Writable = js.native
  
  /**
    * Creates a new block to be committed as part of a blob.
    */
  def createBlobBlockFromStream(
    blockId: String,
    container: String,
    blob: String,
    readStream: Stream,
    streamLength: Double,
    callback: StorageCallbackVoid
  ): Unit = js.native
  def createBlobBlockFromStream(
    blockId: String,
    container: String,
    blob: String,
    readStream: Stream,
    streamLength: Double,
    options: CreateBlockOptions,
    callback: StorageCallbackVoid
  ): Unit = js.native
  
  /**
    * Creates a new block to be committed as part of a blob.
    */
  def createBlobBlockFromText(blockId: String, container: String, blob: String, text: String, callback: StorageCallbackVoid): Unit = js.native
  def createBlobBlockFromText(
    blockId: String,
    container: String,
    blob: String,
    text: String,
    options: CreateBlockOptions,
    callback: StorageCallbackVoid
  ): Unit = js.native
  
  /**
    * Updates a page blob from a stream.
    */
  def createBlobPagesFromStream(
    container: String,
    blob: String,
    readStream: Readable,
    rangeStart: Double,
    rangeEnd: Double,
    callback: StorageCallback[BlobResult]
  ): Unit = js.native
  def createBlobPagesFromStream(
    container: String,
    blob: String,
    readStream: Readable,
    rangeStart: Double,
    rangeEnd: Double,
    options: CreatePagesOptions,
    callback: StorageCallback[BlobResult]
  ): Unit = js.native
  
  /**
    * Updates a page blob from a text string.
    */
  def createBlobPagesFromText(
    container: String,
    blob: String,
    text: String,
    rangeStart: Double,
    rangeEnd: Double,
    callback: StorageCallback[BlobResult]
  ): Unit = js.native
  def createBlobPagesFromText(
    container: String,
    blob: String,
    text: String,
    rangeStart: Double,
    rangeEnd: Double,
    options: CreatePagesOptions,
    callback: StorageCallback[BlobResult]
  ): Unit = js.native
  
  /**
    * Creates a read-only snapshot of a blob.
    */
  def createBlobSnapshot(container: String, blob: String, callback: StorageCallback[String]): Unit = js.native
  def createBlobSnapshot(container: String, blob: String, options: BlobSnapshotOptions, callback: StorageCallback[String]): Unit = js.native
  
  def createBlockBlobFromFile(container: String, blob: String, localFileName: String, callback: StorageCallback[BlobResult]): SpeedSummary = js.native
  def createBlockBlobFromFile(
    container: String,
    blob: String,
    localFileName: String,
    options: UploadBlockBlobOptions,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  
  def createBlockBlobFromStream(
    container: String,
    blob: String,
    stream: Stream,
    streamLength: Double,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  def createBlockBlobFromStream(
    container: String,
    blob: String,
    stream: Stream,
    streamLength: Double,
    options: UploadBlockBlobOptions,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  
  /**
    * Uploads a block blob from a text string.
    */
  def createBlockBlobFromText(container: String, blob: String, text: String, callback: StorageCallback[BlobResult]): SpeedSummary = js.native
  def createBlockBlobFromText(
    container: String,
    blob: String,
    text: String,
    options: UploadBlockBlobOptions,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  
  /**
    * Creates a new container under the specified account.
    * If a container with the same name already exists, the operation fails.
    */
  def createContainer(container: String, callback: StorageCallback[ContainerResult]): Unit = js.native
  def createContainer(container: String, options: CreateContainerOptions, callback: StorageCallback[ContainerResult]): Unit = js.native
  
  /**
    * Creates a new container under the specified account if the container does not exists.
    */
  def createContainerIfNotExists(container: String, callback: StorageCallback[Boolean]): Unit = js.native
  def createContainerIfNotExists(container: String, options: CreateContainerOptions, callback: StorageCallback[Boolean]): Unit = js.native
  
  //#endregion
  //#region Page Blob Methods
  /**
    * Creates a page blob of the specified length.
    */
  def createPageBlob(container: String, blob: String, length: Double, callback: StorageCallbackVoid): Unit = js.native
  def createPageBlob(
    container: String,
    blob: String,
    length: Double,
    options: SetBlobPropertiesOptions,
    callback: StorageCallbackVoid
  ): Unit = js.native
  
  /**
    * Marks the specified blob or snapshot for deletion. The blob is later deleted during garbage collection.
    * If a blob has snapshots, you must delete them when deleting the blob. Using the deleteSnapshots option, you can choose either to delete both the blob and its snapshots,
    * or to delete only the snapshots but not the blob itself. If the blob has snapshots, you must include the deleteSnapshots option or the blob service will return an error
    * and nothing will be deleted.
    * If you are deleting a specific snapshot using the snapshotId option, the deleteSnapshots option must NOT be included.
    */
  def deleteBlob(container: String, blob: String, callback: StorageCallback[Boolean]): Unit = js.native
  def deleteBlob(container: String, blob: String, options: DeleteBlobOptions, callback: StorageCallback[Boolean]): Unit = js.native
  
  /**
    * Marks the specified container for deletion.
    * The container and any blobs contained within it are later deleted during garbage collection.
    */
  def deleteContainer(container: String, callback: StorageCallbackVoid): Unit = js.native
  def deleteContainer(container: String, options: LeaseIdOptions, callback: StorageCallbackVoid): Unit = js.native
  
  /**
    * Generate a random block id prefix.
    */
  def generateBlockIdPrefix(): String = js.native
  
  /**
    * Retrieves a shared access signature token.
    */
  def generateSharedAccessSignature(container: String, blob: String, sharedAccessPolicy: SharedAccessPolicy): SharedAccessSignatureResult = js.native
  
  /**
    * Provides a stream to read from a blob.
    */
  def getBlob(container: String, blob: String, callback: StorageCallback[BlobResult]): Readable = js.native
  def getBlob(container: String, blob: String, options: ReadBlobOptions, callback: StorageCallback[BlobResult]): Readable = js.native
  
  /**
    * Returns all user-defined metadata, standard HTTP properties, and system properties for the blob.
    * It does not return or modify the content of the blob.
    */
  def getBlobProperties(container: String, blob: String, callback: StorageCallback[BlobResult]): Unit = js.native
  def getBlobProperties(
    container: String,
    blob: String,
    options: GetBlobPropertiesOptions,
    callback: StorageCallback[BlobResult]
  ): Unit = js.native
  
  /**
    * Downloads a blob into a file.
    */
  def getBlobToFile(container: String, blob: String, localFileName: String, callback: StorageCallback[BlobResult]): Unit = js.native
  def getBlobToFile(
    container: String,
    blob: String,
    localFileName: String,
    options: ReadBlobOptions,
    callback: StorageCallback[BlobResult]
  ): Unit = js.native
  
  /**
    * Downloads a blob into a stream.
    */
  def getBlobToStream(container: String, blob: String, stream: Writable, callback: StorageCallback[BlobResult]): Unit = js.native
  def getBlobToStream(
    container: String,
    blob: String,
    stream: Writable,
    options: ReadBlobOptions,
    callback: StorageCallback[BlobResult]
  ): Unit = js.native
  
  /**
    * Downloads a blob into a text string.
    */
  def getBlobToText(container: String, blob: String, callback: GetBlobToTextCallback): Unit = js.native
  def getBlobToText(container: String, blob: String, options: ReadBlobOptions, callback: GetBlobToTextCallback): Unit = js.native
  
  /**
    * Retrieves a blob or container URL.
    */
  def getBlobUrl(container: String): String = js.native
  def getBlobUrl(container: String, blob: String): String = js.native
  def getBlobUrl(container: String, blob: String, sharedAccessPolicy: SharedAccessPolicy): String = js.native
  
  /**
    * Get a block id according to prefix and block number.
    */
  def getBlockId(prefix: String, number: Double): String = js.native
  
  /**
    * Gets the container's ACL.
    */
  def getContainerAcl(container: String, callback: StorageCallback[ContainerResult]): Unit = js.native
  def getContainerAcl(
    container: String,
    options: GetContainerPropertiesOptions,
    callback: StorageCallback[ContainerResult]
  ): Unit = js.native
  
  /**
    * Returns all user-defined metadata for the container.
    */
  def getContainerMetadata(container: String, callback: StorageCallback[ContainerResult]): Unit = js.native
  def getContainerMetadata(
    container: String,
    options: GetContainerPropertiesOptions,
    callback: StorageCallback[ContainerResult]
  ): Unit = js.native
  
  /**
    * Retrieves a container and its properties from a specified account.
    */
  def getContainerProperties(container: String, callback: StorageCallback[ContainerResult]): Unit = js.native
  def getContainerProperties(
    container: String,
    options: GetContainerPropertiesOptions,
    callback: StorageCallback[ContainerResult]
  ): Unit = js.native
  
  //#endregion
  //#region Service Methods
  /**
    * Gets the properties of a storage account's Blob service, including Azure Storage Analytics.
    */
  def getServiceProperties(callback: StorageServicePropertiesCallback): Unit = js.native
  def getServiceProperties(options: TimeoutIntervalOptions, callback: StorageServicePropertiesCallback): Unit = js.native
  
  /**
    * Retrieves the list of blocks that have been uploaded as part of a block blob.
    */
  def listBlobBlocks(container: String, blob: String, blockListType: String, callback: StorageCallback[BlockList]): Unit = js.native
  def listBlobBlocks(
    container: String,
    blob: String,
    blockListType: String,
    options: GetBlobPropertiesOptions,
    callback: StorageCallback[BlockList]
  ): Unit = js.native
  
  /**
    * Lists page ranges.
    * Lists all of the page ranges by default, or only the page ranges over a specific range of bytes if rangeStart and rangeEnd are specified.
    */
  def listBlobRegions(container: String, blob: String, callback: StorageCallback[js.Array[PageRange]]): Unit = js.native
  def listBlobRegions(
    container: String,
    blob: String,
    options: PageRangeOptions,
    callback: StorageCallback[js.Array[PageRange]]
  ): Unit = js.native
  
  //#endregion
  //#region Blob Methods
  /**
    * Lists all of the blobs in the given container.
    */
  def listBlobs(container: String, callback: ListBlobsCallback): Unit = js.native
  def listBlobs(container: String, options: ListBlobsOptions, callback: ListBlobsCallback): Unit = js.native
  
  //#endregion
  //#region Containers Methods
  /**
    * Lists a segment containing a collection of container items under the specified account.
    */
  def listContainers(callback: ListContainersCallback): Unit = js.native
  def listContainers(options: ListContainersOptions, callback: ListContainersCallback): Unit = js.native
  
  var parallelOperationThreadCount: Double = js.native
  
  //#endregion
  //#region Block Blob Methods
  /**
    * Uploads a block blob from file.
    */
  def putBlockBlobFromFile(container: String, blob: String, localFileName: String, callback: StorageCallback[BlobResult]): SpeedSummary = js.native
  def putBlockBlobFromFile(
    container: String,
    blob: String,
    localFileName: String,
    options: UploadBlockBlobOptions,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  
  /**
    * Uploads a block blob from a stream.
    */
  def putBlockBlobFromStream(
    container: String,
    blob: String,
    stream: Stream,
    streamLength: Double,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  def putBlockBlobFromStream(
    container: String,
    blob: String,
    stream: Stream,
    streamLength: Double,
    options: UploadBlockBlobOptions,
    callback: StorageCallback[BlobResult]
  ): SpeedSummary = js.native
  
  /**
    * Releases the lease.
    * If container and blob are specified, releases the blob lease.
    * Otherwise, if only container is specified and blob is null, releases the container lease.
    */
  def releaseLease(container: String, blob: String, leaseId: String, callback: StorageCallback[LeaseResult]): Unit = js.native
  def releaseLease(
    container: String,
    blob: String,
    leaseId: String,
    options: AccessConditionsOptions,
    callback: StorageCallback[LeaseResult]
  ): Unit = js.native
  
  /**
    * Renews an existing lease.
    * If container and blob are specified, renews the blob lease.
    * Otherwise, if only container is specified and blob is null, renews the container lease.
    */
  def renewLease(container: String, blob: String, leaseId: String, callback: StorageCallback[LeaseResult]): Unit = js.native
  def renewLease(
    container: String,
    blob: String,
    leaseId: String,
    options: AccessConditionsOptions,
    callback: StorageCallback[LeaseResult]
  ): Unit = js.native
  
  /**
    * Resizes a page blob.
    */
  def resizePageBlob(container: String, blob: String, size: Double, callback: StorageCallback[BlobResult]): Unit = js.native
  def resizePageBlob(
    container: String,
    blob: String,
    size: Double,
    options: LeaseAccessConditionsOptions,
    callback: StorageCallback[BlobResult]
  ): Unit = js.native
  
  /**
    * Sets user-defined metadata for the specified blob or snapshot as one or more name-value pairs
    * It does not return or modify the content of the blob.
    */
  def setBlobMetadata(container: String, blob: String, metadata: StorageMetadata, callback: StorageCallback[BlobResult]): Unit = js.native
  def setBlobMetadata(
    container: String,
    blob: String,
    metadata: StorageMetadata,
    options: GetBlobPropertiesOptions,
    callback: StorageCallback[BlobResult]
  ): Unit = js.native
  
  /**
    * Sets user-defined properties for the specified blob or snapshot.
    * It does not return or modify the content of the blob.
    */
  def setBlobProperties(container: String, blob: String, callback: StorageCallback[BlobResult]): Unit = js.native
  def setBlobProperties(
    container: String,
    blob: String,
    options: SetBlobPropertiesOptions,
    callback: StorageCallback[BlobResult]
  ): Unit = js.native
  
  /**
    * Updates the container's ACL.
    */
  def setContainerAcl(container: String, publicAccessLevel: String, callback: StorageCallback[ContainerResult]): Unit = js.native
  def setContainerAcl(
    container: String,
    publicAccessLevel: String,
    options: StorageAclOptions,
    callback: StorageCallback[ContainerResult]
  ): Unit = js.native
  
  /**
    * Sets the container's metadata.
    */
  def setContainerMetadata(container: String, metadata: StorageMetadata, callback: StorageCallback[ContainerResult]): Unit = js.native
  def setContainerMetadata(
    container: String,
    metadata: StorageMetadata,
    options: AccessConditionsOptions,
    callback: StorageCallback[ContainerResult]
  ): Unit = js.native
  
  /**
    * Sets the page blob's sequence number.
    */
  def setPageBlobSequenceNumber(
    container: String,
    blob: String,
    sequenceNumberAction: String,
    sequenceNumber: String,
    callback: StorageCallback[BlobResult]
  ): Unit = js.native
  def setPageBlobSequenceNumber(
    container: String,
    blob: String,
    sequenceNumberAction: String,
    sequenceNumber: String,
    options: AccessConditionsOptions,
    callback: StorageCallback[BlobResult]
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
  
  var singleBlobPutThresholdInBytes: Double = js.native
}

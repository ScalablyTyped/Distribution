package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRepositoryAssociation extends StObject {
  
  /**
    * The system-generated, unique ID of the data repository association.
    */
  var AssociationId: js.UndefOr[DataRepositoryAssociationId] = js.undefined
  
  /**
    * A boolean flag indicating whether an import data repository task to import metadata should run after the data repository association is created. The task runs if this flag is set to true.
    */
  var BatchImportMetaDataOnCreate: js.UndefOr[typings.awsSdk.fsxMod.BatchImportMetaDataOnCreate] = js.undefined
  
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The path to the Amazon S3 data repository that will be linked to the file system. The path can be an S3 bucket or prefix in the format s3://myBucket/myPrefix/. This path specifies where in the S3 data repository files will be imported from or exported to.
    */
  var DataRepositoryPath: js.UndefOr[ArchivePath] = js.undefined
  
  var FailureDetails: js.UndefOr[DataRepositoryFailureDetails] = js.undefined
  
  var FileSystemId: js.UndefOr[typings.awsSdk.fsxMod.FileSystemId] = js.undefined
  
  /**
    * A path on the file system that points to a high-level directory (such as /ns1/) or subdirectory (such as /ns1/subdir/) that will be mapped 1-1 with DataRepositoryPath. The leading forward slash in the name is required. Two data repository associations cannot have overlapping file system paths. For example, if a data repository is associated with file system path /ns1/, then you cannot link another data repository with file system path /ns1/ns2. This path specifies where in your file system files will be exported from or imported to. This file system directory can be linked to only one Amazon S3 bucket, and no other S3 bucket can be linked to the directory.  If you specify only a forward slash (/) as the file system path, you can link only 1 data repository to the file system. You can only specify "/" as the file system path for the first data repository associated with a file system. 
    */
  var FileSystemPath: js.UndefOr[Namespace] = js.undefined
  
  /**
    * For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be striped across is limited by the total number of disks that make up the file system. The default chunk size is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a maximum size of 5 TB.
    */
  var ImportedFileChunkSize: js.UndefOr[Megabytes] = js.undefined
  
  /**
    * Describes the state of a data repository association. The lifecycle can have the following values:    CREATING - The data repository association between the FSx file system and the S3 data repository is being created. The data repository is unavailable.    AVAILABLE - The data repository association is available for use.    MISCONFIGURED - Amazon FSx cannot automatically import updates from the S3 bucket or automatically export updates to the S3 bucket until the data repository association configuration is corrected.    UPDATING - The data repository association is undergoing a customer initiated update that might affect its availability.    DELETING - The data repository association is undergoing a customer initiated deletion.    FAILED - The data repository association is in a terminal state that cannot be recovered.  
    */
  var Lifecycle: js.UndefOr[DataRepositoryLifecycle] = js.undefined
  
  var ResourceARN: js.UndefOr[typings.awsSdk.fsxMod.ResourceARN] = js.undefined
  
  /**
    * The configuration for an Amazon S3 data repository linked to an Amazon FSx Lustre file system with a data repository association. The configuration defines which file events (new, changed, or deleted files or directories) are automatically imported from the linked data repository to the file system or automatically exported from the file system to the data repository.
    */
  var S3: js.UndefOr[S3DataRepositoryConfiguration] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.fsxMod.Tags] = js.undefined
}
object DataRepositoryAssociation {
  
  inline def apply(): DataRepositoryAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRepositoryAssociation]
  }
  
  extension [Self <: DataRepositoryAssociation](x: Self) {
    
    inline def setAssociationId(value: DataRepositoryAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setBatchImportMetaDataOnCreate(value: BatchImportMetaDataOnCreate): Self = StObject.set(x, "BatchImportMetaDataOnCreate", value.asInstanceOf[js.Any])
    
    inline def setBatchImportMetaDataOnCreateUndefined: Self = StObject.set(x, "BatchImportMetaDataOnCreate", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDataRepositoryPath(value: ArchivePath): Self = StObject.set(x, "DataRepositoryPath", value.asInstanceOf[js.Any])
    
    inline def setDataRepositoryPathUndefined: Self = StObject.set(x, "DataRepositoryPath", js.undefined)
    
    inline def setFailureDetails(value: DataRepositoryFailureDetails): Self = StObject.set(x, "FailureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "FailureDetails", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    inline def setFileSystemPath(value: Namespace): Self = StObject.set(x, "FileSystemPath", value.asInstanceOf[js.Any])
    
    inline def setFileSystemPathUndefined: Self = StObject.set(x, "FileSystemPath", js.undefined)
    
    inline def setImportedFileChunkSize(value: Megabytes): Self = StObject.set(x, "ImportedFileChunkSize", value.asInstanceOf[js.Any])
    
    inline def setImportedFileChunkSizeUndefined: Self = StObject.set(x, "ImportedFileChunkSize", js.undefined)
    
    inline def setLifecycle(value: DataRepositoryLifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setS3(value: S3DataRepositoryConfiguration): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}

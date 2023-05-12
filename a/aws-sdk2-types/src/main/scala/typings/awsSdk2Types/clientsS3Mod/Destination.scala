package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  /**
    * Specify this only in a cross-account scenario (where source and destination bucket owners are not the same), and you want to change replica ownership to the Amazon Web Services account that owns the destination bucket. If this is not specified in the replication configuration, the replicas are owned by same Amazon Web Services account that owns the source object.
    */
  var AccessControlTranslation: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.AccessControlTranslation] = js.undefined
  
  /**
    * Destination bucket owner account ID. In a cross-account scenario, if you direct Amazon S3 to change replica ownership to the Amazon Web Services account that owns the destination bucket by specifying the AccessControlTranslation property, this is the account ID of the destination bucket owner. For more information, see Replication Additional Configuration: Changing the Replica Owner in the Amazon S3 User Guide.
    */
  var Account: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to store the results.
    */
  var Bucket: BucketName
  
  /**
    * A container that provides information about encryption. If SourceSelectionCriteria is specified, you must specify this element.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.EncryptionConfiguration] = js.undefined
  
  /**
    *  A container specifying replication metrics-related settings enabling replication metrics and events. 
    */
  var Metrics: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Metrics] = js.undefined
  
  /**
    *  A container specifying S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and the time when all objects and operations on objects must be replicated. Must be specified together with a Metrics block. 
    */
  var ReplicationTime: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ReplicationTime] = js.undefined
  
  /**
    *  The storage class to use when replicating objects, such as S3 Standard or reduced redundancy. By default, Amazon S3 uses the storage class of the source object to create the object replica.  For valid values, see the StorageClass element of the PUT Bucket replication action in the Amazon S3 API Reference.
    */
  var StorageClass: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.StorageClass] = js.undefined
}
object Destination {
  
  inline def apply(Bucket: BucketName): Destination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
    
    inline def setAccessControlTranslation(value: AccessControlTranslation): Self = StObject.set(x, "AccessControlTranslation", value.asInstanceOf[js.Any])
    
    inline def setAccessControlTranslationUndefined: Self = StObject.set(x, "AccessControlTranslation", js.undefined)
    
    inline def setAccount(value: AccountId): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setMetrics(value: Metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setReplicationTime(value: ReplicationTime): Self = StObject.set(x, "ReplicationTime", value.asInstanceOf[js.Any])
    
    inline def setReplicationTimeUndefined: Self = StObject.set(x, "ReplicationTime", js.undefined)
    
    inline def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
  }
}

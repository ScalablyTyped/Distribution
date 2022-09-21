package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerReplicationParameters extends StObject {
  
  /**
    * Indicates whether the replication job produces encrypted AMIs.
    */
  var encrypted: js.UndefOr[Encrypted] = js.undefined
  
  /**
    * The frequency of creating replication jobs for the server.
    */
  var frequency: js.UndefOr[Frequency] = js.undefined
  
  /**
    * The ID of the KMS key for replication jobs that produce encrypted AMIs. This value can be any of the following:   KMS key ID   KMS key alias   ARN referring to the KMS key ID   ARN referring to the KMS key alias   If encrypted is enabled but a KMS key ID is not specified, the customer's default KMS key for Amazon EBS is used.
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The license type for creating a replication job for the server.
    */
  var licenseType: js.UndefOr[LicenseType] = js.undefined
  
  /**
    * The number of recent AMIs to keep when creating a replication job for this server.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined
  
  /**
    * Indicates whether to run the replication job one time.
    */
  var runOnce: js.UndefOr[RunOnce] = js.undefined
  
  /**
    * The seed time for creating a replication job for the server.
    */
  var seedTime: js.UndefOr[js.Date] = js.undefined
}
object ServerReplicationParameters {
  
  inline def apply(): ServerReplicationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerReplicationParameters]
  }
  
  extension [Self <: ServerReplicationParameters](x: Self) {
    
    inline def setEncrypted(value: Encrypted): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    inline def setFrequency(value: Frequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setLicenseType(value: LicenseType): Self = StObject.set(x, "licenseType", value.asInstanceOf[js.Any])
    
    inline def setLicenseTypeUndefined: Self = StObject.set(x, "licenseType", js.undefined)
    
    inline def setNumberOfRecentAmisToKeep(value: NumberOfRecentAmisToKeep): Self = StObject.set(x, "numberOfRecentAmisToKeep", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRecentAmisToKeepUndefined: Self = StObject.set(x, "numberOfRecentAmisToKeep", js.undefined)
    
    inline def setRunOnce(value: RunOnce): Self = StObject.set(x, "runOnce", value.asInstanceOf[js.Any])
    
    inline def setRunOnceUndefined: Self = StObject.set(x, "runOnce", js.undefined)
    
    inline def setSeedTime(value: js.Date): Self = StObject.set(x, "seedTime", value.asInstanceOf[js.Any])
    
    inline def setSeedTimeUndefined: Self = StObject.set(x, "seedTime", js.undefined)
  }
}

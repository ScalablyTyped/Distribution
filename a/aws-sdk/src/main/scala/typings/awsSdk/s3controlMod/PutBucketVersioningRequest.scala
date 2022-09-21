package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketVersioningRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID of the S3 on Outposts bucket.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId
  
  /**
    * The S3 on Outposts bucket to set the versioning state for.
    */
  var Bucket: BucketName
  
  /**
    * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device.
    */
  var MFA: js.UndefOr[typings.awsSdk.s3controlMod.MFA] = js.undefined
  
  /**
    * The root-level tag for the VersioningConfiguration parameters.
    */
  var VersioningConfiguration: typings.awsSdk.s3controlMod.VersioningConfiguration
}
object PutBucketVersioningRequest {
  
  inline def apply(AccountId: AccountId, Bucket: BucketName, VersioningConfiguration: VersioningConfiguration): PutBucketVersioningRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], VersioningConfiguration = VersioningConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketVersioningRequest]
  }
  
  extension [Self <: PutBucketVersioningRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setMFA(value: MFA): Self = StObject.set(x, "MFA", value.asInstanceOf[js.Any])
    
    inline def setMFAUndefined: Self = StObject.set(x, "MFA", js.undefined)
    
    inline def setVersioningConfiguration(value: VersioningConfiguration): Self = StObject.set(x, "VersioningConfiguration", value.asInstanceOf[js.Any])
  }
}

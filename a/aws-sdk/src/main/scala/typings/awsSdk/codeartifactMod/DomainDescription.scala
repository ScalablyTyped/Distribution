package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDescription extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the domain. 
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    *  The total size of all assets in the domain. 
    */
  var assetSizeBytes: js.UndefOr[Long] = js.undefined
  
  /**
    *  A timestamp that represents the date and time the domain was created. 
    */
  var createdTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The ARN of an Key Management Service (KMS) key associated with a domain. 
    */
  var encryptionKey: js.UndefOr[Arn] = js.undefined
  
  /**
    *  The name of the domain. 
    */
  var name: js.UndefOr[DomainName] = js.undefined
  
  /**
    *  The Amazon Web Services account ID that owns the domain. 
    */
  var owner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The number of repositories in the domain. 
    */
  var repositoryCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 bucket that is used to store package assets in the domain.
    */
  var s3BucketArn: js.UndefOr[Arn] = js.undefined
  
  /**
    *  The current status of a domain. 
    */
  var status: js.UndefOr[DomainStatus] = js.undefined
}
object DomainDescription {
  
  inline def apply(): DomainDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDescription]
  }
  
  extension [Self <: DomainDescription](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setAssetSizeBytes(value: Long): Self = StObject.set(x, "assetSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setAssetSizeBytesUndefined: Self = StObject.set(x, "assetSizeBytes", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setEncryptionKey(value: Arn): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: AccountId): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRepositoryCount(value: Integer): Self = StObject.set(x, "repositoryCount", value.asInstanceOf[js.Any])
    
    inline def setRepositoryCountUndefined: Self = StObject.set(x, "repositoryCount", js.undefined)
    
    inline def setS3BucketArn(value: Arn): Self = StObject.set(x, "s3BucketArn", value.asInstanceOf[js.Any])
    
    inline def setS3BucketArnUndefined: Self = StObject.set(x, "s3BucketArn", js.undefined)
    
    inline def setStatus(value: DomainStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

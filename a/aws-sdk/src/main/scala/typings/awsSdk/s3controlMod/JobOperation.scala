package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOperation extends StObject {
  
  /**
    * Directs the specified job to invoke an Lambda function on every object in the manifest.
    */
  var LambdaInvoke: js.UndefOr[LambdaInvokeOperation] = js.undefined
  
  /**
    * Directs the specified job to execute a DELETE Object tagging call on every object in the manifest.
    */
  var S3DeleteObjectTagging: js.UndefOr[S3DeleteObjectTaggingOperation] = js.undefined
  
  /**
    * Directs the specified job to initiate restore requests for every archived object in the manifest.
    */
  var S3InitiateRestoreObject: js.UndefOr[S3InitiateRestoreObjectOperation] = js.undefined
  
  /**
    * Directs the specified job to run a PUT Object acl call on every object in the manifest.
    */
  var S3PutObjectAcl: js.UndefOr[S3SetObjectAclOperation] = js.undefined
  
  /**
    * Directs the specified job to run a PUT Copy object call on every object in the manifest.
    */
  var S3PutObjectCopy: js.UndefOr[S3CopyObjectOperation] = js.undefined
  
  var S3PutObjectLegalHold: js.UndefOr[S3SetObjectLegalHoldOperation] = js.undefined
  
  var S3PutObjectRetention: js.UndefOr[S3SetObjectRetentionOperation] = js.undefined
  
  /**
    * Directs the specified job to run a PUT Object tagging call on every object in the manifest.
    */
  var S3PutObjectTagging: js.UndefOr[S3SetObjectTaggingOperation] = js.undefined
  
  /**
    * Directs the specified job to invoke ReplicateObject on every object in the job's manifest.
    */
  var S3ReplicateObject: js.UndefOr[S3ReplicateObjectOperation] = js.undefined
}
object JobOperation {
  
  inline def apply(): JobOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobOperation]
  }
  
  extension [Self <: JobOperation](x: Self) {
    
    inline def setLambdaInvoke(value: LambdaInvokeOperation): Self = StObject.set(x, "LambdaInvoke", value.asInstanceOf[js.Any])
    
    inline def setLambdaInvokeUndefined: Self = StObject.set(x, "LambdaInvoke", js.undefined)
    
    inline def setS3DeleteObjectTagging(value: S3DeleteObjectTaggingOperation): Self = StObject.set(x, "S3DeleteObjectTagging", value.asInstanceOf[js.Any])
    
    inline def setS3DeleteObjectTaggingUndefined: Self = StObject.set(x, "S3DeleteObjectTagging", js.undefined)
    
    inline def setS3InitiateRestoreObject(value: S3InitiateRestoreObjectOperation): Self = StObject.set(x, "S3InitiateRestoreObject", value.asInstanceOf[js.Any])
    
    inline def setS3InitiateRestoreObjectUndefined: Self = StObject.set(x, "S3InitiateRestoreObject", js.undefined)
    
    inline def setS3PutObjectAcl(value: S3SetObjectAclOperation): Self = StObject.set(x, "S3PutObjectAcl", value.asInstanceOf[js.Any])
    
    inline def setS3PutObjectAclUndefined: Self = StObject.set(x, "S3PutObjectAcl", js.undefined)
    
    inline def setS3PutObjectCopy(value: S3CopyObjectOperation): Self = StObject.set(x, "S3PutObjectCopy", value.asInstanceOf[js.Any])
    
    inline def setS3PutObjectCopyUndefined: Self = StObject.set(x, "S3PutObjectCopy", js.undefined)
    
    inline def setS3PutObjectLegalHold(value: S3SetObjectLegalHoldOperation): Self = StObject.set(x, "S3PutObjectLegalHold", value.asInstanceOf[js.Any])
    
    inline def setS3PutObjectLegalHoldUndefined: Self = StObject.set(x, "S3PutObjectLegalHold", js.undefined)
    
    inline def setS3PutObjectRetention(value: S3SetObjectRetentionOperation): Self = StObject.set(x, "S3PutObjectRetention", value.asInstanceOf[js.Any])
    
    inline def setS3PutObjectRetentionUndefined: Self = StObject.set(x, "S3PutObjectRetention", js.undefined)
    
    inline def setS3PutObjectTagging(value: S3SetObjectTaggingOperation): Self = StObject.set(x, "S3PutObjectTagging", value.asInstanceOf[js.Any])
    
    inline def setS3PutObjectTaggingUndefined: Self = StObject.set(x, "S3PutObjectTagging", js.undefined)
    
    inline def setS3ReplicateObject(value: S3ReplicateObjectOperation): Self = StObject.set(x, "S3ReplicateObject", value.asInstanceOf[js.Any])
    
    inline def setS3ReplicateObjectUndefined: Self = StObject.set(x, "S3ReplicateObject", js.undefined)
  }
}

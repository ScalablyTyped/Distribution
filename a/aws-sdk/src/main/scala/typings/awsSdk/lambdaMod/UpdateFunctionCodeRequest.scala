package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFunctionCodeRequest extends StObject {
  
  /**
    * The instruction set architecture that the function supports. Enter a string array with one of the valid values (arm64 or x86_64). The default value is x86_64.
    */
  var Architectures: js.UndefOr[ArchitecturesList] = js.undefined
  
  /**
    * Set to true to validate the request parameters and access permissions without modifying the function code.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName
  
  /**
    * URI of a container image in the Amazon ECR registry. Do not use for a function defined with a .zip file archive.
    */
  var ImageUri: js.UndefOr[String] = js.undefined
  
  /**
    * Set to true to publish a new version of the function after updating the code. This has the same effect as calling PublishVersion separately.
    */
  var Publish: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only update the function if the revision ID matches the ID that's specified. Use this option to avoid modifying a function that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * An Amazon S3 bucket in the same Amazon Web Services Region as your function. The bucket can be in a different Amazon Web Services account. Use only with a function defined with a .zip file archive deployment package.
    */
  var S3Bucket: js.UndefOr[typings.awsSdk.lambdaMod.S3Bucket] = js.undefined
  
  /**
    * The Amazon S3 key of the deployment package. Use only with a function defined with a .zip file archive deployment package.
    */
  var S3Key: js.UndefOr[typings.awsSdk.lambdaMod.S3Key] = js.undefined
  
  /**
    * For versioned objects, the version of the deployment package object to use.
    */
  var S3ObjectVersion: js.UndefOr[typings.awsSdk.lambdaMod.S3ObjectVersion] = js.undefined
  
  /**
    * The base64-encoded contents of the deployment package. Amazon Web Services SDK and Amazon Web Services CLI clients handle the encoding for you. Use only with a function defined with a .zip file archive deployment package.
    */
  var ZipFile: js.UndefOr[_Blob] = js.undefined
}
object UpdateFunctionCodeRequest {
  
  inline def apply(FunctionName: FunctionName): UpdateFunctionCodeRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionCodeRequest]
  }
  
  extension [Self <: UpdateFunctionCodeRequest](x: Self) {
    
    inline def setArchitectures(value: ArchitecturesList): Self = StObject.set(x, "Architectures", value.asInstanceOf[js.Any])
    
    inline def setArchitecturesUndefined: Self = StObject.set(x, "Architectures", js.undefined)
    
    inline def setArchitecturesVarargs(value: Architecture*): Self = StObject.set(x, "Architectures", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setImageUri(value: String): Self = StObject.set(x, "ImageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "ImageUri", js.undefined)
    
    inline def setPublish(value: Boolean): Self = StObject.set(x, "Publish", value.asInstanceOf[js.Any])
    
    inline def setPublishUndefined: Self = StObject.set(x, "Publish", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    inline def setS3Key(value: S3Key): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    inline def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
    
    inline def setS3ObjectVersion(value: S3ObjectVersion): Self = StObject.set(x, "S3ObjectVersion", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectVersionUndefined: Self = StObject.set(x, "S3ObjectVersion", js.undefined)
    
    inline def setZipFile(value: _Blob): Self = StObject.set(x, "ZipFile", value.asInstanceOf[js.Any])
    
    inline def setZipFileUndefined: Self = StObject.set(x, "ZipFile", js.undefined)
  }
}

package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformS3DataSource extends StObject {
  
  /**
    * If you choose S3Prefix, S3Uri identifies a key name prefix. Amazon SageMaker uses all objects with the specified key name prefix for batch transform.  If you choose ManifestFile, S3Uri identifies an object that is a manifest file containing a list of object keys that you want Amazon SageMaker to use for batch transform.  The following values are compatible: ManifestFile, S3Prefix  The following value is not compatible: AugmentedManifestFile 
    */
  var S3DataType: typings.awsSdk.sagemakerMod.S3DataType
  
  /**
    * Depending on the value specified for the S3DataType, identifies either a key name prefix or a manifest. For example:    A key name prefix might look like this: s3://bucketname/exampleprefix.     A manifest might look like this: s3://bucketname/example.manifest   The manifest is an S3 object which is a JSON file with the following format:   [ {"prefix": "s3://customer_bucket/some/prefix/"},   "relative/path/to/custdata-1",   "relative/path/custdata-2",   ...   "relative/path/custdata-N"   ]   The preceding JSON matches the following S3Uris:   s3://customer_bucket/some/prefix/relative/path/to/custdata-1   s3://customer_bucket/some/prefix/relative/path/custdata-2   ...   s3://customer_bucket/some/prefix/relative/path/custdata-N   The complete set of S3Uris in this manifest constitutes the input data for the channel for this datasource. The object that each S3Uris points to must be readable by the IAM role that Amazon SageMaker uses to perform tasks on your behalf.  
    */
  var S3Uri: typings.awsSdk.sagemakerMod.S3Uri
}
object TransformS3DataSource {
  
  @scala.inline
  def apply(S3DataType: S3DataType, S3Uri: S3Uri): TransformS3DataSource = {
    val __obj = js.Dynamic.literal(S3DataType = S3DataType.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformS3DataSource]
  }
  
  @scala.inline
  implicit class TransformS3DataSourceMutableBuilder[Self <: TransformS3DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3DataType(value: S3DataType): Self = StObject.set(x, "S3DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}

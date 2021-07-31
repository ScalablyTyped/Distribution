package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DestinationConfiguration extends StObject {
  
  /**
    * The name of the S3 bucket to which dataset contents are delivered.
    */
  var bucket: BucketName
  
  /**
    * Configuration information for coordination with AWS Glue, a fully managed extract, transform and load (ETL) service.
    */
  var glueConfiguration: js.UndefOr[GlueConfiguration] = js.undefined
  
  /**
    * The key of the dataset contents object in an S3 bucket. Each object has a key that is a unique identifier. Each object has exactly one key. You can create a unique key with the following options:   Use !{iotanalytics:scheduleTime} to insert the time of a scheduled SQL query run.   Use !{iotanalytics:versionId} to insert a unique hash that identifies a dataset content.   Use !{iotanalytics:creationTime} to insert the creation time of a dataset content.   The following example creates a unique key for a CSV file: dataset/mydataset/!{iotanalytics:scheduleTime}/!{iotanalytics:versionId}.csv   If you don't use !{iotanalytics:versionId} to specify the key, you might get duplicate keys. For example, you might have two dataset contents with the same scheduleTime but different versionIds. This means that one dataset content overwrites the other.  
    */
  var key: BucketKeyExpression
  
  /**
    * The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon S3 and AWS Glue resources.
    */
  var roleArn: RoleArn
}
object S3DestinationConfiguration {
  
  @scala.inline
  def apply(bucket: BucketName, key: BucketKeyExpression, roleArn: RoleArn): S3DestinationConfiguration = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DestinationConfiguration]
  }
  
  @scala.inline
  implicit class S3DestinationConfigurationMutableBuilder[Self <: S3DestinationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlueConfiguration(value: GlueConfiguration): Self = StObject.set(x, "glueConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlueConfigurationUndefined: Self = StObject.set(x, "glueConfiguration", js.undefined)
    
    @scala.inline
    def setKey(value: BucketKeyExpression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}

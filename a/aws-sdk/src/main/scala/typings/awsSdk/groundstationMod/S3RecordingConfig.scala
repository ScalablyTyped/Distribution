package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3RecordingConfig extends StObject {
  
  /**
    * ARN of the bucket to record to.
    */
  var bucketArn: BucketArn
  
  /**
    * S3 Key prefix to prefice data files.
    */
  var prefix: js.UndefOr[S3KeyPrefix] = js.undefined
  
  /**
    * ARN of the role Ground Station assumes to write data to the bucket.
    */
  var roleArn: RoleArn
}
object S3RecordingConfig {
  
  inline def apply(bucketArn: BucketArn, roleArn: RoleArn): S3RecordingConfig = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3RecordingConfig]
  }
  
  extension [Self <: S3RecordingConfig](x: Self) {
    
    inline def setBucketArn(value: BucketArn): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: S3KeyPrefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}

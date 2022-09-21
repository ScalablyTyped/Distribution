package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Location extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an S3 bucket.
    */
  var bucketArn: string
  
  /**
    * The file key for an object in an S3 bucket.
    */
  var fileKey: string
  
  /**
    * The version of an object in an S3 bucket.
    */
  var objectVersion: js.UndefOr[string] = js.undefined
}
object S3Location {
  
  inline def apply(bucketArn: string, fileKey: string): S3Location = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], fileKey = fileKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
  
  extension [Self <: S3Location](x: Self) {
    
    inline def setBucketArn(value: string): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    inline def setFileKey(value: string): Self = StObject.set(x, "fileKey", value.asInstanceOf[js.Any])
    
    inline def setObjectVersion(value: string): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}

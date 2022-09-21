package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DestinationConfiguration extends StObject {
  
  /**
    * Location (S3 bucket name) where recorded videos will be stored.
    */
  var bucketName: S3DestinationBucketName
}
object S3DestinationConfiguration {
  
  inline def apply(bucketName: S3DestinationBucketName): S3DestinationConfiguration = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DestinationConfiguration]
  }
  
  extension [Self <: S3DestinationConfiguration](x: Self) {
    
    inline def setBucketName(value: S3DestinationBucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
  }
}

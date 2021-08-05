package typings.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Resource extends StObject {
  
  /**
    * The name of the S3 bucket.
    */
  var bucketName: BucketName
  
  /**
    * The prefix of the S3 bucket. 
    */
  var prefix: js.UndefOr[Prefix] = js.undefined
}
object S3Resource {
  
  inline def apply(bucketName: BucketName): S3Resource = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Resource]
  }
  
  extension [Self <: S3Resource](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}

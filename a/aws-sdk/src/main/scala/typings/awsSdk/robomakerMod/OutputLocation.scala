package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputLocation extends StObject {
  
  /**
    * The S3 bucket for output.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
  
  /**
    * The S3 folder in the s3Bucket where output files will be placed.
    */
  var s3Prefix: js.UndefOr[S3Key] = js.undefined
}
object OutputLocation {
  
  inline def apply(): OutputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputLocation]
  }
  
  extension [Self <: OutputLocation](x: Self) {
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    inline def setS3Prefix(value: S3Key): Self = StObject.set(x, "s3Prefix", value.asInstanceOf[js.Any])
    
    inline def setS3PrefixUndefined: Self = StObject.set(x, "s3Prefix", js.undefined)
  }
}

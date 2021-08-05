package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageLensDataExport extends StObject {
  
  /**
    * A container for the bucket where the S3 Storage Lens metrics export will be located.
    */
  var S3BucketDestination: typings.awsSdk.s3controlMod.S3BucketDestination
}
object StorageLensDataExport {
  
  inline def apply(S3BucketDestination: S3BucketDestination): StorageLensDataExport = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageLensDataExport]
  }
  
  extension [Self <: StorageLensDataExport](x: Self) {
    
    inline def setS3BucketDestination(value: S3BucketDestination): Self = StObject.set(x, "S3BucketDestination", value.asInstanceOf[js.Any])
  }
}

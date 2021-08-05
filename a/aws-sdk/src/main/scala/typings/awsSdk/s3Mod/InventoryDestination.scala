package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryDestination extends StObject {
  
  /**
    * Contains the bucket name, file format, bucket owner (optional), and prefix (optional) where inventory results are published.
    */
  var S3BucketDestination: InventoryS3BucketDestination
}
object InventoryDestination {
  
  inline def apply(S3BucketDestination: InventoryS3BucketDestination): InventoryDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDestination]
  }
  
  extension [Self <: InventoryDestination](x: Self) {
    
    inline def setS3BucketDestination(value: InventoryS3BucketDestination): Self = StObject.set(x, "S3BucketDestination", value.asInstanceOf[js.Any])
  }
}

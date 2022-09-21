package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Location extends StObject {
  
  /**
    * A bucket name.
    */
  var BucketName: typings.awsSdk.panoramaMod.BucketName
  
  /**
    * An object key.
    */
  var ObjectKey: typings.awsSdk.panoramaMod.ObjectKey
  
  /**
    * The bucket's Region.
    */
  var Region: js.UndefOr[typings.awsSdk.panoramaMod.Region] = js.undefined
}
object S3Location {
  
  inline def apply(BucketName: BucketName, ObjectKey: ObjectKey): S3Location = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], ObjectKey = ObjectKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
  
  extension [Self <: S3Location](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setObjectKey(value: ObjectKey): Self = StObject.set(x, "ObjectKey", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}

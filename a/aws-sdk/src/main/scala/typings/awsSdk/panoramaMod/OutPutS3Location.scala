package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutPutS3Location extends StObject {
  
  /**
    * The object's bucket.
    */
  var BucketName: typings.awsSdk.panoramaMod.BucketName
  
  /**
    * The object's key.
    */
  var ObjectKey: typings.awsSdk.panoramaMod.ObjectKey
}
object OutPutS3Location {
  
  inline def apply(BucketName: BucketName, ObjectKey: ObjectKey): OutPutS3Location = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], ObjectKey = ObjectKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutPutS3Location]
  }
  
  extension [Self <: OutPutS3Location](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setObjectKey(value: ObjectKey): Self = StObject.set(x, "ObjectKey", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Destination extends StObject {
  
  /**
    *  The name of the Amazon S3 bucket you want to associate with the streaming video project. You must be the owner of the Amazon S3 bucket. 
    */
  var Bucket: js.UndefOr[S3Bucket] = js.undefined
  
  /**
    *  The prefix value of the location within the bucket that you want the information to be published to. For more information, see Using prefixes. 
    */
  var KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
}
object S3Destination {
  
  inline def apply(): S3Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Destination]
  }
  
  extension [Self <: S3Destination](x: Self) {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setKeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixUndefined: Self = StObject.set(x, "KeyPrefix", js.undefined)
  }
}

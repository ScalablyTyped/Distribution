package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStorageLocationResultMessage extends StObject {
  
  /**
    * The name of the Amazon S3 bucket created.
    */
  var S3Bucket: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.S3Bucket] = js.undefined
}
object CreateStorageLocationResultMessage {
  
  inline def apply(): CreateStorageLocationResultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorageLocationResultMessage]
  }
  
  extension [Self <: CreateStorageLocationResultMessage](x: Self) {
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
  }
}

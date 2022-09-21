package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectSource extends StObject {
  
  /**
    * The name of the S3 bucket that contains a template bundle.
    */
  var bucket: S3Bucket
  
  /**
    * The path to the S3 bucket that contains a template bundle.
    */
  var key: S3Key
}
object S3ObjectSource {
  
  inline def apply(bucket: S3Bucket, key: S3Key): S3ObjectSource = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ObjectSource]
  }
  
  extension [Self <: S3ObjectSource](x: Self) {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setKey(value: S3Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}

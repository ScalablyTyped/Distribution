package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Object extends StObject {
  
  /**
    * The name of the S3 bucket.
    */
  var Bucket: js.UndefOr[S3Bucket] = js.undefined
  
  /**
    * The file name of the input document. Synchronous operations can use image files that are in JPEG or PNG format. Asynchronous operations also support PDF format files.
    */
  var Name: js.UndefOr[S3ObjectName] = js.undefined
  
  /**
    * If the bucket has versioning enabled, you can specify the object version. 
    */
  var Version: js.UndefOr[S3ObjectVersion] = js.undefined
}
object S3Object {
  
  inline def apply(): S3Object = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Object]
  }
  
  extension [Self <: S3Object](x: Self) {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setName(value: S3ObjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setVersion(value: S3ObjectVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}

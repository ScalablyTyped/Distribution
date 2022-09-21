package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3FileLocation extends StObject {
  
  /**
    * Specifies the S3 bucket that contains the file being used.
    */
  var Bucket: js.UndefOr[S3Bucket] = js.undefined
  
  /**
    * The entity tag is a hash of the object. The ETag reflects changes only to the contents of an object, not its metadata.
    */
  var Etag: js.UndefOr[S3Etag] = js.undefined
  
  /**
    * The name assigned to the file when it was created in Amazon S3. You use the object key to retrieve the object.
    */
  var Key: js.UndefOr[S3Key] = js.undefined
  
  /**
    * Specifies the file version.
    */
  var VersionId: js.UndefOr[S3VersionId] = js.undefined
}
object S3FileLocation {
  
  inline def apply(): S3FileLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3FileLocation]
  }
  
  extension [Self <: S3FileLocation](x: Self) {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setEtag(value: S3Etag): Self = StObject.set(x, "Etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "Etag", js.undefined)
    
    inline def setKey(value: S3Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setVersionId(value: S3VersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}

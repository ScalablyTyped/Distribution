package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobManifestLocation extends StObject {
  
  /**
    * The ETag for the specified manifest object.
    */
  var ETag: NonEmptyMaxLength1024String
  
  /**
    * The Amazon Resource Name (ARN) for a manifest object.  Replacement must be made for object keys containing special characters (such as carriage returns) when using XML requests. For more information, see  XML related object key constraints. 
    */
  var ObjectArn: S3KeyArnString
  
  /**
    * The optional version ID to identify a specific version of the manifest object.
    */
  var ObjectVersionId: js.UndefOr[S3ObjectVersionId] = js.undefined
}
object JobManifestLocation {
  
  inline def apply(ETag: NonEmptyMaxLength1024String, ObjectArn: S3KeyArnString): JobManifestLocation = {
    val __obj = js.Dynamic.literal(ETag = ETag.asInstanceOf[js.Any], ObjectArn = ObjectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobManifestLocation]
  }
  
  extension [Self <: JobManifestLocation](x: Self) {
    
    inline def setETag(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setObjectArn(value: S3KeyArnString): Self = StObject.set(x, "ObjectArn", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionId(value: S3ObjectVersionId): Self = StObject.set(x, "ObjectVersionId", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionIdUndefined: Self = StObject.set(x, "ObjectVersionId", js.undefined)
  }
}

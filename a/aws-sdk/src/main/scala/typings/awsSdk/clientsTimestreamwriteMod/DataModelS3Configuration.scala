package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataModelS3Configuration extends StObject {
  
  /**
    * 
    */
  var BucketName: js.UndefOr[S3BucketName] = js.undefined
  
  /**
    * 
    */
  var ObjectKey: js.UndefOr[S3ObjectKey] = js.undefined
}
object DataModelS3Configuration {
  
  inline def apply(): DataModelS3Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataModelS3Configuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataModelS3Configuration] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: S3BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setObjectKey(value: S3ObjectKey): Self = StObject.set(x, "ObjectKey", value.asInstanceOf[js.Any])
    
    inline def setObjectKeyUndefined: Self = StObject.set(x, "ObjectKey", js.undefined)
  }
}

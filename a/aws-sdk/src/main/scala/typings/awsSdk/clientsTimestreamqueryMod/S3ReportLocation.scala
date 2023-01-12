package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ReportLocation extends StObject {
  
  /**
    *  S3 bucket name. 
    */
  var BucketName: js.UndefOr[S3BucketName] = js.undefined
  
  /**
    * S3 key. 
    */
  var ObjectKey: js.UndefOr[S3ObjectKey] = js.undefined
}
object S3ReportLocation {
  
  inline def apply(): S3ReportLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ReportLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ReportLocation] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: S3BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setObjectKey(value: S3ObjectKey): Self = StObject.set(x, "ObjectKey", value.asInstanceOf[js.Any])
    
    inline def setObjectKeyUndefined: Self = StObject.set(x, "ObjectKey", js.undefined)
  }
}

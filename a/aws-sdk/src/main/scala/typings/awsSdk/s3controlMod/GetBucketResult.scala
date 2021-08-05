package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketResult extends StObject {
  
  /**
    * The Outposts bucket requested.
    */
  var Bucket: js.UndefOr[BucketName] = js.undefined
  
  /**
    * The creation date of the Outposts bucket.
    */
  var CreationDate: js.UndefOr[typings.awsSdk.s3controlMod.CreationDate] = js.undefined
  
  /**
    * 
    */
  var PublicAccessBlockEnabled: js.UndefOr[typings.awsSdk.s3controlMod.PublicAccessBlockEnabled] = js.undefined
}
object GetBucketResult {
  
  inline def apply(): GetBucketResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketResult]
  }
  
  extension [Self <: GetBucketResult](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setCreationDate(value: CreationDate): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setPublicAccessBlockEnabled(value: PublicAccessBlockEnabled): Self = StObject.set(x, "PublicAccessBlockEnabled", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessBlockEnabledUndefined: Self = StObject.set(x, "PublicAccessBlockEnabled", js.undefined)
  }
}

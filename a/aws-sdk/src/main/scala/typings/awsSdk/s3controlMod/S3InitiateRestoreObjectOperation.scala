package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3InitiateRestoreObjectOperation extends StObject {
  
  /**
    * 
    */
  var ExpirationInDays: js.UndefOr[S3ExpirationInDays] = js.undefined
  
  /**
    * 
    */
  var GlacierJobTier: js.UndefOr[S3GlacierJobTier] = js.undefined
}
object S3InitiateRestoreObjectOperation {
  
  inline def apply(): S3InitiateRestoreObjectOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3InitiateRestoreObjectOperation]
  }
  
  extension [Self <: S3InitiateRestoreObjectOperation](x: Self) {
    
    inline def setExpirationInDays(value: S3ExpirationInDays): Self = StObject.set(x, "ExpirationInDays", value.asInstanceOf[js.Any])
    
    inline def setExpirationInDaysUndefined: Self = StObject.set(x, "ExpirationInDays", js.undefined)
    
    inline def setGlacierJobTier(value: S3GlacierJobTier): Self = StObject.set(x, "GlacierJobTier", value.asInstanceOf[js.Any])
    
    inline def setGlacierJobTierUndefined: Self = StObject.set(x, "GlacierJobTier", js.undefined)
  }
}

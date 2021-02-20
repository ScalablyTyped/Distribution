package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3InitiateRestoreObjectOperation extends StObject {
  
  /**
    * 
    */
  var ExpirationInDays: js.UndefOr[S3ExpirationInDays] = js.native
  
  /**
    * 
    */
  var GlacierJobTier: js.UndefOr[S3GlacierJobTier] = js.native
}
object S3InitiateRestoreObjectOperation {
  
  @scala.inline
  def apply(): S3InitiateRestoreObjectOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3InitiateRestoreObjectOperation]
  }
  
  @scala.inline
  implicit class S3InitiateRestoreObjectOperationMutableBuilder[Self <: S3InitiateRestoreObjectOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationInDays(value: S3ExpirationInDays): Self = StObject.set(x, "ExpirationInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationInDaysUndefined: Self = StObject.set(x, "ExpirationInDays", js.undefined)
    
    @scala.inline
    def setGlacierJobTier(value: S3GlacierJobTier): Self = StObject.set(x, "GlacierJobTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlacierJobTierUndefined: Self = StObject.set(x, "GlacierJobTier", js.undefined)
  }
}

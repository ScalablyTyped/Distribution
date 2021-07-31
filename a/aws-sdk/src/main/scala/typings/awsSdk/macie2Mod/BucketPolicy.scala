package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketPolicy extends StObject {
  
  /**
    * Specifies whether the bucket policy allows the general public to have read access to the bucket.
    */
  var allowsPublicReadAccess: js.UndefOr[boolean] = js.undefined
  
  /**
    * Specifies whether the bucket policy allows the general public to have write access to the bucket.
    */
  var allowsPublicWriteAccess: js.UndefOr[boolean] = js.undefined
}
object BucketPolicy {
  
  @scala.inline
  def apply(): BucketPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketPolicy]
  }
  
  @scala.inline
  implicit class BucketPolicyMutableBuilder[Self <: BucketPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowsPublicReadAccess(value: boolean): Self = StObject.set(x, "allowsPublicReadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsPublicReadAccessUndefined: Self = StObject.set(x, "allowsPublicReadAccess", js.undefined)
    
    @scala.inline
    def setAllowsPublicWriteAccess(value: boolean): Self = StObject.set(x, "allowsPublicWriteAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsPublicWriteAccessUndefined: Self = StObject.set(x, "allowsPublicWriteAccess", js.undefined)
  }
}

package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketPolicy extends StObject {
  
  /**
    * A value that indicates whether public read access for the bucket is enabled through a bucket policy.
    */
  var AllowsPublicReadAccess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether public write access for the bucket is enabled through a bucket policy.
    */
  var AllowsPublicWriteAccess: js.UndefOr[Boolean] = js.undefined
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
    def setAllowsPublicReadAccess(value: Boolean): Self = StObject.set(x, "AllowsPublicReadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsPublicReadAccessUndefined: Self = StObject.set(x, "AllowsPublicReadAccess", js.undefined)
    
    @scala.inline
    def setAllowsPublicWriteAccess(value: Boolean): Self = StObject.set(x, "AllowsPublicWriteAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsPublicWriteAccessUndefined: Self = StObject.set(x, "AllowsPublicWriteAccess", js.undefined)
  }
}

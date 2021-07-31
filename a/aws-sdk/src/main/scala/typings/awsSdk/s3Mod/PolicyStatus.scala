package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyStatus extends StObject {
  
  /**
    * The policy status for this bucket. TRUE indicates that this bucket is public. FALSE indicates that the bucket is not public.
    */
  var IsPublic: js.UndefOr[typings.awsSdk.s3Mod.IsPublic] = js.undefined
}
object PolicyStatus {
  
  @scala.inline
  def apply(): PolicyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyStatus]
  }
  
  @scala.inline
  implicit class PolicyStatusMutableBuilder[Self <: PolicyStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPublic(value: IsPublic): Self = StObject.set(x, "IsPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPublicUndefined: Self = StObject.set(x, "IsPublic", js.undefined)
  }
}

package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3AccessControlPolicy extends StObject {
  
  /**
    * 
    */
  var AccessControlList: js.UndefOr[S3AccessControlList] = js.native
  
  /**
    * 
    */
  var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList] = js.native
}
object S3AccessControlPolicy {
  
  @scala.inline
  def apply(): S3AccessControlPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3AccessControlPolicy]
  }
  
  @scala.inline
  implicit class S3AccessControlPolicyMutableBuilder[Self <: S3AccessControlPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlList(value: S3AccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlListUndefined: Self = StObject.set(x, "AccessControlList", js.undefined)
    
    @scala.inline
    def setCannedAccessControlList(value: S3CannedAccessControlList): Self = StObject.set(x, "CannedAccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCannedAccessControlListUndefined: Self = StObject.set(x, "CannedAccessControlList", js.undefined)
  }
}

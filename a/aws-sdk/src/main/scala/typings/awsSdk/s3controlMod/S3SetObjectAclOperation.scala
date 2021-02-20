package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3SetObjectAclOperation extends StObject {
  
  /**
    * 
    */
  var AccessControlPolicy: js.UndefOr[S3AccessControlPolicy] = js.native
}
object S3SetObjectAclOperation {
  
  @scala.inline
  def apply(): S3SetObjectAclOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3SetObjectAclOperation]
  }
  
  @scala.inline
  implicit class S3SetObjectAclOperationMutableBuilder[Self <: S3SetObjectAclOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlPolicy(value: S3AccessControlPolicy): Self = StObject.set(x, "AccessControlPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlPolicyUndefined: Self = StObject.set(x, "AccessControlPolicy", js.undefined)
  }
}

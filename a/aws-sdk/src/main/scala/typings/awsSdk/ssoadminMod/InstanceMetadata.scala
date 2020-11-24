package typings.awsSdk.ssoadminMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceMetadata extends js.Object {
  
  /**
    * The identifier of the identity store that is connected to the SSO instance.
    */
  var IdentityStoreId: js.UndefOr[Id] = js.native
  
  /**
    * The ARN of the SSO instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: js.UndefOr[typings.awsSdk.ssoadminMod.InstanceArn] = js.native
}
object InstanceMetadata {
  
  @scala.inline
  def apply(): InstanceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMetadata]
  }
  
  @scala.inline
  implicit class InstanceMetadataOps[Self <: InstanceMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentityStoreId(value: Id): Self = this.set("IdentityStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityStoreId: Self = this.set("IdentityStoreId", js.undefined)
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = this.set("InstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceArn: Self = this.set("InstanceArn", js.undefined)
  }
}

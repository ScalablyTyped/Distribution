package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceMetadata extends StObject {
  
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
  implicit class InstanceMetadataMutableBuilder[Self <: InstanceMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityStoreId(value: Id): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityStoreIdUndefined: Self = StObject.set(x, "IdentityStoreId", js.undefined)
    
    @scala.inline
    def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceArnUndefined: Self = StObject.set(x, "InstanceArn", js.undefined)
  }
}

package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourcePolicyResponse extends StObject {
  
  /**
    * The date and time at which the policy was created.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Contains the hash value associated with this policy.
    */
  var PolicyHash: js.UndefOr[HashString] = js.native
  
  /**
    * Contains the requested policy document, in JSON format.
    */
  var PolicyInJson: js.UndefOr[PolicyJsonString] = js.native
  
  /**
    * The date and time at which the policy was last updated.
    */
  var UpdateTime: js.UndefOr[Timestamp] = js.native
}
object GetResourcePolicyResponse {
  
  @scala.inline
  def apply(): GetResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePolicyResponse]
  }
  
  @scala.inline
  implicit class GetResourcePolicyResponseMutableBuilder[Self <: GetResourcePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: Timestamp): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    @scala.inline
    def setPolicyHash(value: HashString): Self = StObject.set(x, "PolicyHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyHashUndefined: Self = StObject.set(x, "PolicyHash", js.undefined)
    
    @scala.inline
    def setPolicyInJson(value: PolicyJsonString): Self = StObject.set(x, "PolicyInJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyInJsonUndefined: Self = StObject.set(x, "PolicyInJson", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: Timestamp): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "UpdateTime", js.undefined)
  }
}

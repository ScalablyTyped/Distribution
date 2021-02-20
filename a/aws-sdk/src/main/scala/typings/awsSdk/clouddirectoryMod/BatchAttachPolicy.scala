package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAttachPolicy extends StObject {
  
  /**
    * The reference that identifies the object to which the policy will be attached.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
  
  /**
    * The reference that is associated with the policy object.
    */
  var PolicyReference: ObjectReference = js.native
}
object BatchAttachPolicy {
  
  @scala.inline
  def apply(ObjectReference: ObjectReference, PolicyReference: ObjectReference): BatchAttachPolicy = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any], PolicyReference = PolicyReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAttachPolicy]
  }
  
  @scala.inline
  implicit class BatchAttachPolicyMutableBuilder[Self <: BatchAttachPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyReference(value: ObjectReference): Self = StObject.set(x, "PolicyReference", value.asInstanceOf[js.Any])
  }
}

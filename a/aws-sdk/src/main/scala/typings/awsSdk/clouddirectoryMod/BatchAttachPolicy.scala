package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAttachPolicy extends StObject {
  
  /**
    * The reference that identifies the object to which the policy will be attached.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference
  
  /**
    * The reference that is associated with the policy object.
    */
  var PolicyReference: ObjectReference
}
object BatchAttachPolicy {
  
  inline def apply(ObjectReference: ObjectReference, PolicyReference: ObjectReference): BatchAttachPolicy = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any], PolicyReference = PolicyReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAttachPolicy]
  }
  
  extension [Self <: BatchAttachPolicy](x: Self) {
    
    inline def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
    
    inline def setPolicyReference(value: ObjectReference): Self = StObject.set(x, "PolicyReference", value.asInstanceOf[js.Any])
  }
}

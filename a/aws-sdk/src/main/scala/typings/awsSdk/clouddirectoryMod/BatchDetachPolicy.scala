package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetachPolicy extends StObject {
  
  /**
    * Reference that identifies the object whose policy object will be detached.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference
  
  /**
    * Reference that identifies the policy object.
    */
  var PolicyReference: ObjectReference
}
object BatchDetachPolicy {
  
  inline def apply(ObjectReference: ObjectReference, PolicyReference: ObjectReference): BatchDetachPolicy = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any], PolicyReference = PolicyReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetachPolicy]
  }
  
  extension [Self <: BatchDetachPolicy](x: Self) {
    
    inline def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
    
    inline def setPolicyReference(value: ObjectReference): Self = StObject.set(x, "PolicyReference", value.asInstanceOf[js.Any])
  }
}

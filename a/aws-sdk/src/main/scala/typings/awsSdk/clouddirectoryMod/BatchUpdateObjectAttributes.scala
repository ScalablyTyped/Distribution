package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateObjectAttributes extends StObject {
  
  /**
    * Attributes update structure.
    */
  var AttributeUpdates: ObjectAttributeUpdateList = js.native
  
  /**
    * Reference that identifies the object.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
}
object BatchUpdateObjectAttributes {
  
  @scala.inline
  def apply(AttributeUpdates: ObjectAttributeUpdateList, ObjectReference: ObjectReference): BatchUpdateObjectAttributes = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateObjectAttributes]
  }
  
  @scala.inline
  implicit class BatchUpdateObjectAttributesMutableBuilder[Self <: BatchUpdateObjectAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeUpdates(value: ObjectAttributeUpdateList): Self = StObject.set(x, "AttributeUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUpdatesVarargs(value: ObjectAttributeUpdate*): Self = StObject.set(x, "AttributeUpdates", js.Array(value :_*))
    
    @scala.inline
    def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
  }
}

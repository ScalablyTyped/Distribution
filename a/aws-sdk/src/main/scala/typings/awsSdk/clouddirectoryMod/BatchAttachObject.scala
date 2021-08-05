package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAttachObject extends StObject {
  
  /**
    * The child object reference that is to be attached to the object.
    */
  var ChildReference: ObjectReference
  
  /**
    * The name of the link.
    */
  var LinkName: typings.awsSdk.clouddirectoryMod.LinkName
  
  /**
    * The parent object reference.
    */
  var ParentReference: ObjectReference
}
object BatchAttachObject {
  
  inline def apply(ChildReference: ObjectReference, LinkName: LinkName, ParentReference: ObjectReference): BatchAttachObject = {
    val __obj = js.Dynamic.literal(ChildReference = ChildReference.asInstanceOf[js.Any], LinkName = LinkName.asInstanceOf[js.Any], ParentReference = ParentReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAttachObject]
  }
  
  extension [Self <: BatchAttachObject](x: Self) {
    
    inline def setChildReference(value: ObjectReference): Self = StObject.set(x, "ChildReference", value.asInstanceOf[js.Any])
    
    inline def setLinkName(value: LinkName): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    inline def setParentReference(value: ObjectReference): Self = StObject.set(x, "ParentReference", value.asInstanceOf[js.Any])
  }
}

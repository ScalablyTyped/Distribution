package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetObjectInformation extends StObject {
  
  /**
    * A reference to the object.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference = js.native
}
object BatchGetObjectInformation {
  
  @scala.inline
  def apply(ObjectReference: ObjectReference): BatchGetObjectInformation = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetObjectInformation]
  }
  
  @scala.inline
  implicit class BatchGetObjectInformationMutableBuilder[Self <: BatchGetObjectInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
  }
}

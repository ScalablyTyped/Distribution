package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAttachToIndex extends StObject {
  
  /**
    * A reference to the index that you are attaching the object to.
    */
  var IndexReference: ObjectReference = js.native
  
  /**
    * A reference to the object that you are attaching to the index.
    */
  var TargetReference: ObjectReference = js.native
}
object BatchAttachToIndex {
  
  @scala.inline
  def apply(IndexReference: ObjectReference, TargetReference: ObjectReference): BatchAttachToIndex = {
    val __obj = js.Dynamic.literal(IndexReference = IndexReference.asInstanceOf[js.Any], TargetReference = TargetReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAttachToIndex]
  }
  
  @scala.inline
  implicit class BatchAttachToIndexMutableBuilder[Self <: BatchAttachToIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexReference(value: ObjectReference): Self = StObject.set(x, "IndexReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetReference(value: ObjectReference): Self = StObject.set(x, "TargetReference", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDetachFromIndex extends StObject {
  
  /**
    * A reference to the index object.
    */
  var IndexReference: ObjectReference = js.native
  
  /**
    * A reference to the object being detached from the index.
    */
  var TargetReference: ObjectReference = js.native
}
object BatchDetachFromIndex {
  
  @scala.inline
  def apply(IndexReference: ObjectReference, TargetReference: ObjectReference): BatchDetachFromIndex = {
    val __obj = js.Dynamic.literal(IndexReference = IndexReference.asInstanceOf[js.Any], TargetReference = TargetReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetachFromIndex]
  }
  
  @scala.inline
  implicit class BatchDetachFromIndexMutableBuilder[Self <: BatchDetachFromIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexReference(value: ObjectReference): Self = StObject.set(x, "IndexReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetReference(value: ObjectReference): Self = StObject.set(x, "TargetReference", value.asInstanceOf[js.Any])
  }
}

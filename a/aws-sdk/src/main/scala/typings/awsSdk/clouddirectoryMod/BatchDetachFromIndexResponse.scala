package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetachFromIndexResponse extends StObject {
  
  /**
    * The ObjectIdentifier of the object that was detached from the index.
    */
  var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}
object BatchDetachFromIndexResponse {
  
  @scala.inline
  def apply(): BatchDetachFromIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetachFromIndexResponse]
  }
  
  @scala.inline
  implicit class BatchDetachFromIndexResponseMutableBuilder[Self <: BatchDetachFromIndexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetachedObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "DetachedObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachedObjectIdentifierUndefined: Self = StObject.set(x, "DetachedObjectIdentifier", js.undefined)
  }
}

package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAttachToIndexResponse extends StObject {
  
  /**
    * The ObjectIdentifier of the object that was attached to the index.
    */
  var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}
object BatchAttachToIndexResponse {
  
  @scala.inline
  def apply(): BatchAttachToIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAttachToIndexResponse]
  }
  
  @scala.inline
  implicit class BatchAttachToIndexResponseMutableBuilder[Self <: BatchAttachToIndexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachedObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "AttachedObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedObjectIdentifierUndefined: Self = StObject.set(x, "AttachedObjectIdentifier", js.undefined)
  }
}

package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachFromIndexResponse extends StObject {
  
  /**
    * The ObjectIdentifier of the object that was detached from the index.
    */
  var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}
object DetachFromIndexResponse {
  
  @scala.inline
  def apply(): DetachFromIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachFromIndexResponse]
  }
  
  @scala.inline
  implicit class DetachFromIndexResponseMutableBuilder[Self <: DetachFromIndexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetachedObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "DetachedObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachedObjectIdentifierUndefined: Self = StObject.set(x, "DetachedObjectIdentifier", js.undefined)
  }
}

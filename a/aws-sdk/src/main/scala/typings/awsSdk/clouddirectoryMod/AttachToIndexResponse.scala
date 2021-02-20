package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachToIndexResponse extends StObject {
  
  /**
    * The ObjectIdentifier of the object that was attached to the index.
    */
  var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.native
}
object AttachToIndexResponse {
  
  @scala.inline
  def apply(): AttachToIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachToIndexResponse]
  }
  
  @scala.inline
  implicit class AttachToIndexResponseMutableBuilder[Self <: AttachToIndexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachedObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "AttachedObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedObjectIdentifierUndefined: Self = StObject.set(x, "AttachedObjectIdentifier", js.undefined)
  }
}

package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAttachObjectResponse extends StObject {
  
  /**
    * The ObjectIdentifier of the object that has been attached.
    */
  var attachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}
object BatchAttachObjectResponse {
  
  @scala.inline
  def apply(): BatchAttachObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAttachObjectResponse]
  }
  
  @scala.inline
  implicit class BatchAttachObjectResponseMutableBuilder[Self <: BatchAttachObjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachedObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "attachedObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedObjectIdentifierUndefined: Self = StObject.set(x, "attachedObjectIdentifier", js.undefined)
  }
}

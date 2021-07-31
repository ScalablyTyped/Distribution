package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachObjectResponse extends StObject {
  
  /**
    * The ObjectIdentifier that was detached from the object.
    */
  var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}
object DetachObjectResponse {
  
  @scala.inline
  def apply(): DetachObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachObjectResponse]
  }
  
  @scala.inline
  implicit class DetachObjectResponseMutableBuilder[Self <: DetachObjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetachedObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "DetachedObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachedObjectIdentifierUndefined: Self = StObject.set(x, "DetachedObjectIdentifier", js.undefined)
  }
}

package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateObjectAttributesResponse extends StObject {
  
  /**
    * The ObjectIdentifier of the updated object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.undefined
}
object UpdateObjectAttributesResponse {
  
  @scala.inline
  def apply(): UpdateObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateObjectAttributesResponse]
  }
  
  @scala.inline
  implicit class UpdateObjectAttributesResponseMutableBuilder[Self <: UpdateObjectAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
  }
}

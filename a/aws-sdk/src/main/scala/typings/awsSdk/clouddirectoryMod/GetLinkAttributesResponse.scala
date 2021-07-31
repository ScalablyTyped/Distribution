package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLinkAttributesResponse extends StObject {
  
  /**
    * The attributes that are associated with the typed link.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
}
object GetLinkAttributesResponse {
  
  @scala.inline
  def apply(): GetLinkAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLinkAttributesResponse]
  }
  
  @scala.inline
  implicit class GetLinkAttributesResponseMutableBuilder[Self <: GetLinkAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeKeyAndValueList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: AttributeKeyAndValue*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
  }
}

package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetLinkAttributesResponse extends StObject {
  
  /**
    * The attributes that are associated with the typed link.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.native
}
object BatchGetLinkAttributesResponse {
  
  @scala.inline
  def apply(): BatchGetLinkAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetLinkAttributesResponse]
  }
  
  @scala.inline
  implicit class BatchGetLinkAttributesResponseMutableBuilder[Self <: BatchGetLinkAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeKeyAndValueList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: AttributeKeyAndValue*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
  }
}

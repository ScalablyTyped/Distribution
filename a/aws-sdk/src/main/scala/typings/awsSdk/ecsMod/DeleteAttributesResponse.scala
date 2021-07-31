package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAttributesResponse extends StObject {
  
  /**
    * A list of attribute objects that were successfully deleted from your resource.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
}
object DeleteAttributesResponse {
  
  @scala.inline
  def apply(): DeleteAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAttributesResponse]
  }
  
  @scala.inline
  implicit class DeleteAttributesResponseMutableBuilder[Self <: DeleteAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
  }
}

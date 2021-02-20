package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetObjectAttributesResponse extends StObject {
  
  /**
    * The attribute values that are associated with an object.
    */
  var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.native
}
object BatchGetObjectAttributesResponse {
  
  @scala.inline
  def apply(): BatchGetObjectAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetObjectAttributesResponse]
  }
  
  @scala.inline
  implicit class BatchGetObjectAttributesResponseMutableBuilder[Self <: BatchGetObjectAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeKeyAndValueList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: AttributeKeyAndValue*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
  }
}

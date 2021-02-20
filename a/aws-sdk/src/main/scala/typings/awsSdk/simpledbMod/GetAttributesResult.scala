package typings.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAttributesResult extends StObject {
  
  /**
    * The list of attributes returned by the operation.
    */
  var Attributes: js.UndefOr[AttributeList] = js.native
}
object GetAttributesResult {
  
  @scala.inline
  def apply(): GetAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAttributesResult]
  }
  
  @scala.inline
  implicit class GetAttributesResultMutableBuilder[Self <: GetAttributesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeList): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "Attributes", js.Array(value :_*))
  }
}

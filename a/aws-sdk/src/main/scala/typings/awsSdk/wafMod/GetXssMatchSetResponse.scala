package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetXssMatchSetResponse extends StObject {
  
  /**
    * Information about the XssMatchSet that you specified in the GetXssMatchSet request. For more information, see the following topics:    XssMatchSet: Contains Name, XssMatchSetId, and an array of XssMatchTuple objects    XssMatchTuple: Each XssMatchTuple object contains FieldToMatch and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var XssMatchSet: js.UndefOr[typings.awsSdk.wafMod.XssMatchSet] = js.native
}
object GetXssMatchSetResponse {
  
  @scala.inline
  def apply(): GetXssMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetXssMatchSetResponse]
  }
  
  @scala.inline
  implicit class GetXssMatchSetResponseMutableBuilder[Self <: GetXssMatchSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXssMatchSet(value: XssMatchSet): Self = StObject.set(x, "XssMatchSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXssMatchSetUndefined: Self = StObject.set(x, "XssMatchSet", js.undefined)
  }
}

package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetXssMatchSetResponse extends js.Object {
  
  /**
    * Information about the XssMatchSet that you specified in the GetXssMatchSet request. For more information, see the following topics:    XssMatchSet: Contains Name, XssMatchSetId, and an array of XssMatchTuple objects    XssMatchTuple: Each XssMatchTuple object contains FieldToMatch and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var XssMatchSet: js.UndefOr[typings.awsSdk.wafregionalMod.XssMatchSet] = js.native
}
object GetXssMatchSetResponse {
  
  @scala.inline
  def apply(): GetXssMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetXssMatchSetResponse]
  }
  
  @scala.inline
  implicit class GetXssMatchSetResponseOps[Self <: GetXssMatchSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setXssMatchSet(value: XssMatchSet): Self = this.set("XssMatchSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXssMatchSet: Self = this.set("XssMatchSet", js.undefined)
  }
}

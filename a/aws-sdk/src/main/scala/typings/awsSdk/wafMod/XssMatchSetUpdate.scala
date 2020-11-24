package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XssMatchSetUpdate extends js.Object {
  
  /**
    * Specify INSERT to add an XssMatchSetUpdate to an XssMatchSet. Use DELETE to remove an XssMatchSetUpdate from an XssMatchSet.
    */
  var Action: ChangeAction = js.native
  
  /**
    * Specifies the part of a web request that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to inspect a header, the name of the header.
    */
  var XssMatchTuple: typings.awsSdk.wafMod.XssMatchTuple = js.native
}
object XssMatchSetUpdate {
  
  @scala.inline
  def apply(Action: ChangeAction, XssMatchTuple: XssMatchTuple): XssMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], XssMatchTuple = XssMatchTuple.asInstanceOf[js.Any])
    __obj.asInstanceOf[XssMatchSetUpdate]
  }
  
  @scala.inline
  implicit class XssMatchSetUpdateOps[Self <: XssMatchSetUpdate] (val x: Self) extends AnyVal {
    
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
    def setAction(value: ChangeAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXssMatchTuple(value: XssMatchTuple): Self = this.set("XssMatchTuple", value.asInstanceOf[js.Any])
  }
}

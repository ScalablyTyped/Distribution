package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XssMatchSetUpdate extends StObject {
  
  /**
    * Specify INSERT to add an XssMatchSetUpdate to an XssMatchSet. Use DELETE to remove an XssMatchSetUpdate from an XssMatchSet.
    */
  var Action: ChangeAction = js.native
  
  /**
    * Specifies the part of a web request that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to inspect a header, the name of the header.
    */
  var XssMatchTuple: typings.awsSdk.wafregionalMod.XssMatchTuple = js.native
}
object XssMatchSetUpdate {
  
  @scala.inline
  def apply(Action: ChangeAction, XssMatchTuple: XssMatchTuple): XssMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], XssMatchTuple = XssMatchTuple.asInstanceOf[js.Any])
    __obj.asInstanceOf[XssMatchSetUpdate]
  }
  
  @scala.inline
  implicit class XssMatchSetUpdateMutableBuilder[Self <: XssMatchSetUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXssMatchTuple(value: XssMatchTuple): Self = StObject.set(x, "XssMatchTuple", value.asInstanceOf[js.Any])
  }
}

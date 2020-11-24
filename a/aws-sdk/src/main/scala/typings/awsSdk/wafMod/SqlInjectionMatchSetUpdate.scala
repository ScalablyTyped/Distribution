package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlInjectionMatchSetUpdate extends js.Object {
  
  /**
    * Specify INSERT to add a SqlInjectionMatchSetUpdate to a SqlInjectionMatchSet. Use DELETE to remove a SqlInjectionMatchSetUpdate from a SqlInjectionMatchSet.
    */
  var Action: ChangeAction = js.native
  
  /**
    * Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
    */
  var SqlInjectionMatchTuple: typings.awsSdk.wafMod.SqlInjectionMatchTuple = js.native
}
object SqlInjectionMatchSetUpdate {
  
  @scala.inline
  def apply(Action: ChangeAction, SqlInjectionMatchTuple: SqlInjectionMatchTuple): SqlInjectionMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], SqlInjectionMatchTuple = SqlInjectionMatchTuple.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlInjectionMatchSetUpdate]
  }
  
  @scala.inline
  implicit class SqlInjectionMatchSetUpdateOps[Self <: SqlInjectionMatchSetUpdate] (val x: Self) extends AnyVal {
    
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
    def setSqlInjectionMatchTuple(value: SqlInjectionMatchTuple): Self = this.set("SqlInjectionMatchTuple", value.asInstanceOf[js.Any])
  }
}

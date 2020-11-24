package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSqlInjectionMatchSetResponse extends js.Object {
  
  /**
    * The ChangeToken that you used to submit the CreateSqlInjectionMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafregionalMod.ChangeToken] = js.native
  
  /**
    * A SqlInjectionMatchSet.
    */
  var SqlInjectionMatchSet: js.UndefOr[typings.awsSdk.wafregionalMod.SqlInjectionMatchSet] = js.native
}
object CreateSqlInjectionMatchSetResponse {
  
  @scala.inline
  def apply(): CreateSqlInjectionMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSqlInjectionMatchSetResponse]
  }
  
  @scala.inline
  implicit class CreateSqlInjectionMatchSetResponseOps[Self <: CreateSqlInjectionMatchSetResponse] (val x: Self) extends AnyVal {
    
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
    def setChangeToken(value: ChangeToken): Self = this.set("ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeToken: Self = this.set("ChangeToken", js.undefined)
    
    @scala.inline
    def setSqlInjectionMatchSet(value: SqlInjectionMatchSet): Self = this.set("SqlInjectionMatchSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqlInjectionMatchSet: Self = this.set("SqlInjectionMatchSet", js.undefined)
  }
}

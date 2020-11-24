package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigRulesResponse extends js.Object {
  
  /**
    * The details about your AWS Config rules.
    */
  var ConfigRules: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRules] = js.native
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeConfigRulesResponse {
  
  @scala.inline
  def apply(): DescribeConfigRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigRulesResponse]
  }
  
  @scala.inline
  implicit class DescribeConfigRulesResponseOps[Self <: DescribeConfigRulesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfigRulesVarargs(value: ConfigRule*): Self = this.set("ConfigRules", js.Array(value :_*))
    
    @scala.inline
    def setConfigRules(value: ConfigRules): Self = this.set("ConfigRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigRules: Self = this.set("ConfigRules", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}

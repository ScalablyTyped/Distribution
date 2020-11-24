package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSecurityConfigurationsResponse extends js.Object {
  
  /**
    * A continuation token, if there are more security configurations to return.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  
  /**
    * A list of security configurations.
    */
  var SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.native
}
object GetSecurityConfigurationsResponse {
  
  @scala.inline
  def apply(): GetSecurityConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityConfigurationsResponse]
  }
  
  @scala.inline
  implicit class GetSecurityConfigurationsResponseOps[Self <: GetSecurityConfigurationsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSecurityConfigurationsVarargs(value: SecurityConfiguration*): Self = this.set("SecurityConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setSecurityConfigurations(value: SecurityConfigurationList): Self = this.set("SecurityConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityConfigurations: Self = this.set("SecurityConfigurations", js.undefined)
  }
}

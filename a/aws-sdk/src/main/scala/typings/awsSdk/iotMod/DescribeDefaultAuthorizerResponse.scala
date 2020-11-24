package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDefaultAuthorizerResponse extends js.Object {
  
  /**
    * The default authorizer's description.
    */
  var authorizerDescription: js.UndefOr[AuthorizerDescription] = js.native
}
object DescribeDefaultAuthorizerResponse {
  
  @scala.inline
  def apply(): DescribeDefaultAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDefaultAuthorizerResponse]
  }
  
  @scala.inline
  implicit class DescribeDefaultAuthorizerResponseOps[Self <: DescribeDefaultAuthorizerResponse] (val x: Self) extends AnyVal {
    
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
    def setAuthorizerDescription(value: AuthorizerDescription): Self = this.set("authorizerDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerDescription: Self = this.set("authorizerDescription", js.undefined)
  }
}

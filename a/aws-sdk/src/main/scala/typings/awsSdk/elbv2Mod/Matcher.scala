package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matcher extends js.Object {
  
  /**
    * You can specify values between 0 and 99. You can specify multiple values (for example, "0,1") or a range of values (for example, "0-5"). The default value is 12.
    */
  var GrpcCode: js.UndefOr[typings.awsSdk.elbv2Mod.GrpcCode] = js.native
  
  /**
    * For Application Load Balancers, you can specify values between 200 and 499, and the default value is 200. You can specify multiple values (for example, "200,202") or a range of values (for example, "200-299"). For Network Load Balancers and Gateway Load Balancers, this must be "200–399".
    */
  var HttpCode: js.UndefOr[typings.awsSdk.elbv2Mod.HttpCode] = js.native
}
object Matcher {
  
  @scala.inline
  def apply(): Matcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Matcher]
  }
  
  @scala.inline
  implicit class MatcherOps[Self <: Matcher] (val x: Self) extends AnyVal {
    
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
    def setGrpcCode(value: GrpcCode): Self = this.set("GrpcCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrpcCode: Self = this.set("GrpcCode", js.undefined)
    
    @scala.inline
    def setHttpCode(value: HttpCode): Self = this.set("HttpCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpCode: Self = this.set("HttpCode", js.undefined)
  }
}

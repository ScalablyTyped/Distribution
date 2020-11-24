package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountAttributesResult extends js.Object {
  
  /**
    * Information about the account attributes.
    */
  var AccountAttributes: js.UndefOr[AccountAttributeList] = js.native
}
object DescribeAccountAttributesResult {
  
  @scala.inline
  def apply(): DescribeAccountAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesResult]
  }
  
  @scala.inline
  implicit class DescribeAccountAttributesResultOps[Self <: DescribeAccountAttributesResult] (val x: Self) extends AnyVal {
    
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
    def setAccountAttributesVarargs(value: AccountAttribute*): Self = this.set("AccountAttributes", js.Array(value :_*))
    
    @scala.inline
    def setAccountAttributes(value: AccountAttributeList): Self = this.set("AccountAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountAttributes: Self = this.set("AccountAttributes", js.undefined)
  }
}

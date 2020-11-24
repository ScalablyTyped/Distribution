package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIdentityIdFormatResult extends js.Object {
  
  /**
    * Information about the ID format for the resources.
    */
  var Statuses: js.UndefOr[IdFormatList] = js.native
}
object DescribeIdentityIdFormatResult {
  
  @scala.inline
  def apply(): DescribeIdentityIdFormatResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityIdFormatResult]
  }
  
  @scala.inline
  implicit class DescribeIdentityIdFormatResultOps[Self <: DescribeIdentityIdFormatResult] (val x: Self) extends AnyVal {
    
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
    def setStatusesVarargs(value: IdFormat*): Self = this.set("Statuses", js.Array(value :_*))
    
    @scala.inline
    def setStatuses(value: IdFormatList): Self = this.set("Statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatuses: Self = this.set("Statuses", js.undefined)
  }
}

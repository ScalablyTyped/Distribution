package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIdFormatResult extends js.Object {
  
  /**
    * Information about the ID format for the resource.
    */
  var Statuses: js.UndefOr[IdFormatList] = js.native
}
object DescribeIdFormatResult {
  
  @scala.inline
  def apply(): DescribeIdFormatResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdFormatResult]
  }
  
  @scala.inline
  implicit class DescribeIdFormatResultOps[Self <: DescribeIdFormatResult] (val x: Self) extends AnyVal {
    
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

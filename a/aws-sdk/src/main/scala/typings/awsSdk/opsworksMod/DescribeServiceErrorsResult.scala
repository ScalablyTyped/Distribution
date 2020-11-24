package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeServiceErrorsResult extends js.Object {
  
  /**
    * An array of ServiceError objects that describe the specified service errors.
    */
  var ServiceErrors: js.UndefOr[typings.awsSdk.opsworksMod.ServiceErrors] = js.native
}
object DescribeServiceErrorsResult {
  
  @scala.inline
  def apply(): DescribeServiceErrorsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceErrorsResult]
  }
  
  @scala.inline
  implicit class DescribeServiceErrorsResultOps[Self <: DescribeServiceErrorsResult] (val x: Self) extends AnyVal {
    
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
    def setServiceErrorsVarargs(value: ServiceError*): Self = this.set("ServiceErrors", js.Array(value :_*))
    
    @scala.inline
    def setServiceErrors(value: ServiceErrors): Self = this.set("ServiceErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceErrors: Self = this.set("ServiceErrors", js.undefined)
  }
}

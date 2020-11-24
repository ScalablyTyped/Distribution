package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventDetailsForOrganizationResponse extends js.Object {
  
  /**
    * Error messages for any events that could not be retrieved.
    */
  var failedSet: js.UndefOr[DescribeEventDetailsForOrganizationFailedSet] = js.native
  
  /**
    * Information about the events that could be retrieved.
    */
  var successfulSet: js.UndefOr[DescribeEventDetailsForOrganizationSuccessfulSet] = js.native
}
object DescribeEventDetailsForOrganizationResponse {
  
  @scala.inline
  def apply(): DescribeEventDetailsForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventDetailsForOrganizationResponse]
  }
  
  @scala.inline
  implicit class DescribeEventDetailsForOrganizationResponseOps[Self <: DescribeEventDetailsForOrganizationResponse] (val x: Self) extends AnyVal {
    
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
    def setFailedSetVarargs(value: OrganizationEventDetailsErrorItem*): Self = this.set("failedSet", js.Array(value :_*))
    
    @scala.inline
    def setFailedSet(value: DescribeEventDetailsForOrganizationFailedSet): Self = this.set("failedSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedSet: Self = this.set("failedSet", js.undefined)
    
    @scala.inline
    def setSuccessfulSetVarargs(value: OrganizationEventDetails*): Self = this.set("successfulSet", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfulSet(value: DescribeEventDetailsForOrganizationSuccessfulSet): Self = this.set("successfulSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessfulSet: Self = this.set("successfulSet", js.undefined)
  }
}

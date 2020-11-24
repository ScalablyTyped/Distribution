package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventDetailsResponse extends js.Object {
  
  /**
    * Error messages for any events that could not be retrieved.
    */
  var failedSet: js.UndefOr[DescribeEventDetailsFailedSet] = js.native
  
  /**
    * Information about the events that could be retrieved.
    */
  var successfulSet: js.UndefOr[DescribeEventDetailsSuccessfulSet] = js.native
}
object DescribeEventDetailsResponse {
  
  @scala.inline
  def apply(): DescribeEventDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventDetailsResponse]
  }
  
  @scala.inline
  implicit class DescribeEventDetailsResponseOps[Self <: DescribeEventDetailsResponse] (val x: Self) extends AnyVal {
    
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
    def setFailedSetVarargs(value: EventDetailsErrorItem*): Self = this.set("failedSet", js.Array(value :_*))
    
    @scala.inline
    def setFailedSet(value: DescribeEventDetailsFailedSet): Self = this.set("failedSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedSet: Self = this.set("failedSet", js.undefined)
    
    @scala.inline
    def setSuccessfulSetVarargs(value: EventDetails*): Self = this.set("successfulSet", js.Array(value :_*))
    
    @scala.inline
    def setSuccessfulSet(value: DescribeEventDetailsSuccessfulSet): Self = this.set("successfulSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessfulSet: Self = this.set("successfulSet", js.undefined)
  }
}

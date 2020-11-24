package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeResourceResponse extends js.Object {
  
  /**
    * The booking options for the described resource.
    */
  var BookingOptions: js.UndefOr[typings.awsSdk.workmailMod.BookingOptions] = js.native
  
  /**
    * The date and time when a resource was disabled from WorkMail, in UNIX epoch time format.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The email of the described resource.
    */
  var Email: js.UndefOr[EmailAddress] = js.native
  
  /**
    * The date and time when a resource was enabled for WorkMail, in UNIX epoch time format.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the described resource.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The identifier of the described resource.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.workmailMod.ResourceId] = js.native
  
  /**
    * The state of the resource: enabled (registered to Amazon WorkMail), disabled (deregistered or never registered to WorkMail), or deleted.
    */
  var State: js.UndefOr[EntityState] = js.native
  
  /**
    * The type of the described resource.
    */
  var Type: js.UndefOr[ResourceType] = js.native
}
object DescribeResourceResponse {
  
  @scala.inline
  def apply(): DescribeResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourceResponse]
  }
  
  @scala.inline
  implicit class DescribeResourceResponseOps[Self <: DescribeResourceResponse] (val x: Self) extends AnyVal {
    
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
    def setBookingOptions(value: BookingOptions): Self = this.set("BookingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBookingOptions: Self = this.set("BookingOptions", js.undefined)
    
    @scala.inline
    def setDisabledDate(value: Timestamp): Self = this.set("DisabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDate: Self = this.set("DisabledDate", js.undefined)
    
    @scala.inline
    def setEmail(value: EmailAddress): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    
    @scala.inline
    def setEnabledDate(value: Timestamp): Self = this.set("EnabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledDate: Self = this.set("EnabledDate", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    
    @scala.inline
    def setState(value: EntityState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setType(value: ResourceType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}

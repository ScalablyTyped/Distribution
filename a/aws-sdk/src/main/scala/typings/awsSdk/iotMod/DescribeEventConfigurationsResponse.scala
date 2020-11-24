package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventConfigurationsResponse extends js.Object {
  
  /**
    * The creation date of the event configuration.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
  
  /**
    * The event configurations.
    */
  var eventConfigurations: js.UndefOr[EventConfigurations] = js.native
  
  /**
    * The date the event configurations were last modified.
    */
  var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.native
}
object DescribeEventConfigurationsResponse {
  
  @scala.inline
  def apply(): DescribeEventConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventConfigurationsResponse]
  }
  
  @scala.inline
  implicit class DescribeEventConfigurationsResponseOps[Self <: DescribeEventConfigurationsResponse] (val x: Self) extends AnyVal {
    
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
    def setCreationDate(value: CreationDate): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setEventConfigurations(value: EventConfigurations): Self = this.set("eventConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventConfigurations: Self = this.set("eventConfigurations", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: LastModifiedDate): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
  }
}

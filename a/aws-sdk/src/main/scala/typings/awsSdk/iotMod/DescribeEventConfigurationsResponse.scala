package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventConfigurationsResponse extends StObject {
  
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
  implicit class DescribeEventConfigurationsResponseMutableBuilder[Self <: DescribeEventConfigurationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setEventConfigurations(value: EventConfigurations): Self = StObject.set(x, "eventConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventConfigurationsUndefined: Self = StObject.set(x, "eventConfigurations", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: LastModifiedDate): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
  }
}

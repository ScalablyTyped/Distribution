package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventConfigurationsResponse extends StObject {
  
  /**
    * The creation date of the event configuration.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The event configurations.
    */
  var eventConfigurations: js.UndefOr[EventConfigurations] = js.undefined
  
  /**
    * The date the event configurations were last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
}
object DescribeEventConfigurationsResponse {
  
  inline def apply(): DescribeEventConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventConfigurationsResponse]
  }
  
  extension [Self <: DescribeEventConfigurationsResponse](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setEventConfigurations(value: EventConfigurations): Self = StObject.set(x, "eventConfigurations", value.asInstanceOf[js.Any])
    
    inline def setEventConfigurationsUndefined: Self = StObject.set(x, "eventConfigurations", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
  }
}

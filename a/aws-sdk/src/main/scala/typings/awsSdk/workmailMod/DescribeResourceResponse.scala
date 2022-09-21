package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourceResponse extends StObject {
  
  /**
    * The booking options for the described resource.
    */
  var BookingOptions: js.UndefOr[typings.awsSdk.workmailMod.BookingOptions] = js.undefined
  
  /**
    * The date and time when a resource was disabled from WorkMail, in UNIX epoch time format.
    */
  var DisabledDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The email of the described resource.
    */
  var Email: js.UndefOr[EmailAddress] = js.undefined
  
  /**
    * The date and time when a resource was enabled for WorkMail, in UNIX epoch time format.
    */
  var EnabledDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the described resource.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The identifier of the described resource.
    */
  var ResourceId: js.UndefOr[typings.awsSdk.workmailMod.ResourceId] = js.undefined
  
  /**
    * The state of the resource: enabled (registered to Amazon WorkMail), disabled (deregistered or never registered to WorkMail), or deleted.
    */
  var State: js.UndefOr[EntityState] = js.undefined
  
  /**
    * The type of the described resource.
    */
  var Type: js.UndefOr[ResourceType] = js.undefined
}
object DescribeResourceResponse {
  
  inline def apply(): DescribeResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourceResponse]
  }
  
  extension [Self <: DescribeResourceResponse](x: Self) {
    
    inline def setBookingOptions(value: BookingOptions): Self = StObject.set(x, "BookingOptions", value.asInstanceOf[js.Any])
    
    inline def setBookingOptionsUndefined: Self = StObject.set(x, "BookingOptions", js.undefined)
    
    inline def setDisabledDate(value: js.Date): Self = StObject.set(x, "DisabledDate", value.asInstanceOf[js.Any])
    
    inline def setDisabledDateUndefined: Self = StObject.set(x, "DisabledDate", js.undefined)
    
    inline def setEmail(value: EmailAddress): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    inline def setEnabledDate(value: js.Date): Self = StObject.set(x, "EnabledDate", value.asInstanceOf[js.Any])
    
    inline def setEnabledDateUndefined: Self = StObject.set(x, "EnabledDate", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setState(value: EntityState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

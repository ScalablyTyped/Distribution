package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    * The date indicating when the resource was disabled from Amazon WorkMail use.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The email of the resource.
    */
  var Email: js.UndefOr[EmailAddress] = js.undefined
  
  /**
    * The date indicating when the resource was enabled for Amazon WorkMail use.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The identifier of the resource.
    */
  var Id: js.UndefOr[WorkMailIdentifier] = js.undefined
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The state of the resource, which can be ENABLED, DISABLED, or DELETED.
    */
  var State: js.UndefOr[EntityState] = js.undefined
  
  /**
    * The type of the resource: equipment or room.
    */
  var Type: js.UndefOr[ResourceType] = js.undefined
}
object Resource {
  
  inline def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setDisabledDate(value: Timestamp): Self = StObject.set(x, "DisabledDate", value.asInstanceOf[js.Any])
    
    inline def setDisabledDateUndefined: Self = StObject.set(x, "DisabledDate", js.undefined)
    
    inline def setEmail(value: EmailAddress): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    inline def setEnabledDate(value: Timestamp): Self = StObject.set(x, "EnabledDate", value.asInstanceOf[js.Any])
    
    inline def setEnabledDateUndefined: Self = StObject.set(x, "EnabledDate", js.undefined)
    
    inline def setId(value: WorkMailIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: EntityState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

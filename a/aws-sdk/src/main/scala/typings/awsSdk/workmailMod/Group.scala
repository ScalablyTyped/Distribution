package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  /**
    * The date indicating when the group was disabled from Amazon WorkMail use.
    */
  var DisabledDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The email of the group.
    */
  var Email: js.UndefOr[EmailAddress] = js.undefined
  
  /**
    * The date indicating when the group was enabled for Amazon WorkMail use.
    */
  var EnabledDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the group.
    */
  var Id: js.UndefOr[WorkMailIdentifier] = js.undefined
  
  /**
    * The name of the group.
    */
  var Name: js.UndefOr[GroupName] = js.undefined
  
  /**
    * The state of the group, which can be ENABLED, DISABLED, or DELETED.
    */
  var State: js.UndefOr[EntityState] = js.undefined
}
object Group {
  
  inline def apply(): Group = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setDisabledDate(value: js.Date): Self = StObject.set(x, "DisabledDate", value.asInstanceOf[js.Any])
    
    inline def setDisabledDateUndefined: Self = StObject.set(x, "DisabledDate", js.undefined)
    
    inline def setEmail(value: EmailAddress): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    inline def setEnabledDate(value: js.Date): Self = StObject.set(x, "EnabledDate", value.asInstanceOf[js.Any])
    
    inline def setEnabledDateUndefined: Self = StObject.set(x, "EnabledDate", js.undefined)
    
    inline def setId(value: WorkMailIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: GroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: EntityState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}

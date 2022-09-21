package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Member extends StObject {
  
  /**
    * The date indicating when the member was disabled from Amazon WorkMail use.
    */
  var DisabledDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date indicating when the member was enabled for Amazon WorkMail use.
    */
  var EnabledDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the member.
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the member.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the member, which can be ENABLED, DISABLED, or DELETED.
    */
  var State: js.UndefOr[EntityState] = js.undefined
  
  /**
    * A member can be a user or group.
    */
  var Type: js.UndefOr[MemberType] = js.undefined
}
object Member {
  
  inline def apply(): Member = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Member]
  }
  
  extension [Self <: Member](x: Self) {
    
    inline def setDisabledDate(value: js.Date): Self = StObject.set(x, "DisabledDate", value.asInstanceOf[js.Any])
    
    inline def setDisabledDateUndefined: Self = StObject.set(x, "DisabledDate", js.undefined)
    
    inline def setEnabledDate(value: js.Date): Self = StObject.set(x, "EnabledDate", value.asInstanceOf[js.Any])
    
    inline def setEnabledDateUndefined: Self = StObject.set(x, "EnabledDate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: EntityState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setType(value: MemberType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

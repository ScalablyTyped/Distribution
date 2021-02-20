package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Member extends StObject {
  
  /**
    * The date indicating when the member was disabled from Amazon WorkMail use.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The date indicating when the member was enabled for Amazon WorkMail use.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The identifier of the member.
    */
  var Id: js.UndefOr[String] = js.native
  
  /**
    * The name of the member.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The state of the member, which can be ENABLED, DISABLED, or DELETED.
    */
  var State: js.UndefOr[EntityState] = js.native
  
  /**
    * A member can be a user or group.
    */
  var Type: js.UndefOr[MemberType] = js.native
}
object Member {
  
  @scala.inline
  def apply(): Member = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Member]
  }
  
  @scala.inline
  implicit class MemberMutableBuilder[Self <: Member] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabledDate(value: Timestamp): Self = StObject.set(x, "DisabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledDateUndefined: Self = StObject.set(x, "DisabledDate", js.undefined)
    
    @scala.inline
    def setEnabledDate(value: Timestamp): Self = StObject.set(x, "EnabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledDateUndefined: Self = StObject.set(x, "EnabledDate", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setState(value: EntityState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setType(value: MemberType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

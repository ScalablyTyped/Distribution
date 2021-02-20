package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Child extends StObject {
  
  /**
    * The unique identifier (ID) of this child entity. The regex pattern for a child ID string requires one of the following:    Account - A string that consists of exactly 12 digits.    Organizational unit (OU) - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that contains the OU). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.  
    */
  var Id: js.UndefOr[ChildId] = js.native
  
  /**
    * The type of this child entity.
    */
  var Type: js.UndefOr[ChildType] = js.native
}
object Child {
  
  @scala.inline
  def apply(): Child = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Child]
  }
  
  @scala.inline
  implicit class ChildMutableBuilder[Self <: Child] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ChildId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setType(value: ChildType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

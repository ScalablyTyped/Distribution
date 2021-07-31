package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginGroupMembers extends StObject {
  
  /**
    * Items (origins) in an origin group.
    */
  var Items: OriginGroupMemberList
  
  /**
    * The number of origins in an origin group.
    */
  var Quantity: integer
}
object OriginGroupMembers {
  
  @scala.inline
  def apply(Items: OriginGroupMemberList, Quantity: integer): OriginGroupMembers = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroupMembers]
  }
  
  @scala.inline
  implicit class OriginGroupMembersMutableBuilder[Self <: OriginGroupMembers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: OriginGroupMemberList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: OriginGroupMember*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}

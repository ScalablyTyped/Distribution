package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceRouteTableAssociationResult extends StObject {
  
  /**
    * The state of the association.
    */
  var AssociationState: js.UndefOr[RouteTableAssociationState] = js.undefined
  
  /**
    * The ID of the new association.
    */
  var NewAssociationId: js.UndefOr[String] = js.undefined
}
object ReplaceRouteTableAssociationResult {
  
  @scala.inline
  def apply(): ReplaceRouteTableAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceRouteTableAssociationResult]
  }
  
  @scala.inline
  implicit class ReplaceRouteTableAssociationResultMutableBuilder[Self <: ReplaceRouteTableAssociationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationState(value: RouteTableAssociationState): Self = StObject.set(x, "AssociationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationStateUndefined: Self = StObject.set(x, "AssociationState", js.undefined)
    
    @scala.inline
    def setNewAssociationId(value: String): Self = StObject.set(x, "NewAssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewAssociationIdUndefined: Self = StObject.set(x, "NewAssociationId", js.undefined)
  }
}

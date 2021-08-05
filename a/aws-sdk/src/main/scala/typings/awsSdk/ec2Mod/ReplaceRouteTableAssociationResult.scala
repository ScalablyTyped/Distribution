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
  
  inline def apply(): ReplaceRouteTableAssociationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceRouteTableAssociationResult]
  }
  
  extension [Self <: ReplaceRouteTableAssociationResult](x: Self) {
    
    inline def setAssociationState(value: RouteTableAssociationState): Self = StObject.set(x, "AssociationState", value.asInstanceOf[js.Any])
    
    inline def setAssociationStateUndefined: Self = StObject.set(x, "AssociationState", js.undefined)
    
    inline def setNewAssociationId(value: String): Self = StObject.set(x, "NewAssociationId", value.asInstanceOf[js.Any])
    
    inline def setNewAssociationIdUndefined: Self = StObject.set(x, "NewAssociationId", js.undefined)
  }
}

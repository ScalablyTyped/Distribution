package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateRouteTableResult extends StObject {
  
  /**
    * The route table association ID. This ID is required for disassociating the route table.
    */
  var AssociationId: js.UndefOr[String] = js.native
  
  /**
    * The state of the association.
    */
  var AssociationState: js.UndefOr[RouteTableAssociationState] = js.native
}
object AssociateRouteTableResult {
  
  @scala.inline
  def apply(): AssociateRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateRouteTableResult]
  }
  
  @scala.inline
  implicit class AssociateRouteTableResultMutableBuilder[Self <: AssociateRouteTableResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: String): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setAssociationState(value: RouteTableAssociationState): Self = StObject.set(x, "AssociationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationStateUndefined: Self = StObject.set(x, "AssociationState", js.undefined)
  }
}

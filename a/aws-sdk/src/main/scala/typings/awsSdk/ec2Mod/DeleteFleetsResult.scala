package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFleetsResult extends StObject {
  
  /**
    * Information about the EC2 Fleets that are successfully deleted.
    */
  var SuccessfulFleetDeletions: js.UndefOr[DeleteFleetSuccessSet] = js.undefined
  
  /**
    * Information about the EC2 Fleets that are not successfully deleted.
    */
  var UnsuccessfulFleetDeletions: js.UndefOr[DeleteFleetErrorSet] = js.undefined
}
object DeleteFleetsResult {
  
  @scala.inline
  def apply(): DeleteFleetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFleetsResult]
  }
  
  @scala.inline
  implicit class DeleteFleetsResultMutableBuilder[Self <: DeleteFleetsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccessfulFleetDeletions(value: DeleteFleetSuccessSet): Self = StObject.set(x, "SuccessfulFleetDeletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfulFleetDeletionsUndefined: Self = StObject.set(x, "SuccessfulFleetDeletions", js.undefined)
    
    @scala.inline
    def setSuccessfulFleetDeletionsVarargs(value: DeleteFleetSuccessItem*): Self = StObject.set(x, "SuccessfulFleetDeletions", js.Array(value :_*))
    
    @scala.inline
    def setUnsuccessfulFleetDeletions(value: DeleteFleetErrorSet): Self = StObject.set(x, "UnsuccessfulFleetDeletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsuccessfulFleetDeletionsUndefined: Self = StObject.set(x, "UnsuccessfulFleetDeletions", js.undefined)
    
    @scala.inline
    def setUnsuccessfulFleetDeletionsVarargs(value: DeleteFleetErrorItem*): Self = StObject.set(x, "UnsuccessfulFleetDeletions", js.Array(value :_*))
  }
}

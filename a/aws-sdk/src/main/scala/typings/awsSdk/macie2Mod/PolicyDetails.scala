package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyDetails extends StObject {
  
  /**
    * The action that produced the finding.
    */
  var action: js.UndefOr[FindingAction] = js.undefined
  
  /**
    * The entity that performed the action that produced the finding.
    */
  var actor: js.UndefOr[FindingActor] = js.undefined
}
object PolicyDetails {
  
  @scala.inline
  def apply(): PolicyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDetails]
  }
  
  @scala.inline
  implicit class PolicyDetailsMutableBuilder[Self <: PolicyDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: FindingAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setActor(value: FindingActor): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
  }
}

package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTrialComponentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialArn] = js.undefined
  
  /**
    * The ARN of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentArn] = js.undefined
}
object AssociateTrialComponentResponse {
  
  @scala.inline
  def apply(): AssociateTrialComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTrialComponentResponse]
  }
  
  @scala.inline
  implicit class AssociateTrialComponentResponseMutableBuilder[Self <: AssociateTrialComponentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrialArn(value: TrialArn): Self = StObject.set(x, "TrialArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialArnUndefined: Self = StObject.set(x, "TrialArn", js.undefined)
    
    @scala.inline
    def setTrialComponentArn(value: TrialComponentArn): Self = StObject.set(x, "TrialComponentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialComponentArnUndefined: Self = StObject.set(x, "TrialComponentArn", js.undefined)
  }
}

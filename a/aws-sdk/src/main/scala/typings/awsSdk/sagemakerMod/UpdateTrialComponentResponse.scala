package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrialComponentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentArn] = js.undefined
}
object UpdateTrialComponentResponse {
  
  @scala.inline
  def apply(): UpdateTrialComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTrialComponentResponse]
  }
  
  @scala.inline
  implicit class UpdateTrialComponentResponseMutableBuilder[Self <: UpdateTrialComponentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrialComponentArn(value: TrialComponentArn): Self = StObject.set(x, "TrialComponentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialComponentArnUndefined: Self = StObject.set(x, "TrialComponentArn", js.undefined)
  }
}

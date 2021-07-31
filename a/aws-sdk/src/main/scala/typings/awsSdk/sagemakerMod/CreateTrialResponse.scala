package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrialResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialArn] = js.undefined
}
object CreateTrialResponse {
  
  @scala.inline
  def apply(): CreateTrialResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrialResponse]
  }
  
  @scala.inline
  implicit class CreateTrialResponseMutableBuilder[Self <: CreateTrialResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrialArn(value: TrialArn): Self = StObject.set(x, "TrialArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialArnUndefined: Self = StObject.set(x, "TrialArn", js.undefined)
  }
}

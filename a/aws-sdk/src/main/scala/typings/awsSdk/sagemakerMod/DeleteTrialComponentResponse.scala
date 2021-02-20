package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrialComponentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component is being deleted.
    */
  var TrialComponentArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponentArn] = js.native
}
object DeleteTrialComponentResponse {
  
  @scala.inline
  def apply(): DeleteTrialComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrialComponentResponse]
  }
  
  @scala.inline
  implicit class DeleteTrialComponentResponseMutableBuilder[Self <: DeleteTrialComponentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrialComponentArn(value: TrialComponentArn): Self = StObject.set(x, "TrialComponentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrialComponentArnUndefined: Self = StObject.set(x, "TrialComponentArn", js.undefined)
  }
}

package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWorkforceResponse extends StObject {
  
  /**
    * A single private workforce. You can create one private work force in each AWS Region. By default, any workforce-related API operation used in a specific region will apply to the workforce created in that region. To learn how to create a private workforce, see Create a Private Workforce.
    */
  var Workforce: typings.awsSdk.sagemakerMod.Workforce = js.native
}
object UpdateWorkforceResponse {
  
  @scala.inline
  def apply(Workforce: Workforce): UpdateWorkforceResponse = {
    val __obj = js.Dynamic.literal(Workforce = Workforce.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkforceResponse]
  }
  
  @scala.inline
  implicit class UpdateWorkforceResponseMutableBuilder[Self <: UpdateWorkforceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkforce(value: Workforce): Self = StObject.set(x, "Workforce", value.asInstanceOf[js.Any])
  }
}

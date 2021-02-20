package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCanaryResponse extends StObject {
  
  /**
    * The full details about the canary you have created.
    */
  var Canary: js.UndefOr[typings.awsSdk.syntheticsMod.Canary] = js.native
}
object CreateCanaryResponse {
  
  @scala.inline
  def apply(): CreateCanaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCanaryResponse]
  }
  
  @scala.inline
  implicit class CreateCanaryResponseMutableBuilder[Self <: CreateCanaryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanary(value: Canary): Self = StObject.set(x, "Canary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanaryUndefined: Self = StObject.set(x, "Canary", js.undefined)
  }
}

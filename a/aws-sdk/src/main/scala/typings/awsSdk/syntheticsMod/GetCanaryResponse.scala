package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCanaryResponse extends StObject {
  
  /**
    * A strucure that contains the full information about the canary.
    */
  var Canary: js.UndefOr[typings.awsSdk.syntheticsMod.Canary] = js.native
}
object GetCanaryResponse {
  
  @scala.inline
  def apply(): GetCanaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCanaryResponse]
  }
  
  @scala.inline
  implicit class GetCanaryResponseMutableBuilder[Self <: GetCanaryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanary(value: Canary): Self = StObject.set(x, "Canary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanaryUndefined: Self = StObject.set(x, "Canary", js.undefined)
  }
}

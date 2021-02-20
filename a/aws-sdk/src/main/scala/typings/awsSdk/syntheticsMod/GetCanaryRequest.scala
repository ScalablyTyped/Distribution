package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCanaryRequest extends StObject {
  
  /**
    * The name of the canary that you want details for.
    */
  var Name: CanaryName = js.native
}
object GetCanaryRequest {
  
  @scala.inline
  def apply(Name: CanaryName): GetCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCanaryRequest]
  }
  
  @scala.inline
  implicit class GetCanaryRequestMutableBuilder[Self <: GetCanaryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: CanaryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

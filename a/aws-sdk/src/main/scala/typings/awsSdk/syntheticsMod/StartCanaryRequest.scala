package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartCanaryRequest extends StObject {
  
  /**
    * The name of the canary that you want to run. To find canary names, use DescribeCanaries.
    */
  var Name: CanaryName = js.native
}
object StartCanaryRequest {
  
  @scala.inline
  def apply(Name: CanaryName): StartCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCanaryRequest]
  }
  
  @scala.inline
  implicit class StartCanaryRequestMutableBuilder[Self <: StartCanaryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: CanaryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

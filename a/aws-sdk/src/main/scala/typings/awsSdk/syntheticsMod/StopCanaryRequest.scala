package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopCanaryRequest extends StObject {
  
  /**
    * The name of the canary that you want to stop. To find the names of your canaries, use DescribeCanaries.
    */
  var Name: CanaryName = js.native
}
object StopCanaryRequest {
  
  @scala.inline
  def apply(Name: CanaryName): StopCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopCanaryRequest]
  }
  
  @scala.inline
  implicit class StopCanaryRequestMutableBuilder[Self <: StopCanaryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: CanaryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}

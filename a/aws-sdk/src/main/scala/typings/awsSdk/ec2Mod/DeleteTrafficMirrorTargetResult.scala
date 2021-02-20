package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrafficMirrorTargetResult extends StObject {
  
  /**
    * The ID of the deleted Traffic Mirror target.
    */
  var TrafficMirrorTargetId: js.UndefOr[String] = js.native
}
object DeleteTrafficMirrorTargetResult {
  
  @scala.inline
  def apply(): DeleteTrafficMirrorTargetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrafficMirrorTargetResult]
  }
  
  @scala.inline
  implicit class DeleteTrafficMirrorTargetResultMutableBuilder[Self <: DeleteTrafficMirrorTargetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrafficMirrorTargetId(value: String): Self = StObject.set(x, "TrafficMirrorTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorTargetIdUndefined: Self = StObject.set(x, "TrafficMirrorTargetId", js.undefined)
  }
}

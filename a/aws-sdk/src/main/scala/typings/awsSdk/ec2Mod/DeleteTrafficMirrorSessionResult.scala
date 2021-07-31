package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrafficMirrorSessionResult extends StObject {
  
  /**
    * The ID of the deleted Traffic Mirror session.
    */
  var TrafficMirrorSessionId: js.UndefOr[String] = js.undefined
}
object DeleteTrafficMirrorSessionResult {
  
  @scala.inline
  def apply(): DeleteTrafficMirrorSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrafficMirrorSessionResult]
  }
  
  @scala.inline
  implicit class DeleteTrafficMirrorSessionResultMutableBuilder[Self <: DeleteTrafficMirrorSessionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrafficMirrorSessionId(value: String): Self = StObject.set(x, "TrafficMirrorSessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorSessionIdUndefined: Self = StObject.set(x, "TrafficMirrorSessionId", js.undefined)
  }
}

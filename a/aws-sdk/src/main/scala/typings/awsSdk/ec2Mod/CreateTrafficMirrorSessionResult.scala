package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTrafficMirrorSessionResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the Traffic Mirror session.
    */
  var TrafficMirrorSession: js.UndefOr[typings.awsSdk.ec2Mod.TrafficMirrorSession] = js.native
}
object CreateTrafficMirrorSessionResult {
  
  @scala.inline
  def apply(): CreateTrafficMirrorSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrafficMirrorSessionResult]
  }
  
  @scala.inline
  implicit class CreateTrafficMirrorSessionResultMutableBuilder[Self <: CreateTrafficMirrorSessionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setTrafficMirrorSession(value: TrafficMirrorSession): Self = StObject.set(x, "TrafficMirrorSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorSessionUndefined: Self = StObject.set(x, "TrafficMirrorSession", js.undefined)
  }
}

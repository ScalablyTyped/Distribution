package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrafficMirrorFilterResult extends StObject {
  
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: js.UndefOr[String] = js.native
}
object DeleteTrafficMirrorFilterResult {
  
  @scala.inline
  def apply(): DeleteTrafficMirrorFilterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrafficMirrorFilterResult]
  }
  
  @scala.inline
  implicit class DeleteTrafficMirrorFilterResultMutableBuilder[Self <: DeleteTrafficMirrorFilterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrafficMirrorFilterId(value: String): Self = StObject.set(x, "TrafficMirrorFilterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorFilterIdUndefined: Self = StObject.set(x, "TrafficMirrorFilterId", js.undefined)
  }
}

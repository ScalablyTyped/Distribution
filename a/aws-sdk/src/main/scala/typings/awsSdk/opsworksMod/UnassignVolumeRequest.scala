package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnassignVolumeRequest extends StObject {
  
  /**
    * The volume ID.
    */
  var VolumeId: String = js.native
}
object UnassignVolumeRequest {
  
  @scala.inline
  def apply(VolumeId: String): UnassignVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnassignVolumeRequest]
  }
  
  @scala.inline
  implicit class UnassignVolumeRequestMutableBuilder[Self <: UnassignVolumeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}

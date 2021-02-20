package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeStatusInfo extends StObject {
  
  /**
    * The details of the volume status.
    */
  var Details: js.UndefOr[VolumeStatusDetailsList] = js.native
  
  /**
    * The status of the volume.
    */
  var Status: js.UndefOr[VolumeStatusInfoStatus] = js.native
}
object VolumeStatusInfo {
  
  @scala.inline
  def apply(): VolumeStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeStatusInfo]
  }
  
  @scala.inline
  implicit class VolumeStatusInfoMutableBuilder[Self <: VolumeStatusInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: VolumeStatusDetailsList): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: VolumeStatusDetails*): Self = StObject.set(x, "Details", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: VolumeStatusInfoStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}

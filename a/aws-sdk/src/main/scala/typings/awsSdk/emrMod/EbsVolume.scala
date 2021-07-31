package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsVolume extends StObject {
  
  /**
    * The device name that is exposed to the instance, such as /dev/sdh.
    */
  var Device: js.UndefOr[String] = js.undefined
  
  /**
    * The volume identifier of the EBS volume.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
}
object EbsVolume {
  
  @scala.inline
  def apply(): EbsVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsVolume]
  }
  
  @scala.inline
  implicit class EbsVolumeMutableBuilder[Self <: EbsVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: String): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "Device", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}

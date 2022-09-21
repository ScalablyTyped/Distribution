package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVolumeRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.undefined
  
  /**
    * The name of the OpenZFS volume. OpenZFS root volumes are automatically named FSX. Child volume names must be unique among their parent volume's children. The name of the volume is part of the mount string for the OpenZFS volume. 
    */
  var Name: js.UndefOr[VolumeName] = js.undefined
  
  /**
    * The configuration of the ONTAP volume that you are updating.
    */
  var OntapConfiguration: js.UndefOr[UpdateOntapVolumeConfiguration] = js.undefined
  
  /**
    * The configuration of the OpenZFS volume that you are updating.
    */
  var OpenZFSConfiguration: js.UndefOr[UpdateOpenZFSVolumeConfiguration] = js.undefined
  
  /**
    * The ID of the volume that you want to update, in the format fsvol-0123456789abcdef0.
    */
  var VolumeId: typings.awsSdk.fsxMod.VolumeId
}
object UpdateVolumeRequest {
  
  inline def apply(VolumeId: VolumeId): UpdateVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVolumeRequest]
  }
  
  extension [Self <: UpdateVolumeRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setName(value: VolumeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOntapConfiguration(value: UpdateOntapVolumeConfiguration): Self = StObject.set(x, "OntapConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOntapConfigurationUndefined: Self = StObject.set(x, "OntapConfiguration", js.undefined)
    
    inline def setOpenZFSConfiguration(value: UpdateOpenZFSVolumeConfiguration): Self = StObject.set(x, "OpenZFSConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOpenZFSConfigurationUndefined: Self = StObject.set(x, "OpenZFSConfiguration", js.undefined)
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}

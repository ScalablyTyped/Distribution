package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVolumeRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.undefined
  
  /**
    * For Amazon FSx for ONTAP volumes, specify whether to take a final backup of the volume and apply tags to the backup. To apply tags to the backup, you must have the fsx:TagResource permission.
    */
  var OntapConfiguration: js.UndefOr[DeleteVolumeOntapConfiguration] = js.undefined
  
  /**
    * For Amazon FSx for OpenZFS volumes, specify whether to delete all child volumes and snapshots.
    */
  var OpenZFSConfiguration: js.UndefOr[DeleteVolumeOpenZFSConfiguration] = js.undefined
  
  /**
    * The ID of the volume that you are deleting.
    */
  var VolumeId: typings.awsSdk.fsxMod.VolumeId
}
object DeleteVolumeRequest {
  
  inline def apply(VolumeId: VolumeId): DeleteVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVolumeRequest]
  }
  
  extension [Self <: DeleteVolumeRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setOntapConfiguration(value: DeleteVolumeOntapConfiguration): Self = StObject.set(x, "OntapConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOntapConfigurationUndefined: Self = StObject.set(x, "OntapConfiguration", js.undefined)
    
    inline def setOpenZFSConfiguration(value: DeleteVolumeOpenZFSConfiguration): Self = StObject.set(x, "OpenZFSConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOpenZFSConfigurationUndefined: Self = StObject.set(x, "OpenZFSConfiguration", js.undefined)
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}

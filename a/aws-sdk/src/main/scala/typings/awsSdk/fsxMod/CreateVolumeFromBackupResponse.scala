package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVolumeFromBackupResponse extends StObject {
  
  /**
    * Returned after a successful CreateVolumeFromBackup API operation, describing the volume just created.
    */
  var Volume: js.UndefOr[typings.awsSdk.fsxMod.Volume] = js.undefined
}
object CreateVolumeFromBackupResponse {
  
  inline def apply(): CreateVolumeFromBackupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVolumeFromBackupResponse]
  }
  
  extension [Self <: CreateVolumeFromBackupResponse](x: Self) {
    
    inline def setVolume(value: Volume): Self = StObject.set(x, "Volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "Volume", js.undefined)
  }
}

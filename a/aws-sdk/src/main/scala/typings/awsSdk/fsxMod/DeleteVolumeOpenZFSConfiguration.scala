package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVolumeOpenZFSConfiguration extends StObject {
  
  /**
    * To delete the volume's child volumes, snapshots, and clones, use the string DELETE_CHILD_VOLUMES_AND_SNAPSHOTS.
    */
  var Options: js.UndefOr[DeleteOpenZFSVolumeOptions] = js.undefined
}
object DeleteVolumeOpenZFSConfiguration {
  
  inline def apply(): DeleteVolumeOpenZFSConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteVolumeOpenZFSConfiguration]
  }
  
  extension [Self <: DeleteVolumeOpenZFSConfiguration](x: Self) {
    
    inline def setOptions(value: DeleteOpenZFSVolumeOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setOptionsVarargs(value: DeleteOpenZFSVolumeOption*): Self = StObject.set(x, "Options", js.Array(value*))
  }
}

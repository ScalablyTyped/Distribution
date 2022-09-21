package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScannedItemCount extends StObject {
  
  /**
    * Number of files scanned.
    */
  var Files: js.UndefOr[Integer] = js.undefined
  
  /**
    * Total GB of files scanned for malware.
    */
  var TotalGb: js.UndefOr[Integer] = js.undefined
  
  /**
    * Total number of scanned volumes.
    */
  var Volumes: js.UndefOr[Integer] = js.undefined
}
object ScannedItemCount {
  
  inline def apply(): ScannedItemCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScannedItemCount]
  }
  
  extension [Self <: ScannedItemCount](x: Self) {
    
    inline def setFiles(value: Integer): Self = StObject.set(x, "Files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "Files", js.undefined)
    
    inline def setTotalGb(value: Integer): Self = StObject.set(x, "TotalGb", value.asInstanceOf[js.Any])
    
    inline def setTotalGbUndefined: Self = StObject.set(x, "TotalGb", js.undefined)
    
    inline def setVolumes(value: Integer): Self = StObject.set(x, "Volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "Volumes", js.undefined)
  }
}

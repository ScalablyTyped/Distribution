package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetLabelStats extends StObject {
  
  /**
    *  The total number of images that have the label assigned to a bounding box. 
    */
  var BoundingBoxCount: js.UndefOr[UInteger] = js.undefined
  
  /**
    *  The total number of images that use the label. 
    */
  var EntryCount: js.UndefOr[UInteger] = js.undefined
}
object DatasetLabelStats {
  
  inline def apply(): DatasetLabelStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetLabelStats]
  }
  
  extension [Self <: DatasetLabelStats](x: Self) {
    
    inline def setBoundingBoxCount(value: UInteger): Self = StObject.set(x, "BoundingBoxCount", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxCountUndefined: Self = StObject.set(x, "BoundingBoxCount", js.undefined)
    
    inline def setEntryCount(value: UInteger): Self = StObject.set(x, "EntryCount", value.asInstanceOf[js.Any])
    
    inline def setEntryCountUndefined: Self = StObject.set(x, "EntryCount", js.undefined)
  }
}

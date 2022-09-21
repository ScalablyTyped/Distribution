package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetLabelDescription extends StObject {
  
  /**
    *  The name of the label. 
    */
  var LabelName: js.UndefOr[DatasetLabel] = js.undefined
  
  /**
    *  Statistics about the label. 
    */
  var LabelStats: js.UndefOr[DatasetLabelStats] = js.undefined
}
object DatasetLabelDescription {
  
  inline def apply(): DatasetLabelDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetLabelDescription]
  }
  
  extension [Self <: DatasetLabelDescription](x: Self) {
    
    inline def setLabelName(value: DatasetLabel): Self = StObject.set(x, "LabelName", value.asInstanceOf[js.Any])
    
    inline def setLabelNameUndefined: Self = StObject.set(x, "LabelName", js.undefined)
    
    inline def setLabelStats(value: DatasetLabelStats): Self = StObject.set(x, "LabelStats", value.asInstanceOf[js.Any])
    
    inline def setLabelStatsUndefined: Self = StObject.set(x, "LabelStats", js.undefined)
  }
}

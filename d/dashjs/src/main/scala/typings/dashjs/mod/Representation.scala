package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Representation extends StObject {
  
  var MSETimeOffset: Double
  
  var adaptation: js.Object
  
  var availabilityTimeComplete: Boolean
  
  var availabilityTimeOffset: Double
  
  var availableSegmentsNumber: Double
  
  var bandwidth: Double
  
  var codecPrivateData: String
  
  var codecs: String
  
  var frameRate: Double
  
  var height: Double
  
  var id: String
  
  var index: Double
  
  var indexRange: String
  
  var initialization: js.Object
  
  var maxPlayoutRate: Double
  
  var mimeType: String
  
  var presentationTimeOffset: Double
  
  var range: String
  
  var scanType: String
  
  var segmentDuration: Double
  
  var segmentInfoType: String
  
  var startNumber: Double
  
  var timescale: Double
  
  var width: Double
}
object Representation {
  
  inline def apply(
    MSETimeOffset: Double,
    adaptation: js.Object,
    availabilityTimeComplete: Boolean,
    availabilityTimeOffset: Double,
    availableSegmentsNumber: Double,
    bandwidth: Double,
    codecPrivateData: String,
    codecs: String,
    frameRate: Double,
    height: Double,
    id: String,
    index: Double,
    indexRange: String,
    initialization: js.Object,
    maxPlayoutRate: Double,
    mimeType: String,
    presentationTimeOffset: Double,
    range: String,
    scanType: String,
    segmentDuration: Double,
    segmentInfoType: String,
    startNumber: Double,
    timescale: Double,
    width: Double
  ): Representation = {
    val __obj = js.Dynamic.literal(MSETimeOffset = MSETimeOffset.asInstanceOf[js.Any], adaptation = adaptation.asInstanceOf[js.Any], availabilityTimeComplete = availabilityTimeComplete.asInstanceOf[js.Any], availabilityTimeOffset = availabilityTimeOffset.asInstanceOf[js.Any], availableSegmentsNumber = availableSegmentsNumber.asInstanceOf[js.Any], bandwidth = bandwidth.asInstanceOf[js.Any], codecPrivateData = codecPrivateData.asInstanceOf[js.Any], codecs = codecs.asInstanceOf[js.Any], frameRate = frameRate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], indexRange = indexRange.asInstanceOf[js.Any], initialization = initialization.asInstanceOf[js.Any], maxPlayoutRate = maxPlayoutRate.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], presentationTimeOffset = presentationTimeOffset.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], scanType = scanType.asInstanceOf[js.Any], segmentDuration = segmentDuration.asInstanceOf[js.Any], segmentInfoType = segmentInfoType.asInstanceOf[js.Any], startNumber = startNumber.asInstanceOf[js.Any], timescale = timescale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Representation]
  }
  
  extension [Self <: Representation](x: Self) {
    
    inline def setAdaptation(value: js.Object): Self = StObject.set(x, "adaptation", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityTimeComplete(value: Boolean): Self = StObject.set(x, "availabilityTimeComplete", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityTimeOffset(value: Double): Self = StObject.set(x, "availabilityTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setAvailableSegmentsNumber(value: Double): Self = StObject.set(x, "availableSegmentsNumber", value.asInstanceOf[js.Any])
    
    inline def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setCodecPrivateData(value: String): Self = StObject.set(x, "codecPrivateData", value.asInstanceOf[js.Any])
    
    inline def setCodecs(value: String): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
    
    inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexRange(value: String): Self = StObject.set(x, "indexRange", value.asInstanceOf[js.Any])
    
    inline def setInitialization(value: js.Object): Self = StObject.set(x, "initialization", value.asInstanceOf[js.Any])
    
    inline def setMSETimeOffset(value: Double): Self = StObject.set(x, "MSETimeOffset", value.asInstanceOf[js.Any])
    
    inline def setMaxPlayoutRate(value: Double): Self = StObject.set(x, "maxPlayoutRate", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setPresentationTimeOffset(value: Double): Self = StObject.set(x, "presentationTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setScanType(value: String): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
    
    inline def setSegmentDuration(value: Double): Self = StObject.set(x, "segmentDuration", value.asInstanceOf[js.Any])
    
    inline def setSegmentInfoType(value: String): Self = StObject.set(x, "segmentInfoType", value.asInstanceOf[js.Any])
    
    inline def setStartNumber(value: Double): Self = StObject.set(x, "startNumber", value.asInstanceOf[js.Any])
    
    inline def setTimescale(value: Double): Self = StObject.set(x, "timescale", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

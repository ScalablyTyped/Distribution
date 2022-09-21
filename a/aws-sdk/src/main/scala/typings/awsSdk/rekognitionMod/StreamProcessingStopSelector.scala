package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamProcessingStopSelector extends StObject {
  
  /**
    *  Specifies the maximum amount of time in seconds that you want the stream to be processed. The largest amount of time is 2 minutes. The default is 10 seconds. 
    */
  var MaxDurationInSeconds: js.UndefOr[MaxDurationInSecondsULong] = js.undefined
}
object StreamProcessingStopSelector {
  
  inline def apply(): StreamProcessingStopSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessingStopSelector]
  }
  
  extension [Self <: StreamProcessingStopSelector](x: Self) {
    
    inline def setMaxDurationInSeconds(value: MaxDurationInSecondsULong): Self = StObject.set(x, "MaxDurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationInSecondsUndefined: Self = StObject.set(x, "MaxDurationInSeconds", js.undefined)
  }
}

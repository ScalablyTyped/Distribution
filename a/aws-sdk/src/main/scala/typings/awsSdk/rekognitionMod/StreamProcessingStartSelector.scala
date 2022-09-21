package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamProcessingStartSelector extends StObject {
  
  /**
    *  Specifies the starting point in the stream to start processing. This can be done with a timestamp or a fragment number in a Kinesis stream. 
    */
  var KVSStreamStartSelector: js.UndefOr[KinesisVideoStreamStartSelector] = js.undefined
}
object StreamProcessingStartSelector {
  
  inline def apply(): StreamProcessingStartSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessingStartSelector]
  }
  
  extension [Self <: StreamProcessingStartSelector](x: Self) {
    
    inline def setKVSStreamStartSelector(value: KinesisVideoStreamStartSelector): Self = StObject.set(x, "KVSStreamStartSelector", value.asInstanceOf[js.Any])
    
    inline def setKVSStreamStartSelectorUndefined: Self = StObject.set(x, "KVSStreamStartSelector", js.undefined)
  }
}

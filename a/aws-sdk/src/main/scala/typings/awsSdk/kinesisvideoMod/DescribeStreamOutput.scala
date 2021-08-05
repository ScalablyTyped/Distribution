package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStreamOutput extends StObject {
  
  /**
    * An object that describes the stream.
    */
  var StreamInfo: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamInfo] = js.undefined
}
object DescribeStreamOutput {
  
  inline def apply(): DescribeStreamOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamOutput]
  }
  
  extension [Self <: DescribeStreamOutput](x: Self) {
    
    inline def setStreamInfo(value: StreamInfo): Self = StObject.set(x, "StreamInfo", value.asInstanceOf[js.Any])
    
    inline def setStreamInfoUndefined: Self = StObject.set(x, "StreamInfo", js.undefined)
  }
}

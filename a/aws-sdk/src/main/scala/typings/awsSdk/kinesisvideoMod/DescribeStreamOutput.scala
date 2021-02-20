package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStreamOutput extends StObject {
  
  /**
    * An object that describes the stream.
    */
  var StreamInfo: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamInfo] = js.native
}
object DescribeStreamOutput {
  
  @scala.inline
  def apply(): DescribeStreamOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamOutput]
  }
  
  @scala.inline
  implicit class DescribeStreamOutputMutableBuilder[Self <: DescribeStreamOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamInfo(value: StreamInfo): Self = StObject.set(x, "StreamInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamInfoUndefined: Self = StObject.set(x, "StreamInfo", js.undefined)
  }
}

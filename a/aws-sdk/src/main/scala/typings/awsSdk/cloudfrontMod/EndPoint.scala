package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndPoint extends StObject {
  
  /**
    * Contains information about the Amazon Kinesis data stream where you are sending real-time log data.
    */
  var KinesisStreamConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.KinesisStreamConfig] = js.native
  
  /**
    * The type of data stream where you are sending real-time log data. The only valid value is Kinesis.
    */
  var StreamType: String = js.native
}
object EndPoint {
  
  @scala.inline
  def apply(StreamType: String): EndPoint = {
    val __obj = js.Dynamic.literal(StreamType = StreamType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndPoint]
  }
  
  @scala.inline
  implicit class EndPointMutableBuilder[Self <: EndPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKinesisStreamConfig(value: KinesisStreamConfig): Self = StObject.set(x, "KinesisStreamConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamConfigUndefined: Self = StObject.set(x, "KinesisStreamConfig", js.undefined)
    
    @scala.inline
    def setStreamType(value: String): Self = StObject.set(x, "StreamType", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisStreamConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the data stream.
    */
  var StreamArn: ARN = js.native
}
object KinesisStreamConfig {
  
  @scala.inline
  def apply(StreamArn: ARN): KinesisStreamConfig = {
    val __obj = js.Dynamic.literal(StreamArn = StreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamConfig]
  }
  
  @scala.inline
  implicit class KinesisStreamConfigMutableBuilder[Self <: KinesisStreamConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamArn(value: ARN): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
  }
}

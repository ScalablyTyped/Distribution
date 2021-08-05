package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the data stream.
    */
  var StreamArn: ARN
}
object KinesisStreamConfig {
  
  inline def apply(StreamArn: ARN): KinesisStreamConfig = {
    val __obj = js.Dynamic.literal(StreamArn = StreamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamConfig]
  }
  
  extension [Self <: KinesisStreamConfig](x: Self) {
    
    inline def setStreamArn(value: ARN): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
  }
}

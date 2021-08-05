package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisFirehoseConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the delivery stream.
    */
  var FirehoseArn: ARN
}
object KinesisFirehoseConfig {
  
  inline def apply(FirehoseArn: ARN): KinesisFirehoseConfig = {
    val __obj = js.Dynamic.literal(FirehoseArn = FirehoseArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseConfig]
  }
  
  extension [Self <: KinesisFirehoseConfig](x: Self) {
    
    inline def setFirehoseArn(value: ARN): Self = StObject.set(x, "FirehoseArn", value.asInstanceOf[js.Any])
  }
}

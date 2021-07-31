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
  
  @scala.inline
  def apply(FirehoseArn: ARN): KinesisFirehoseConfig = {
    val __obj = js.Dynamic.literal(FirehoseArn = FirehoseArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseConfig]
  }
  
  @scala.inline
  implicit class KinesisFirehoseConfigMutableBuilder[Self <: KinesisFirehoseConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirehoseArn(value: ARN): Self = StObject.set(x, "FirehoseArn", value.asInstanceOf[js.Any])
  }
}

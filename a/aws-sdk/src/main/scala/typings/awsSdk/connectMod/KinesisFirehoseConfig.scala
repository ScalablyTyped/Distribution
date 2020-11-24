package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisFirehoseConfig extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the delivery stream.
    */
  var FirehoseArn: ARN = js.native
}
object KinesisFirehoseConfig {
  
  @scala.inline
  def apply(FirehoseArn: ARN): KinesisFirehoseConfig = {
    val __obj = js.Dynamic.literal(FirehoseArn = FirehoseArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisFirehoseConfig]
  }
  
  @scala.inline
  implicit class KinesisFirehoseConfigOps[Self <: KinesisFirehoseConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFirehoseArn(value: ARN): Self = this.set("FirehoseArn", value.asInstanceOf[js.Any])
  }
}

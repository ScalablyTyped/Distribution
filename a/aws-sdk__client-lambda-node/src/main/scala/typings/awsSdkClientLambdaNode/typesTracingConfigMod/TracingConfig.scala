package typings.awsSdkClientLambdaNode.typesTracingConfigMod

import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.Active
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracingConfig extends js.Object {
  /**
    * <p>The tracing mode.</p>
    */
  var Mode: js.UndefOr[Active | PassThrough | String] = js.native
}

object TracingConfig {
  @scala.inline
  def apply(): TracingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingConfig]
  }
  @scala.inline
  implicit class TracingConfigOps[Self <: TracingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMode(value: Active | PassThrough | String): Self = this.set("Mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("Mode", js.undefined)
  }
  
}


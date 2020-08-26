package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringOutput extends js.Object {
  /**
    * The Amazon S3 storage location where the results of a monitoring job are saved.
    */
  var S3Output: MonitoringS3Output = js.native
}

object MonitoringOutput {
  @scala.inline
  def apply(S3Output: MonitoringS3Output): MonitoringOutput = {
    val __obj = js.Dynamic.literal(S3Output = S3Output.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringOutput]
  }
  @scala.inline
  implicit class MonitoringOutputOps[Self <: MonitoringOutput] (val x: Self) extends AnyVal {
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
    def setS3Output(value: MonitoringS3Output): Self = this.set("S3Output", value.asInstanceOf[js.Any])
  }
  
}


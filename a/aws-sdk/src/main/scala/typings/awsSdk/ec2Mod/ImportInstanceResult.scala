package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportInstanceResult extends js.Object {
  /**
    * Information about the conversion task.
    */
  var ConversionTask: js.UndefOr[typings.awsSdk.ec2Mod.ConversionTask] = js.native
}

object ImportInstanceResult {
  @scala.inline
  def apply(): ImportInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportInstanceResult]
  }
  @scala.inline
  implicit class ImportInstanceResultOps[Self <: ImportInstanceResult] (val x: Self) extends AnyVal {
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
    def setConversionTask(value: ConversionTask): Self = this.set("ConversionTask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversionTask: Self = this.set("ConversionTask", js.undefined)
  }
  
}

